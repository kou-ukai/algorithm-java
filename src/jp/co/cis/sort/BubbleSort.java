package jp.co.cis.sort;

/**
 * バブルソートで並び替えるクラスです。
 *
 */
public class BubbleSort {

	/**
	 * 配列の値を小さい順に並び替えた結果を返却します。
	 * @param ary
	 * @return
	 */
	public int[] sort(int[] ary) {
		// TODO バブルソートで並び替える処理を実装してください。
		for(int i=1; i<= ary.length-1; i++) {
			for(int j=0; j < ary.length-i; j++) {
				if(ary[j] > ary[j+1]) {
					int y = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = y;
				}
			}
		}
		return ary;
	}
}
