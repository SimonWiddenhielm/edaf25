package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
/** 
 * Obs
 * 
 * 
 * 
 * 
 * 
 * **/

public class StatusLabel extends ColoredLabel implements Observer { //Status label
    public StatusLabel() {
        super("asd", Color.WHITE);
        
        
    }

    public void update(Observable observable, Object object) {
        setText("");
    }
    
    
}