package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Dbtest_01 {
	
	//����̹�, url 
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	
	//������- �ϳ��� �޼ҵ�� �޼ҵ� ������� �ٸ����� ����
	public Dbtest_01() {
		try {
			Class.forName(driver);
			System.out.println("����Ŭ ����̹� ����!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����Ŭ ����̹� ���Ф�");
		}
		
	}
	///////////////////////////////Ŀ�ؼ�
	public Connection getConnection()
	{
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, "katatj", "skfo0762");//������ ������ ���
			System.out.println("��������");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("��������");
			e.printStackTrace();
		} 
		
		return conn;
		
	}
	
	//////////////////insert
	public void insert()
	{
		Scanner sc = new Scanner(System.in);
		String name, addr;
		String sql; //insert sql �ۼ��� ���� ����.
		
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		addr = sc.nextLine();
		
		//���� ����ǥ�� sql���� ���°Ÿ� ���ڶ� ����. ���ڸ� ���� �ʿ� ����
		sql = "insert into hello values(seq_h.nextval, '" + name + "','" + addr + "', sysdate)";
		System.out.println(sql);
		
		//1.db����
		Connection conn = null;
		
		//2. statement
		Statement stmt = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			//sql�� ���ۿ� �ʿ��� statement ��ü�� createSTatement��ü�� ���� ����.
			//sql�� ����.. insert��
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("insert ����"+ e.getMessage());
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
		System.out.println("������ \t�̸�\t�ּ�\t���糯¥");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //��ȸ�� ���̺� ���·� ������ִ� ��ü
		//�������� , �������� ����ʵ� ���
		String sql = "select * from hello order by num desc"; //desc ����.. asc ���� 
		
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
				System.out.println(rs.getInt("num")//��������("�÷���")
				+ "\t" + rs.getString("name")//���ڿ�("�÷���")
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
/////////////////////////////////////////////delete
	public void delete()
	{
		Scanner sc = new Scanner(System.in);
//		String name, addr;
//		int num;
		String num;
//		String sql = "";
//		ResultSet rs = null;
		
		
		System.out.println("������ ��ȣ?");
		num = sc.nextLine();
		String sql = "delete from hello where num = " + num; //'*'�� ���� ����. 	
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql); //�������鼭 �ٽ� ���õ� //������ ���ڵ� ���� ��ȯ
			
			if (a == 0)
				System.out.println("���� ������ ��ȣ�Դϴ�.");//���� ��ȣ �Է½� ���� �������� �����Ƿ� 0�� ��ȯ
			else
				System.out.println("�����Ǿ����ϴ�."); //�����Ǹ� 1�� ��ȯ
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
		String sql; // update sql �ۼ��� ���� ����
		
		System.out.println("������ ��ȣ�� �Է��ϼ���");
		num = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		addr = sc.nextLine();
		
		//���� ����ǥ�� sql���� ���°Ÿ� ���ڶ� ����. ���ڸ� ���� �ʿ� ����
		sql = "update hello set name ="+ name + ",addr= '" + addr +"' where num =" + num;
		System.out.println(sql);
		
		//1.db����
		Connection conn = null;
		
		//2. statement
		Statement stmt = null;
		
		conn = getConnection();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
			
			if(a == 0)
				System.out.println("������ �����Ͱ� �������� ����");
			else
				System.out.println("������");
			
		} catch (SQLException e) {
			System.out.println("insert ����"+ e.getMessage());
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
		
		//�����Լ��� ������ �߰��� �� �� �ְ� ���ǹ� ����	
		Scanner sc = new Scanner(System.in);
		int n = 0; //1,2,3,4, ���� ������ ����
		
		while(true)  //while�� break �� ������.
		{
		 System.out.println("1.insert  2.select  3.delete  4.update  0.����");
		 n = Integer.parseInt(sc.nextLine());
		 
		 if(n == 1)
			 db.insert();
		 else if (n == 0)
		 {
			 System.out.println("����!");
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
