package com.jason;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.produitgate.vtiger.JavaObject;

public class Jason_Convert {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException{
	JavaObject java = new JavaObject();
	ObjectMapper objmap = new ObjectMapper();
	//objmap.writeValue(new File("./JASON/test.json"), java);
	
	JavaObject data = objmap.readValue(new File("./JASON/test.json"), JavaObject.class);
	System.out.println(data.getId());
	System.out.println(data.getName());
	int[] mob = data.getMob();
	System.out.println(mob[0]);
	System.out.println(mob[1]);
	
	
}
}
