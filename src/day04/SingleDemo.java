package day04;

/*
 * ���ģʽ����������֮��Ч�Ľ����ʽ����ʵ����һ��˼�롣
 * 1.�������ģʽ��
 * ��������⣺���Ա�֤һ�������ڴ��е�Ψһ�ԡ�
 * ������ڶ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤�����Ψһ�ԡ�
 * ��α�֤�����Ψһ���أ�
 * 1.����������������new�����������
 * 2.�ڸ����д���һ������ʵ����
 * 3.�����ṩһ������������������Ի�ȡ�ö���
 * 
 * ���裺
 * 1.˽�л����๹�캯����
 * 2.ͨ��new�ڱ����д���һ�����׶���
 * ����һ�����еķ������������Ķ��󷵻ء�
 * 
 * 
 */
class Single
{
	   private static  Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
		
	}
}
public class SingleDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			//Single ss=Single.s;
		Single s1=Single.getInstance();
	}

}




