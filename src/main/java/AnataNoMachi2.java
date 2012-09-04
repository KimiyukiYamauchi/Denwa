import pack1.KokiDenwa;

public class AnataNoMachi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// KokiDenwaクラスのインスタンスの生成 項番１
		KokiDenwa taro = new KokiDenwa("太郎", "000-000-0000", 3);

		// 何回か電話する 項番２
		for (int i = 0; i < 3; i++) {
			taro.denwaSuru();
		}

		// 電話料金表示 項番３
		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.getKeiyaku() + " " + taro.getRyokin());

		// 電話料金クリア 項番４
		taro.clearRyokin();

		// 電話料金表示 項番５
		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.getKeiyaku() + " " + taro.getRyokin());

		// 電話番号を表示する 項番6
		System.out.print("インスタンス[taro]の情報（変更前）：");
		System.out.println(taro.getKeiyaku() + " " + taro.getBangou());

		// 電話番号を変更する 項番7
		taro.setBangou("050-7500-1588");

		// 電話番号を表示する 項番8
		System.out.print("インスタンス[taro]の情報（変更後）：");
		System.out.println(taro.getKeiyaku() + " " + taro.getBangou());

		// 内線をかける 項番9
		for (int i = 1; i <= 5; i++) {
			taro.naisen(i);
		}

		// 子機の数を表示する 項番10
		System.out.print("子機の数（変更前）：");
		System.out.println(" " + taro.getKokiSu());

		// 子機の数を変更する 項番11
		taro.setKokiSu(10);

		// 子機の数を表示する 項番12
		System.out.print("子機の数（変更後）：");
		System.out.println(" " + taro.getKokiSu());

		// 会社名、型番号、契約者名を表示する 項番13
		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.KAISYA + " " + taro.getKataban() + " "
				+ taro.getKeiyaku());

	}

}
