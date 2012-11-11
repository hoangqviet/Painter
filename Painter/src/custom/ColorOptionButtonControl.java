package custom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorOptionButtonControl extends JPanel {
	private JButton mButtonOne;
	private JButton mButtonTwo;
	private JPanel mButtonOnePanel;
	private JPanel mButtonTwoPanel;

	public ColorOptionButtonControl() {
		mButtonOne = new JButton("Color1");
		mButtonTwo = new JButton("Color2");
		mButtonOnePanel = new JPanel();
		mButtonTwoPanel = new JPanel();
		buildGUI();
	}

	public void setColor(Color color) {
		if (mButtonOnePanel.getBackground() == Color.gray) {
			mButtonOne.setBackground(color);
		}
		if (mButtonTwoPanel.getBackground() == Color.gray) {
			mButtonTwo.setBackground(color);
		}
	}
	
	public void buildGUI() {
		mButtonOnePanel.setPreferredSize(new Dimension(150, 100));
		mButtonTwoPanel.setPreferredSize(new Dimension(150, 100));
		mButtonOne.setPreferredSize(new Dimension(100, 50));
		mButtonTwo.setPreferredSize(new Dimension(100, 50));
		
		
		mButtonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mButtonOnePanel.getBackground() != Color.gray) {
					mButtonOnePanel.setBackground(Color.gray);
					mButtonTwoPanel.setBackground(null);
				} 
			}
		});
		mButtonOnePanel.add(mButtonOne);
		mButtonOnePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				mButtonOnePanel.setBackground(Color.gray);
				mButtonTwoPanel.setBackground(null);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		mButtonTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mButtonTwoPanel.getBackground() != Color.gray) {
					mButtonTwoPanel.setBackground(Color.gray);
					mButtonOnePanel.setBackground(null);
				}
			}
		});

		mButtonTwoPanel.add(mButtonTwo);
		mButtonTwoPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				mButtonTwoPanel.setBackground(Color.gray);
				mButtonOnePanel.setBackground(null);

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		add(mButtonOnePanel);
		add(mButtonTwoPanel);
	}

}
