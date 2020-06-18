package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Dbtest_01 {
	
	//드라이버, url 
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	
	//생성자- 하나의 메소드라 메소드 만들려면 다른곳에 ㄱㄱ
	public Dbtest_01() {
		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 성공!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 드라이버 실패ㅠ");
		}
		
	}
	///////////////////////////////커넥션
	public Connection getConnection()
	{
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, "katatj", "skfo0762");//각각의 계정과 비번
			System.out.println("연동성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연동실패");
			e.printStackTrace();
		} 
		
		return conn;
		
	}
	
	//////////////////insert
	public void insert()
	{
		Scanner sc = new Scanner(System.in);
		String name, addr;
		String sql; //insert sql 작성을 위한 변수.
		
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		System.out.println("주소를 입력하세요");
		addr = sc.nextLine();
		
		//작은 따옴표는 sql에서 나온거며 문자라서 넣음. 숫자면 넣을 필요 ㄴㄴ
		sql = "insert into hello values(seq_h.nextval, '" + name + "','" + addr + "', sysdate)";
		System.out.println(sql);
		
		//1.db연결
		Connection conn = null;
		
		//2. statement
		Statement stmt = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			//sql문 전송에 필요한 statement 객체를 createSTatement객체를 통해 얻음.
			//sql문 실행.. insert문
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("insert 에러"+ e.getMessage());
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		
	}
	
	///////////////////////////////////select
	public void select()
	{
		System.out.println("시퀀스 \t이름\t주소\t현재날짜");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //조회시 테이블 형태로 출력해주는 객체
		//오름차순 , 내림차순 모든필드 출력
		String sql = "select * from hello order by num desc"; //desc 내림.. asc 오름 
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//select문은 항상 result set
			//select 문을 요청하므로 excuteQuery메소드를 이용해서 Resultset 객체로 값을 얻는다.
			
			//2개 이상의 값을 얻고자 할 때 while 
			while(rs.next()) //다음 값을 true값 반환
			{
				//rs의 next를 이용해서 행을 선택하고, get메소드를 이용해서 테이블의 컬럼값을 얻는다.
				System.out.println(rs.getInt("num")//숫자형태("컬럼명")
				+ "\t" + rs.getString("name")//문자열("컬럼명")
				+ "\t" + rs.getString("addr") 
				+ "\t" + rs.getDate("sdate"));  //날짜("컬럼명")
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
/////////////////////////////////////////////delete
	public void delete()
	{
		Scanner sc = new Scanner(System.in);
//		String name, addr;
//		int num;
		String num;
//		String sql = "";
//		ResultSet rs = null;
		
		
		System.out.println("삭제할 번호?");
		num = sc.nextLine();
		String sql = "delete from hello where num = " + num; //'*'은 넣지 말것. 	
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql); //지워지면서 다시 세팅됨 //성공한 레코드 갯수 반환
			
			if (a == 0)
				System.out.println("없는 데이터 번호입니다.");//없는 번호 입력시 실제 삭제되지 않으므로 0이 반환
			else
				System.out.println("삭제되었습니다."); //삭제되면 1이 반환
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	///////////////////////////////////update
	public void update() {
		Scanner sc = new Scanner(System.in);
		String name, addr, num;
		String sql; // update sql 작성을 위한 변수
		
		System.out.println("수정할 번호를 입력하세요");
		num = sc.nextLine();
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		System.out.println("주소를 입력하세요");
		addr = sc.nextLine();
		
		//작은 따옴표는 sql에서 나온거며 문자라서 넣음. 숫자면 넣을 필요 ㄴㄴ
		sql = "update hello set name ="+ name + ",addr= '" + addr +"' where num =" + num;
		System.out.println(sql);
		
		//1.db연결
		Connection conn = null;
		
		//2. statement
		Statement stmt = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
			
			if(a == 0)
				System.out.println("수정할 데이터가 존재하지 않음");
			else
				System.out.println("수정됨");
			
		} catch (SQLException e) {
			System.out.println("insert 에러"+ e.getMessage());
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
	
	}
	
	
///////////////////////////////////////////
	
	
	public static void main(String[] args) {
		
		Dbtest_01 db = new Dbtest_01();
		
		//메인함수에 데이터 추가를 할 수 있게 조건문 지정	
		Scanner sc = new Scanner(System.in);
		int n = 0; //1,2,3,4, 종료 선택할 변수
		
		while(true)  //while은 break 꼭 넣을것.
		{
		 System.out.println("1.insert  2.select  3.delete  4.update  0.종료");
		 n = Integer.parseInt(sc.nextLine());
		 
		 if(n == 1)
			 db.insert();
		 else if (n == 0)
		 {
			 System.out.println("종료!");
			 break;
		 }
		 else if (n == 2)
			 db.select();
		 else if (n == 3)
			 db.delete();
		 else if (n == 4)
			 db.update();
		}
		
		

	}

}
