package packages;

import java.util.ArrayList;

public class Folder extends AbstractFile{

	private ArrayList list = new ArrayList();
	@Override
	public void operation() {
		// TODO �Զ����ɵķ������
		for(Object obj:list)
		{
			((AbstractFile)obj).operation();
		}
	}

	@Override
	public void add(AbstractFile f) {
		// TODO �Զ����ɵķ������
		list.add(f);
		System.out.println("��ӳɹ�");
	}

	@Override
	public void remove(AbstractFile f) {
		// TODO �Զ����ɵķ������
		list.remove(f);
		System.out.print("ɾ���ɹ�");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO �Զ����ɵķ������
		return (AbstractFile)list.get(i);
	}

}
