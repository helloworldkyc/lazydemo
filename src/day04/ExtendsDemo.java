package day04;

/*�̳еĺô���
 * 1.��ߴ���ĸ����ԡ�
 * 2.��������֮������˹�ϵ����������������̬�ṩ��ǰ�ᡣ
 * 
 * 
 * 
 * java��֧�ֵ��̳У���ֱ��֧�ֶ�̳У�����c++�еĶ�̳л��ƽ��и�����
 * ���̳У� һ������ֻ����һ��ֱ�Ӹ��ࡣ
 * 
 * ��̳У�һ����������ж��ֱ�Ӹ��ࣨjava�в��������и�����
 * 				��ֱ��֧�֣���Ϊ�������������ͬ��Ա����������ò�ȷ���ԡ�
 *  java֧�ֶ��̳С�
 *  C�̳�B,B�̳�A.
 *  
 *  ��Ҫʹ��һ���̳���ϵʱ��
 *  1.�鿴����ϵ�еĶ����࣬�˽���ϵ�Ļ������ܡ�
 *  2.��ϵ�е������������ɹ��ܵ�ʹ�á�
 *  
 *  ʲôʱ����̳��أ�
 *  ��������֮�����������ϵ��ʱ�򣬾Ͷ���̳С�
 *  ������ϵ�� is a
 *  
 */
class Person03{
	String name;
	int age;
	
}



class Student  extends/*�̳�*/Person03
{
	//String name;
	//int age;
	void study()
	{
		System.out.println(name+"...student study.."+age);
	}
}

class Worker extends/*�̳�*/Person03
{
	//String name;
	//int age;
	void work()
	{
		System.out.println("worker work");
	}
}


public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Student s=new Student( );
			s.name="zhangsan";
			s.age=20;
			s.study();
	}

}
