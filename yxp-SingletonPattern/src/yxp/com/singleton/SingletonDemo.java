package yxp.com.singleton;

public class SingletonDemo {
	/**
	*@author xiaopeng
	*@date 2018��3��22��
	*����ģʽ��ʵ��֮����01�������ʼ��ʱ��������һ�����ʵ����
	* ȷ��һ����ֻ��һ��ʵ������Ϊ����ϵͳ�ṩһ��ȫ�ַ��ʵ� (������ϵͳ�ṩ���ʵ��)��
	*/
	
	//ʵ����һ��˽�еľ�̬����
	private static SingletonDemo singletonDemo =  new SingletonDemo();
	
	/**
	 * ˽�еĹ��췽��
	 */
	private SingletonDemo() {
		
	}
	
	/**
	 * ����һ����̬��ȫ�ַ��������ص�ǰ���һ��ʵ������̬����������������������Ҫʹ�ø���ʱ��ֱ�ӵ��ø÷�����ʵ�ֶ����ֻʹ��ͬһ�����ʵ��
	 * @return
	 */
	public static SingletonDemo getSingletonDemo() {
		return singletonDemo;
	}
	
}
