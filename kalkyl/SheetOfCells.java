package kalkyl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.regex.Pattern;

import expr.Environment;
import expr.Expr;
import expr.ExprParser;

public class SheetOfCells extends Observable implements Environment {

	private HashMap<String, Cell> sheet;

	public SheetOfCells() {

		sheet = new HashMap<>();

	}

	public boolean insert(String adress, String expr) {
		Cell cell;

		if (expr.charAt(0) == '#') {
			cell = new StringCell(expr.substring(1));
			sheet.put(adress, cell);
			System.out.println(sheet.get(adress).toString(this));
			return true;
		} else {
			ExprParser parser = new ExprParser();
			try {
				Expr expression = parser.build(expr);
				
				
				Environment env = new Environment() {
					
	                public double value(String adr) {
	                	if(Pattern.matches("[A-H]([0-9]|10)", adr)) {
	                		return lol(adr);
	                	}
	                	return 0;
	                }
	            };
				
				
				cell = new ExprCell(expression);
				sheet.put(adress, cell);				
				
				
				System.out.println(expression);
				System.out.println(sheet.get(adress).value(env));
				
			}

			catch (IOException e) {

			}

			//System.out.println(sheet.get(adress).toString(this));
			setChanged();
			notifyObservers();
			return false;

		}
	}
	
	public double lol(String adr) {
		return sheet.get(adr).value(this);
	}

	public void removeCell(String adress) {

		sheet.remove(adress);
		setChanged();
		notifyObservers();

	}

	@Override
	public  double value(String adress) {

		if (!sheet.containsKey(adress)) {

			throw new NullPointerException();

		}

		return sheet.get(adress).value(this);

	}

	public String StringRepresentation(String adress) {

		if (!sheet.containsKey(adress)) {

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
	
	
	
	
	
	
	


