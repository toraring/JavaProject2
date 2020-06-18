package day0609;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class MysqlDb_01 {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String pass = "1234";
	
	//생성자
	public MysqlDb_01() {
		try {
			Class.forName(driver);
			System.out.println("mysql드라이버 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("mysql드라이버 실패");
		}
		
	}
	////////////////////////커넥션 연결
	public Connection getConnection() {
		Connection conn = null;//위에 빨간줄 없애기 위해 conn에 null 지정 후 돌려주자
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			// 실패는 꼭 써주되, 성공은 굳이 안써도됨.
			System.out.println("db연동 실패");
		}
		
		return conn;
		
	}
	////////////////////////insert
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, major, grade;
		
		System.out.println("학생명은?");
		name = sc.nextLine();
		System.out.println("학과는?");
		major = sc.nextLine();
		System.out.println("학년은?");
		grade = sc.nextLine();
		
		String sql = "insert into univ values(null,?,?,?,now())";
		
		Connection conn = null;
		PreparedStatement pstmt = null; //이거 있으면 소,대 따옴표 안써도됨
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			//?,?,? 인자값 완성
			pstmt.setString(1, name); //index - 몇번째 위치?
			pstmt.setString(2, major);
			pstmt.setString(3, grade);
			
			//update
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///////////////////////////////select
	
	public void select() {
		System.out.println("시퀀스\t이름\t전공\t학년\t현재날짜");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		String sql = "select * from univ order by num asc";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("num")
						+"\t" + rs.getString("name")
						+"\t" + rs.getString("major")
						+"\t" + rs.getString("grade")
						+"\t" + rs.getDate("sdate"));
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
	/////////////////////////////delete
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		int num;
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		System.out.println("삭제할 번호?");
		num = sc.nextInt();
		
		String sql = "delete from univ where num = " + num;
		System.out.println(sql);
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int a = pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	////////////////////////////update
	
	public void update() {
		Scanner sc = new Scanner(System.in);
		String name, major, grade, num;
		
		System.out.println("수정할 번호 입력");
		num = sc.nextLine();
		System.out.println("수정할 이름 입력");
		name = sc.nextLine();
		System.out.println("수정할 전공 입력");
		major = sc.nextLine();
		System.out.println("수정할 학년 입력");
		grade = sc.nextLine();
		
		String sql = "update univ set name= ?,major = ?,grade = ? where num = ?";
		System.out.println(sql);
		Connection conn = null;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, major);
			pstmt.setString(3, grade);
			pstmt.setString(4, num);
			
			int a = pstmt.executeUpdate();
			if(a == 0)
				System.out.println("수정할 데이터 없음");
			else
				System.out.println("수정됨쓰");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

	////////////////////////////////출력메인
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysqlDb_01 mdb = new MysqlDb_01();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.println("1.입력   2.출력   3.삭제   4.수정   0.종료");
			n = Integer.parseInt(sc.nextLine());
			
			if(n == 1) {				
				mdb.insert();
				System.out.println("입력완료");	
			}
			else if(n == 2)
				mdb.select();
			else if(n == 3)
				mdb.delete();
			else if(n == 0) {
				System.out.println("종료");
				break;				
			}
			else if (n == 4)
				mdb.update();
		}
	}

}
