package Day05;
/*
 * �����ࣺ
 * ������ͳ��ģ�����������������塣
 * 
 * 
 * �ص㣺
 * 1.����ֻ������û��ʵ��ʱ���÷������ǳ��󷽷�����Ҫ��abstract���Ρ�
 * ���󷽷����붨���ڳ������С��������Ҳ��abstract���Ρ�
 * 2.�����಻���Ա�ʵ������Ϊʲô��
 * ��Ϊ���ó��󷽷�û���塣
 * 3.����������������า�������г��󷽷��󣬸�����ſ���ʵ������
 * ����������໹�ǳ����ࡣ
 * 
 * 
 * 1.���������й��캯����
 * �У��������������г�ʼ����
 * 
 * 2.��������Բ�������󷽷���
 * ���Եġ����Ǻ��ټ���Ŀ�ľ��ǲ��ø��ഴ������ AWT�����������������ࡣ
 * ͨ��������еķ����з����壬����ȴû�����ݡ�
 * 
 * 3.����ؼ��ֲ����Ժ���Щ�ؼ��ֹ��棿
 * private  ���С��޷����౻����
 * static  ���С�   
 * final  ���С�
 * 
 * 4.�������һ�������ͬ�㣿
 * ��ͬ�㣺
 * ���߶���������������ģ������ڲ����˳�Ա��
 * ��ͬ��
 * 1.һ�������㹻��Ϣ�������
 * 		�����������������Ϣ�п��ܲ��㡣
 * 2.һ�����в��ܶ�����󷽷���ֻ�ܶ���ǳ��󷽷���
 * �������пɶ�����󷽷���ͬʱ���Զ���ǳ��󷽷���
 * �����಻���Ա�ʵ������һ������ԡ�
 * 
 * 
 * 5.������һ���Ǹ�������
 * �ǵġ���Ϊ��Ҫ���า���䷽����ſ��Զ�����ʵ������
 */
abstract class Demo
{
	abstract void show( );
}



class DemoA extends Demo
 {
	 void show( )
	 {
		 System.out.println("demoa show");
	 }
 }
 class DemoB extends Demo
 {
	 void show( )
	 {
		 System.out.println("demob show");
	 }
 }
 
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
/*public class A
{
    public A()
    {
    }
}
public class B extends A
{
    public B()
    {
    }
}
�ȼ��ڣ�
public class A
{
    public A()
    {
        super();//����ʵ������Object();
        //������ʼ������
    }
}
public class B extends A
{
    public B()
    {
        super();//����ʵ������A();
        //������ʼ������
    }
}
���⣬��������������
public class A
{
    X x=new X();
    public A()
    {
    }
}
public class B extends A
{
    Y y=new Y();
    public B()
    {//������A�ռ�����ֶζ��Ѿ���ʼ����ϡ�
    }
}
�ڳ�Աy����ֵ֮ǰ��xһ���Ѿ����ڡ����仰˵��X x=new X();һ������Y y=new Y();ִ�С�*/
//��ν��ʵ��������Ķ���ǰҪ��ʵ���������е����ݣ�Ϊ�����ʼ��������ָ����������ʵ����ʱ��
//������ʽ���ø��๹�췽����ʼ������ռ䡣���仰˵������Ĺ��췽�������ȵ��ø���Ĺ��췽����
//���˲��ܸɱ�ĳ�ʼ���������������û����ʽ������䣬����������ʽ������ϡ�