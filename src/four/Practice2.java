package four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by rider on 2018/11/21.
 *
 * 写一个程序，产生25个int类型的随机数。对于每一个随机数，使用if-else语句来
 * 为其分类为大于、小于、或者等于紧随他随机生成的值
 */
public class Practice2 {

	private static final int index = 25;

	public static void main(String[] args) {
		int[] arr = new int[index];
		Random random = new Random(47);
		List<Integer> lessList = new ArrayList<>();
		List<Integer> moreList = new ArrayList<>();
		List<Integer> equalList = new ArrayList<>();
		for (int i = 0; i < index - 1; i++) {
			arr[i] = random.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(i==arr.length-1)
				break;
			if (arr[i] > arr[i + 1]) {
				moreList.add(arr[i]);
			} else if (arr[i] < arr[i + 1]) {
				lessList.add(arr[i]);
			} else {
				equalList.add(arr[i]);
			}
		}

		System.out.println(lessList);
		System.out.println(moreList);
		System.out.println(equalList);
	}
}
