package factory;

public class YFactory implements EFactory{

	@Override
	public Man produceMan() {
		// TODO �Զ����ɵķ������
		return new YMan();
	}

	@Override
	public Woman produceWoman() {
		// TODO �Զ����ɵķ������
		return new YWoman();
	}

}
