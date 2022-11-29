package ai;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.internal.ads.zzauf;
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
public final class xm0 implements zi {

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f11994q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReference<byte[]> f11995r = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final int f11997b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11998c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11999d;

    /* renamed from: e  reason: collision with root package name */
    public final yi f12000e;

    /* renamed from: f  reason: collision with root package name */
    public final ej<? super xm0> f12001f;

    /* renamed from: g  reason: collision with root package name */
    public vi f12002g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f12003h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f12004i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12005j;

    /* renamed from: k  reason: collision with root package name */
    public long f12006k;

    /* renamed from: l  reason: collision with root package name */
    public long f12007l;

    /* renamed from: m  reason: collision with root package name */
    public long f12008m;

    /* renamed from: n  reason: collision with root package name */
    public long f12009n;

    /* renamed from: o  reason: collision with root package name */
    public int f12010o;

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f11996a = new wm0(this);

    /* renamed from: p  reason: collision with root package name */
    public final Set<Socket> f12011p = new HashSet();

    public xm0(String str, ej<? super xm0> ejVar, int i10, int i11, int i12) {
        fj.f(str);
        this.f11999d = str;
        this.f12001f = ejVar;
        this.f12000e = new yi();
        this.f11997b = i10;
        this.f11998c = i11;
        this.f12010o = i12;
    }

    @Override // ai.ui
    public final Uri b() {
        HttpURLConnection httpURLConnection = this.f12003h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // ai.zi
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f12003h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // ai.ui
    public final void d() throws zzauf {
        try {
            if (this.f12004i != null) {
                HttpURLConnection httpURLConnection = this.f12003h;
                long j10 = this.f12007l;
                if (j10 != -1) {
                    j10 -= this.f12009n;
                }
                int i10 = vj.f11100a;
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
                    this.f12004i.close();
                } catch (IOException e10) {
                    throw new zzauf(e10, this.f12002g, 3);
                }
            }
        } finally {
            this.f12004i = null;
            i();
            if (this.f12005j) {
                this.f12005j = false;
            }
            this.f12011p.clear();
        }
    }

    @Override // ai.ui
    public final int e(byte[] bArr, int i10, int i11) throws zzauf {
        try {
            if (this.f12008m != this.f12006k) {
                byte[] andSet = f11995r.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j10 = this.f12008m;
                    long j11 = this.f12006k;
                    if (j10 != j11) {
                        int read = this.f12004i.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f12008m += read;
                            ej<? super xm0> ejVar = this.f12001f;
                            if (ejVar != null) {
                                ((mn0) ejVar).e0(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f11995r.set(andSet);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f12007l;
            if (j12 != -1) {
                long j13 = j12 - this.f12009n;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                }
                return -1;
            }
            int read2 = this.f12004i.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.f12007l == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f12009n += read2;
            ej<? super xm0> ejVar2 = this.f12001f;
            if (ejVar2 != null) {
                ((mn0) ejVar2).e0(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e10) {
            throw new zzauf(e10, this.f12002g, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if (r3 != 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    @Override // ai.ui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(ai.vi r22) throws com.google.android.gms.internal.ads.zzauf {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.xm0.f(ai.vi):long");
    }

    public final void g(int i10) {
        this.f12010o = i10;
        for (Socket socket : this.f12011p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f12010o);
                } catch (SocketException e10) {
                    uj0.g("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.f12003h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                uj0.d("Unexpected error while disconnecting", e10);
            }
            this.f12003h = null;
        }
    }
}
