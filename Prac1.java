import java.net.SocketPermission;

public class Prac1 {

    public static void main(String[] args) {

        String[] message = new String[4];

        message[1] = "My name is Steven";
        message[0] = "Welcome to Stemiot Softwares";
        message[2] = "Come program with us";
        message[3] = "Java is an interesting language";

        // System.out.println(message[0]);
        // System.out.println(message[1]);

        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }

        // System.out.println("Hello,"+message[0]+"\n,"+message[1]+message[2]);

    }
    

}
