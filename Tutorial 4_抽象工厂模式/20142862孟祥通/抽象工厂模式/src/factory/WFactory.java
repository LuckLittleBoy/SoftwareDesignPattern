package factory;

public class WFactory implements EFactory{

	@Override
	public Man produceMan() {
		// TODO �Զ����ɵķ������
		return new WMan();
	}

	@Override
	public Woman produceWoman() {
		// TODO �Զ����ɵķ������
		return new WWoman();
	}

}
