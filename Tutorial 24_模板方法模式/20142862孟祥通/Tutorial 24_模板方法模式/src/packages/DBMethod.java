package packages;

public abstract class DBMethod {

	public abstract void connDB();
	
	public void openDB()
	{
		System.out.println("�����ݿ�");
	}
	public void useDB()
	{
		System.out.println("ʹ�����ݿ�");
	}
	public void closeDB()
	{
		System.out.println("�ر����ݿ�");
	}
	
	public void process()
	{
		this.connDB();
		this.openDB();
		this.useDB();
		this.closeDB();
	}
}
