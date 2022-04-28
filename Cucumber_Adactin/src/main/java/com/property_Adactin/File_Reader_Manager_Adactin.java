package com.property_Adactin;

import java.io.IOException;

public class File_Reader_Manager_Adactin {
	
	private File_Reader_Manager_Adactin() {
	
	}
	
	public Configuration_Reader_Adactin get_Instance_CR() throws IOException {
		
		Configuration_Reader_Adactin Reader = new Configuration_Reader_Adactin();
		
		return Reader;
		

	}
	
	public static File_Reader_Manager_Adactin get_Instance_FRM() {
		
		File_Reader_Manager_Adactin FRM = new File_Reader_Manager_Adactin();
		
		return FRM;
		

	}

}
