package com.property_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Automation {

	public static Properties p;

	public Configuration_Reader_Automation() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\src\\main\\java\\com\\property_Automation\\Configuration_Automation.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String get_config_url() {

		String value = p.getProperty("url");

		return value;

	}

	public String get_config_email() {

		String value = p.getProperty("email");

		return value;

	}

	public String get_config_password() {

		String value = p.getProperty("password");

		return value;

	}

}
