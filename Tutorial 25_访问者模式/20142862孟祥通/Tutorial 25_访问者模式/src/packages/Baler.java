package packages;

public class Baler extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("���Ա" + name + "��ƻ�������");
	}
	
	public void visit(Book book)
	{
		System.out.println("���Ա" + name + "��������");
	}

	@Override
	public void visit(Apple apple, Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("���Ա" + name + "�����ƻ�������");
	}
}
