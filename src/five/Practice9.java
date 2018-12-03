package five;

/**
 * Created by rider on 2018/12/3.
 * 编写具有两个构造器的类，并且在第一个构造器中通过this调用第二个
 * 构造器
 */
class Cat {
	public Cat() {
		System.out.println("I am default");
	}

	public Cat(String name) {
		this();
		System.out.println("I have name" + name);
	}
}

public class Practice9 {

	public static void main(String[] args) {
		Cat cat = new Cat("佩恩");

	}
}
