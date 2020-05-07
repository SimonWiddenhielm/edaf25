package kalkyl;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import expr.Environment;

public class SheetOfCells extends Observable implements Environment{
	
	
	private HashMap<String,Cell>sheet;
	
	public SheetOfCells () {
	
		sheet = new HashMap<>();
		
	}
	
	
	public void add(String adress , Cell cell) {
		
		sheet.put(adress, cell) ;
		 setChanged();
         notifyObservers();
		
	}
	
	public void removeCell(String adress) {
		
		sheet.remove(adress); 
		setChanged();
        notifyObservers();
		
	}


	@Override
	public double value(String adress) {
		
		
		if(!sheet.containsKey(adress)) {
			
			throw new NullPointerException();
			
		}
		
		return sheet.get(adress).value(this);
		
	}
	public String StringRepresentation(String adress) {
		
		
		if(!sheet.containsKey(adress)) {
			
			throw new NullPointerException();
		}
		
		return sheet.get(adress).toString(this);
	}
	public void remove(String adress) {
		
		
		sheet.remove(adress);
	}
	public boolean evaluate(String adress, String value) {
		
		
		return false;
		
	}
	
}
	
	
	
	
	
	
	


