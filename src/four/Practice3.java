package four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by rider on 2018/11/21.
 *
 * 修改练习2，把代码用一个while无限循环包括起来。然后运行它直到用键盘中断其运行
 */
public class Practice3 {

	public static void main(String[] args) {
		Random random = new Random(47);
		List<Integer> lessList = new ArrayList<>();
		List<Integer> moreList = new ArrayList<>();
		List<Integer> equalList = new ArrayList<>();
		int current, next;
		current = random.nextInt(1000);
//		int i = 0;
		while (true) {
			System.out.println(current);
			next = random.nextInt(1000);
			if (current > next) {
				moreList.add(current);
			} else if (current < next) {
				lessList.add(current);
			}else
				equalList.add(current);

			current = next;
			System.out.println(lessList);
			System.out.println(moreList);
			System.out.println(equalList);
		}

	}
}
