package MockserverDataCreator.MockserverDataCreator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.javafaker.Faker;

import io.swagger.model.branch.Branch;
import out.MockCreator;
import out.ObjectCreatorBranch;


public class MCMain 
{
    public static void main( String[] args )
    {
    	//Faker faker = new Faker(new Locale("de"));
    	

    	//create some Objects
		ObjectCreatorBranch ocs = new ObjectCreatorBranch();
		

    	//5 Branch Objects
    	ArrayList <Branch> st2List = new ArrayList<Branch>();
    	for (int i= 0; i< 5; i++)
    	{
    		st2List.add(ocs.createBranch());
    	}
    	
    	ObjectMapper om = new ObjectMapper();
    	
    	try {
    		om.enable(SerializationFeature.INDENT_OUTPUT);

    		System.out.println(om.writeValueAsString(st2List));
    		om.writeValue(new File("target/resultBranch.json"), st2List);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
