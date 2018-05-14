package _01_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	
	private int itemsRecieved; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // can be any object type except String. Strings get turned into objects.
String temp = "";

	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	public int getItem() {

		return itemsRecieved;
	}

	public void setItem(int itemsRecieved) {
		if(itemsRecieved < 0) {
			itemsRecieved = 0;
		}
		this.itemsRecieved = itemsRecieved;
	}

	public float getDegrees() {
		
		return degreesTurned;
	}

	public void setDegrees(float degreesTurned) {
		if(degreesTurned < 0) {
			this.degreesTurned = (float) 0.0;
		}
		else if(degreesTurned > 360) {
			this.degreesTurned = (float) 360.0;
		}
		else {
			this.degreesTurned = degreesTurned;
		}
		
	}

	public String getNomenclature() {

		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if(nomenclature.equals("")) {
			this.nomenclature = " ";
		}
		else{this.nomenclature = nomenclature;
	}}

	public Object getMember() {
System.out.println(memberObj.getClass());
		return memberObj;
	}

	
	public void setMember(Object memberObj) {
	
		this.memberObj = memberObj;
	}

	public void setMember(String memberObj) {
	
		Object m = (Object) memberObj;
		 
		this.memberObj = m;
	}
	
	public static void main(String[] args) {

	}

}
