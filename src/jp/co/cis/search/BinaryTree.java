package jp.co.cis.search;

/**
 * 二分木を用いて探索するクラスです
 *
 */
public class BinaryTree {

	/**
	 * 配列aryからsearchの位置を探索します。
	 * @param ary
	 * @param search
	 * @return
	 */
	public int search(int[] ary, int search) {
		// 最小値のインデックス番号
		int low = 0;
		// 最大値のインデックス番号
		int high = ary.length-1;
		while(low <= high) {
			//配列の中間の値のインデックス番号
			int mid = (low + high)/2;
			//中間の要素
			int tmp = ary[mid];
			if(tmp == search) {
				return mid;
			}else if(tmp > search) {
				high = mid - 1;
			}else {
			low = mid + 1;
			}
		}
		return 0;
	}

}
