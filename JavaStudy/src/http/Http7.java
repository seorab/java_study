package http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONObject;

public class Http7 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		NetworkUtil nu = new NetworkUtil();
		String url = "https://dapi.kakao.com/v2/local/search/address.json";
		String param = "?query=" + URLEncoder.encode("±«Á¤µ¿", "utf-8");
		String appKey = "d4be7b479f4b4cbd99bd19ae87f88b4b";
		String result = nu.getKakao(url + param, appKey);
		System.out.println(result);
		JSONObject obj = new JSONObject(result);
		JSONArray documents = obj.getJSONArray("documents");
		for (int i = 0; i < documents.length(); i++) {
			JSONObject document = documents.getJSONObject(i);
			String addressName = document.getString("address_name");
			String latitude = document.getString("y");
			String longitude = document.getString("x");
			System.out.printf("%s, %s / %s\n", addressName, latitude, longitude);
		}
	}
	
	
	
	
	
	
	
	
}