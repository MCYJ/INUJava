
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		// public�̱� ������ pass
		aClass.a = 10;
		// private�̱� ������ error
		// aClass.b = 10;
		// ���� package�� �����ϱ� ������ pass
		aClass.c = 10;
	}
}

class Sample{
	public int a;
	private int b;
	int c;
}