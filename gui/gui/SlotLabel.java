package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import kalkyl.*;

public class SlotLabel extends ColoredLabel implements Observer {
	
	private SheetOfCells sheet;
	private String address;
	private CurrentCell currentCell;
	private Color color;
	

	
    public SlotLabel(SheetOfCells sheet, String address, CurrentCell currentCell) {
      
    	super("",Color.WHITE, RIGHT);
    	
    	color = Color.WHITE;
    
    	this.sheet = sheet;
        this.address = address;
        this.currentCell = currentCell;

    }

	@Override
	public void update(Observable o, Object arg) {
		
		
		
		
		if(sheet.contains(address)) {
			
			String text = sheet.StringRepresentation(address);
			
			super.setText(text);
			
			

		} else {
			super.setText("");
			
		}




		if(currentCell.getAdress() != address ) {

			setBackground(Color.WHITE);
			

			}
			
			
			
		
			
	}

	


	public String getAddress() {
		
		return address;
	}
  
}