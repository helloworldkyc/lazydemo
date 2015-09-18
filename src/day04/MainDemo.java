package day04;

/*主函数特殊之处：
 * 1.格式是固定的。
 * 被jvm所识别和调用。
 * 
 * public：因为权限必须是最大的。
 * static：不需要对象的，直接用主函数所属类名调用即可。
 * void：主函数没有具体的返回值。
 * main：函数名，不是关键字，只是一个jvm识别的固定的名字。
 * String[] args：这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型。
 *  
*/





public class MainDemo {

	public static void main(String[] args) {//new String[0]
		// TODO 自动生成的方法存根
			System.out.println(args);
			System.out.println(args.length);
	}

}
