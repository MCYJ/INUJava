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
		
	}
	// �м� ���� �޼ҵ�
	public void subFraction() {
		
	}
	// �м� ���� �޼ҵ�
	public void mulFraction() {
		
	}
	// �м� ������ �޼ҵ�
	public void divFraction() {
		
	}
	// �м� ��� �޼ҵ�
	public void simFraction() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, d1, n2, d2;
		
		System.out.print("�м�1(���� �и�) �Է�: ");
		n1 = sc.nextInt();
		d1 = sc.nextInt();
		Fraction f1 = new Fraction(n1, d1);
		
		System.out.print("�м�2(���� �и�) �Է�: ");
		n2 = sc.nextInt();
		d2 = sc.nextInt();
		Fraction f2 = new Fraction(n2, d2);
		
	//	addFraction(f1, f2);
	//	System.out.println(n1+" "+d1+" "+n2+" "+d2);
	}
}
