package test.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@NewAnnotationType
public class TestClassA {

	int a;
	String b;
	TestClassB object;
	List<TestClassC> objects;

	
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
	public TestClassB getObject() {
		return object;
	}

	public void setObject(TestClassB object) {
		this.object = object;
	}

	
	@JsonProperty("objects")
	public List<TestClassC> getObjects() {
		return objects;
	}

	public void setObjects(List<TestClassC> objects) {
		this.objects = objects;
	}
}
