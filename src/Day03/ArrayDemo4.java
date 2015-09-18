package Day03;

public class ArrayDemo4 {
				public static void main(String[] args) {
					int [ ] arr ={34,19,11,109,3,56};
					int max =getMax(arr);
					System.out.println("max="+max);
				}
	/*
	 * 获取数组中的最大值。
	 * 思路：
	 * 1.需要进行比较，并定义变量记录每次比较后较大的值。
	 * 2.对数组中的元素进行遍历取出，和变量中的记录的元素进行比较。
	 * 3.遍历结果，该变量记录就是最大值。
	 * 
	 * 
	 * 定义一个功能来实现。
	 * 明确一，结果。
	 * 是数组中的元素。int
	 * 明确二，未知内容。
	 * 数组
	 */
					
	public static int getMax(int[] arr)
	{
			int max=arr[0];
			for(int x=0; x<arr.length;x++)
			{
				if(arr[x]>max)
				max=arr[x];
			}
			return max;
		}
}

