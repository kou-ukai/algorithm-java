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
		//受け取る配列の長さ
		int aryLength = ary.length;
		//最大値を探す処理をする回数
		int changeNum = aryLength - 1;

		for (int i = 1; i <= changeNum; i++) {
			//左端(最大値を入れる場所)のindex番号
			int tempAryIndex = i - 1;
			//最大値があるindex番号を受け取る
			int maxAryIndex = i - 1;
			//最大値を受け取る
			int maxAryNum = ary[i - 1];

			//最大値をもつindex番号を調べる
			for (int j = tempAryIndex; j <= changeNum; j++) {
				if (maxAryNum < ary[j]) {
					maxAryNum = ary[j];
					maxAryIndex = j;
				}
			}

			//左端と最大値を持つ配列要素を入れ替える
			int tempNum = ary[tempAryIndex];
			ary[tempAryIndex] = ary[maxAryIndex];
			ary[maxAryIndex] = tempNum;
		}

		return ary;
	}

}
