package Day03;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr =new int[3];
		System.out.println(arr[3]);
		//当访问到的数组中不存在角标时，会发生异常。
		arr= null;
		System.out.println(arr[3]);
		//当引用变量没有任何实体指向时，还在用起操作实体，会发生异常。
		
	}

}
