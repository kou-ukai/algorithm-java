package jp.co.cis.sort;

/**
 * バブルソートで並び替えるクラスです。
 *
 */
public class BubbleSort {

	/**
	 * 配列の値を小さい順に並び替えた結果を返却します。
	 * 
	 * @param ary
	 * @return
	 */
	public int[] sort(int[] ary) {

		// ソート結果格納先
		int[] ans = ary.clone();

		// 添え字での最大値
		final int max = ans.length - 1;

		// 比較下限を先頭からカウントアップ
		for (int i = 0; i < max; i++) {

			// 比較対象を後ろの要素からカウントダウン
			for (int j = max; j > i; j--) {

				if (ans[j] < ans[j - 1]) {

					// 後ろの要素[j]が前の要素[j - 1]より小さい場合、
					// 前の要素と交換する
					int temp = ans[j];
					ans[j] = ans[j - 1];
					ans[j - 1] = temp;

				}

			}

		}

		return ans;
	}

}
