package Day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class program01 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		File src = new File (".\\src\\test\\resources\\DataSheet.xls");
		InputStream ip = new FileInputStream(src);
		Properties property = new Properties();
		property.load(ip);
		
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("sleep"));
		System.out.println(property.getProperty("browser"));
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}

}

	


