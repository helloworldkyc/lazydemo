package Day03;

public class ArrayTest {

	public static void main(String[] args) {
		String week =getWeek(1);
		System.out.println(week);
		
	}
		// TODO �Զ����ɵķ������

		/*
		 * ʹ�ò����
		 * ���ڡ�
		 * String s ="abc";
		 * int  x=4;
		 */
		public static String getWeek(int num)
		{
			
			if(num>7|| num<1 )
			{
				return "���������";
			}
			String [ ] weeks ={" ","������","����һ","���ڶ�","������",
					"������","������","������"};
					return weeks [num];
			}
		}
