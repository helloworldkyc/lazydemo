package Day05;
/*
 * 为什么内部类能直接访问外部类中成员呢？
 * 那是因为内部类持有了外部类的引用。   外部名.this
 */
class Outer
{
	int num=3;
	class Inner{
		int num=4;
	void show()
	{
		int num=5;
		System.out.println(this.num);
	}
	}
	void method()
	{
		new Inner().show();
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
			new Outer().method();
	}

}
