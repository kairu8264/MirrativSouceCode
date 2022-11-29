package q6;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f48750a;

    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // q6.d.c
        public void a(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (d.f48750a != null) {
                httpsURLConnection.setRequestProperty("User-Agent", d.f48750a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements InterfaceC0735d {
        @Override // q6.d.InterfaceC0735d
        public HttpsURLConnection a(URL url) throws IOException {
            return (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(HttpsURLConnection httpsURLConnection, String str);
    }

    /* renamed from: q6.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0735d {
        HttpsURLConnection a(URL url) throws IOException;
    }

    public static c b() {
        return new a();
    }

    public static InterfaceC0735d c() {
        return new b();
    }

    public static Long d(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof Long) {
            return (Long) opt;
        }
        if (opt instanceof Number) {
            return Long.valueOf(((Number) opt).longValue());
        }
        if (opt instanceof String) {
            try {
                return Long.valueOf((long) Double.parseDouble((String) opt));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String e(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public static void f(String str) {
        f48750a = str;
    }
}
