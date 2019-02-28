import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
public class Base64 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Hi Welcome \n1 » Strint to base64\n2 » base64 to String");
        switch(input.nextInt()){
            case 1:
            System.out.println("Ok now send me String :");
            encode(input.next());
            break;
            case 2:
            System.out.println("Ok now send me base64 :");
            decode(input.next());
            break;
            default:
                System.out.println("404 :/");
        }
    }
    static void encode(String code){
        System.out.println(DatatypeConverter.printBase64Binary(code.getBytes()));
    }
    static void  decode(String code){
        System.out.println(new String (DatatypeConverter.parseBase64Binary(code)));
    }
}
