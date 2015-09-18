package Day05;
/*
 * 多态时，
 * 成员特点：
 * 1.成员变量。
 * 编译时：参考引用型变量所属的类中是否有调用的成员变量，有，通过，无，失败。
 * 运行时：参考引用型变量所属的类中是否有调用的成员变量，并运行所属类中的成员变量。
 * 简单说：编译和运行都参考等号的左边、
 * 
 * 2.成员函数。（非静态）
 * 编译时：参考引用型变量所属的类中是否有调用的函数，有，编译通过，没有，编译失败。
 * 运行时：参考的是对象所属的类中是否有调用的函数。
 * 简单说：编译看左边，运行看右边。
 * 3.静态函数。
 * 编译时：参考引用型变量所属的类中是否有调用的静态方法
 * 运行时：参考引用型变量所属的类中是否有调用的静态方法
  */
class Fu02
{
	//int num=3;
	void  show( )
	{
		System.out.println("fu show");
	}
}

class Zi02 extends Fu02
{
	//int num =4;
	void  show( )
	{
		System.out.println("zi show");
	}
}


public class DuoTaiDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Fu02 f=new Zi02( );//子类覆盖父类，只存在于函数中，成员变量不存在覆盖关系。
		System.out.println();
	}

}
