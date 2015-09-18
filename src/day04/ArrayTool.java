
/**
 * 建立一个用于操作数组的工具类，其中包含着常见的对数组操作的函数如：最值，排序。
 * @author 匡永昌
 * @version V1.0
 */
package day04;

public class ArrayTool {
	private ArrayTool(){ }//该类中方法都是静态的，所以该类是不需要创造对象的
	//可以将构造函数私有化。
/**获取整数数组的最大值。
 * @param arr 接收一个元素类型为 int类型的数组。
 * 
 */public static int getMax( int[]arr)
	{
		int maxIndex=0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[maxIndex])
				maxIndex=x;
	}
		return arr[ maxIndex]; 
}
 	public static  void selectSort(int[] arr)
 	{
 		for(int x=0; x<arr.length-1;x++)
 		{
 			for(int y=x+1;y<arr.length;y++)
 			{
 				if(arr[x]>arr[y])
 					swap(arr,x,y);
 			}
 		}
 	}
 	    private  static    void swap(int [] arr,int a,int b)
 	{
 		int temp=arr[a];
 		arr[a]=arr[b];
 		arr[b]=temp;
 	}
 	    public   static   int getIndex(int[]arr,int key)
 	    {
 	    	for(int x=0;x<arr.length;x++ )
 	    	{
 	    		if(arr[x]==key)
 	    			return x;
 	    	}
 	    	return -1;
 	    }
 	    public String arrayToString(int[ ]arr)
 	    {
 	    	String str="[";
 	    	for(int x=0;x<arr.length;x++)
 	    	{
 	    		if(x!=arr.length -1)
 	    			str=str+arr[x]+","+"]";
 	    	}
 	    	return str;
 	    }
 	 
	}


