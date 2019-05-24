package jp.co.cis;

import jp.co.cis.sort.SelectionSort;

public class Main {

	/**
	 * メインルーチンです。
	 * @param args
	 */
	public static void main(String[] args) {

		// 並び替え対象配列生成
		int in[] = createArray();

		// 変更前表示
		System.out.println("before---------");
		print(in);

		// バブルソート
//		BubbleSort bubbleSort = new BubbleSort();
//		int[] out = bubbleSort.sort(in);
		
		// 選択ソート
		SelectionSort sort = new SelectionSort();
		int[] out = sort.sort(in);

		// 変更後表示
		System.out.println("after---------");
		print(out);
	}

	/**
	 * 0～99の整数配列を生成します。
	 * @return
	 */
	private static int[] createArray() {
		int in[] = new int[10];
		final int max = in.length;
		for(int i = 0; i < max; i++) {
			in[i] = (int) (Math.random() * 100);
		}

		return in;
	}

	/**
	 * 配列の値を一行で表示します。
	 * @param ary
	 */
	private static void print(int[] ary) {
		for(int val: ary) {
			System.out.print(String.format("%2d", val) + " ");
		}
		System.out.println();
	}

}
