package Day05;
/*
 * 抽象类：
 * 抽象：笼统，模糊，看不懂，不具体。
 * 
 * 
 * 特点：
 * 1.方法只有声明没有实现时，该方法就是抽象方法，需要被abstract修饰。
 * 抽象方法必须定义在抽象类中。该类必须也被abstract修饰。
 * 2.抽象类不可以被实例化，为什么？
 * 因为调用抽象方法没意义。
 * 3.抽象类必须有其子类覆盖了所有抽象方法后，该子类才可以实例化。
 * 否则，这个子类还是抽象类。
 * 
 * 
 * 1.抽象类中有构造函数吗？
 * 有，用于子类对象进行初始化。
 * 
 * 2.抽象类可以不定义抽象方法吗？
 * 可以的。但是很少见，目的就是不让该类创建对象。 AWT的适配对象就是这种类。
 * 通常这个类中的方法有方法体，但是却没有内容。
 * 
 * 3.抽象关键字不可以和那些关键字共存？
 * private  不行。无法子类被覆盖
 * static  不行。   
 * final  不行。
 * 
 * 4.抽象类和一般类的异同点？
 * 相同点：
 * 两者都是用了描述事物的，都在内部定了成员。
 * 不同：
 * 1.一般类有足够信息描述事物。
 * 		抽象类描述事物的信息有可能不足。
 * 2.一般类中不能定义抽象方法，只能定义非抽象方法。
 * 抽象类中可定义抽象方法，同时可以定义非抽象方法。
 * 抽象类不可以被实例化，一般类可以。
 * 
 * 
 * 5.抽象类一定是个父类吗？
 * 是的。因为需要子类覆盖其方法后才可以对子类实例化。
 */
abstract class Demo
{
	abstract void show( );
}



class DemoA extends Demo
 {
	 void show( )
	 {
		 System.out.println("demoa show");
	 }
 }
 class DemoB extends Demo
 {
	 void show( )
	 {
		 System.out.println("demob show");
	 }
 }
 
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
/*public class A
{
    public A()
    {
    }
}
public class B extends A
{
    public B()
    {
    }
}
等价于：
public class A
{
    public A()
    {
        super();//这里实际上是Object();
        //其他初始化工作
    }
}
public class B extends A
{
    public B()
    {
        super();//这里实际上是A();
        //其他初始化工作
    }
}
另外，如果有这种情况：
public class A
{
    X x=new X();
    public A()
    {
    }
}
public class B extends A
{
    Y y=new Y();
    public B()
    {//这是类A空间里的字段都已经初始化完毕。
    }
}
在成员y被赋值之前，x一定已经存在。换句话说，X x=new X();一定先于Y y=new Y();执行。*/
//所谓“实例化子类的对象前要先实例化父类中的内容，为父类初始化”，是指当子类正在实例化时，
//总是链式调用父类构造方法初始化父类空间。换句话说，子类的构造方法必须先调用父类的构造方法，
//完了才能干别的初始化工作。如果子类没有显式调用语句，编译器会隐式帮你加上。