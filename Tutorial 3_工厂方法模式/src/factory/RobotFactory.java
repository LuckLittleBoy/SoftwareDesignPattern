package factory;

public class RobotFactory extends PeopleFactory {

	@Override
	public People CreatePeople() {
		// TODO �Զ����ɵķ������
		return new RobotPeople();
	}

}
