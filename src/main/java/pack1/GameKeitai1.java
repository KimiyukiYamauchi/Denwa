package pack1;

public class GameKeitai1 extends KeitaiDenwa implements Game {

	public GameKeitai1(String keiyaku, String bangou, String mailAddress) {

		// 親のコンストラクタを呼んで、契約者名、電話番号、メールアドレスの値を設定
		super(keiyaku, bangou, mailAddress);

		// 型番号は自分でセットする
		super.kataban = "GAME-001";
	}

	@Override
	public void gameSuru() {
		System.out.println("もぐらたたきゲームで遊びました");

	}

}
