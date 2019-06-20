package jp.co.cis.other;

public class Hanoi {

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		hanoi.exec();
	}

	/**
	 * ハノイの塔の移動させる円盤と塔を出力します
	 */
	public void exec() {

		move(5, "START", "GOAL", "WORK");
	}

	/**
	 * 円盤を移動させます
	 * @param enban 移動させる円盤の枚数
	 * @param from 移動元の棒
	 * @param to 移動先の棒
	 * @param work 作業用の棒
	 */
	private void move(int enban, String from, String to, String work) {

		if(enban > 0) {
			// 一番下でないなら続ける

			// (1)一番下以外を作業用の棒に移動させる
			move(enban-1 , from , work , to);

			// (2)一番下をGOALに移動させる
			System.out.println(enban + "番の円盤を" + from + "から" + to + "に移動させる");

			// (3)(1)で移動させた円盤を棒を入れ替えて移動させる
			move(enban-1 , work , to , from);

		}



	}
}
