package view;


import java.awt.Dimension;

import javax.swing.*;

public class TestFrame extends JFrame{
	public TestFrame(){
		setPreferredSize(CommonValue.getMainFrame());
		
//		pack();
		
		VerticalList list = new VerticalList(CommonValue.getMainFrame());
		System.out.println(list.parentPreferredSize);
		add(list);
		
//		
		for(int i=0; i<100; ++i) {
			JPanel pane = new JPanel();
			pane.add(new JLabel("hello"));
			list.add(pane);
		}
		
		pack();
		
		setVisible(true);
//		
//		
//		for(int i=0; i<100; ++i)
//			list.add(new JButton("hello"));
	}
	
	
	public static void main(String [] args) {
		new TestFrame();
		System.out.println("end");
	}
	
	

}
