package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import kalkyl.CellMap;

public class Editor extends JTextField implements Observer {
	
	private CurrentLabel current; //Current "slot" chosen, chosen upon MouseEvent-> Mouseclick, the expression typed in the editor class(JTextField) from keyboard will be a value or equation 
	private SlotLabels grid; //   (compiled as of either another slot or combination of 2 or more ) or comment. This expression is dipslayed in the  currentLabel(marked.YELLOW) obj
    public Editor(CurrentLabel current, CellMap sheet) {
    	
    	this.current = current;
    	this.grid = grid;
    	addActionListener(e -> executeText());
        setBackground(Color.WHITE);
    }
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	/** 
	 * A method that executes the text and sends it o
	 * 
	 * 
	 * **/
	
	public void executeText() {
		
		sheet.(current.getAdress()
		sheet.addCell(current.getAdress(),getText());
		
		
		
		
		
		
	}
	/**
	 * Updates the editor with the value of selected slot
	 *  
	 *  
	 *  
	 *  **/
	
	
    
    
    
    
    
    
    
}