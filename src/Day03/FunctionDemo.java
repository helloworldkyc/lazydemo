package Day03;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("hello world");
		System.out.println(add(3,5));
		draw(8,8);
		System.out.println(equal(6,6));
		
	}


/*
 ����1������һ�����ܣ�������������ĺ͵Ļ�ȡ��
 ˼·����Ȼ���幦�ܣ����ǿ����ú��������֡�
 ��ζ���һ�������أ�
 ͨ��������ȷ����ɡ�
 ��ȷһ��������ܵĽ����ʲô���Ǻ͡��ǹ��ܵĽ�������Ըù��ܵķ���ֵ����int
 ��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
 �У������ͱ������������Ĳ����б������������������ͣ�
 ע�⣺����ֵ���ͺ͡���������û��ֱ����ϵ*/
 	public static int add (int a,int b)
 	{
 		int sum =a+b;
 		return sum;
 	}
  /*����2������һ�����ܣ���һ�������ڿ���̨�� 
   * ��ȷһ��������ܵĽ����ʲô��
   * û�н������Ϊֱ�Ӵ�ӡ���˿���̨����δ���ظ������ߡ���void��ʾ��
   * ��ȷ�����������ʵ�ֹ������Ƿ���Ҫ���ݲ������㣿
   * �У��к��в�ȷ��������������int
*/
 public static void draw(int row, int col)
 {
	 for(int x=1;x<=row;x++)
	 {
		 for(int y=1;y<=col;y++)
			 {
			 System.out.print("*");
			 }
	 System.out.println();
	 }		 
	 return;
	 }

/*����3������һ�����ܣ��Ƚ��������Ƿ���ȡ�
 * ��ȷ1��������ܽ����ʲô��
 * �н����boolean��
 * ��ȷ2���������ʵ�ֹ������Ƿ���Ҫ���ݲ������㣿
 * �У�����������
*/
public static boolean equal(int a,int b)
{
	/*if(a==b)
		return false;
	return true;*/
	return a==b;//ִ�е�returnʱ��������ִ�У�����������������break
}
	
}