import pack1.KeitaiDenwa;

public class AnataNoMachi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// KeitaiDenwaクラスのインスタンスの生成 項番１
		KeitaiDenwa taro = new KeitaiDenwa("太郎", "000-000-0000",
				"yamauchi@std.it-college.ac.jp");

		// // 何回か電話する 項番２
		// for (int i = 0; i < 3; i++) {
		// taro.denwaSuru();
		// }
		//
		// // 電話料金表示 項番３
		// System.out.print("インスタンス[taro]の情報：");
		// System.out.println(taro.getKeiyaku() + " " + taro.getRyokin());
		//
		// // 電話料金クリア 項番４
		// taro.clearRyokin();
		//
		// // 電話料金表示 項番５
		// System.out.print("インスタンス[taro]の情報：");
		// System.out.println(taro.getKeiyaku() + " " + taro.getRyokin());

		// 何回かメールを送信する 項番6
		// for (int i = 0; i < 5; i++) {
		// taro.mail();
		// }

		taro.mail();
		taro.mail("send");
		taro.mail("receive");
		taro.mail("send", 1000);
		taro.mail("receive", 50);

		// パケット料金を表示する 項番7
		System.out.print("パケット料金：");
		System.out.println(taro.getPacketRyokin());

		// // 変更前のメールアドレスを表示する 項番8
		// System.out.print("メールアドレス（変更前）：");
		// System.out.println(taro.getMailAddress());
		//
		// // メールアドレスを変更する 項番9
		// taro.setMailAddress("kimiyuki.yamauchi.0313@gmail.com");
		//
		// // 変更後のメールアドレスを表示する 項番10
		// System.out.print("メールアドレス（変更後）：");
		// System.out.println(taro.getMailAddress());
		//
		// // 電話番号を表示する 項番11
		// System.out.print("電話番号：");
		// System.out.println(taro.getBangou());
		//
		// // 会社名、型番号、契約者名を表示する 項番12
		// System.out.print("インスタンス[taro]の情報：");
		// System.out.println(taro.KAISYA + " " + taro.getKataban() + " "
		// + taro.getKeiyaku());

	}

}
