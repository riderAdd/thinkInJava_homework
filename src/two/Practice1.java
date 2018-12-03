package two;

/**
 * Created by rider on 2018/11/21.
 *
 * 创建一个类，它包含一个int域和一个char域，它们都没有被初始化，将他们的值打印出来，
 * 以验证java执行了默认初始化
 */
public class Practice1 {

	private int i;

	private char c;

	public static void main(String[] args) {
		Practice1 practice1 = new Practice1();
		System.out.println(practice1.i+"------"+practice1.c);
	}

}
