package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

public class SheetPanel extends BorderPanel {
	private SlotLabels slot;
    public SheetPanel(int rows, int columns) {
    	slot = new SlotLabels(rows,columns);
    	
        
    	add(WEST, new RowLabels(rows));
        add(CENTER, slot);
    }
    
    public SlotLabels getSlot() {
    	return slot;
    }
}