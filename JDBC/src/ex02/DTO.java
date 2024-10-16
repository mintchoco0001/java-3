package ex02;

public class DTO {
//	Data Transfor Object
//	데이터 변환 객체
//	Database에 저장된 데이터를 Java 스타일로 바꿔주는 객체
//	web에서는 jason
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
