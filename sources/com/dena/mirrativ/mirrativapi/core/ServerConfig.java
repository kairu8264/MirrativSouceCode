package com.dena.mirrativ.mirrativapi.core;

/* loaded from: classes2.dex */
public interface ServerConfig {
    boolean checkDomainWhiteList(String str);

    void debugSetSandboxServer(int i10);

    void debugSetServer(int i10);

    String getBasicAuthPassword();

    String getBasicAuthUser();

    String getClogServerURL();

    String getServerHost();

    String getServerURL();

    String[] getServerURLs();

    String getServerURLwithBasicAuth();

    String getTwitterConsumerKey();

    String getTwitterConsumerSecrets();
}
