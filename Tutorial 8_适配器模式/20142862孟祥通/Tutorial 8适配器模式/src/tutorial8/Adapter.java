package tutorial8;

public class Adapter implements Cat,Dog{
	
	private Cat cat;
	private Dog dog;
	@Override
	public void wang() {
		// TODO �Զ����ɵķ������
		System.out.println("èģ�¹���");
		dog.wang();
	}
	@Override
	public void mouse() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��è��");
		cat.mouse();
	}
	
	public void setCat(Cat cat)
	{
		this.cat = cat;
	}
	public void setDog(Dog dog)
	{
		this.dog = dog;
	}

}
