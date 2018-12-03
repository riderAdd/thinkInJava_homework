package four;

/**
 * Created by rider on 2018/12/3.
 * 写一个switch开关语句，为每个case打印一个消息。然后把这个switch放进for循环来测试每个
 * case。分别测试有break和没有break两种情况。
 */
public class Practice8 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
//			test1(i);
			test2(i);
		}
	}

	public static void test1(int i) {
		switch (i) {
			case 1:
				System.out.println("I am 1 test");
				break;
			case 2:
				System.out.println("I am 2 test");
				break;
			case 3:
				System.out.println("I am 3 test");
				break;
			case 4:
				System.out.println("I am 4 test");
				break;
			case 5:
				System.out.println("I am 5 test");
				break;
			default:
				System.out.println("I am default");
		}
	}

	public static void test2(int j) {
		switch (j) {
			case 1:
				System.out.println("I am 1 test");
			case 2:
				System.out.println("I am 2 test");
			case 3:
				System.out.println("I am 3 test");
			case 4:
				System.out.println("I am 4 test");
			case 5:
				System.out.println("I am 5 test");
			default:
				System.out.println("I am default");
		}
	}

}
