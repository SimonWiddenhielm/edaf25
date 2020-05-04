package gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SwingConstants;

import kalkyl.CellMap;



public class SlotLabels extends GridPanel {
	
	
	
	/** 
	 * Constructor parameters are rows,cols,listOfells,Current Slot
	 * 
	 * 
	 * 
	 * **/
    private List<SlotLabel> labelList;
    private Scanner scan;
    private CellMap sheet;
    private CurrentLabel currentSlot;

    	public SlotLabels(int rows, int cols, CellMap sheet, CurrentLabel currentSlot) {
    		
    		
    	
    	
    	

    	
        super(rows + 1, cols);
        
        this.currentSlot  = currentSlot; 
        
    	this.sheet = sheet;
    	
             
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
            	
            	
                SlotLabel label = new SlotLabel(sheet,ch + row + "");
                
                
                add(label);
                labelList.add(label);
                
            }
        }
        SlotLabel firstLabel = labelList.get(0);
        
        for (int row = 0; row <= 79; row++) {
        	
        	addMouse(labelList.get(row));
        }
        
    }
    	
    	
    
    private void addMouse(SlotLabel label) {
    	
    	
    	label.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                 
                 label.setBackground(Color.YELLOW);
                 
               
             }

         });
    	
    	
    }
    
    
   
   
}
