import pack1.Denwa;

public class AnataNoMachi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Denwa taro = new Denwa("太郎", "000-000-0000");
		Denwa hanako = new Denwa("花子", "111-111-1111");

		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.KAISYA + " " + taro.getKataban() + " "
				+ taro.getRyokin() + " " + taro.getBangou() + " "
				+ taro.getRyokin());

		System.out.print("インスタンス[hanako]の情報：");
		System.out.println(hanako.KAISYA + " " + hanako.getKataban() + " "
				+ hanako.getKeiyaku() + " " + hanako.getBangou() + " "
				+ hanako.getRyokin());

		for (int i = 0; i < 3; i++) {
			taro.denwaSuru();
		}

		for (int i = 0; i < 4; i++) {
			hanako.denwaSuru();
		}

		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.getKeiyaku() + " " + taro.getRyokin());

		System.out.print("インスタンス[hanako]の情報：");
		System.out.println(hanako.getKeiyaku() + " " + hanako.getRyokin());

		taro.clearRyokin();
		hanako.clearRyokin();

		System.out.print("インスタンス[taro]の情報：");
		System.out.println(taro.getKeiyaku() + " " + taro.getRyokin());

		System.out.print("インスタンス[hanako]の情報：");
		System.out.println(hanako.getKeiyaku() + " " + hanako.getRyokin());

		System.out.print("インスタンス[taro]の情報（変更前）：");
		System.out.println(taro.getKeiyaku() + " " + taro.getBangou());

		taro.setBangou("050-7500-1588");

		System.out.print("インスタンス[taro]の情報（変更後）：");
		System.out.println(taro.getKeiyaku() + " " + taro.getBangou());

	}

}
