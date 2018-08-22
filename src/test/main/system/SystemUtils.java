package test.main.system;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Properties;

public class SystemUtils {

	public static void getSysProps() {
		Properties props = System.getProperties();
		for (Object key : props.keySet()) {
			String value = (String) props.get(key);
			System.out.println("Key = " + key + ", Value = " + value);
		}
	}
	
	public static void getNetAndUser() {
		try {
			System.out.println("User is : " + System.getProperty("user.name")); 
			System.out.println("hostname : " + Inet4Address.getLocalHost().getHostName());
			System.out.println("w IP : " + Inet4Address.getLocalHost());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static void systemChecks() {
		getSysProps();
		getNetAndUser();
	}

}
