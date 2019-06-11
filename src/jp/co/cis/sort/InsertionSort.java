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

 		int aryLength = ary.length;

 		for (int i = 0; i < aryLength - 1; i++) {
 			//注目する配列の位置を1から最後尾まで順にずらすループ処理
 			for (int j = i + 1; j > 0; j--) {
 				//左側の配列より値が大きければ入れ替える。小さければ正しい位置なのでループを抜け出す。
 				if (ary[j] < ary[j - 1]) {
 					int tmp = ary[j - 1];
 					ary[j - 1] = ary[j];
 					ary[j] = tmp;
 				} else {
 					break;
 				}

 			}

 		}

 		return ary;
 	}
}
