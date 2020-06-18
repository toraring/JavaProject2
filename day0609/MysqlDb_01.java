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
	
	//������
	public MysqlDb_01() {
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
		Connection conn = null;//���� ������ ���ֱ� ���� conn�� null ���� �� ��������
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			// ���д� �� ���ֵ�, ������ ���� �Ƚᵵ��.
			System.out.println("db���� ����");
		}
		
		return conn;
		
	}
	////////////////////////insert
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, major, grade;
		
		System.out.println("�л�����?");
		name = sc.nextLine();
		System.out.println("�а���?");
		major = sc.nextLine();
		System.out.println("�г���?");
		grade = sc.nextLine();
		
		String sql = "insert into univ values(null,?,?,?,now())";
		
		Connection conn = null;
		PreparedStatement pstmt = null; //�̰� ������ ��,�� ����ǥ �Ƚᵵ��
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			//?,?,? ���ڰ� �ϼ�
			pstmt.setString(1, name); //index - ���° ��ġ?
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
		System.out.println("������\t�̸�\t����\t�г�\t���糯¥");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
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

		System.out.println("������ ��ȣ?");
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
		
		System.out.println("������ ��ȣ �Է�");
		num = sc.nextLine();
		System.out.println("������ �̸� �Է�");
		name = sc.nextLine();
		System.out.println("������ ���� �Է�");
		major = sc.nextLine();
		System.out.println("������ �г� �Է�");
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
				System.out.println("������ ������ ����");
			else
				System.out.println("�����ʾ�");
			
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
		MysqlDb_01 mdb = new MysqlDb_01();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.println("1.�Է�   2.���   3.����   4.����   0.����");
			n = Integer.parseInt(sc.nextLine());
			
			if(n == 1) {				
				mdb.insert();
				System.out.println("�Է¿Ϸ�");	
			}
			else if(n == 2)
				mdb.select();
			else if(n == 3)
				mdb.delete();
			else if(n == 0) {
				System.out.println("����");
				break;				
			}
			else if (n == 4)
				mdb.update();
		}
	}

}
