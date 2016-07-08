package util;


public class URLBuilderUtil {

	public String urlBuilder (String url, String site, String pool){
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append(url).append(site).append(pool);
		return urlBuilder.toString();
		
		}
	
}
