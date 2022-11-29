package com.dena.mirrativ.mirrativapi.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.dena.mirrativ.mirrativapi.R;
import java.util.Arrays;
import java.util.Locale;
import jo.h;
import jo.i0;
import jo.p;
import so.n;

/* loaded from: classes2.dex */
public final class ServerConfigImpl implements ServerConfig {
    public static final Companion Companion = new Companion(null);
    private static final int PERSONAL_DEV_SERVERS_COUNT = 27;
    private static final int QA_SERVERS_COUNT = 38;
    private static int sandBoxNumber;
    private static int serverIndex;
    private final Context context;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public ServerConfigImpl(Context context) {
        p.h(context, "context");
        this.context = context;
    }

    private final String getBasicAuthPassword(int i10) {
        String[] stringArray = this.context.getApplicationContext().getResources().getStringArray(R.array.basic_auth_passwords);
        p.g(stringArray, "context.applicationConte…ray.basic_auth_passwords)");
        try {
            String str = stringArray[i10];
            p.g(str, "{\n            if (BuildC…asswords[index]\n        }");
            return str;
        } catch (Exception unused) {
            String str2 = stringArray[0];
            p.g(str2, "{\n            passwords[0]\n        }");
            return str2;
        }
    }

    private final String getBasicAuthUser(int i10) {
        String[] stringArray = this.context.getResources().getStringArray(R.array.basic_auth_users);
        p.g(stringArray, "context.resources.getStr…R.array.basic_auth_users)");
        try {
            String str = stringArray[i10];
            p.g(str, "{\n            if (BuildC…se users[index]\n        }");
            return str;
        } catch (Exception unused) {
            String str2 = stringArray[0];
            p.g(str2, "{\n            users[0]\n        }");
            return str2;
        }
    }

    private final String getClogServerHost(int i10) {
        String[] stringArray = this.context.getApplicationContext().getResources().getStringArray(R.array.clog_server_urls);
        p.g(stringArray, "context.applicationConte…R.array.clog_server_urls)");
        try {
            String str = stringArray[i10];
            p.g(str, "{\n            if (BuildC…    urls[index]\n        }");
            return str;
        } catch (Exception unused) {
            String str2 = stringArray[0];
            p.g(str2, "{\n            urls[0]\n        }");
            return str2;
        }
    }

    private final String getServerHost(int i10) {
        String[] stringArray = this.context.getApplicationContext().getResources().getStringArray(R.array.server_urls);
        p.g(stringArray, "context.applicationConte…rray(R.array.server_urls)");
        try {
            String str = stringArray[i10];
            p.g(str, "{\n            if (BuildC…    urls[index]\n        }");
            return str;
        } catch (Exception unused) {
            String str2 = stringArray[0];
            p.g(str2, "{\n            urls[0]\n        }");
            return str2;
        }
    }

    private final String personalDevServerHostname(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("personal");
        i0 i0Var = i0.f38149a;
        String format = String.format(Locale.US, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        p.g(format, "format(locale, format, *args)");
        sb2.append(format);
        sb2.append(".dev.mirrativ.com");
        return sb2.toString();
    }

    private final String qaServerHostname(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("www");
        i0 i0Var = i0.f38149a;
        String format = String.format(Locale.US, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        p.g(format, "format(locale, format, *args)");
        sb2.append(format);
        sb2.append(".dev.mirrativ.com");
        return sb2.toString();
    }

    private final String sandboxServerHostname(int i10) {
        return "sandbox" + i10 + ".dev.mirrativ.com";
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public boolean checkDomainWhiteList(String str) {
        String[] stringArray = this.context.getApplicationContext().getResources().getStringArray(R.array.domain_whitelist);
        p.g(stringArray, "context.applicationConte…R.array.domain_whitelist)");
        if (str == null) {
            return false;
        }
        for (String str2 : stringArray) {
            p.g(str2, "whitelist[i]");
            if (n.p(str, str2, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public void debugSetSandboxServer(int i10) {
        serverIndex = 1;
        sandBoxNumber = i10;
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    @SuppressLint({"ApplySharedPref"})
    public void debugSetServer(int i10) {
        serverIndex = i10;
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getClogServerURL() {
        return "https://" + getClogServerHost(serverIndex);
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getServerURL() {
        String serverHost = getServerHost(serverIndex);
        return "https://" + serverHost;
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String[] getServerURLs() {
        String[] stringArray = this.context.getResources().getStringArray(R.array.server_urls);
        p.g(stringArray, "context.resources.getStr…rray(R.array.server_urls)");
        return stringArray;
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getServerURLwithBasicAuth() {
        String str;
        String serverHost = getServerHost(serverIndex);
        String basicAuthUser = getBasicAuthUser(serverIndex);
        String basicAuthPassword = getBasicAuthPassword(serverIndex);
        if (TextUtils.isEmpty(basicAuthUser) || TextUtils.isEmpty(basicAuthPassword)) {
            str = "";
        } else {
            str = basicAuthUser + ':' + basicAuthPassword + '@';
        }
        return "https://" + str + serverHost;
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getTwitterConsumerKey() {
        String[] stringArray = this.context.getResources().getStringArray(R.array.twitter_consumer_keys);
        p.g(stringArray, "context.resources.getStr…ay.twitter_consumer_keys)");
        try {
            String str = stringArray[serverIndex];
            p.g(str, "{\n                if (Bu…erverIndex]\n            }");
            return str;
        } catch (Exception unused) {
            String str2 = stringArray[0];
            p.g(str2, "{\n                keys[0]\n            }");
            return str2;
        }
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getTwitterConsumerSecrets() {
        String[] stringArray = this.context.getResources().getStringArray(R.array.twitter_consumer_secrets);
        p.g(stringArray, "context.resources.getStr…twitter_consumer_secrets)");
        try {
            String str = stringArray[serverIndex];
            p.g(str, "{\n                if (Bu…erverIndex]\n            }");
            return str;
        } catch (Exception unused) {
            String str2 = stringArray[0];
            p.g(str2, "{\n                secrets[0]\n            }");
            return str2;
        }
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getBasicAuthPassword() {
        return getBasicAuthPassword(serverIndex);
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getBasicAuthUser() {
        return getBasicAuthUser(serverIndex);
    }

    @Override // com.dena.mirrativ.mirrativapi.core.ServerConfig
    public String getServerHost() {
        return getServerHost(serverIndex);
    }
}
