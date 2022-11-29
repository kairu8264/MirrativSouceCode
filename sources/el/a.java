package el;

import com.google.android.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import xk.f;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f30638a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f30639b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f30640c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f30638a = str;
        this.f30639b = map;
    }

    public final String a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(next.getKey());
        sb3.append("=");
        sb3.append(next.getValue() != null ? next.getValue() : "");
        sb2.append(sb3.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("&");
            sb4.append(next2.getKey());
            sb4.append("=");
            sb4.append(next2.getValue() != null ? next2.getValue() : "");
            sb2.append(sb4.toString());
        }
        return sb2.toString();
    }

    public final String b(String str, Map<String, String> map) {
        String a10 = a(map);
        if (a10.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a10 = "&" + a10;
            }
            return str + a10;
        }
        return str + "?" + a10;
    }

    public c c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e10 = null;
        inputStream = null;
        try {
            String b10 = b(this.f30638a, this.f30639b);
            f.f().i("GET Request URL: " + b10);
            httpsURLConnection = (HttpsURLConnection) new URL(b10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f30640c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e10 = e(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, e10);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f30640c.put(str, str2);
        return this;
    }

    public final String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }
}
