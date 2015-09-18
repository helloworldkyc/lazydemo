
package Day03;
import java.util.*;
public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//int[ ]arr={4,1,5,7,3,8,2};
		int[ ]arr={13,15,19,28,33,45,78,106};
		//int index=getIndex(arr,78);
		//int key=halfSearch(arr,100);
		//System.out.println("index="+index);
		int key=Arrays.binarySearch(arr, 100);//如果存在：返回的具体的角标位置；不存在：返回 -插入点-1
		System.out.println("key="+key);
	}
	/*二分查找法。
	 * 
	 */
	/*面试题：
	 * 给定一个数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，
	 * 那么这个元素的存储的角标该如何获取？
	 * ｛13，15，19，28，33，45，78，106｝；
	 * 
	 */
	
	
	public static int halfSearch_2(int [ ]arr,int key)
	{
		int max,min, mid;
		min=0;
		max=arr.length-1;
	while(max>=min)
	{
		mid=(max+min)>>1;
		if(key>arr[mid])
			min=mid+1;
		else if (key<arr[mid])
			max=mid-1;
		else
			return mid;
	}
	return min ;
	}
	public static int halfSearch(int [ ]arr,int key)
	{
		int max,min, mid;
		min=0;
		max=arr.length-1;
		mid=(max+min)/2;
		while (arr[mid]!=key)
		{
			if(key>arr[mid])
				min=mid+1;
			else if (key<arr[mid])
				max=mid-1;
			if(max<min)
				return min ;
			mid=(max+min)/2;
		}
		return mid;
	}
	
	
	
/*数组常见功能：查找。
 * 
 */
	public static int getIndex(int[]arr,int key )
	{
		for(int x=0;x<arr.length;x++ )
		{
			if(arr[x]==key)
				return x;
	}
	return -1;
	
}
}
