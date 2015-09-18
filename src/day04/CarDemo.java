package day04;

/*
 * 描述小汽车
 * 
 * 分析：
 * 1.属性。
 * 轮胎数。
 * 颜色
 *2.行为。
 *运行
 *
 *定义类其实就是定义类中的成员
 *成员：成员变量<-->属性，成员函数<-->行为。
 *
 *成员变量和局部变量的区别：
 *1.
 *成员变量定义在类中，整个类中都可以访问。
 *局部变量定义在函数中，语句，局部代码快中，只在所属的区域有效。
 *2.
 *成员变量存在于堆内存的对象中。
 *局部变量存在于栈内存的方法中。
 *3.
 *成员变量随着对象的创建而存在，随着对象的消失而消失。
 *局部变量随着所属区域的执行而存在，随着所属区域的结束而释放。
 *4.
 *成员变量都有默认初始化值。
 *局部变量没有默认初始化值。
 *
 */class Car
{
	 int num;
	 String color;
	 void run()
	 {
		 System.out.println(num+"..."+color);
		 
	 }
}

public class CarDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		//在计算机中创建一个car的实例，通过 new关键字。
	//	Car c= new Car();//c 就是一个类类型的引用变量，指向了该类的对象。
	//	c.num=4;
		//c.color="red";	c.run();//要使对象中的内容可以通过， 对象.成员   的形式来完成调用。
	//Car c1=new Car();
	//Car c2=new Car();
	//show(c1);
	//show(c2);

	/*
	 * 匿名对象：没有名字的对象
	 * new Car（）；//匿名对象。其实就是定义对象的简写方式。
	 * 
	 * 
	 * Car c=new car();一个对象对方法进行2次调用
	 * c.run();
	 * c.run(); 
	 * 
	 * new Car().run();两个对象分别对方法进行调用。
	 * new Car().run();
	 * 1.当对象对*方法*仅进行一次调用的时候，就可以简化成匿名对象。
	 * new Car(). num=5;
	 * new Car().color="green";
	 * new Car().run();
	 * 2.匿名对象可以作为实际参数的传递
	 * 
	 */
	//Car c1=new Car（）；
	//show（c1）；
	show(new Car());
	}
	
	
	
public static void show(Car c)//类类型的变量一定指向对象，要不就是null
{
	c.num=3;
	c.color="black";
	System.out.println(c.num+"..."+c.color);
}
	
	
}
