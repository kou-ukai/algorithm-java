package jp.co.cis.sort;

/**
 * 選択ソートで配列の値を並び替えるクラスです。
 *
 */
public class SelectionSort {

	/**
	 * 配列の値を小さい順に並び替えた結果を返却します。
	 * @param ary
	 * @return
	 */
	public int[] sort(int[] ary) {
		// TODO 選択ソートで並び替える処理を実装してください。
		for(int i = 0; i < ary.length-1; i++) {
		//比較する配列のインデックス
		int min = i;
			//最小値を見つけ、入れ替える繰り返し
			for(int j = i + 1; j < ary.length; j++) {
				if(ary[min] > ary[j]) {
					min = j;
				}
			}
			int tmp = ary[i];
			ary[i] = ary[min];
			ary[min] = tmp;
		}
		return ary;
	}

}
