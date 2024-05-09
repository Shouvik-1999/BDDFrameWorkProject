package com.tutorialsninja.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties initializeConfigFile() {
		Properties prop=new Properties();
		try {
			FileInputStream file=new FileInputStream(".\\src\\main\\java\\com\\tutorialsninja\\config\\config.properties");
			prop.load(file);

		}catch(Exception E) {
			System.out.println(E);
		}
		return prop;

	}

}
