package packages;

public class Bus extends Che{

	@Override
	public void drive(String name) {
		// TODO �Զ����ɵķ������
		String cheType = "Bus";
		this.road.bedrive(cheType, name);
	}

}
