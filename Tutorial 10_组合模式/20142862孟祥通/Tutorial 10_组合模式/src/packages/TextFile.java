package packages;

public class TextFile extends AbstractFile{

	@Override
	public void operation() {
		// TODO �Զ����ɵķ������
		System.out.println("һ���ı��ļ�");
	}

	@Override
	public void add(AbstractFile f) {
		// TODO �Զ����ɵķ������
		System.out.println("�ı��޷�����ӽڵ�");
	}

	@Override
	public void remove(AbstractFile f) {
		// TODO �Զ����ɵķ������
		System.out.println("�ı��޷�ɾ���ӽڵ�");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
