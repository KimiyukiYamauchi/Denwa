package pack1;

public class KeitaiDenwa extends Denwa {

	private String mailAddress = ""; // メールアドレス
	private int packetRyokin = 0; // パケット料金
	public final int PACKET_TANKA = 1; // パケットあたりの加算額

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
