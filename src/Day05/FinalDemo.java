package Day05;
//�̳б׶ˣ������˷�װ�ԡ�
/*
 * final�ؼ��֣�
 * 1.final��һ�����η������������࣬������������
 * 2.final���ε��಻���Ա��̳С�
 * 3.final���εķ��������Ա����ǡ�
 * 4.final���εı�����һ��������ֻ�ܸ�ֵһ�Ρ�
 * 
 * ΪʲôҪ��final���α�������ʵ�ڳ������һ�������ǹ̶��ģ�
 * ��ôֱ��ʹ��������ݾͿ����ˣ����������Ķ��Բ������������������ơ�
 * ��������������Ƶ�ֵ���ܱ仯�����Լ���final�̶���
 * 
 * д���淶������������ĸ����д��������ʣ��м��� _ ���ӡ� 
 * 
 */
//final class   Fu
class Fu
{
	void method( )
	//final void method( )
	{
		//�����˵ײ�ϵͳ����Դ��
	}
}
	class Zi extends Fu
{
	void method ( )
	{
		final int x=9;
		//x=9;
		System.out.println(x);
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			
		{
			System.out.println("");
		}
	}

}
