package Quiz;
class TvOnOff{
	public void tv_on() {
		System.out.println("TV 전원 켜짐");
	}
	
	public void tv_off() {
		System.out.println("TV 전원 꺼짐");
	}
}

class Canel extends TvOnOff{
	public void canel() {
		System.out.println("채널 바꿈");
	}
}


class Tv extends Canel{
	public void tv() {
		System.out.println("TV 화면");
	}
}

public class MainClass01 {
public static void main(String[] args) {
	// tv -> 전원 on,off / 채널 바꾸기/ 소리 높이기, 줄이기
	// 뻐꾸기 시계 -> 분침/ 초침/ 시침/ 뻐꾸기
	// 
	
	Tv tv = new Tv();
	tv.tv_on();
	tv.tv();
	tv.canel();
	tv.tv_off();
	
	
}
}
