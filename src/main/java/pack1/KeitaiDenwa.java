package pack1;

public class KeitaiDenwa extends Denwa {

	private String mailAddress = ""; // メールアドレス
	private int packetRyokin = 0; // パケット料金
	public final int PACKET_TANKA = 1; // パケットあたりの加算額

	@Override
	public void clearRyokin() {
		super.clearRyokin();
		this.packetRyokin = 0;
	}

	@Override
	public void denwaSuru() {
		System.out.print("アドレス帳で探しました --> ");
		super.denwaSuru();
	}

	public KeitaiDenwa(String keiyaku, String bangou, String mailAddress) {
		super(keiyaku, bangou); // 契約者名と番号は親のコンストラクタで設定
		this.mailAddress = mailAddress; // メールアドレスは自分で設定
		super.kataban = "KEITAI-001";
	}

	public int mail() {
		System.out.println("メールしました");
		this.packetRyokin = this.packetRyokin + PACKET_TANKA * 5; // パケット料金の加算
		return this.packetRyokin; // パケット料金を戻す
	}

	public int mail(String joutai) {
		System.out.println("メールを" + joutai + "しました");
		this.packetRyokin = this.packetRyokin + PACKET_TANKA * 5; // パケット料金の加算
		return this.packetRyokin; // パケット料金を戻す
	}

	public int mail(String joutai, int kaisu) {
		for (int i = 0; i < kaisu; i++) {
			System.out.println((i + 1) + "通目のメールを" + joutai + "しました");
			this.packetRyokin = this.packetRyokin + PACKET_TANKA * 5; // パケット料金の加算
		}
		return this.packetRyokin; // パケット料金を戻す
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public int getPacketRyokin() {
		return packetRyokin;
	}

}
