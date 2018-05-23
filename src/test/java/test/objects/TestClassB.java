package test.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestClassB {

	int a;
	String b;
	TestClassD object;

	
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

	@JsonProperty("object")
	public TestClassD getObject() {
		return object;
	}

	public void setObject(TestClassD object) {
		this.object = object;
	}
}
