package day04;
/*
 * 在子父类中，成员的特点体现。
 * 1.成员变量。
 * 2.成员函数
 * 3.构造函数。
 * 
 */
//1.成员变量
/*
 * 当本类的成员和局部变量同名用this区分。
 * 当父类中的成员变量同名用super区分父类。
 * this 和super的用法很相似
 * this：代表本类对象的引用。
 *super：代表一个父类空间。 
 */
class   Fu
{
	   int num=4;
}
class Zi   extends Fu
{
	   int num=5;
	void show ( )
	{
		System.out.println(this.num+"..."+super.num);
	}
}

public class ExendsDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Zi z=new Zi( );
			z.show();
	}

}
