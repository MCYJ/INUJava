import java.util.Scanner;

public class Fraction {
	// �����ʵ�
	int numerator;
	// �и��ʵ�
	int denominator;
	// ���ڿ� �и� 1�� �����ϴ� ������
	public Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	// ���ڴ� 1�� ����, �и�� d�� �����ϴ� ������
	public Fraction(int d) {
		this.numerator = 1;
		this.denominator = d;
	}
	// ���ڴ� n, �и�� d�� �����ϴ� ������
	public Fraction(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}
	
	// �м� ���� �޼ҵ�
	public void addFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
		this.denominator = f1.denominator*f2.denominator;
	}
	// �м� ���� �޼ҵ�
	public void subFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.denominator - f2.numerator*f1.denominator;
		this.denominator = f1.denominator*f2.denominator;
	}
	// �м� ���� �޼ҵ�
	public void mulFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.numerator;
		this.denominator = f1.denominator*f2.denominator;
	}
	// �м� ������ �޼ҵ�
	public void divFraction(Fraction f1, Fraction f2) {
		this.numerator = f1.numerator*f2.denominator;
		this.denominator = f1.denominator*f2.numerator;
	}
	// �м� ��� �޼ҵ�
	public void simFraction() {
		int numerator = this.numerator;
		int denominator = this.denominator;
		// �������� ������ �ּҰ������ ����
		int gcdNum = gcd(numerator, denominator);
		
		// ���� �ּҰ������ ������ �������� ������ ���� ���� �ٽ� ����
		numerator /= gcdNum;
		denominator /= gcdNum;
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
	public static String printFraction(Fraction f) {
		String str = "";
		str += f.numerator;
		str += "/";
		str += f.denominator;
		
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, d1, n2, d2;
		
		// �м�1 �����Է�
		System.out.print("�м�1(���� �и�) �Է�: ");
		n1 = sc.nextInt();
		d1 = sc.nextInt();
		// �м�1 �ν��Ͻ� ����
		Fraction f1 = new Fraction(n1, d1);
		
		// �м�2 �����Է�
		System.out.print("�м�2(���� �и�) �Է�: ");
		n2 = sc.nextInt();
		d2 = sc.nextInt();
		// �м�2 �ν��Ͻ� ����
		Fraction f2 = new Fraction(n2, d2);
		
		// ����� ���� ���� result �ν��Ͻ� ����
		Fraction result = new Fraction();
		
		System.out.println("-----------------------");
		
		// �м��� ���� ���
		result.addFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"+"+printFraction(f2)+"="+printFraction(result));
		
		// �м��� ���� ���
		result.subFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"-"+printFraction(f2)+"="+printFraction(result));
		
		// �м��� ���� ���
		result.mulFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"x"+printFraction(f2)+"="+printFraction(result));
		
		// �м��� ������ ���
		result.divFraction(f1, f2);
		result.simFraction();
		System.out.println(printFraction(f1)+"/"+printFraction(f2)+"="+printFraction(result));
		
		
		// scanner ��ü close
		sc.close();
	}
}
