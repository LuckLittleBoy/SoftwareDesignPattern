package factory;

public class BFactory implements EFactory{

	@Override
	public Man produceMan() {
		// TODO �Զ����ɵķ������
		return new BMan();
	}

	@Override
	public Woman produceWoman() {
		// TODO �Զ����ɵķ������
		return new BWoman();
	}

}
