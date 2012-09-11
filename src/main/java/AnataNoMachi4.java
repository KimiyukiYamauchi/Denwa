import pack1.GameKeitai1;
import pack1.GameKeitai2;

public class AnataNoMachi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ゲーム付き携帯電話1とゲーム付き携帯電話2クラスのインスタンスをそれぞれ
		// ひとつずつ作成する 項番１
		GameKeitai1 taro = new GameKeitai1("山田太郎", "012-1234-5678",
				"taro.yamada@mail.com");
		GameKeitai2 hanako = new GameKeitai2("山田花子", "505-5000-5555",
				"hanako@mail.com");

		// 各々で電話を数回かける 項番２
		for (int i = 0; i < 3; i++) {
			taro.denwaSuru();
		}
		hanako.denwaSuru();
		hanako.denwaSuru();

		// 各々でメールを数回実行する 項番3
		taro.mail();
		taro.mail("send");
		taro.mail("receive");
		taro.mail("send", 2);
		taro.mail("receive", 2);
		hanako.mail();
		hanako.mail("send");
		hanako.mail("receive");
		hanako.mail("send", 3);
		hanako.mail("receive", 10);

		// 各々で何回かゲームをする 項番4
		for (int i = 0; i < 3; i++) {
			taro.gameSuru();
		}
		for (int i = 0; i < 5; i++) {
			hanako.gameSuru();
		}

		// 各々のインスタンスの情報を表示する 項番5
		// 会社名
		System.out.print("[taro]インスタンスの会社名：");
		System.out.println(taro.KAISYA);
		System.out.print("[hanako]インスタンスの会社名：");
		System.out.println(hanako.KAISYA);
		// 型番号
		System.out.print("[taro]インスタンスの型番号：");
		System.out.println(taro.getKataban());
		System.out.print("[hanako]インスタンスの型番号：");
		System.out.println(hanako.getKataban());
		// 契約者名
		System.out.print("[taro]インスタンスの契約者名：");
		System.out.println(taro.getKeiyaku());
		System.out.print("[hanako]インスタンスの契約者名：");
		System.out.println(hanako.getKeiyaku());
		// 電話番号
		System.out.print("[taro]インスタンスの電話番号：");
		System.out.println(taro.getBangou());
		System.out.print("[hanako]インスタンスの電話番号：");
		System.out.println(hanako.getBangou());
		// 電話料金
		System.out.print("[taro]インスタンスの電話料金：");
		System.out.println(taro.getRyokin());
		System.out.print("[hanako]インスタンスの電話料金：");
		System.out.println(hanako.getRyokin());
		// メールアドレス
		System.out.print("[taro]インスタンスのメールアドレス：");
		System.out.println(taro.getMailAddress());
		System.out.print("[hanako]インスタンスのメールアドレス：");
		System.out.println(hanako.getMailAddress());
		// パケット料金
		System.out.print("[taro]インスタンスのパケット料金：");
		System.out.println(taro.getPacketRyokin());
		System.out.print("[hanako]インスタンスのパケット料金：");
		System.out.println(hanako.getPacketRyokin());

	}

}
