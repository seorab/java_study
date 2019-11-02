package http;

import org.json.JSONArray;
import org.json.JSONObject;

public class Http5 {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?serviceKey=A2usf4txsthrBPXx7%2FckSjISrlOOF3DRCXlpwxFKcl1KPyvOOWSD%2FUhcapvCkM51AdZOieooIvkMdz2XQCt33w%3D%3D&MobileOS=ETC&MobileApp=AppTest&eventStartDate=20191101&_type=json&areaCode=36");
		System.out.println(result);
		
		JSONObject obj = new JSONObject(result);
		JSONObject response = 
			obj.getJSONObject("response");
		JSONObject body =
			response.getJSONObject("body");
		JSONObject items =
			body.getJSONObject("items");
		JSONArray item =
			items.getJSONArray("item");
		for(int i = 0; i < item.length(); i++) {
			JSONObject it = item.getJSONObject(i);
			String addr1 = it.getString("addr1");
			String tel = it.getString("tel");
			String title = it.getString("title");
			System.out.printf(
				"%s, %s, %s\n", addr1, tel, title);
		}
	}
}








