package main;

public class Conversor {

	private short numShort;
	private float numFloat;
	private Integer numIntegerWrapper;
	private Double numDoubleWrapper;
	
	private int numInt;
	//private int numInt2;
	//private short numShort2;
	private Float numFloatWrapper;
	private Short numShortWrapper;
	private double numDouble;
	
	public Conversor(){
	}

	public short getNumShort() {
		return numShort;
	}

	public void setNumShort(short numShort) {
		this.numShort = numShort;
	}

	public float getNumFloat() {
		return numFloat;
	}

	public void setNumFloat(float numFloat) {
		this.numFloat = numFloat;
	}

	public Integer getNumIntegerWrapper() {
		return numIntegerWrapper;
	}

	public void setNumIntegerWrapper(Integer numIntegerWrapper) {
		this.numIntegerWrapper = numIntegerWrapper;
	}

	public Double getNumDoubleWrapper() {
		return numDoubleWrapper;
	}

	public void setNumDoubleWrapper(Double numDoubleWrapper) {
		this.numDoubleWrapper = numDoubleWrapper;
	}
	
	
	public void CastImplicito(short numShort) {
		this.numInt = numShort;
	}
	
	
	/* public void Unboxing (Integer numIntegerWrapper) {
		this.numInt2 = numIntegerWrapper;
	}
	
	
	public void CastExplicito(int numInt2) {
		this.numShort2 = (short)numInt2;
	}
	*/
	
	public void CastExplicitoWrapper(Integer numIntegerWrapper) {
		this.numShortWrapper = numIntegerWrapper.shortValue();
				
	}
	
	public void boxing (float numfloat) {
		this.numFloatWrapper = numfloat;
	}
	

	public void Unboxing (Double numDoublerWrapper) {
		this.numDouble = numDoublerWrapper.doubleValue();
	}
	
	public void Print() {
		System.out.println("Cast Implicito: short -> int: " + numInt);
		System.out.println("Boxing: float -> Float(Wrapper): " + numFloatWrapper);
		System.out.println("Cast Explicito: Integer(Wrapper) -> Shor(Wrapper): " + numShortWrapper);
		System.out.println("Unboxing: Double(Wrapper) -> double: " + numDouble);
	}
}
