/*
 * �ڲ�������ص㣺
 * 1.�ڲ������ֱ�ӷ����ⲿ��Ķ���
 * 2.�ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ���Ķ���
 * 
 * һ�����������ơ�
 * ��������ʱ�����ָ����������л����������������ﻹ�ڷ��ʱ�������������ݡ�
 * ��ʱ���ǻ��е����ﶨ����ڲ�����������
 */
class Outer
{
	private  static   int   num=3;
	
	static class Inner //�ڲ���
	{
		void show ( )
		{
			System.out.println("show run..."+num);
		}
	}
	public void method ( )
	{
		Inner in =new Inner();
		in.show();
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

			//Outer out = new Outer( );
			//out.method();
		//ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա��
		//����ڲ����Ǿ�̬�ģ��൱��һ���ⲿ�ࡣ
		//����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬�ġ�
		//����ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬�ġ�
		Outer.Inner in= new Outer.Inner();
		in .show();
	}

}
