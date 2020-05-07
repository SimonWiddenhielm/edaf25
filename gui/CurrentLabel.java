package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class CurrentLabel extends ColoredLabel implements Observer {
	
	private String adress;
    public CurrentLabel(String Adress) {
        super("A1", Color.WHITE);
        
        
        this.adress = adress;
    }
    
    

	@Override
	public void update(Observable o, Object arg) {
		
		
	}
	
	public void setAdress(String adr) {
		adress = adr;
	}
}