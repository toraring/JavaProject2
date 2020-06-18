package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DbDriver_02 {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	
	//생성자
	public DbDriver_02() {
		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 드라이버 실패");
		}
	}
	
	/////////// conncetion
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, "katatj", "skfo0762");
			System.out.println("db 연동 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db 연동 실패..");
		}
		return conn; 
				
	}
	
		
		
	/////////////insert
	public void insert() {
		
		Scanner sc = new Scanner(System.in);
		String name, age, addr;
		String sql = "";
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요");
		age = sc.nextLine();
		System.out.println("주소를 입력하세요");
		addr = sc.nextLine();
		
		sql = "insert into member values (seq_mem.nextval,'"+name+"','"+age+"','"+addr+"',sysdate)";
		//콤마다음 띄어쓰기 ㄴㄴ
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
	///////////////////////select
	
	public void select()
	{
		System.out.println("시퀀스 \t이름\t나이\t주소\t현재날짜");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //조회시 테이블 형태로 출력해주는 객체
		//오름차순 , 내림차순 모든필드 출력
		String sql = "select * from member order by no desc"; //desc 내림.. asc 오름 
		
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
				System.out.println(rs.getInt("no")//숫자형태("컬럼명")
				+ "\t" + rs.getString("name")
				+ "\t" + rs.getString("age")//문자열("컬럼명")
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
	///////////////////////////delete
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String no;
		
		System.out.println("삭제할 번호?");
		no = sc.nextLine();
		String sql = "delete from member where no = " + no;
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	}
	
	//////////////////////update
	public void update() {
		Scanner sc = new Scanner(System.in);
		String name, age, addr, no;
		
		
		System.out.println("변경할 번호?");
		no = sc.nextLine();
		System.out.println("변경할 이름?");
		name = sc.nextLine();
		System.out.println("변경할 나이?");
		age = sc.nextLine();
		System.out.println("변경할 주소?");
		addr = sc.nextLine();
		
		String sql = "update member set name = '"+name+"', age = '"+age+"',addr = '"+addr+"' where no = "+ no;
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}	
	
	/////////////////////////////////////////////////////////////////
	
	
	
	public static void main(String[] args) {
		
		DbDriver_02 db2 = new DbDriver_02();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.println("1.입력   2.출력. 3.삭제   4.수정   9.종료");
			n = Integer.parseInt(sc.nextLine());  //모든 문자열에 칸을 주기
			
			if(n == 1)
				db2.insert();
			else if (n == 2)
				db2.select();
			else if (n == 9) {
				System.out.println("종료");
				break;
			}
			else if (n == 3)
				db2.delete();
			else if (n == 4)
				db2.update();
			
		}
		
	}
}
