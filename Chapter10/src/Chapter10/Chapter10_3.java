package Chapter10;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

// JLabel�� Ȱ���Ͽ� "Love Java"�� ����ϰ� ���� ȭ��ǥ Ű (<Left> Ű)�� �Է��� �� ����
// "avaJ evoL"�� "Love Java"�� ������ ����ϴ� ���� ���α׷��� �ۼ��϶�.
// StringBuffer Ŭ������ reverse() �޼ҵ带 �̿��Ͽ� �����ϴ� �Ͱ� JLavel�� ��Ŀ���� �����ϴ� ���� ���� ���ƾ� �Ѵ�.

public class Chapter10_3 extends JFrame{
	JLabel label; 
	// "Love Java"�� �Ųٷ� ����ϱ� ���� StringBuffer ����
	StringBuffer s = new StringBuffer("Love Java");
	Chapter10_3(){
		setTitle("Left Ű�� ���ڿ� �ٲٱ� ����"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		label= new JLabel("Love Java");
		
		// Jabel ������Ʈ ���� �� KeyListener�� �ܴ�.
		label.addKeyListener(new MyKeyAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_3();
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) { // �Է¹��� �ڵ尡
				case KeyEvent.VK_LEFT: //<Left> Ű �϶�
					if(label.getText().equals("Love Java")) { // "Love Java"�� ��
						label.setText(s.reverse().toString()); 
						// s.reverse()�� �ϸ� ���� ������ ���� �ʾƵ� s ��ü�� �ٲ�
					}
					else {
						label.setText(s.reverse().toString());
					}
					break;
				default:
					break;
			}
		}
	}

}
