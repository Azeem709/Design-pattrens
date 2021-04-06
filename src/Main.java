import proxyPattren.AbsctractProxy.Internet;
import proxyPattren.implementation.ProxyInternet;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Internet internet = new ProxyInternet();
        internet.connect("xyz.com");
    }
}
