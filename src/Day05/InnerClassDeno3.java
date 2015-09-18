package Day05;
/*
 * 内部类可以存放在局部位置上。
 * 
 * 内部类在局部位置上只能访问局部中被final修饰的局部变量。
 */
class Outer01
{
	int num=3;
	void method()
	{
		final int x=9;
		class Inner
		{
			void show()
			{
				System.out.println("show..."+x);
			}
		}
		Inner in=new Inner();
		in.show();
	}
}
public class InnerClassDeno3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
			new Outer01().method();
	}

}
