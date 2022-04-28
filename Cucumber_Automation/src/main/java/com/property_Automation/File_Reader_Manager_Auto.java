package com.property_Automation;

import java.io.IOException;

public class File_Reader_Manager_Auto {
	
	private File_Reader_Manager_Auto() {
		
	}
	
	public Configuration_Reader_Automation get_Instance_CR() throws IOException {
		
		Configuration_Reader_Automation Reader = new Configuration_Reader_Automation();
		
		return Reader;
		

	}
	
	public static File_Reader_Manager_Auto get_Instance_FRM() {
		
		File_Reader_Manager_Auto FRM = new File_Reader_Manager_Auto();
		
		return FRM;
		

	}

}
