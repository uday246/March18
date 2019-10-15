package Mar13th18;
abstract class Element {

	private String symbol;
	private int atomicNumber;
	private  String atomicWeight;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String aSymbol) {
		symbol = aSymbol;
	}
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(int aAtomicNumber) {
		atomicNumber = aAtomicNumber;
	}
	public String getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(String aAtomicWeight) {
		atomicWeight = aAtomicWeight;
	}
	public Element(String aSymbol, int aAtomicNumber, String aAtomicWeight) {
		super();
		symbol = aSymbol;
		atomicNumber = aAtomicNumber;
		atomicWeight = aAtomicWeight;
	}
	
	
	public abstract void describeElement();
	
}
class MetalElment extends Element{

	

	public MetalElment(String aSymbol, int aAtomicNumber, String aAtomicWeight) {
		super(aSymbol, aAtomicNumber, aAtomicWeight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describeElement() {
		System.out.println("About  Metal Elements : \n Metals are good conductors of electricity");
		System.out.println(" Symbol : "+getSymbol());
		System.out.println(" Atomic Weight : "+getAtomicWeight());
		System.out.println(" Atomic Number : "+getAtomicNumber());
		
	}
	
}
class NonMetalElement extends Element{

	

	public NonMetalElement(String aSymbol, int aAtomicNumber, String aAtomicWeight) {
		super(aSymbol, aAtomicNumber, aAtomicWeight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describeElement() {
		System.out.println("About Non Metal Elements : \n  Nonmetals are poor conductors");
		System.out.println(" Symbol : "+getSymbol());
		System.out.println(" Atomic Weight : "+getAtomicWeight());
		System.out.println(" Atomic Number : "+getAtomicNumber());
		
		
		
	}
	
}
class ElementArray{
	public static void main(String[] args) {
		Element element[] = new Element[4];
		element[0] = new NonMetalElement("H", 1, "1.00794 amu");
		element[1] = new NonMetalElement("N", 7, "14.00674 amu");
		element[2] = new NonMetalElement("Hg", 82, "207.2 amu");
		element[3] = new NonMetalElement("Fe", 26, "55.845 amu");
		
		for(Element ele:element){
			ele.describeElement();
		}
		
	}
}