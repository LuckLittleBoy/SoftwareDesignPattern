package packages;

public class ImageFile extends AbstractFile {

	@Override
	public void operation() {
		// TODO �Զ����ɵķ������
		System.out.println("һ��ͼƬ");
	}

	@Override
	public void add(AbstractFile f) {
		// TODO �Զ����ɵķ������
		System.out.println("ͼƬ�޷�����ӽڵ�");
	}

	@Override
	public void remove(AbstractFile f) {
		// TODO �Զ����ɵķ������
		System.out.println("ͼƬ�޷�ɾ���ӽڵ�");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
