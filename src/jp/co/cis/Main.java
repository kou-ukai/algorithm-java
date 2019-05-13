package jp.co.cis;

import jp.co.cis.sort.BubbleSort;

public class Main {

	/**
	 * メインルーチンです。
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();

		// 並び替え対象配列生成
		int in[] = createArray();

		// 変更前表示
		System.out.println("before---------");
		print(in);

		// 並び替え
		int[] out = bubbleSort.sort(in);

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
