package Day05;
/*abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
	
}

��һ���������еķ������ǳ����ʱ����ʱ���Խ��ó���������һ����ʽ
����ͱ�ʾ�����ǽӿ� interface��

*/
//����ӿ�ʹ�õĹؼ��ֲ��� class���� interface��
/*
 * ���ڽӿڵ��г����ĳ�Ա����Щ��Ա���й̶������η���
 * 1.ȫ�ֳ�����public static final
 * 
 * 2.���󷽷���public abstract
 * �ɴ˵ó����ۣ��ӿ��еĳ�Ա���ǹ�����Ȩ�ޡ�
 */
interface Demo01
{
	public static int NUM =4;
	abstract void show1();
	abstract void show2();
}
//������֮���Ǽ̳й�ϵ������ӿ�֮����ʵ�ֹ�ϵ��
/*
 * �ӿڲ�����ʵ������
 * ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ������еĳ��󷽷�
 */
class DemoImpl implements/* ʵ��*/Demo01
{
	public  void show1(){}
	public void show2(){}
}

/*
 *��java�в�ֱ��֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ���ԡ�
 *����java����̳л��ƽ��и�������java�б���˶�ʵ�֡�
 *һ�������ʵ�ֶ���ӿ� 
 * 
 */

interface A
{
	public void show();
}
interface Z
{
	public void show( );
}
class Test implements A,Z//��ʵ��
{
	public void show()
	{
		
	}
}
/*
 * һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ���ӿڡ�
 
 */
class Q
{
	public void method()
	{}
}
class Test2 extends Q implements A,Z
{
	public void show(){}
}
/*
 * �ӿڵĳ��ֱ����˵��̳еľ����ԡ�   �ӿ�û�з�����
 */
interface CC
{
	void show();
}
interface MM
{
	void method();
}
interface QQ extends  CC,MM//�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿڿ��Զ�̳С�
{
	void function();
}
abstract class WW implements QQ//����������������
{
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Test t=new Test();
			t.show();
		//DemoImpl d=new DemoImpl();
	//	System.out.println(d.NUM);//�������
		//System.out.println(DemoImpl.NUM);//�������
	//	System.out.println(Demo01.NUM);//�ӿ����Ƶ����Լ��ľ�̬��Ա
	}

}
