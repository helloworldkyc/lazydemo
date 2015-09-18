package Day05;
/*
 * 抽象类和接口的异同点：
 * 相同点：
 * 都是向上抽取而来的。
 * 
 * 
 * 
 * 不同点：
 * 1.抽象类需要被继承，而且只能单继承。
 * 接口需要被实现，而且可以多实现。
 * 2.抽象类中可以定义抽象方法和非抽象方法，子类继承后可以直接使用非抽象方法。
 * 接口中只能定义抽象方法，必须由子类去实现。
 * 3.抽象类的继承，是 is a 关系，在定义该体系的基本共性内容。
 * 接口的实现是 like a 关系，在定义体系额外功能。
 * 
 * 
 * 犬按功能分：导盲犬，搜爆犬。
 * 
 * abstract class 犬
 * {
 * abstract  void吼叫（）
 * ｝
 *  abstract class 导盲
 *  ｛
 *  	//abstract void 导盲（）
 *  	interface 导盲
 * ｝
 * class 导盲犬 extends 犬 implements 导盲
 * ｛
 * 		public void 吼叫（）
 * ｛
 * ｝
 *｝ 
 *
 //在不同的问题领域中，有不同的分析方式。
 */
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
