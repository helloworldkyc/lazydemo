package Day05;
/*
 * �ڲ�����Դ���ھֲ�λ���ϡ�
 * 
 * �ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ��б�final���εľֲ�������
 */
class Outer01
{
	int num=3;
	void method()
	{
		final int x=9;
		class Inner
		{
			void show()
			{
				System.out.println("show..."+x);
			}
		}
		Inner in=new Inner();
		in.show();
	}
}
public class InnerClassDeno3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
			new Outer01().method();
	}

}
