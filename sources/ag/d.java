package ag;

import ag.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import bg.j;
import bg.k;
import bg.l;
import bg.m;
import bg.n;
import bg.o;
import bg.p;
import cg.h;
import cg.i;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.firebase.encoders.EncodingException;
import dg.f;
import dg.g;
import dg.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final ql.a f1605a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f1606b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1607c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f1608d;

    /* renamed from: e  reason: collision with root package name */
    public final ng.a f1609e;

    /* renamed from: f  reason: collision with root package name */
    public final ng.a f1610f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1611g;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f1612a;

        /* renamed from: b  reason: collision with root package name */
        public final j f1613b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1614c;

        public a(URL url, j jVar, String str) {
            this.f1612a = url;
            this.f1613b = jVar;
            this.f1614c = str;
        }

        public a a(URL url) {
            return new a(url, this.f1613b, this.f1614c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1615a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f1616b;

        /* renamed from: c  reason: collision with root package name */
        public final long f1617c;

        public b(int i10, URL url, long j10) {
            this.f1615a = i10;
            this.f1616b = url;
            this.f1617c = j10;
        }
    }

    public d(Context context, ng.a aVar, ng.a aVar2, int i10) {
        this.f1605a = j.b();
        this.f1607c = context;
        this.f1606b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1608d = n(ag.a.f1595c);
        this.f1609e = aVar2;
        this.f1610f = aVar;
        this.f1611g = i10;
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.c();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.c();
        }
        return networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            hg.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f1616b;
        if (url != null) {
            hg.a.a("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f1616b);
        }
        return null;
    }

    public static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // dg.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f1606b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c(LogBase.LOCALE, Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f1607c).getSimOperator()).c("application_build", Integer.toString(h(this.f1607c))).d();
    }

    @Override // dg.m
    public g b(f fVar) {
        j i10 = i(fVar);
        URL url = this.f1608d;
        if (fVar.c() != null) {
            try {
                ag.a c10 = ag.a.c(fVar.c());
                r3 = c10.d() != null ? c10.d() : null;
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) ig.b.a(5, new a(url, i10, r3), new ig.a() { // from class: ag.b
                @Override // ig.a
                public final Object apply(Object obj) {
                    d.b e10;
                    e10 = d.this.e((d.a) obj);
                    return e10;
                }
            }, c.f1604a);
            int i11 = bVar.f1615a;
            if (i11 == 200) {
                return g.e(bVar.f1617c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return g.d();
                }
                return g.a();
            }
            return g.f();
        } catch (IOException e10) {
            hg.a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    public final b e(a aVar) throws IOException {
        hg.a.a("CctTransportBackend", "Making request to: %s", aVar.f1612a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f1612a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f1611g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.1"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(FileTypes.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f1614c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f1605a.a(aVar.f1613b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                hg.a.e("CctTransportBackend", "Status Code: " + responseCode);
                hg.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField(FileTypes.HEADER_CONTENT_TYPE));
                hg.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                    if (m10 != null) {
                        m10.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e10) {
            e = e10;
            hg.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            hg.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            hg.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            hg.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final j i(f fVar) {
        l.a j10;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j11 = iVar.j();
            if (!hashMap.containsKey(j11)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j11, arrayList);
            } else {
                ((List) hashMap.get(j11)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = bg.m.a().f(p.DEFAULT).g(this.f1610f.a()).h(this.f1609e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(bg.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b(LogBase.LOCALE)).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                zf.b b11 = e10.b();
                if (b11.equals(zf.b.b("proto"))) {
                    j10 = l.j(e10.a());
                } else if (b11.equals(zf.b.b("json"))) {
                    j10 = l.i(new String(e10.a(), Charset.forName(C.UTF8_NAME)));
                } else {
                    hg.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j10.b(iVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    public d(Context context, ng.a aVar, ng.a aVar2) {
        this(context, aVar, aVar2, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND);
    }
}
