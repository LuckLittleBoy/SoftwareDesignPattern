package packages;
public class Customer extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("�˿�" + name + "ѡƻ����");
	}
	
	public void visit(Book book)
	{
		System.out.println("�˿�" + name + "���顣");
	}

	@Override
	public void visit(Apple apple, Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("�˿�" + name + "�����ѡƻ����");
	}
}