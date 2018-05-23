package test.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestClassD {

	int a;
	String b;
	
	
	@JsonProperty("a")
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	@JsonProperty("b")
	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
}
