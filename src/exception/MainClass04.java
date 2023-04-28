package exception;
class A04{}
class B04 extends A04{}
class C04 extends B04{}

public class MainClass04 {
public static void main(String[] args) {
	C04 c = new C04();
	A04 a;
	a = new C04();
	a = new B04();
	
	int num = 0;
	int[] arr = new int[3];
	arr[0] = 1; arr[1]=2; arr[2]=3;
	
	try {
		System.out.println(10/num);
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	} catch (Exception e) {
		//System.out.println("0으로 나눌 수 없음");
		e.printStackTrace();
	} 
	System.out.println("다음 문장들 실행");
}
}
