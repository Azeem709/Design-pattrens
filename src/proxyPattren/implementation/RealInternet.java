package proxyPattren.implementation;

import proxyPattren.AbsctractProxy.Internet;

import java.io.IOException;

public class RealInternet implements Internet {
    @Override
    public void connect(String serverHost) throws IOException {
        System.out.println("connecting to "+serverHost);
    }
}
