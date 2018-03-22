package yxp.com.singleton;

public class SingletonDemo {
	/**
	*@author xiaopeng
	*@date 2018年3月22日
	*单例模式的实现之方法01（当类初始化时立即创建一个类的实例）
	* 确保一个类只有一个实例，并为整个系统提供一个全局访问点 (向整个系统提供这个实例)。
	*/
	
	//实例化一个私有的静态引用
	private static SingletonDemo singletonDemo =  new SingletonDemo();
	
	/**
	 * 私有的构造方法
	 */
	private SingletonDemo() {
		
	}
	
	/**
	 * 创建一个静态的全局方法，返回当前类的一个实例（静态工厂方法），当其他类需要使用该类时，直接调用该方法，实现多个类只使用同一个类的实例
	 * @return
	 */
	public static SingletonDemo getSingletonDemo() {
		return singletonDemo;
	}
	
}
