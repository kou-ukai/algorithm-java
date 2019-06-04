package jp.co.cis.sort;

/**
 * ヒープソートで並び替えるクラスです。
 *
 */
public class HeapSort {

	/**
	 * 配列の値を小さい順に並び替えた結果を返却します。
	 * 
	 * @param ary
	 * @return
	 */
	public int[] sort(int[] ary) {
		// TODO ヒープソートで並び替える処理を実装してください。

		// ヒープ用に配列を初期化
		initHeap(ary);

		// 最後尾から大きい順に並び替える
		final int max = ary.length;
		for (int i = max; i > 0; i--) {

			// TODO 先頭（未ソート範囲での最大値）とソート位置を入れ替える
			int temp = ary[i - 1];
			ary[i - 1] = ary[0];
			ary[0] = temp;

			// ヒープの整理
			downHeap(ary, i);
		}

		return ary;
	}

	/**
	 * ヒープ(子要素が親要素より小さいか等しい）で初期化します
	 * 
	 * @param ary
	 */
	private void initHeap(int[] ary) {
		final int max = ary.length;

		for (int i = 1; i < max + 1; i++) {

			int ko = i;
			int oya = ko / 2;
			while (oya > 0) {

				if (ary[oya - 1] < ary[ko - 1]) {
					int temp = ary[oya - 1];
					ary[oya - 1] = ary[ko - 1];
					ary[ko - 1] = temp;
				} else {
					break;
				}

				ko = oya;
				oya = oya / 2;

			}
		}
	}

	/**
	 * 先頭にある要素を沈めてヒープを整理します。
	 * @param ary
	 * @param max
	 */
	private void downHeap(int[] ary, int max) {
		int oya = 1;
		while (oya * 2 < max) {
			// 子がいる限り続行する

			int koLeft = oya * 2;
			int koRight = oya * 2 + 1;

			// 左右の子のうち、大きい子を選ぶ
			int ko;
			if (koRight < max && ary[koRight - 1] > ary[koLeft - 1]) {
				// 右の子が比較対象であり、かつ左の子より大きい場合、
				ko = koRight;
			} else {
				ko = koLeft;
			}

			// 子のほうが大きければ、入れ替える
			if (ary[ko - 1] > ary[oya - 1]) {
				int temp = ary[oya - 1];
				ary[oya - 1] = ary[ko - 1];
				ary[ko - 1] = temp;
			} else {
				// 子のほうが小さければ整理完了
				break;
			}

			// 次の親位置を設定
			oya = ko;
		}
	}
}
