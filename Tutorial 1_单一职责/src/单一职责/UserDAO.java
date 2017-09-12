package ��һְ��;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class UserDAO
{
	DBUtil db;
	Statement stmt = null;
	public UserDAO(DBUtil db)
	{
		this.db = db;
		try {
			stmt = this.db.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	public int executeUpdate(String s)
	{
		int result = 0;
		try
		{
			result = stmt.executeUpdate(s);
		}
		catch (Exception e)
		{
			System.out.println("ִ�и��´���");
		}
		return result;
	}
	
	public boolean findUser(String userName,String userPassword)
	{
		ResultSet rs = null;
		String s = "select * from UserLogin";
		try
		{
			rs = stmt.executeQuery(s);
		} 
		catch (Exception e)
		{
			System.out.println("ִ�в�ѯ����");
		}
		try {
			if(rs.next())
			{
				if(rs.getString(1).equals(userName) && rs.getString(2).equals(userPassword))
				{
					JOptionPane.showMessageDialog(null, "��¼�ɹ�","��¼��ʾ", JOptionPane.INFORMATION_MESSAGE); 
				}
				else
				{
					JOptionPane.showMessageDialog(null, "�������", "������ʾ", JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			JOptionPane.showMessageDialog(null, "���û�δע��", "������ʾ", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}

	public ResultSet executeQuery(String s)
	{
		ResultSet rs = null;
		try
		{
			rs = stmt.executeQuery(s);
		} 
		catch (Exception e)
		{
			System.out.println("ִ�в�ѯ����");
		}
		return rs;
	}

	public void close()
	{
		try
		{
			stmt.close();
			db.getConnection().close();;
		}
		catch (Exception e)
		{
		}
	}
}

