package Array.ForEachLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Locale;

public class forEachLoop3 {
    public static void main(String[] args) {
        String[] names = {"Madina", "Irina", "Guzel", "John", "Brian", "Nina", "David"};
        // create e-mail address for each of the names in the array
        // example: john@gmail.com
        //store this emails in new array (gmail with gmail; yahoo with yahoo)
        for (String eMail : names) {
            System.out.print(eMail + "@gmail.com    ");
            System.out.println(eMail.toLowerCase().concat("yahoo.com"));
        }
        /*
Madina@gmail.com    madinayahoo.com
Irina@gmail.com    irinayahoo.com
Guzel@gmail.com    guzelyahoo.com
John@gmail.com    johnyahoo.com
Brian@gmail.com    brianyahoo.com
Nina@gmail.com    ninayahoo.com
David@gmail.com    davidyahoo.com

 */
            String[] gMails = new String[names.length];
            String[] yahooMails = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                gMails[i] = names[i] + "@gmail.com";
                yahooMails[i] = names[i].toUpperCase().concat("@yahoo.com");
            }
            System.out.println(Arrays.toString(gMails));
            System.out.println(Arrays.toString(yahooMails));

        }

    }



