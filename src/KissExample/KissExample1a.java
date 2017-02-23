package KissExample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

public class KissExample1a extends JFrame implements ActionListener {

	public final int NUM = 6;
	JButton jButton1,jButton2, jButton3, jButton4, jButton5,jButton6;
	JLabel indicator1,indicator2,indicator3,indicator4,indicator5,indicator6;
	
	String[] textButton = {"jButton1", "jButton2", "jButton3", "jButton4", "jButton5","jButton6"};
	String[] textLabel = {"indicator1", "indicator2", "indicator3", "indicator4", "indicator5", "indicator6"};
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new KissExample1a();
			}
		});
	}
	
	public KissExample1a() {
		super();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(6,2));
		
		JLabel[] labels = new JLabel[NUM];
		JButton[] buttons = new JButton[NUM];
		for (int i = 0; i < NUM; i++){
			labels[i] = new JLabel();
			buttons[i] = new JButton();
		}

		for(int j =0; j < buttons.length; j++){
			setButton(buttons[j],textButton[j]);
			setLabel(labels[j],textLabel[j]);
		}
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		if (btn == jButton1) {
			indicator1.setVisible(true);
			indicator2.setVisible(false);
			indicator3.setVisible(false);
			indicator4.setVisible(false);
			indicator5.setVisible(false);
			indicator6.setVisible(false);
		} else if (btn == jButton2) {
			indicator1.setVisible(false);
			indicator2.setVisible(true);
			indicator3.setVisible(false);
			indicator4.setVisible(false);
			indicator5.setVisible(false);
			indicator6.setVisible(false);
		} else if (btn == jButton3) {
			indicator1.setVisible(false);
			indicator2.setVisible(false);
			indicator3.setVisible(true);
			indicator4.setVisible(false);
			indicator5.setVisible(false);
			indicator6.setVisible(false);
		} else if (btn == jButton4) {
			indicator1.setVisible(false);
			indicator2.setVisible(false);
			indicator3.setVisible(false);
			indicator4.setVisible(true);
			indicator5.setVisible(false);
			indicator6.setVisible(false);
		} else if (btn == jButton5) {
			indicator1.setVisible(false);
			indicator2.setVisible(false);
			indicator3.setVisible(false);
			indicator4.setVisible(false);
			indicator5.setVisible(true);
			indicator6.setVisible(false);
		} else if (btn == jButton6) {
			indicator1.setVisible(false);
			indicator2.setVisible(false);
			indicator3.setVisible(false);
			indicator4.setVisible(false);
			indicator5.setVisible(false);
			indicator6.setVisible(true);
		}		
		
	}
	
	public void setButton(JButton button, String text) {
		button = new JButton();
		this.add(button);
		button.setBorder(new BevelBorder(BevelBorder.RAISED));
		button.setBackground(Color.blue);
		button.setForeground(Color.white);
		button.setText(text);
		button.setPreferredSize(new Dimension(100,30));
		button.setVisible(true);
		button.addActionListener(this);
	}
	
	public void setLabel(JLabel label, String text) {
		label = new JLabel();
		this.add(label);
		label.setVisible(false);
		label.setForeground(Color.blue);
		label.setPreferredSize(new Dimension(60,30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(text);
	}
	
}
