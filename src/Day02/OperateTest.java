package Day02;

public class OperateTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//最有效率的方式算出2乘以8等于几？
		//System.out.println(2<<3);
		//对两个整数变量的值进行互换(不能用第三变量)
		int a=3,b=5;
		//a=b;
		//System.out.println("a="+a+",b="+b);
		//a = a + b; 
		//b = a - b;
		//a = a - b;
		a = a ^b;//a=3^5;
		b = a ^b;//b=(3^5)^5;b=3;
		a = a ^b;//a=(3^5)^3;a=5;
		System.out.println("a="+a+",b="+b);
	}

}
