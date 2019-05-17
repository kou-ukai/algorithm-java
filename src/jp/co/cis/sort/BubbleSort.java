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
		
	/**
	 * aryLengthで配列の長さを取得
	 * changeNumは配列の入れ替えをする回数を表します
	 */
	    int aryLength = ary.length;
	    int changeNum = aryLength - 1;
	      for(int i=changeNum; i>0; i--){
		for(int j=0; j<i; j++){
		  if(ary[j]>ary[j+1]){
		    int temNum = ary[j+1];
		    ary[j+1] = ary[j];
		    ary[j] = temNum;
		  }
		}
	      }
	    return ary;
	}

}
