/**
 * 
 */
package JavaHttpURL;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Govin
 *
 */
public class Test001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader inp = new InputStreamReader(System.in);
		try {
			int str = inp.read();
			char c = (char)str;
			System.out.println(str+"  "+ c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
