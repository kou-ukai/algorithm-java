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
		
	    int aryLength = ary.length;
	    int changeNum = aryLength - 1;
	      for(int i=changeNum; i>0; i--){
		for(int j=0; j<i; j++){
		  if(ary[i]>ary[i+1]){
		    int temNum = ary[i+1];
		    ary[i+1] = ary[i];
		    ary[i] = temNum;
		  }
		}
	      }
	    return ary;
	}

}
