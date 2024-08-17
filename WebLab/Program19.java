import java.net.InetAddress;
import java.net.UnknownHostException;

public class Program19 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("IP address of the local host is: " + address);

        String hostName = "www.google.com";
        InetAddress address1 = InetAddress.getByName(hostName);
        System.out.println("IP address of the named host : " + hostName + " is: " + address1);
    }
}
