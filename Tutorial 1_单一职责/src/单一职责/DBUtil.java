package ��һְ��;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private String driverStr = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String connStr = "jdbc:sqlserver://localhost:1433; DatabaseName=Test";
	private String dbusername = "sa";
	private String dbpassword = "meng19950628";
	private Connection conn = null;
	
	
	public DBUtil()
	{
		try
		{
			Class.forName(driverStr);
			conn = DriverManager.getConnection(connStr, dbusername, dbpassword);
		}
		catch (Exception e)
		{
			System.out.println("�޷�ͬ���ݿ⽨�����ӣ�");
		}
	}
	public Connection getConnection()
	{
		return conn;
	}
}
