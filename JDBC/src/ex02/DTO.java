package ex02;

public class DTO {
//	Data Transfor Object
//	������ ��ȯ ��ü
//	Database�� ����� �����͸� Java ��Ÿ�Ϸ� �ٲ��ִ� ��ü
//	web������ jason
	private int num;
	private String nick;
	private int str;
	private int dex;
	private int intel;
	private int luck;
	public DTO(int num, String nick, int str, int dex, int intel, int luck) {
		this.num = num;
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.luck = luck;
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + ", nick=" + nick + ", str=" + str + ", dex=" + dex + ", intel=" + intel + ", luck="
				+ luck + "]";
	}
	
	

}
