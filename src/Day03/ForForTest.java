package Day03;

public class ForForTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*
 
 	*****
 	****
 	***
	**
 	*
 	外层循环管行数，内层循环控列数。
 */
		
		/*int z=5;
		for(int x=1;x<=5;x++)//1-5  2-5  3-5  //1-5  1-4  1-3
		{
			for(int y=1;y<=z;y++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			z--;*/
		for(int x=5;x>=1;x--)
		{
			for(int y=x;y<=5;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}

