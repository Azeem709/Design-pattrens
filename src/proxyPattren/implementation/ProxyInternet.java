package proxyPattren.implementation;

import proxyPattren.AbsctractProxy.Internet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    Internet realInternet = new RealInternet();
    List<String> bannedSites = new ArrayList<>();

    {
        bannedSites.add("xyz.com");
        bannedSites.add("google.com");
    }
    public void connect(String serverHost) throws IOException {
        if(bannedSites.contains(serverHost))
            throw  new IOException("this site is bannned");
        else
            realInternet.connect(serverHost);

    }
}
