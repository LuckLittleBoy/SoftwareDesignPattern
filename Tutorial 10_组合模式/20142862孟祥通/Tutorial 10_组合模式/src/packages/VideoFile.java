package packages;

public class VideoFile extends AbstractFile{

	@Override
	public void operation() {
		// TODO �Զ����ɵķ������
		System.out.println("һ��ý���ļ�");
	}

	@Override
	public void add(AbstractFile f) {
		// TODO �Զ����ɵķ������
		System.out.println("ý���޷�����ӽڵ�");
	}

	@Override
	public void remove(AbstractFile f) {
		// TODO �Զ����ɵķ������
		System.out.println("ý���޷�ɾ���ӽڵ�");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
