package oop;

import java.util.Arrays;

class Card{
	private int color;
	private int value;
	private String shape;
	public Card(int aColor, int aValue, String aShape) {
		super();
		color = aColor;
		value = aValue;
		shape = aShape;
	}
	@Override
	public String toString() {
		return "Card [color=" + color + ", value=" + value + ", shape=" + shape + "]";
	}
	public int getColor() {
		return color;
	}
	public void setColor(int aColor) {
		color = aColor;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int aValue) {
		value = aValue;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String aShape) {
		shape = aShape;
	}
	
}
public class Triad {
Card cards[];
Triad(Card c1,Card c2,Card c3){
	cards = new Card[3];
	cards[0]=c1;
	cards[1]=c2;
	cards[2]=c3;
	
}
public boolean isSet(){
	return ;
}
@Override
public String toString() {
	return "Triad [cards=" + Arrays.toString(cards) + "]";
}

}

