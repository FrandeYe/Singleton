package yxp.com.singleton;

public class SingletonDemo1 {
	/**
	*@author xiaopeng
	*@date 2018��3��22��
	*����ģʽ��ʵ�ַ���2���ӳ�ʵ������
	*�뷽��1����һ��
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
