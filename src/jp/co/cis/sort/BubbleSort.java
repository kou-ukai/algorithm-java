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
		for(int i=1; i <= ary.length-1; i++) {			//小さい数字を決める
			for(int j=0; j < ary.length-i; j++) {		//ary[j]とary[j+1]の大小比較
				if(ary[j] < ary[j+1]) {
				// ary[j]とary[j+1]の順番を入れ替えたい
					int x = ary[j+1];
					ary[j+1] = ary[j];
					ary[j] = x;
		return ary;
	}

}
