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
	
	//������
	public DbDriver_02() {
		try {
			Class.forName(driver);
			System.out.println("����Ŭ ����̹� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����Ŭ ����̹� ����");
		}
	}
	
	/////////// conncetion
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, "katatj", "skfo0762");
			System.out.println("db ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db ���� ����..");
		}
		return conn; 
				
	}
	
		
		
	/////////////insert
	public void insert() {
		
		Scanner sc = new Scanner(System.in);
		String name, age, addr;
		String sql = "";
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���");
		age = sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		addr = sc.nextLine();
		
		sql = "insert into member values (seq_mem.nextval,'"+name+"','"+age+"','"+addr+"',sysdate)";
		//�޸����� ���� ����
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
		System.out.println("������ \t�̸�\t����\t�ּ�\t���糯¥");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //��ȸ�� ���̺� ���·� ������ִ� ��ü
		//�������� , �������� ����ʵ� ���
		String sql = "select * from member order by no desc"; //desc ����.. asc ���� 
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//select���� �׻� result set
			//select ���� ��û�ϹǷ� excuteQuery�޼ҵ带 �̿��ؼ� Resultset ��ü�� ���� ��´�.
			
			//2�� �̻��� ���� ����� �� �� while 
			while(rs.next()) //���� ���� true�� ��ȯ
			{
				//rs�� next�� �̿��ؼ� ���� �����ϰ�, get�޼ҵ带 �̿��ؼ� ���̺��� �÷����� ��´�.
				System.out.println(rs.getInt("no")//��������("�÷���")
				+ "\t" + rs.getString("name")
				+ "\t" + rs.getString("age")//���ڿ�("�÷���")
				+ "\t" + rs.getString("addr") 
				+ "\t" + rs.getDate("sdate"));  //��¥("�÷���")
				
				
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
		
		System.out.println("������ ��ȣ?");
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
		
		
		System.out.println("������ ��ȣ?");
		no = sc.nextLine();
		System.out.println("������ �̸�?");
		name = sc.nextLine();
		System.out.println("������ ����?");
		age = sc.nextLine();
		System.out.println("������ �ּ�?");
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
			System.out.println("1.�Է�   2.���. 3.����   4.����   9.����");
			n = Integer.parseInt(sc.nextLine());  //��� ���ڿ��� ĭ�� �ֱ�
			
			if(n == 1)
				db2.insert();
			else if (n == 2)
				db2.select();
			else if (n == 9) {
				System.out.println("����");
				break;
			}
			else if (n == 3)
				db2.delete();
			else if (n == 4)
				db2.update();
			
		}
		
	}
}
