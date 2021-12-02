package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/*
 * 
 * this have
 * scrollbar
 * buttons that stand in vertical line 
 */
public class VerticalList extends JScrollPane {
	private YAXISBOXPANE pane;
	public  Dimension parentPreferredSize; //size of component hold this Pane
	
	VerticalList() {
		this(CommonValue.getMainFrameSize());
	}
	
	VerticalList(Dimension parentPreferredSize) {
		super();
		this.parentPreferredSize = parentPreferredSize;
		
		//eliminate horizontal scroll bar
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
		Dimension recommendedBtn;	//size button by this Dimension
//		int scrollBarWidth = ((Integer)UIManager.get("ScrollBar.width")).intValue()+50;  // for calculate recommenBtn, frame width - scrollbar width
		
		private YAXISBOXPANE() {
			super();
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			calcRecommendedBtn();
			
			System.out.println(parentPreferredSize);
		}
		
		private void calcRecommendedBtn(){
			//실제로는 프레임 상의 제목줄이나 보더 때문에 10개가 보여지지는 않는다.
//			recommendedBtn = new Dimension(parentPreferredSize.width - scrollBarWidth, parentPreferredSize.height/10);
			recommendedBtn = new Dimension(0, parentPreferredSize.height/10);
			
//			System.out.println(recommendedBtn);
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
