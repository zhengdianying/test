package Test;

public class WeatherInterfaceImpl implements WeatherInterface{

	@Override
	public String getWeatherByCity(String city) {
		System.out.println("���ܿͻ��˷��͵����֣�"+city);
		String result = "��";
		System.out.println("����������Ϣ��"+result);
		return result;
	}

}
