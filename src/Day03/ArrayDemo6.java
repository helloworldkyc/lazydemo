
package Day03;
import java.util.*;
public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//int[ ]arr={4,1,5,7,3,8,2};
		int[ ]arr={13,15,19,28,33,45,78,106};
		//int index=getIndex(arr,78);
		//int key=halfSearch(arr,100);
		//System.out.println("index="+index);
		int key=Arrays.binarySearch(arr, 100);//������ڣ����صľ���ĽǱ�λ�ã������ڣ����� -�����-1
		System.out.println("key="+key);
	}
	/*���ֲ��ҷ���
	 * 
	 */
	/*�����⣺
	 * ����һ�����飬������������д洢һ��Ԫ�أ�����֤������黹������ģ�
	 * ��ô���Ԫ�صĴ洢�ĽǱ����λ�ȡ��
	 * ��13��15��19��28��33��45��78��106����
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
	
	
	
/*���鳣�����ܣ����ҡ�
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
