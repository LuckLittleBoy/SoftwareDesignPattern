package factory;

public class ManFactory extends PeopleFactory {

	@Override
	public People CreatePeople() {
		// TODO �Զ����ɵķ������
		return new ManPeople();
	}

}
