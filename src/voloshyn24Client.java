/**
 * Created by mv on 21.12.15.
 */
import ua.voloshyn24.npv.NpvVoloshyn24;
import ua.voloshyn24.npv.NpvVoloshyn24PortType;

public class voloshyn24Client {
    public static void main(String[] args) {
        NpvVoloshyn24 wsServer = new NpvVoloshyn24();
        NpvVoloshyn24PortType wsServerPortType = wsServer.getNpvVoloshyn24Soap();
        String response = wsServerPortType.javaTest();
        System.out.println(response);
    }
}
