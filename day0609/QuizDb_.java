package day0609;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class QuizDb_ {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String pass = "1234";
	
	//������
	public QuizDb_() {
		try {
			Class.forName(driver);
			System.out.println("mysql����̹� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("mysql����̹� ����");
		}
		
	}
	////////////////////////Ŀ�ؼ� ����
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			System.out.println("db���� ����");
		}
		
		return conn;
		
	}
	////////////////////////insert
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, ban, title, content;
		
		System.out.println("�л�����?");
		name = sc.nextLine();
		System.out.println("�Ҽӹ���?");
		ban = sc.nextLine();
		System.out.println("������?");
		title = sc.nextLine();
		System.out.println("������?");
		content = sc.nextLine();
		
		String sql = "insert into inf values(null,?,?,?,?,now())";
		
		Connection conn = null;
		PreparedStatement pstmt = null; 
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, name); 
			pstmt.setString(2, ban);
			pstmt.setString(3, title);
			pstmt.setString(4, content);
			
			//update
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///////////////////////////////select
	
	public void select() {
		System.out.println("No\t�̸�\t�Ҽ�\t����\t����\t���糯¥");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		String sql = "select * from inf order by num asc";
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
						+"\t" + rs.getString("ban")
						+"\t" + rs.getString("title")
						+"\t" + rs.getString("content")
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

		System.out.println("������ ��ȣ?");
		num = sc.nextInt();
		
		String sql = "delete from inf where num = " + num;
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
		String name, ban, title, content;
		
		System.out.println("������ �л�����?");
		name = sc.nextLine();
		System.out.println("������ �Ҽӹ���?");
		ban = sc.nextLine();
		System.out.println("������ ������?");
		title = sc.nextLine();
		System.out.println("������ ������?");
		content = sc.nextLine();
		
		
		String sql = "update  set name= ?,major = ?,grade = ? where num = ?";
		System.out.println(sql);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, ban);
			pstmt.setString(3, title);
			pstmt.setString(4, content);

			
			int a = pstmt.executeUpdate();
			if(a == 0)
				System.out.println("������ ������ ����");
			else
				System.out.println("������");
			
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

	////////////////////////////////��¸���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizDb_ qz = new QuizDb_();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.println("1.�Է�   2.���   3.����   4.����   0.����");
			n = Integer.parseInt(sc.nextLine());
//			n = sc.nextInt();
			
			if(n == 1) {				
				qz.insert();
				System.out.println("�Է¿Ϸ�");	
			}
			else if(n == 2)
				qz.select();
			else if(n == 3)
				qz.delete();
			else if(n == 0) {
				System.out.println("����");
				break;				
			}
			else if (n == 4)
				qz.update();
		}
	}

}
