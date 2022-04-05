import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		String a, b, opr="";
		int x,y;
		do {
			// �ǿ�����(a,b) 2���� ������(opr) 1�� �Է�
			a = sc.next();
			opr = sc.next();
			b = sc.next();

			try {
				// a,b�� int���·� ����
				x = Integer.parseInt(a);
				y = Integer.parseInt(b);
				
				// ������(opr)�� ���� ����
				if(opr.equals("+")) {
					tot = x+y;
				} else if(opr.equals("-")) {
					tot = x-y;
				} else if(opr.equals("*")) {
					tot = x*y;
				} else if(opr.equals("/")) {
					tot = x/y;
				} else if(opr.equals("%")) {
					tot = x%y;
				} else if(opr.equals("=")){
					break;
				} else {
					// 5Ģ ������� ���ڸ� �����ڷ� ����� ���, �Է¾���� ��ų �� �ֵ��� ���ܹ߻�
					throw new NumberFormatException();
				}
			// 0���� ������ ��� exception ó��
			} catch(ArithmeticException e) {
				System.out.println("0���δ� ���� �� �����ϴ�!");
				continue;
			// number format�� ���� �ʴ� ��� exception ó��
			} catch (NumberFormatException e) {
				System.out.println("[���� ������ ����]�� �Է¾���� �����ּ���!");
				continue;
			}
			
			// ������(opr)�� '='�ΰ�� ������ ����� ���� ����
			if(!opr.equals("=")) {
				// ������
				System.out.println("���: "+tot);
			}
		// ������(opr)�� '='�� �ƴ� ���, while�� �ݺ�
		} while(!opr.equals("="));
		// scanner��ü close
		sc.close();
	}
}
