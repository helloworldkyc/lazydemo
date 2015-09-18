package day04;

public class ArrayToolDemo {
/*
 * 保证程序的独立运行
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			int []arr={4,8,6,7,9};
			//ArrayTool tool=new ArrayTool();
			int max=ArrayTool.getMax(arr);
			int index=ArrayTool.getIndex(arr, 10);
			System.out.println("max="+max);
			System.out.println("index="+index);
	}
			/**获取整型数组的最大值。
			 * 
			 */

}