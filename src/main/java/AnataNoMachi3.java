import pack1.Denwa;
import pack1.KeitaiDenwa;

public class AnataNoMachi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// DenwaクラスとKeitaiDenwaクラスのインスタンスの生成 項番１
		Denwa hanako = new Denwa("山田花子", "012-123-4456");
		KeitaiDenwa taro = new KeitaiDenwa("太郎", "000-000-0000",
				"yamauchi@std.it-college.ac.jp");

		// 各々で電話を数回かける 項番２
		hanako.denwaSuru();
		hanako.denwaSuru();
		for (int i = 0; i < 3; i++) {
			taro.denwaSuru();
		}

		// Keitai電話クラスのインスタンスでメールを数回実行する 項番3
		taro.mail();
		taro.mail("send");
		taro.mail("receive");
		taro.mail("send", 2);
		taro.mail("receive", 2);

		// Denwaクラスのインスタンスの電話料金を表示する 項番4
		System.out.print(" Denwaクラスのインスタンスの電話料金：");
		System.out.println(hanako.getRyokin());

		// Keiati Denwaクラスのインスタンスの電話料金・パケット料金を表示する 項番5
		System.out.print("Keitai Denwaクラスのインスタンスの電話料金：");
		System.out.println(taro.getRyokin());
		System.out.print("Keiati Denwaクラスのインスタンスのパケット料金：");
		System.out.println(taro.getPacketRyokin());

		// 各々でclearRyokin()を呼び出す 項番6
		hanako.clearRyokin();
		taro.clearRyokin();

		// Denwaクラスのインスタンスの電話料金を表示する 項番7
		System.out.print(" Denwaクラスのインスタンスの電話料金：");
		System.out.println(hanako.getRyokin());

		// Keiati Denwaクラスのインスタンスの電話料金・パケット料金を表示する 項番8
		System.out.print("Keitai Denwaクラスのインスタンスの電話料金：");
		System.out.println(taro.getRyokin());
		System.out.print("Keiati Denwaクラスのインスタンスのパケット料金：");
		System.out.println(taro.getPacketRyokin());

	}

}
