package Day03;

public class OperateDemo5 {

	public static void main(String[] args) {
		int x= 0,y;
		y = (x>1)?100:200;
		// TODO 自动生成的方法存根
		System.out.println("y="+y);
		//获取两个整数中的较大的整数。
		int a=1,b=1;
		int max = a > b?a:b;
		System.out.println(max);
		//获取三个整数中的较大的整数。
		int o=0,p=1,q=2;
		int temp =o>p?o:p;
		int max2 =(temp>q)?temp:q;
		System.out.println(max2);
	}

}
