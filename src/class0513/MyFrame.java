package class0513;

import java.awt.*;

import javax.swing.*;

// JFrame ����� Ŭ����
public class MyFrame extends JFrame {
	public MyFrame() {
	//	super("title");
		setTitle("300x300 ���� ������ �����");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		// frame ���� button Ŭ���� �������α׷� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		// FlowLayout constructor�� ��/�� ���Ŀ� ���� ������ ���ް���
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton b = new JButton("Click1");
		c.add(b);
		JButton b2 = new JButton("Click2");
		c.add(b2);
	}
}
