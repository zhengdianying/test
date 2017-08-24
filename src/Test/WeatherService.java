package Test;

import javax.xml.ws.Endpoint;

public class WeatherService {
	public static void main(String[] args) {
		String address="http://127.0.0.1:12345/weather";
		WeatherInterfaceImpl  wImple = new WeatherInterfaceImpl();
		Endpoint.publish(address, wImple);
	}

}
