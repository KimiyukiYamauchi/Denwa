package pack1;

public class KokiDenwa extends Denwa {

	private int kokiSu;

	public KokiDenwa(String keiyaku, String bangou, int kokisu) {
		super(keiyaku, bangou);
		this.kokiSu = kokisu;
		super.kataban = "KOKI-001";
	}

	public void naisen(int kokiBangou) {
		if (kokiBangou > this.kokiSu || kokiBangou < 1) {
			System.out.println("その番号の子機はありません");
		} else {
			System.out.println(kokiBangou + "番の子機と内線通話しました");
		}
	}

	public int getKokiSu() {
		return kokiSu;
	}

	public void setKokiSu(int kokiSu) {
		this.kokiSu = kokiSu;
	}

}
