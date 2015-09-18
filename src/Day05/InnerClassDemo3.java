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
		};//匿名内部类子类对象
		//obj.show( );//因为匿名内部类这个子类对象被向上转型为了object类型。
							//这样就不能在使用子类特有的方法了。
	}
}
public class InnerClassDemo3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
				new Outer().method();
	}

}
