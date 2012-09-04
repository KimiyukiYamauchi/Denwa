package pack1;
public class Denwa {
	protected String kataban; // 電話機の機種
	private String keiyaku; // 使用している契約者
	private int ryokin; // 電話料金
	private String bangou; // 電話番号
	public final int TANKA = 10; // 単位時間当たりの加算額
	public final String KAISYA = "(株)ABC"; // 製造会社名

	/**
	 * コンストラクタ
	 * 
	 * @param keiyaku
	 *            契約者名
	 * @param bangou
	 *            電話番号
	 */
	public Denwa(String keiyaku, String bangou) {
		this.keiyaku = keiyaku; // 契約者名の初期設定
		this.bangou = bangou; // 電話番号の初期設定
		this.ryokin = 0; // 電話料金を0で初期化
		this.kataban = "DENWA-001"; // 機種名（型番号）の初期設定
	}

	/**
	 * １回の通話を表す
	 */
	public void denwaSuru() {
		System.out.println("もしもし － はいはい"); // 電話をかけた旨のメッセージ
		this.ryokin = this.ryokin + this.TANKA; // 電話計算（電話料金の加算）
	}

	public void clearRyokin() {
		this.ryokin = 0;
	}

	public String getKeiyaku() {
		return keiyaku;
	}

	public void setKeiyaku(String keiyaku) {
		this.keiyaku = keiyaku;
	}

	public String getBangou() {
		return bangou;
	}

	public void setBangou(String bangou) {
		this.bangou = bangou;
	}

	public String getKataban() {
		return kataban;
	}

	public int getRyokin() {
		return ryokin;
	}

}
