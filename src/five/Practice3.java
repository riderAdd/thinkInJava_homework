package five;

/**
 * Created by rider on 2018/12/3.
 * 创建一个带默认构造器的类，在构造器中打印一条消息。为这个类创建一个对象。
 */
class Person {
	public Person() {
		System.out.println("I am birth");
	}
}

public class Practice3 {

	public static void main(String[] args) {
		Person person = new Person();
	}

}
