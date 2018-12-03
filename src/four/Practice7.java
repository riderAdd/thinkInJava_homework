package four;

/**
 * Created by rider on 2018/11/21.
 * <p>
 * 写一个程序，打印从1到100的值；通过使用break关键字是的在打印到99时退出；然后尝试用
 * return来达到相同的目的
 */
public class Practice7 {

	public static void main(String[] args) {
		normal();
		System.out.println();
		breakExit();
		System.out.println();
		returnExit();
	}

	private static void normal() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	private static void breakExit() {
		for (int i = 1; i <= 100; i++) {
			if (i == 100)
				break;
			System.out.println(i);
		}
	}

	private static void returnExit() {
		for (int i = 1; i <= 100; i++) {
			if (i == 100)
				return;
			System.out.println(i);
		}
	}
}
