package four;

/**
 * Created by rider on 2018/11/21.
 *
 * 写一个程序，使用两个嵌套的for循环和取余操作符来探测和打印素数
 */
public class Practice4 {

	public static void main(String[] args) {

	}

	/**
	 * 判断素数函数
	 */
	private boolean checkNum(int i) {
		boolean flag = true;
		if (i == 0) {
			System.out.println("输入错误");
		}
		if (i == 1) {
			return flag;
		}

		for(int a=2;a*a<i*i;a++) {
			if (i % a == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
