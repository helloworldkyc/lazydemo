package Day03;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello world");
		System.out.println(add(3,5));
		draw(8,8);
		System.out.println(equal(6,6));
		
	}


/*
 需求1：定义一个功能，完成两个整数的和的获取。
 思路：既然定义功能，就是可以用函数来体现。
 如何定义一个函数呢？
 通过两个明确来完成。
 明确一：这个功能的结果是什么？是和。是功能的结果，所以该功能的返回值类型int
 明确二：这个功能实现过程中是否需要未知内容参与运算？
 有，加数和被加数。函数的参数列表（参数个数，参数类型）
 注意：返回值类型和·参数类型没有直接联系*/
 	public static int add (int a,int b)
 	{
 		int sum =a+b;
 		return sum;
 	}
  /*需求2：定义一个功能，画一个矩形在控制台。 
   * 明确一：这个功能的结果是什么？
   * 没有结果，因为直接打印到了控制台，并未返回给调用者。用void表示。
   * 明确二：这个功能实现过程中是否需要内容参与运算？
   * 有，行和列不确定。两个。整数int
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

/*需求3：定义一个功能，比较两个数是否相等。
 * 明确1：这个功能结果是什么？
 * 有结果，boolean。
 * 明确2：这个功能实现过程中是否需要内容参与运算？
 * 有，两个整数。
*/
public static boolean equal(int a,int b)
{
	/*if(a==b)
		return false;
	return true;*/
	return a==b;//执行到return时不再向下执行，而是跳出。类似于break
}
	
}