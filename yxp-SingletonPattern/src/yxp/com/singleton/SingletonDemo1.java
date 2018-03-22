package yxp.com.singleton;

public class SingletonDemo1 {
	/**
	*@author xiaopeng
	*@date 2018年3月22日
	*单例模式的实现方法2（延迟实例化）
	*与方法1基本一样
	*/
	
	private static SingletonDemo1 singletonDemo1;
	
	private SingletonDemo1() {}
	
	public static SingletonDemo1 getSingletonDemo1() {
		if (singletonDemo1 == null) {
			singletonDemo1 = new SingletonDemo1();
		}
		return singletonDemo1;
	}
	
}
