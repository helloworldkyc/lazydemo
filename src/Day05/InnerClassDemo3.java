package Day05;

class Outer02
{
	void method()
	{
		Object obj=new Object()
		{
			public void show( )
			{
				System.out.println("show run");
			}
		};//�����ڲ����������
		//obj.show( );//��Ϊ�����ڲ�����������������ת��Ϊ��object���͡�
							//�����Ͳ�����ʹ���������еķ����ˡ�
	}
}
public class InnerClassDemo3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
				new Outer().method();
	}

}
