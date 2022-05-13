import java.util.*;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<String> v = new Vector<String>();
		String str = sc.next();
		
		StringTokenizer st = new StringTokenizer(str, "+-", true);
		
		while(st.hasMoreTokens()) {
			v.add(st.nextToken());
		}
		String temp;
		int sign = 1;
		int result = 0;
		for(int i=0;i<v.size()-1;i++) {
			temp = v.get(i);
			// ��ȣ�� ���
			if(temp.equals("+") || temp.equals("-")) {
				// ��ȣ�� ��ĥ ��� program ����
				if(v.get(i+1).equals("+") || v.get(i+1).equals("-"))
					return;
				// ��ȣ�� +�϶� sign�� 1, -�϶� sign�� -1�� ����
				if(temp.equals("+")) sign = 1;
				else sign = -1;
			}
			// ������ ���
			else {
				// ��ȣ�� ���ڸ� ���ؼ� result�� ������
				result += sign*Integer.parseInt(v.get(i));
			}
		}
		// ������ ���� �ݿ�
		result += sign*Integer.parseInt(v.get(v.size()-1));
		System.out.println(result);
		
		sc.close();
	}
}
