package Day02;

public class OperateTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����Ч�ʵķ�ʽ���2����8���ڼ���
		//System.out.println(2<<3);
		//����������������ֵ���л���(�����õ�������)
		int a=3,b=5;
		//a=b;
		//System.out.println("a="+a+",b="+b);
		//a = a + b; 
		//b = a - b;
		//a = a - b;
		a = a ^b;//a=3^5;
		b = a ^b;//b=(3^5)^5;b=3;
		a = a ^b;//a=(3^5)^3;a=5;
		System.out.println("a="+a+",b="+b);
	}

}
