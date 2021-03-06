package Day06;
/*
 * 异常处理的捕捉形式：
 * 这是可以对异常进行针对性处理的方式。
 * 
 * 具体格式是：
 * try
 * ｛ 
 * 			//需要被检测的代码。
 * ｝ 
 * catch（异常类 变量）//该变量用于接收发生的异常对象
 * ｛
 * 处理异常的代码。
 * ｝
 * finally
 * ｛
 * 		//一定会被执行的代码。
 * ｝
 * 
 * 
 * 异常处理的原则：
 * 1.函数内容如果抛出需要检测的异常，那么函数上必须要声明。
 * 否则必须在函数内用try catch捕捉，否则编译失败。
 * 
 * 2.如果调用到了声明异常的函数，要么trycatch要么throws，否则编译失败。
 * 
 * 3.什么时候catch，什么时候throws呢？
 * 功能内容可以解决，用catch。
 * 解决不了，用throws告诉调用者，由调用者解决。
 * 
 * 
 * 
 * 
 */

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
