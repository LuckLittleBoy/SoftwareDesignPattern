package packages;
public class Saler extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("����Ա" + name + "��ƻ�����ӣ�Ȼ�������۸�");
	}
	
	public void visit(Book book)
	{
		System.out.println("����Ա" + name + "ֱ�Ӽ�����ļ۸�");
	}

	@Override
	public void visit(Apple apple, Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա" + name + "����۸�");
	}
}