package data.faker;

public class MockUtil {
	  private static final MockUtil MU = new MockUtil(); 
	  private Boolean bool = true;
	    
	    private MockUtil() { 
	    } 
	         
	    public static MockUtil getInstance() { 
	      return MU; 
	    } 
	    
	    
	    public Boolean returnBool()
	    {
	    	bool = !bool;
	    	return bool;
	    }
	    
	  //  return (type == Double.class || type == Float.class || type == Byte.class 
	  //			|| type == Long.class || type == Integer.class || type == Short.class ) ;
	    
	    public Double returnDouble(int max)
	    {
	    	  return Math.floor(Math.random() * max);
	    }
	    public Float returnFloat(int max)
	    {
	    	return (float) Math.floor(Math.random() * max);
	    }
	    public Byte returnByte(int max)
	    {
	    	return (byte) Math.floor(Math.random() * max);
	    }
	    public Long returnLong(int max)
	    {
	    	return (long) Math.floor(Math.random() * max);
	    }
	    public Integer returnInteger(int max)
	    {
	    	return (int) Math.floor(Math.random() * max);
	    }
	    public Short returnShort(int max)
	    {
	    	return (short) Math.floor(Math.random() * max);
	    }
	    
	    public Object returnRandomEnumValue(@SuppressWarnings("rawtypes") Class clazz)
	    {
	    	Object[] possibleValues = clazz.getEnumConstants();
	    	
	    	int enumPos = (int) ((possibleValues.length-1) * Math.random());
	    	return possibleValues[enumPos];
	    }
	    
}
