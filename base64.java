
package Code;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
public class base64 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Hi Welcome \n1 » Strint to base64\n2 » base64 to String");
        int code = input.nextInt();
        switch(code){
            case 1:
            System.out.println("Ok now send me String :");
            String tobase = input.next();
            encode(tobase);
            break;
            case 2:
            System.out.println("Ok now send me base64 :");
            String tostring = input.next();
            decode(tostring);
            break;
            default:
                System.out.println("404 :/");
        }
    }
    static void encode(String code){
        String encode = DatatypeConverter.printBase64Binary(code.getBytes());
        System.out.println(encode);
    }
    static void  decode(String code){
        String decode = new String (DatatypeConverter.parseBase64Binary(code));
        System.out.println(decode);
    }
}
