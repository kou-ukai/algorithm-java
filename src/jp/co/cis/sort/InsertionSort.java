package jp.co.cis.sort;

/**
 * 挿入ソートで配列の値を並び替えるクラスです。
 *
 */
public class InsertionSort {

	/**
	 * 配列の値を小さい順に並び替えた結果を返却します。
	 * @param ary
	 * @return
	 */
	public int[] sort(int[] ary) {
		
		final int max = ary.length;
		
		// 比較開始位置を前方から後方に向かって変更する
		for(int i = 0; i < max; i++) {
			
			// 後方から前方に向かって比較し、値の小さい要素を前方に移動させる
			for(int j = i; j > 0; j--) {
				
				// 後方(j)の値が前方(j - 1)の値よりも小さい場合、入れ替える
				if(ary[j] < ary[j - 1]) {
					int temp = ary[j];
					ary[j] = ary[j - 1];
					ary[j - 1] = temp;
				}
			}
		}
		
		return ary;
	}

}
