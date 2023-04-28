package Quiz;

class TV01{
	private int size;
	public TV01(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV01{
	private int resolution;
	ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+resolution+"컬러");
	}
	//protected int getResolution() {return resolution;}
}

class IPTV extends ColorTV{
	private String ip;
	IPTV(String ip,int size,int resolution){
		super(size,resolution);
		this.ip = ip;
	}
	public void printIptv() {
		//System.out.println(ip+"주소에 "+getSize()+"인치,"+getResolution()+"컬러");
		System.out.print("나의 IPTV는 "+ip+"주소의 ");
		super.printProperty();
	}
}

public class MainClass02 {
public static void main(String[] args) {
	System.out.println("컬러TV");
	ColorTV myTV = new ColorTV(32,1024);
	myTV.printProperty();
	
	System.out.println("IPTV");
	IPTV iptv = new IPTV("\"192.1.12\"",32,2048);
	iptv.printIptv();
	
}
}
