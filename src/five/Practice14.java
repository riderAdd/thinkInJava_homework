package five;

/**
 * Created by rider on 2018/12/3.
 * 编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块中初始化。
 * 现在，加入一个静态方法用以打印出两个字段值。请证明它们都会在被使用之前完成初始化动作。
 */
class Person2 {

	// 静态域
	static String name = "卡卡西";

	// 静态域
	static String birthPlace;

	// 静态块
	static {
		birthPlace = "木叶";
	}

	Person2() {
		System.out.println(birthPlace +":"+ name);
	}

	// 静态方法
	static void Sout() {
		System.out.println("name:" + name + "---birthPlace:" + birthPlace);
	}

}

public class Practice14 {

	public static void main(String[] args) {
		Person2 person2 = new Person2();
	}
}
