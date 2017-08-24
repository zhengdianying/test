package Test;

public class WeatherInterfaceImpl implements WeatherInterface{

	@Override
	public String getWeatherByCity(String city) {
		System.out.println("接受客户端发送的名字："+city);
		String result = "热";
		System.out.println("返回天气信息："+result);
		return result;
	}

}
