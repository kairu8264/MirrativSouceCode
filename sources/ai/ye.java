package ai;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.internal.ads.zzat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ye extends z4 implements rk {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12552e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12553f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12554g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12555h;

    /* renamed from: i  reason: collision with root package name */
    public final qj f12556i;

    /* renamed from: j  reason: collision with root package name */
    public final qj f12557j;

    /* renamed from: k  reason: collision with root package name */
    public bc f12558k;

    /* renamed from: l  reason: collision with root package name */
    public HttpURLConnection f12559l;

    /* renamed from: m  reason: collision with root package name */
    public InputStream f12560m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12561n;

    /* renamed from: o  reason: collision with root package name */
    public int f12562o;

    /* renamed from: p  reason: collision with root package name */
    public long f12563p;

    /* renamed from: q  reason: collision with root package name */
    public long f12564q;

    public ye(String str, int i10, int i11, boolean z10, qj qjVar, mx2<String> mx2Var, boolean z11) {
        super(true);
        this.f12555h = str;
        this.f12553f = i10;
        this.f12554g = i11;
        this.f12552e = z10;
        this.f12556i = qjVar;
        this.f12557j = new qj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ye(String str, String str2, int i10, int i11, boolean z10, qj qjVar, mx2<String> mx2Var, boolean z11) {
        this(str, str2, i10, i11, z10, null, false);
    }

    @Override // ai.z4, ai.a8
    public final Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.f12559l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzat {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f12563p;
            if (j10 != -1) {
                long j11 = j10 - this.f12564q;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f12560m;
            int i12 = sb.f9778a;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.f12564q += read;
            s(read);
            return read;
        } catch (IOException e10) {
            bc bcVar = this.f12558k;
            int i13 = sb.f9778a;
            throw zzat.a(e10, bcVar, 2);
        }
    }

    @Override // ai.a8
    public final void g() throws zzat {
        try {
            InputStream inputStream = this.f12560m;
            if (inputStream != null) {
                long j10 = this.f12563p;
                long j11 = j10 == -1 ? -1L : j10 - this.f12564q;
                HttpURLConnection httpURLConnection = this.f12559l;
                try {
                    if (httpURLConnection != null) {
                        int i10 = sb.f9778a;
                        if (i10 >= 19) {
                            if (i10 <= 20) {
                                try {
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    if (j11 == -1) {
                                        if (inputStream2.read() != -1) {
                                        }
                                    } else if (j11 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                                    }
                                    String name = inputStream2.getClass().getName();
                                    if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                        Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                        Objects.requireNonNull(superclass);
                                        Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                        declaredMethod.setAccessible(true);
                                        declaredMethod.invoke(inputStream2, new Object[0]);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            inputStream.close();
                        }
                    }
                    inputStream.close();
                } catch (IOException e10) {
                    bc bcVar = this.f12558k;
                    int i11 = sb.f9778a;
                    throw new zzat(e10, bcVar, 2000, 3);
                }
            }
        } finally {
            this.f12560m = null;
            w();
            if (this.f12561n) {
                this.f12561n = false;
                t();
            }
        }
    }

    @Override // ai.a8
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f12559l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ce, code lost:
        r5 = 1;
        r2 = new java.lang.StringBuilder(31);
        r2.append("Too many redirects: ");
        r2.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f2, code lost:
        throw new com.google.android.gms.internal.ads.zzat(new java.net.NoRouteToHostException(r2.toString()), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (r8 != 0) goto L18;
     */
    @Override // ai.a8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(ai.bc r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ye.m(ai.bc):long");
    }

    public final HttpURLConnection u(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String sb2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f12553f);
        httpURLConnection.setReadTimeout(this.f12554g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f12556i.a());
        hashMap.putAll(this.f12557j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bytes=");
            sb3.append(j10);
            sb3.append("-");
            if (j11 != -1) {
                sb3.append((j10 + j11) - 1);
            }
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str = this.f12555h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z10 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(bc.a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL v(URL url, String str, bc bcVar) throws zzat {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new zzat(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), bcVar, 2001, 1);
                } else if (this.f12552e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb2.append("Disallowed cross-protocol redirect (");
                    sb2.append(protocol2);
                    sb2.append(" to ");
                    sb2.append(protocol);
                    sb2.append(")");
                    throw new zzat(sb2.toString(), bcVar, 2001, 1);
                }
            } catch (MalformedURLException e10) {
                throw new zzat(e10, bcVar, 2001, 1);
            }
        }
        throw new zzat("Null location redirect", bcVar, 2001, 1);
    }

    public final void w() {
        HttpURLConnection httpURLConnection = this.f12559l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                oa.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f12559l = null;
        }
    }
}
