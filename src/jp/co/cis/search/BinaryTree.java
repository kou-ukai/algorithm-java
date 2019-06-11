package jp.co.cis.search;

/**
 * 二分木を用いて探索するクラスです
 *
 */
public class BinaryTree {

	/**
	 * 配列aryからsearchの位置を探索します。
	 * @param ary
	 * @param search
	 * @return
	 */
	public int search(int[] ary, int search) {
		// TODO 二分木で探索する処理を実装してください。

		int length = ary.length;

		//考える配列の一番小さいindex番号
		int left = 1;
		//考える配列の一番大きいindex番号
		int right = length;

		int tmp = right + left;

		//配列の数の中央値の値(tmp/2)が求める値と一致するまでループする
		//(tmp/2-1) としているのは配列は0から始まるが、配列の数は1から数えているため
		while (ary[tmp / 2 - 1] != search) {
			if (ary[tmp / 2 - 1] > search) {
				right = tmp / 2;
				System.out.println("right" + right);
			} else {
				left = tmp / 2 + 1;
				System.out.println("left" + left);
			}
			tmp = right + left;
		}

		return tmp / 2;

	}

}
