package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import kalkyl.CellMap;

public class SlotLabel extends ColoredLabel implements Observer {
	
	
	private CellMap sheet;
	private String Adress;
	
    public SlotLabel(CellMap sheet, String Adress, CurrentLabel current ) {
        super("                    ", Color.WHITE, RIGHT);
    
        this.sheet = sheet;
        this.Adress = Adress;
        addMouseEvent(e->)
    }

	@Override
	public void update(Observable o, Object arg) {
		
		
		try {
			String value = sheet.StringRepresentation(Adress);
			setText(value);
			
		} catch (NullPointerException n) {
			
			n.printStackTrace();
			
		}
		
		
		
		
		
		
		
	}
	
    
    
    
   
}