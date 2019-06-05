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
		// TODO
	}

	/**
	 * 先頭にある要素を沈めてヒープを整理します。
	 * @param ary
	 * @param max
	 */
	private void downHeap(int[] ary, int max) {
		// TODO 
	}
}
