package ai;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.internal.ads.zzat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class qo0 extends z4 implements rk {

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f9024u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicReference<byte[]> f9025v = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final SSLSocketFactory f9026e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9027f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9028g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9029h;

    /* renamed from: i  reason: collision with root package name */
    public final qj f9030i;

    /* renamed from: j  reason: collision with root package name */
    public bc f9031j;

    /* renamed from: k  reason: collision with root package name */
    public HttpURLConnection f9032k;

    /* renamed from: l  reason: collision with root package name */
    public InputStream f9033l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9034m;

    /* renamed from: n  reason: collision with root package name */
    public int f9035n;

    /* renamed from: o  reason: collision with root package name */
    public long f9036o;

    /* renamed from: p  reason: collision with root package name */
    public long f9037p;

    /* renamed from: q  reason: collision with root package name */
    public long f9038q;

    /* renamed from: r  reason: collision with root package name */
    public long f9039r;

    /* renamed from: s  reason: collision with root package name */
    public int f9040s;

    /* renamed from: t  reason: collision with root package name */
    public final Set<Socket> f9041t;

    public qo0(String str, pm pmVar, int i10, int i11, int i12) {
        super(true);
        this.f9026e = new po0(this);
        this.f9041t = new HashSet();
        u9.f(str);
        this.f9029h = str;
        this.f9030i = new qj();
        this.f9027f = i10;
        this.f9028g = i11;
        this.f9040s = i12;
        if (pmVar != null) {
            l(pmVar);
        }
    }

    @Override // ai.z4, ai.a8
    public final Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.f9032k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzat {
        try {
            if (this.f9038q != this.f9036o) {
                byte[] andSet = f9025v.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j10 = this.f9038q;
                    long j11 = this.f9036o;
                    if (j10 != j11) {
                        int read = this.f9033l.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f9038q += read;
                            s(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f9025v.set(andSet);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f9037p;
            if (j12 != -1) {
                long j13 = j12 - this.f9039r;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                }
                return -1;
            }
            int read2 = this.f9033l.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.f9037p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f9039r += read2;
            s(read2);
            return read2;
        } catch (IOException e10) {
            throw new zzat(e10, this.f9031j, 2000, 2);
        }
    }

    @Override // ai.a8
    public final void g() throws zzat {
        try {
            if (this.f9033l != null) {
                HttpURLConnection httpURLConnection = this.f9032k;
                long j10 = this.f9037p;
                if (j10 != -1) {
                    j10 -= this.f9039r;
                }
                int i10 = sb.f9778a;
                if (i10 == 19 || i10 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j10 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j10 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f9033l.close();
                } catch (IOException e10) {
                    throw new zzat(e10, this.f9031j, 2000, 3);
                }
            }
        } finally {
            this.f9033l = null;
            x();
            if (this.f9034m) {
                this.f9034m = false;
                t();
            }
            this.f9041t.clear();
        }
    }

    @Override // ai.a8
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f9032k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
        if (r2 != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    @Override // ai.a8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(ai.bc r22) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qo0.m(ai.bc):long");
    }

    public final void v(int i10) {
        this.f9040s = i10;
        for (Socket socket : this.f9041t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f9040s);
                } catch (SocketException e10) {
                    uj0.g("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    public final void x() {
        HttpURLConnection httpURLConnection = this.f9032k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                uj0.d("Unexpected error while disconnecting", e10);
            }
            this.f9032k = null;
        }
    }
}
