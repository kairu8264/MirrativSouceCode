package q6;

import android.net.Uri;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.C;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;
import p6.b1;
import p6.c1;
import p6.k;
import p6.v0;
import p6.z;
import q6.b;
import q6.d;
import r6.f;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f48727a;

    /* renamed from: b  reason: collision with root package name */
    public String f48728b;

    /* renamed from: c  reason: collision with root package name */
    public String f48729c;

    /* renamed from: d  reason: collision with root package name */
    public String f48730d;

    /* renamed from: g  reason: collision with root package name */
    public c f48733g;

    /* renamed from: e  reason: collision with root package name */
    public z f48731e = k.h();

    /* renamed from: f  reason: collision with root package name */
    public f f48732f = new r6.d("ActivityPackageSender");

    /* renamed from: h  reason: collision with root package name */
    public d.InterfaceC0735d f48734h = k.f();

    /* renamed from: i  reason: collision with root package name */
    public d.c f48735i = k.d();

    /* renamed from: q6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0734a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b.a f48736w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p6.c f48737x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Map f48738y;

        public RunnableC0734a(b.a aVar, p6.c cVar, Map map) {
            this.f48736w = aVar;
            this.f48737x = cVar;
            this.f48738y = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f48736w.d(a.this.b(this.f48737x, this.f48738y));
        }
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        this.f48727a = str2;
        this.f48728b = str3;
        this.f48729c = str4;
        this.f48730d = str5;
        this.f48733g = new c(k.c(), k.e(), k.o(), str);
    }

    public static String i(Map<String, String> map) {
        return map.remove("algorithm");
    }

    public static String j(Map<String, String> map) {
        return map.remove("app_secret");
    }

    public static void k(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    public static String l(Map<String, String> map) {
        return map.remove("headers_id");
    }

    public static String m(Map<String, String> map) {
        return map.remove("native_version");
    }

    public static String n(Map<String, String> map) {
        return map.remove("secret_id");
    }

    public static String o(Map<String, String> map) {
        return map.remove("signature");
    }

    public final void A(v0 v0Var) {
        String r10;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                p6.c cVar = v0Var.f46136m;
                                HashMap hashMap = new HashMap(cVar.m());
                                Map<String, String> map = v0Var.f46137n;
                                String c10 = c(hashMap, cVar.a());
                                boolean z10 = true;
                                boolean z11 = v0Var.f46136m.a() == p6.b.ATTRIBUTION;
                                if (z11) {
                                    k(hashMap);
                                    r10 = q(cVar.a(), cVar.o(), hashMap, map);
                                } else {
                                    r10 = r(cVar.a(), cVar.o());
                                }
                                HttpsURLConnection a10 = this.f48734h.a(new URL(r10));
                                this.f48735i.a(a10, cVar.f());
                                if (c10 != null) {
                                    a10.setRequestProperty("Authorization", c10);
                                }
                                if (z11) {
                                    dataOutputStream = f(a10);
                                } else {
                                    k(hashMap);
                                    dataOutputStream = g(a10, hashMap, map);
                                }
                                Integer x10 = x(a10, v0Var);
                                v0Var.f46124a = v0Var.f46129f != null && v0Var.f46134k == null && x10 != null && x10.intValue() == 200;
                                if (v0Var.f46129f != null && v0Var.f46134k == null) {
                                    z10 = false;
                                }
                                v0Var.f46125b = z10;
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e10) {
                                        this.f48731e.c(h(e10, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                                    }
                                }
                            } catch (MalformedURLException e11) {
                                v(e11, "Malformed URL", v0Var);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e12) {
                                        this.f48731e.c(h(e12, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                                    }
                                }
                            } catch (IOException e13) {
                                y(e13, "Request failed", v0Var);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e14) {
                                        this.f48731e.c(h(e14, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                                    }
                                }
                            }
                        } catch (ProtocolException e15) {
                            v(e15, "Protocol Error", v0Var);
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (IOException e16) {
                                    this.f48731e.c(h(e16, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                                }
                            }
                        }
                    } catch (SocketTimeoutException e17) {
                        y(e17, "Request timed out", v0Var);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException e18) {
                                this.f48731e.c(h(e18, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                            }
                        }
                    }
                } catch (SSLHandshakeException e19) {
                    y(e19, "Certificate failed", v0Var);
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (IOException e20) {
                            this.f48731e.c(h(e20, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                        }
                    }
                }
            } catch (UnsupportedEncodingException e21) {
                v(e21, "Failed to encode parameters", v0Var);
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e22) {
                        this.f48731e.c(h(e22, "Flushing and closing connection output stream", v0Var.f46136m), new Object[0]);
                    }
                }
            }
        }
    }

    public final String B(p6.b bVar, String str) {
        if (bVar == p6.b.GDPR) {
            if (this.f48728b != null) {
                return str + this.f48728b;
            }
            return str;
        } else if (bVar == p6.b.SUBSCRIPTION) {
            if (this.f48729c != null) {
                return str + this.f48729c;
            }
            return str;
        } else if (this.f48727a != null) {
            return str + this.f48727a;
        } else {
            return str;
        }
    }

    @Override // q6.b
    public void a(p6.c cVar, Map<String, String> map, b.a aVar) {
        this.f48732f.submit(new RunnableC0734a(aVar, cVar, map));
    }

    @Override // q6.b
    public v0 b(p6.c cVar, Map<String, String> map) {
        v0 a10;
        do {
            a10 = v0.a(cVar, map);
            A(a10);
        } while (z(a10));
        return a10;
    }

    public final String c(Map<String, String> map, p6.b bVar) {
        String bVar2 = bVar.toString();
        String n10 = n(map);
        String e10 = e(o(map), n10, l(map), i(map), m(map));
        return e10 != null ? e10 : d(map, j(map), n10, bVar2);
    }

    public final String d(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map<String, String> s10 = s(map, str3, str);
        String k10 = c1.k("Signature %s,%s,%s,%s", c1.k("secret_id=\"%s\"", str2), c1.k("signature=\"%s\"", c1.b0(s10.get("clear_signature"))), c1.k("algorithm=\"%s\"", "sha256"), c1.k("headers=\"%s\"", s10.get("fields")));
        this.f48731e.g("authorizationHeader: %s", k10);
        return k10;
    }

    public final String e(String str, String str2, String str3, String str4, String str5) {
        if (str2 == null || str == null || str3 == null) {
            return null;
        }
        String k10 = c1.k("signature=\"%s\"", str);
        String k11 = c1.k("secret_id=\"%s\"", str2);
        String k12 = c1.k("headers_id=\"%s\"", str3);
        Object[] objArr = new Object[1];
        if (str4 == null) {
            str4 = "adj1";
        }
        objArr[0] = str4;
        String k13 = c1.k("algorithm=\"%s\"", objArr);
        Object[] objArr2 = new Object[1];
        if (str5 == null) {
            str5 = "";
        }
        objArr2[0] = str5;
        String k14 = c1.k("Signature %s,%s,%s,%s,%s", k10, k11, k13, k12, c1.k("native_version=\"%s\"", objArr2));
        this.f48731e.g("authorizationHeader: %s", k14);
        return k14;
    }

    public final DataOutputStream f(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    public final DataOutputStream g(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2) throws ProtocolException, UnsupportedEncodingException, IOException {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String p10 = p(map, map2);
        if (p10 == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(p10);
        return dataOutputStream;
    }

    public final String h(Throwable th2, String str, p6.c cVar) {
        return c1.k("%s. (%s)", cVar.h(), c1.y(str, th2));
    }

    public final String p(Map<String, String> map, Map<String, String> map2) throws UnsupportedEncodingException {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        u(map, sb2);
        u(map2, sb2);
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public final String q(p6.b bVar, String str, Map<String, String> map, Map<String, String> map2) throws MalformedURLException {
        URL url = new URL(B(bVar, this.f48733g.f(bVar)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.f48731e.d("Making request to url: %s", builder.toString());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
            }
        }
        return builder.build().toString();
    }

    public final String r(p6.b bVar, String str) {
        String k10 = c1.k("%s%s", B(bVar, this.f48733g.f(bVar)), str);
        this.f48731e.d("Making request to url : %s", k10);
        return k10;
    }

    public final Map<String, String> s(Map<String, String> map, String str, String str2) {
        String t10 = t(map);
        String str3 = map.get("source");
        String str4 = map.get("payload");
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put(LogBase.CREATED_AT, map.get(LogBase.CREATED_AT));
        hashMap.put("activity_kind", str);
        hashMap.put(t10, map.get(t10));
        if (str3 != null) {
            hashMap.put("source", str3);
        }
        if (str4 != null) {
            hashMap.put("payload", str4);
        }
        String str5 = "";
        String str6 = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                str5 = str5 + ((String) entry.getKey()) + " ";
                str6 = str6 + ((String) entry.getValue());
            }
        }
        String substring = str5.substring(0, str5.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str6);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    public final String t(Map<String, String> map) {
        if (map.get("gps_adid") != null) {
            return "gps_adid";
        }
        if (map.get("fire_adid") != null) {
            return "fire_adid";
        }
        if (map.get("android_id") != null) {
            return "android_id";
        }
        if (map.get("mac_sha1") != null) {
            return "mac_sha1";
        }
        if (map.get("mac_md5") != null) {
            return "mac_md5";
        }
        if (map.get("android_uuid") != null) {
            return "android_uuid";
        }
        return null;
    }

    public final void u(Map<String, String> map, StringBuilder sb2) throws UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String encode = URLEncoder.encode(entry.getKey(), C.UTF8_NAME);
            String value = entry.getValue();
            String encode2 = value != null ? URLEncoder.encode(value, C.UTF8_NAME) : "";
            sb2.append(encode);
            sb2.append("=");
            sb2.append(encode2);
            sb2.append("&");
        }
    }

    public final void v(Throwable th2, String str, v0 v0Var) {
        String h10 = h(th2, str, v0Var.f46136m);
        this.f48731e.c(h10, new Object[0]);
        v0Var.f46127d = h10;
        v0Var.f46125b = false;
    }

    public final void w(v0 v0Var, String str) {
        if (str.length() == 0) {
            this.f48731e.c("Empty response string", new Object[0]);
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            this.f48731e.c(h(e10, "Failed to parse JSON response", v0Var.f46136m), new Object[0]);
        }
        if (jSONObject == null) {
            return;
        }
        v0Var.f46129f = jSONObject;
        v0Var.f46127d = d.e(jSONObject, "message");
        v0Var.f46126c = d.e(jSONObject, "adid");
        v0Var.f46128e = d.e(jSONObject, "timestamp");
        String e11 = d.e(jSONObject, "tracking_state");
        if (e11 != null && e11.equals("opted_out")) {
            v0Var.f46131h = b1.OPTED_OUT;
        }
        v0Var.f46133j = d.d(jSONObject, "ask_in");
        v0Var.f46134k = d.d(jSONObject, "retry_in");
        v0Var.f46135l = d.d(jSONObject, "continue_in");
        v0Var.f46132i = p6.f.a(jSONObject.optJSONObject("attribution"), v0Var.f46126c, c1.B(this.f48730d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r7 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer x(javax.net.ssl.HttpsURLConnection r7, p6.v0 r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r7.connect()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r3 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L1f
            java.io.InputStream r3 = r7.getErrorStream()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            goto L23
        L1f:
            java.io.InputStream r3 = r7.getInputStream()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L23:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L2d:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r4 == 0) goto L37
            r0.append(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            goto L2d
        L37:
            r7.disconnect()
            goto L50
        L3b:
            r8 = move-exception
            goto La8
        L3d:
            r3 = move-exception
            java.lang.String r4 = "Connecting and reading response"
            p6.c r5 = r8.f46136m     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r6.h(r3, r4, r5)     // Catch: java.lang.Throwable -> L3b
            p6.z r4 = r6.f48731e     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            r4.c(r3, r5)     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L50
            goto L37
        L50:
            int r7 = r0.length()
            if (r7 != 0) goto L60
            p6.z r7 = r6.f48731e
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Empty response string buffer"
            r7.c(r0, r8)
            return r2
        L60:
            int r7 = r2.intValue()
            r3 = 429(0x1ad, float:6.01E-43)
            if (r7 != r3) goto L72
            p6.z r7 = r6.f48731e
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Too frequent requests to the endpoint (429)"
            r7.c(r0, r8)
            return r2
        L72:
            java.lang.String r7 = r0.toString()
            p6.z r0 = r6.f48731e
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r7
            java.lang.String r5 = "Response string: %s"
            r0.d(r5, r4)
            r6.w(r8, r7)
            java.lang.String r7 = r8.f46127d
            if (r7 != 0) goto L8a
            return r2
        L8a:
            int r8 = r2.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "Response message: %s"
            if (r8 != r0) goto L9e
            p6.z r8 = r6.f48731e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.h(r4, r0)
            goto La7
        L9e:
            p6.z r8 = r6.f48731e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.c(r4, r0)
        La7:
            return r2
        La8:
            if (r7 == 0) goto Lad
            r7.disconnect()
        Lad:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.a.x(javax.net.ssl.HttpsURLConnection, p6.v0):java.lang.Integer");
    }

    public final void y(Throwable th2, String str, v0 v0Var) {
        String str2 = h(th2, str, v0Var.f46136m) + " Will retry later";
        this.f48731e.c(str2, new Object[0]);
        v0Var.f46127d = str2;
        v0Var.f46125b = true;
    }

    public final boolean z(v0 v0Var) {
        if (!v0Var.f46125b) {
            this.f48731e.d("Will not retry with current url strategy", new Object[0]);
            this.f48733g.c();
            return false;
        } else if (this.f48733g.d(v0Var.f46130g)) {
            this.f48731e.c("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        } else {
            this.f48731e.c("Failed with current url strategy and it will not retry", new Object[0]);
            return false;
        }
    }
}
