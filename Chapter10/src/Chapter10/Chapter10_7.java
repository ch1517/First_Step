package Chapter10;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


//JLavel�� Ȱ���Ͽ� "Lobe Java"�� ����ϰ�, "Love Java" ���� ���� ���콺�� �÷� ���콺 ���� ���� ������ ���ڰ� �۾�����,
//�Ʒ��� ������ ���ڰ� Ŀ������ ���α׷��� �ۼ��϶�. ��Ʈ ũ��� �� ���� 5�ȼ��� �۾����ų� Ŀ������ �ϰ�, 5�ȼ� ���Ϸ� �۾������ʵ��� �϶�.

public class Chapter10_7 extends JFrame{
	JLabel label; 
	Chapter10_7(){
		setTitle("���콺 ���� ���� ��Ʈ ũ�� ���� �������α׷�"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		label= new JLabel("Love Java");
		label.setSize(200,50);
		label.setFont(new Font("Arial",Font.PLAIN,10));
		// Arial ��Ʈ�� 10�ȼ� ũ��
		
		label.addMouseWheelListener(new MyMouseWheelListener());
		// Jabel ������Ʈ ���� �� MouseListener�� �ܴ�.
		
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_7();
	}
	
	class MyMouseWheelListener implements MouseWheelListener{
		Font f;
		int size; // label�� font size ���ϱ�
		int n;
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			f = label.getFont();
			size =f.getSize();
			n = e.getWheelRotation();
			if(n<0&&size>5) // up direction. ��Ʈ 5�ȼ� �۰�
				label.setFont(new Font("Arial", Font.PLAIN,size-5));
			else // down direction. ��Ʈ 5�ȼ� ũ��
				label.setFont(new Font("Arial", Font.PLAIN,size+5));
		}
		
	}

}
