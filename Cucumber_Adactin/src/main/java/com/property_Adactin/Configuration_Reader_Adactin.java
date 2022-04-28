package com.property_Adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Adactin {

	public static Properties p = new Properties();

	public Configuration_Reader_Adactin() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\src\\main\\java\\com\\property_Adactin\\Configuration_Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p.load(fis);

	}

	public String get_Instance_url() {

		String value = p.getProperty("url");
		return value;

	}

	public String get_Instance_username() {
		String value = p.getProperty("username");
		return value;

	}

	public String get_Instance_password() {
		String value = p.getProperty("password");
		return value;
	}

	public String get_Instance_location() {
		String value = p.getProperty("location");
		return value;
	}

	public String get_Instance_hotel() {
		String value = p.getProperty("hotel");
		return value;
	}

	public String get_Instance_noOfrooms() {
		String value = p.getProperty("noOfrooms");
		return value;

	}

	public String get_Instance_checkIndate() {
		String value = p.getProperty("chekIndate");
		return value;

	}

	public String get_Instance_checkOutdate() {
		String value = p.getProperty("checkOutdate");
		return value;

	}

	public String get_Instance_noOfadults() {
		String value = p.getProperty("noOfadults");
		return value;
	}

	public String get_Instance_noOfchildren() {
		String value = p.getProperty("noOfchildren");
		return value;

	}

	public String get_Instance_firstname() {
		String value = p.getProperty("firstname");
		return value;

	}

	public String get_Instance_lastname() {
		String value = p.getProperty("lastname");
		return value;
	}

	public String get_Instance_address() {
		String value = p.getProperty("address");
		return value;
	}

	public String get_Instance_creditcardno() {
		String value = p.getProperty("creditcardno");
		return value;
	}

	public String get_Instance_cardtype() {
		String value = p.getProperty("cardtype");
		return value;
	}

	public String get_Instance_cvv() {
		String value = p.getProperty("cvv");
		return value;
	}

}
