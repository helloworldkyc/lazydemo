/*
 * �ˣ�
 * ���ԣ�
 * ���䡣
 * ��Ϊ��
 * ˵���� 
 * 
 * private: ˽�У���һ��Ȩ�����η����������γ�Ա��
 * ˽�е�����ֻ�ڱ�������Ч��
 * ע�⣺˽�н����Ƿ�װ��һ�����ֶ��ѡ�
 */
package day04;
class  Person
{
		private/*˽��*/	int age;
		public void setAge(int a)
		{
			age =a;
		}
		public int getAge()
		{
			return age;
		}
		/*public void haha(int a)
		{
			if(a>0&& a<100)
			{
			age =a;
			speak();
		}
			else
				System.out.println("����Ľ��");
		}*/
	 void speak()
	 {
		 System.out.println("age="+age);
	 }
}

public class ��װ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person p = new Person	();
	//	p.age= 20;
	//	p.haha(20);
		//p.speak();
		
	}

}
