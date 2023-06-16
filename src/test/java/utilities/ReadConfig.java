package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		pro = new Properties();
		try {
			FileInputStream inputStream = new FileInputStream("config.properties");
			pro.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getAppURL() {

		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getChromeDriver() {

		String url = pro.getProperty("chromeDriver");
		return url;
	}

	public String getUserName() {

		String url = pro.getProperty("username");
		return url;
	}

	public String getPassword() {

		String url = pro.getProperty("password");
		return url;
	}
}
