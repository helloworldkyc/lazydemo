package day04;
/*
 * ���Ӹ����У���Ա���ص����֡�
 * 1.��Ա������
 * 2.��Ա����
 * 3.���캯����
 * 
 */
//1.��Ա����
/*
 * ������ĳ�Ա�;ֲ�����ͬ����this���֡�
 * �������еĳ�Ա����ͬ����super���ָ��ࡣ
 * this ��super���÷�������
 * this���������������á�
 *super������һ������ռ䡣 
 */
class   Fu
{
	   int num=4;
}
class Zi   extends Fu
{
	   int num=5;
	void show ( )
	{
		System.out.println(this.num+"..."+super.num);
	}
}

public class ExendsDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Zi z=new Zi( );
			z.show();
	}

}
