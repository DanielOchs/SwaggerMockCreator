package data.faker;

import java.util.HashMap;
import java.util.Map;

public class NameStringGenerator {

    private static final NameStringGenerator OBJ = new NameStringGenerator(); 
    Map<String, Number> num;

    
    
    private NameStringGenerator() { 
    	num = new HashMap<String, Number>();
    } 
         
    public static NameStringGenerator getInstance() { 
      return OBJ; 
    } 
	
    public String createNameString(String s)
    {
    	if (num.containsKey(s))
    	{
    		num.put(s, num.get(s).intValue()+1);
    		return s + (num.get(s).intValue()-1);
    	}
    	else {
    		num.put(s, 1);
    		return s + 1;
    	}
        
        
    }
    

	
}
