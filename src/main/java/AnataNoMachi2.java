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
		// 電話番号を変更する 項番7
		// 電話番号を表示する 項番8

		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.KAISYA + " " + taro.getKataban() + " "
				+ taro.getRyokin() + " " + taro.getBangou() + " "
				+ taro.getRyokin());

		System.out.print("インスタンス[taro]の情報（変更前）：");
		System.out.println(taro.getKeiyaku() + " " + taro.getBangou());

		taro.setBangou("050-7500-1588");

		System.out.print("インスタンス[taro]の情報（変更後）：");
		System.out.println(taro.getKeiyaku() + " " + taro.getBangou());

	}

}
