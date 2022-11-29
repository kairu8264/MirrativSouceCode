package com.neovisionaries.ws.client;

import hn.o0;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public class HostnameUnverifiedException extends WebSocketException {

    /* renamed from: x  reason: collision with root package name */
    public final SSLSocket f28253x;

    /* renamed from: y  reason: collision with root package name */
    public final String f28254y;

    public HostnameUnverifiedException(SSLSocket sSLSocket, String str) {
        super(o0.HOSTNAME_UNVERIFIED, String.format("The certificate of the peer%s does not match the expected hostname (%s)", b(sSLSocket), str));
        this.f28253x = sSLSocket;
        this.f28254y = str;
    }

    public static String b(SSLSocket sSLSocket) {
        try {
            return String.format(" (%s)", sSLSocket.getSession().getPeerPrincipal().toString());
        } catch (Exception unused) {
            return "";
        }
    }
}
