/**
 * 
 */
package JavaHttpURL;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;




/**
 * @author Govin
 *
 */
public class JavaHttpURLConnectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a neat value object to hold the URL
//        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//
//        // Open a connection(?) on the URL(?) and cast the response(??)
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//        // Now it's "open", we can set the request method, headers etc.
//        connection.setRequestProperty("accept", "application/json");
//
//        // This line makes the request
//        InputStream responseStream = connection.getInputStream();

        // Manually converting the response body InputStream to APOD using Jackson
//        ObjectMapper mapper = new ObjectMapper();
//        APOD apod = mapper.readValue(responseStream, APOD.class);

        // Finally we have the response
//        System.out.println(apod.title);

	}

}
