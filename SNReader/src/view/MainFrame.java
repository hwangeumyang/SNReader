package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class MainFrame extends JFrame {
	public static MainFrame mainFrame = null;
	
	public static MainFrame getMainFrame() {
		if(mainFrame == null) mainFrame = new MainFrame();		
		return mainFrame;
	}
	
	public MainFrame(){
		setPreferredSize(CommonValue.getMainFrameSize());
//		setPreferredSize(new Dimension(200, 200));
		
		System.out.println(this.getPreferredSize());
		
		VerticalList novelListView = new VerticalList(CommonValue.getMainFrameSize());
		
		add(novelListView);
		
		
		ButtonMaker btnMaker = new MainFrameButtonMaker();
		
		for(int i=0; i<20; i++)
		novelListView.add(btnMaker.make());
		
		
		
		pack();
		
		
		setVisible(true);

	}
	
	class MainFrameButtonMaker implements ButtonMaker<JPanel> {
		@Override
		public JPanel make() {
			JPanel pane = new JPanel();
			pane.setBorder(BorderFactory.createLineBorder(Color.black));			

			return pane;
		}
		
	}
	
	public static void main(String [] args) {
		getMainFrame();
	}

}
