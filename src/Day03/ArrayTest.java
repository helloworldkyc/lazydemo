package Day03;

public class ArrayTest {

	public static void main(String[] args) {
		String week =getWeek(1);
		System.out.println(week);
		
	}
		// TODO 自动生成的方法存根

		/*
		 * 使用查表法。
		 * 星期。
		 * String s ="abc";
		 * int  x=4;
		 */
		public static String getWeek(int num)
		{
			
			if(num>7|| num<1 )
			{
				return "错误的星期";
			}
			String [ ] weeks ={" ","星期日","星期一","星期二","星期三",
					"星期四","星期五","星期六"};
					return weeks [num];
			}
		}
