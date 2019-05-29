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
		// TODO 挿入ソートで並び替える処理を実装してください。
		for(int i = 1; i < ary.length-1; i++){
			int tmp = ary[i];
			for(int j = i; j > 0; j--){
				if(ary[j] > ary[j-1]){
					ary[j] = ary[j-1];
					ary[j-1] = tmp;
				}
			}
		}
		return ary;
	}

}
