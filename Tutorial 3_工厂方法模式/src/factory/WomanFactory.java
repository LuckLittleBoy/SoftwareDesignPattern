package factory;

public class WomanFactory extends PeopleFactory {

	@Override
	public People CreatePeople() {
		// TODO �Զ����ɵķ������
		return new WomanPeople();
	}

}
