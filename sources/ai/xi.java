package ai;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.gms.internal.ads.zzauf;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class xi implements zi {

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f11943n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReference<byte[]> f11944o = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f11945a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11946b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11947c;

    /* renamed from: d  reason: collision with root package name */
    public final yi f11948d;

    /* renamed from: e  reason: collision with root package name */
    public final ej<? super xi> f11949e;

    /* renamed from: f  reason: collision with root package name */
    public vi f11950f;

    /* renamed from: g  reason: collision with root package name */
    public HttpURLConnection f11951g;

    /* renamed from: h  reason: collision with root package name */
    public InputStream f11952h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11953i;

    /* renamed from: j  reason: collision with root package name */
    public long f11954j;

    /* renamed from: k  reason: collision with root package name */
    public long f11955k;

    /* renamed from: l  reason: collision with root package name */
    public long f11956l;

    /* renamed from: m  reason: collision with root package name */
    public long f11957m;

    public xi(String str, pj<String> pjVar, ej<? super xi> ejVar, int i10, int i11, boolean z10, yi yiVar) {
        fj.f(str);
        this.f11947c = str;
        this.f11949e = ejVar;
        this.f11948d = new yi();
        this.f11945a = i10;
        this.f11946b = i11;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f11951g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f11951g = null;
        }
    }

    @Override // ai.ui
    public final Uri b() {
        HttpURLConnection httpURLConnection = this.f11951g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // ai.zi
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f11951g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // ai.ui
    public final void d() throws zzauf {
        try {
            if (this.f11952h != null) {
                HttpURLConnection httpURLConnection = this.f11951g;
                long j10 = this.f11955k;
                if (j10 != -1) {
                    j10 -= this.f11957m;
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
                    this.f11952h.close();
                } catch (IOException e10) {
                    throw new zzauf(e10, this.f11950f, 3);
                }
            }
        } finally {
            this.f11952h = null;
            a();
            if (this.f11953i) {
                this.f11953i = false;
            }
        }
    }

    @Override // ai.ui
    public final int e(byte[] bArr, int i10, int i11) throws zzauf {
        try {
            if (this.f11956l != this.f11954j) {
                byte[] andSet = f11944o.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j10 = this.f11956l;
                    long j11 = this.f11954j;
                    if (j10 != j11) {
                        int read = this.f11952h.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f11956l += read;
                            ej<? super xi> ejVar = this.f11949e;
                            if (ejVar != null) {
                                ejVar.y(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f11944o.set(andSet);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f11955k;
            if (j12 != -1) {
                long j13 = j12 - this.f11957m;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                }
                return -1;
            }
            int read2 = this.f11952h.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.f11955k == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f11957m += read2;
            ej<? super xi> ejVar2 = this.f11949e;
            if (ejVar2 != null) {
                ejVar2.y(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e10) {
            throw new zzauf(e10, this.f11950f, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
        if (r3 != 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    @Override // ai.ui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(ai.vi r21) throws com.google.android.gms.internal.ads.zzauf {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.xi.f(ai.vi):long");
    }
}
