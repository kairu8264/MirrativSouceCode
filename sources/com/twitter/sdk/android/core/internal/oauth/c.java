package com.twitter.sdk.android.core.internal.oauth;

import in.o;
import in.q;
import in.r;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: g  reason: collision with root package name */
    public static final SecureRandom f28280g = new SecureRandom();

    /* renamed from: a  reason: collision with root package name */
    public final q f28281a;

    /* renamed from: b  reason: collision with root package name */
    public final r f28282b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28283c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28284d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28285e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f28286f;

    public c(q qVar, r rVar, String str, String str2, String str3, Map<String, String> map) {
        this.f28281a = qVar;
        this.f28282b = rVar;
        this.f28283c = str;
        this.f28284d = str2;
        this.f28285e = str3;
        this.f28286f = map;
    }

    public final void a(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(ln.c.c(str));
            sb2.append("=\"");
            sb2.append(ln.c.c(str2));
            sb2.append("\",");
        }
    }

    public String b(String str) {
        try {
            String h10 = h();
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(h10.getBytes(StandardCharsets.UTF_8), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] doFinal = mac.doFinal(bytes);
            return rp.f.z(doFinal, 0, doFinal.length).a();
        } catch (InvalidKeyException e10) {
            o.g().c("Twitter", "Failed to calculate signature", e10);
            return "";
        } catch (NoSuchAlgorithmException e11) {
            o.g().c("Twitter", "Failed to calculate signature", e11);
            return "";
        }
    }

    public String c(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder("OAuth");
        a(sb2, "oauth_callback", this.f28283c);
        a(sb2, "oauth_consumer_key", this.f28281a.a());
        a(sb2, "oauth_nonce", str);
        a(sb2, "oauth_signature", str3);
        a(sb2, "oauth_signature_method", "HMAC-SHA1");
        a(sb2, "oauth_timestamp", str2);
        r rVar = this.f28282b;
        a(sb2, "oauth_token", rVar != null ? rVar.f36933x : null);
        a(sb2, "oauth_version", "1.0");
        return sb2.substring(0, sb2.length() - 1);
    }

    public String d(String str, String str2) {
        URI create;
        String str3;
        TreeMap<String, String> b10 = ln.c.b(URI.create(this.f28285e), true);
        Map<String, String> map = this.f28286f;
        if (map != null) {
            b10.putAll(map);
        }
        String str4 = this.f28283c;
        if (str4 != null) {
            b10.put("oauth_callback", str4);
        }
        b10.put("oauth_consumer_key", this.f28281a.a());
        b10.put("oauth_nonce", str);
        b10.put("oauth_signature_method", "HMAC-SHA1");
        b10.put("oauth_timestamp", str2);
        r rVar = this.f28282b;
        if (rVar != null && (str3 = rVar.f36933x) != null) {
            b10.put("oauth_token", str3);
        }
        b10.put("oauth_version", "1.0");
        String str5 = create.getScheme() + "://" + create.getHost() + create.getPath();
        return this.f28284d.toUpperCase(Locale.ENGLISH) + '&' + ln.c.c(str5) + '&' + f(b10);
    }

    public String e() {
        String g10 = g();
        String i10 = i();
        return c(g10, i10, b(d(g10, i10)));
    }

    public final String f(TreeMap<String, String> treeMap) {
        StringBuilder sb2 = new StringBuilder();
        int size = treeMap.size();
        int i10 = 0;
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb2.append(ln.c.c(ln.c.c(entry.getKey())));
            sb2.append("%3D");
            sb2.append(ln.c.c(ln.c.c(entry.getValue())));
            i10++;
            if (i10 < size) {
                sb2.append("%26");
            }
        }
        return sb2.toString();
    }

    public final String g() {
        return String.valueOf(System.nanoTime()) + Math.abs(f28280g.nextLong());
    }

    public final String h() {
        r rVar = this.f28282b;
        String str = rVar != null ? rVar.f36934y : null;
        return ln.c.e(this.f28281a.b()) + '&' + ln.c.e(str);
    }

    public final String i() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }
}
