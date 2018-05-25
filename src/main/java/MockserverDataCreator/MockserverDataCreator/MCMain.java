package MockserverDataCreator.MockserverDataCreator;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.swagger.model.payments.InlineResponse200;
import out.ioswaggermodelpayments;

public class MCMain 
{
    public static void main( String[] args )
    {
    	//Faker faker = new Faker(new Locale("de"));
    	

    	//create an Object Creator for payments
    	ioswaggermodelpayments paymentCreator = new ioswaggermodelpayments();
    	

    	//5 Response Objects
    	ArrayList <InlineResponse200> stList = new ArrayList<InlineResponse200>();
    	for (int i= 0; i< 5; i++)
    	{
    		stList.add(paymentCreator.createInlineResponse200());
    	}
    
    	
    	try {
    		ObjectMapper om = new ObjectMapper();
    		om.enable(SerializationFeature.INDENT_OUTPUT);

    		System.out.println(om.writeValueAsString(stList));
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		}
    
}
