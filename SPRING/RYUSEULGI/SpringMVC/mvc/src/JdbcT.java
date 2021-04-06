import java.sql.*;

class JdbcT 
{
	Connection con;
	Statement stmt;
	JdbcT(){
		//(1) ����Ŭ �帮�̹� �ε� 
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("(1) ����Ŭ �帮�̹� �ε� ����");
		}catch(ClassNotFoundException cf){
			System.out.println("(1) ����Ŭ �帮�̹� �ε� ����");
		}

		//(2) Ŀ�ؼ� ���� 
		try{
			String url = "jdbc:oracle:thin:@192.168.0.9:1521:JAVA";
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("(2) ����Ŭ�� Ŀ�ؼ� ���� ����");
		}catch(SQLException se){
			System.out.println("(2) ����Ŭ�� Ŀ�ؼ� ���� ����");
		}

		//(3) Statement  ���� / ����
		ResultSet rs = null;
		try{
			String sql = "select * from DEPT";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("(3) Statement  ���� / ���� ����");
		}catch(SQLException se){
			System.out.println("(3) Statement  ���� / ���� ����");
		} 

        //(4) ResultSet ������ ����
		try{
			System.out.println("��ȣ\t�μ��̸�\t��ġ");
			System.out.println("------------------------------------");
			while(rs.next()){
				int no = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(no+"\t"+dname+"\t"+loc);
			}
		}catch(SQLException se){
		}

		//(5) ���� ��ü�� �ݱ� 
		try{
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			System.out.println("(5) ���� ��ü�� �ݱ� ����");
		}catch(SQLException se){}
	}
	public static void main(String[] args) 
	{
		new JdbcT();
	}
}
