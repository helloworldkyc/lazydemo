package Day03;
import java.util.*;
public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		
		int [ ] arr ={34,19,11,109,3,56};
		printarray(arr);
		//selectsort(arr);
		 //bubblesort (arr);
		//Arrays.sort(arr);
		selectsort_2(arr);
		System.out.println();
		printarray(arr);
	}
	public static void printarray( int[ ]arr  )//����һ�����ܣ���������ı�����
	{ 
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.print(arr[x]+"]");
			
		}
		
		
		}
	/*ѡ������
	 * 
	 */
	public static void selectsort (int [ ]arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
				
			}
			
		}
		
	}
	
	/*ð������
	 * 
	 */
	public static void bubblesort (int [] arr)
	{
		for(int x =0;x<arr.length-1;x++)
		{
		for(int y=0;y<arr.length-1-x;y++ )
		{
			if(arr[y]>arr[y+1])
			{
				swap(arr,arr[x],arr[y]);
			}
		}
	}
	}
	/*Ч������
	 * 
	 */
	public static void selectsort_2(int [] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			int num=arr[x];
			int index=x;
		for(int y=x+1; y<arr.length;y++)
		{
			if(num>arr[y])
			{
				num=arr[y];
				index =y;
				
			}
			
			
		}
			if(index!=x)
				swap( arr,x,index);
		}
		
	}
	public static void swap(int [] arr,int a,int b)
	{
		int temp;
		temp=arr[ a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	
	
	
	}
