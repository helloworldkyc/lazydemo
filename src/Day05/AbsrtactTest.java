package Day05;
/*��Աʵ����
 * ���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
 * ��Ŀ�������������������ţ�нˮ�����н��𣬹������ݡ�
 * �Ը�������������ݽ�ģ��
 * 
 *
 * ������
 * ��������������У����ҳ��漰�Ķ���
 * ͨ��������������
 * ����Ա��
 * ���ԣ����������ţ�нˮ��
 * ��Ϊ��������
 * ������
 * ���ԣ����������ţ�нˮ������
 * ��Ϊ��������
 * 
 * 
 * ����Ա�;�����������ֱ�ӵļ̳й�ϵ��
 * ���ǳ���Ա�;���ȴ���й������ݡ�
 * ���Խ��г�ȡ����Ϊ���Ƕ��ǹ�˾�Ĺ�Ա
 * ���Խ�����Ա�;������г�ȡ��������ϵ��
 * 
 */
//������Ա��
abstract class Employee
{
	private String name;
	private  String id;
	private double pay;
	Employee(String name,String id,double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	public abstract void work( );
}
//��������Ա��
class Programmer extends Employee
{
	Programmer(String name, String id,double pay )
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("code..");
	}
}

//����������
class Manager extends Employee
{
	private int bonus;
Manager(String name, String id,double pay )
	{
		super(name,id,pay);
		this.bonus=bonus;
	}
	public void work()
	{
		System.out.println("manage");
	}
	 
}




public class AbsrtactTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}