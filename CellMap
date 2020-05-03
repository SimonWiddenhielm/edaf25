package kalkyl;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import expr.Environment;

public class CellMap extends Observable implements Environment{
	
	
	private HashMap<String,Cell>sheet;
	
	public CellMap () {
	
		sheet = new HashMap<>();
		
	}
	
	
	public void addCell(String adress , Cell cell) {
		
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
	
	
}
	
	
	
	
