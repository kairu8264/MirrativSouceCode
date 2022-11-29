package ai;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class tj0 {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f10321c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f10322d = false;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f10325g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f10326a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10320b = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final vh.f f10323e = vh.i.b();

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f10324f = new HashSet(Arrays.asList(new String[0]));

    public tj0(String str) {
        List<String> asList;
        if (!j()) {
            asList = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        }
        this.f10326a = asList;
    }

    public static void g() {
        synchronized (f10320b) {
            f10321c = false;
            f10322d = false;
            uj0.f("Ad debug logging enablement is out of date.");
        }
    }

    public static void h(boolean z10) {
        synchronized (f10320b) {
            f10321c = true;
            f10322d = z10;
        }
    }

    public static boolean i() {
        boolean z10;
        synchronized (f10320b) {
            z10 = f10321c;
        }
        return z10;
    }

    public static boolean j() {
        boolean z10;
        synchronized (f10320b) {
            z10 = false;
            if (f10321c && f10322d) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean k(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && zy.f13274a.e().booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e10) {
                uj0.g("Fail to determine debug setting.", e10);
                return false;
            }
        }
        return false;
    }

    public static final /* synthetic */ void l(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        q(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static final /* synthetic */ void m(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        q(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(TtmlNode.TAG_BODY).value(vh.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static void q(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f10324f.contains(key)) {
                if (next.getValue() instanceof List) {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                } else if (next.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    uj0.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public static synchronized void s(String str) {
        synchronized (tj0.class) {
            uj0.e("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                String valueOf = String.valueOf(str.substring(i10, Math.min(i11, str.length())));
                uj0.e(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i10 = i11;
            }
            uj0.e("GMA Debug FINISH");
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (j()) {
            n(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (j()) {
            n(str, "GET", map, bArr);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, int i10) {
        if (j()) {
            String str = null;
            o(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    uj0.f(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                p(str);
            }
        }
    }

    public final void d(Map<String, ?> map, int i10) {
        if (j()) {
            o(map, i10);
            if (i10 < 200 || i10 >= 300) {
                p(null);
            }
        }
    }

    public final void e(String str) {
        if (j() && str != null) {
            f(str.getBytes());
        }
    }

    public final void f(final byte[] bArr) {
        r("onNetworkResponseBody", new sj0(bArr) { // from class: ai.qj0

            /* renamed from: a  reason: collision with root package name */
            public final byte[] f8970a;

            {
                this.f8970a = bArr;
            }

            @Override // ai.sj0
            public final void a(JsonWriter jsonWriter) {
                byte[] bArr2 = this.f8970a;
                int i10 = tj0.f10325g;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String a10 = vh.c.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name(TtmlNode.TAG_BODY).value(a10);
                } else {
                    String d10 = nj0.d(a10);
                    if (d10 != null) {
                        jsonWriter.name("bodydigest").value(d10);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public final void n(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        r("onNetworkRequest", new sj0(str, str2, map, bArr) { // from class: ai.oj0

            /* renamed from: a  reason: collision with root package name */
            public final String f7827a;

            /* renamed from: b  reason: collision with root package name */
            public final String f7828b;

            /* renamed from: c  reason: collision with root package name */
            public final Map f7829c;

            /* renamed from: d  reason: collision with root package name */
            public final byte[] f7830d;

            {
                this.f7827a = str;
                this.f7828b = str2;
                this.f7829c = map;
                this.f7830d = bArr;
            }

            @Override // ai.sj0
            public final void a(JsonWriter jsonWriter) {
                tj0.m(this.f7827a, this.f7828b, this.f7829c, this.f7830d, jsonWriter);
            }
        });
    }

    public final void o(final Map<String, ?> map, final int i10) {
        r("onNetworkResponse", new sj0(i10, map) { // from class: ai.pj0

            /* renamed from: a  reason: collision with root package name */
            public final int f8440a;

            /* renamed from: b  reason: collision with root package name */
            public final Map f8441b;

            {
                this.f8440a = i10;
                this.f8441b = map;
            }

            @Override // ai.sj0
            public final void a(JsonWriter jsonWriter) {
                tj0.l(this.f8440a, this.f8441b, jsonWriter);
            }
        });
    }

    public final void p(final String str) {
        r("onNetworkRequestError", new sj0(str) { // from class: ai.rj0

            /* renamed from: a  reason: collision with root package name */
            public final String f9458a;

            {
                this.f9458a = str;
            }

            @Override // ai.sj0
            public final void a(JsonWriter jsonWriter) {
                String str2 = this.f9458a;
                int i10 = tj0.f10325g;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    public final void r(String str, sj0 sj0Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f10323e.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.f10326a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            sj0Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            uj0.d("unable to log", e10);
        }
        s(stringWriter.toString());
    }
}
