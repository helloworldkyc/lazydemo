package Day03;

public class WhileTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 练习：
		 * 1-100之间6的倍数出现的次数并打印符合条件的X值
		 * 要求自己独立完成思想的书写。和步骤的文字的描述。
		 */
		int x=1;
		int count =0;
		while(x<100)
		{
			if(x%6==0){
			count++;
			System.out.println("x="+x);
			}
			x++;
		}
		System.out.println("count="+count);
	}

}
