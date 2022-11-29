package com.dena.mirrorman.net.bcsvr;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import jo.p;

/* loaded from: classes2.dex */
public final class BcsvrAddress {
    public static final int $stable = 0;
    private final String host;
    private final String key;
    private final int port;

    public BcsvrAddress(String str, int i10, String str2) {
        p.h(str, "host");
        p.h(str2, "key");
        this.host = str;
        this.port = i10;
        this.key = str2;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getPort() {
        return this.port;
    }

    public final Socket openSocket() throws IOException {
        return new Socket(InetAddress.getByName(this.host), this.port);
    }
}
