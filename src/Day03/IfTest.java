package Day03;

public class IfTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*需求：根据用户指定的具体数据，判断该数据对应的星期。
 * 1-星期一Monday
 * 思路：用户输入无法获取但是那只是具体数据的一种获取手段而已。
 * 而我们要做的功能仅仅是对用户的数据进行对应星期的打印而已。
 * 所以具体数据不确定，完成可以使用变量来表示。
 * 我们只对变量进行操作即可。至于变量的值，可以有用户决定。
 * 因为数据的不确定性，所以对数据进行判断。
 */ 
		/*int week=8;
		if (week==1)
			System.out.println(week+"对应的中文是星期一");
		else	if (week==2)
			System.out.println(week+"对应的中文是星期二");
		else if (week==3)
			System.out.println(week+"对应的中文是星期三");
		else	if (week==4)
			System.out.println(week+"对应的中文是星期四");
		else	if (week==5)
			System.out.println(week+"对应的中文是星期五");
		else	if (week==6)
			System.out.println(week+"对应的中文是星期六");
		if (week==7)
			System.out.println(week+"对应的中文是星期日");
		else 
			System.out.println(week+"无对应星期");
	}

}*/
		/*一年有四季。
		春季：3 4 5
		夏季：6 7 8
		秋季：9 10 11
		冬季：12 1 2
		根据用户输入的月份，给出对应的季节。
		*/
		int month=4;
		/*if (month==3|| month==4 || month==5)
		System.out.println(month+"月是春季");
		*/
		if (month<1 || month>12)
		if (month>=3&& month<=5)
			System.out.println(month+"月是春季");
	}
}
		
		
		
		
		
		
		
		
		
		
		

