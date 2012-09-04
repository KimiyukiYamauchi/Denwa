package pack1;

public class KokiDenwa extends Denwa {

	private int kokiSu;

	public KokiDenwa(String keiyaku, String bangou, int kokisu) {
		super(keiyaku, bangou);
		this.kokiSu = kokisu;
	}

	void naisen(int kokiBangou) {
		if (kokiBangou > this.kokiSu) {
			System.out.println("その番号の子機はありません");
		} else {
			System.out.println(kokiBangou + "の子機と内線通話しました");
		}
	}

	public int getKokiSu() {
		return kokiSu;
	}

	public void setKokiSu(int kokiSu) {
		this.kokiSu = kokiSu;
	}

}
