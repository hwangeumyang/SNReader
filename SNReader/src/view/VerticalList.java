package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class VerticalList extends JScrollPane {
	private YAXISBOXPANE pane;
	public  Dimension parentPreferredSize;
	
	VerticalList() {
		this(CommonValue.getMainFrame());
	}
	
	VerticalList(Dimension parentPreferredSize) {
		super();
		this.parentPreferredSize = parentPreferredSize;
		
		setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		
		this.pane = new YAXISBOXPANE();
		setViewportView(pane);
	}
	
	@Override
	public Component add(Component comp) {
		return pane.add(comp);
	}
	
	//viewport of this scrollpane
	private class YAXISBOXPANE extends JPanel {
		Dimension recommendedBtn;
		int scrollBarWidth = ((Integer)UIManager.get("ScrollBar.width")).intValue();
		
		private YAXISBOXPANE() {
			super();
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			setRecommendedBtn();
			
			
			System.out.println(parentPreferredSize);
		}
		
		private void setRecommendedBtn(){
			recommendedBtn = new Dimension(parentPreferredSize.width - scrollBarWidth, parentPreferredSize.height/10);
			System.out.println(recommendedBtn);
		}
		
		@Override
		public Component add(Component comp) {
			comp.setPreferredSize(recommendedBtn);
			comp.setSize(recommendedBtn);
//			System.out.println(parentPreferredSize);
//
//			System.out.println(this.getSize());
			return super.add(comp);
		}
		public Component add(Component comp, Dimension preferredSize) {
			comp.setPreferredSize(preferredSize);
			return super.add(comp);
		}
		
		
	}
}
