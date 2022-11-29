package om;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: f  reason: collision with root package name */
    public static final lm.a f45476f = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f45477a;

    /* renamed from: b  reason: collision with root package name */
    public final mm.d f45478b;

    /* renamed from: c  reason: collision with root package name */
    public long f45479c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f45480d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final sm.h f45481e;

    public e(HttpURLConnection httpURLConnection, sm.h hVar, mm.d dVar) {
        this.f45477a = httpURLConnection;
        this.f45478b = dVar;
        this.f45481e = hVar;
        dVar.w(httpURLConnection.getURL().toString());
    }

    public boolean A() {
        return this.f45477a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f45477a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            return new b(this.f45477a.getOutputStream(), this.f45478b, this.f45481e);
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f45477a.getPermission();
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public int E() {
        return this.f45477a.getReadTimeout();
    }

    public String F() {
        return this.f45477a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f45477a.getRequestProperties();
    }

    public String H(String str) {
        return this.f45477a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f45480d == -1) {
            long b10 = this.f45481e.b();
            this.f45480d = b10;
            this.f45478b.v(b10);
        }
        try {
            int responseCode = this.f45477a.getResponseCode();
            this.f45478b.m(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f45480d == -1) {
            long b10 = this.f45481e.b();
            this.f45480d = b10;
            this.f45478b.v(b10);
        }
        try {
            String responseMessage = this.f45477a.getResponseMessage();
            this.f45478b.m(this.f45477a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public URL K() {
        return this.f45477a.getURL();
    }

    public boolean L() {
        return this.f45477a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f45477a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f45477a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f45477a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f45477a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f45477a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f45477a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f45477a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45477a.setFixedLengthStreamingMode(j10);
        }
    }

    public void U(long j10) {
        this.f45477a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f45477a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f45477a.setReadTimeout(i10);
    }

    public void X(String str) throws ProtocolException {
        this.f45477a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f45478b.x(str2);
        }
        this.f45477a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f45477a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f45477a.addRequestProperty(str, str2);
    }

    public final void a0() {
        if (this.f45479c == -1) {
            this.f45481e.e();
            long d10 = this.f45481e.d();
            this.f45479c = d10;
            this.f45478b.q(d10);
        }
        String F = F();
        if (F != null) {
            this.f45478b.l(F);
        } else if (o()) {
            this.f45478b.l("POST");
        } else {
            this.f45478b.l("GET");
        }
    }

    public void b() throws IOException {
        if (this.f45479c == -1) {
            this.f45481e.e();
            long d10 = this.f45481e.d();
            this.f45479c = d10;
            this.f45478b.q(d10);
        }
        try {
            this.f45477a.connect();
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f45477a.usingProxy();
    }

    public void c() {
        this.f45478b.u(this.f45481e.b());
        this.f45478b.b();
        this.f45477a.disconnect();
    }

    public boolean d() {
        return this.f45477a.getAllowUserInteraction();
    }

    public int e() {
        return this.f45477a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f45477a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f45478b.m(this.f45477a.getResponseCode());
        try {
            Object content = this.f45477a.getContent();
            if (content instanceof InputStream) {
                this.f45478b.r(this.f45477a.getContentType());
                return new a((InputStream) content, this.f45478b, this.f45481e);
            }
            this.f45478b.r(this.f45477a.getContentType());
            this.f45478b.s(this.f45477a.getContentLength());
            this.f45478b.u(this.f45481e.b());
            this.f45478b.b();
            return content;
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f45478b.m(this.f45477a.getResponseCode());
        try {
            Object content = this.f45477a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f45478b.r(this.f45477a.getContentType());
                return new a((InputStream) content, this.f45478b, this.f45481e);
            }
            this.f45478b.r(this.f45477a.getContentType());
            this.f45478b.s(this.f45477a.getContentLength());
            this.f45478b.u(this.f45481e.b());
            this.f45478b.b();
            return content;
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f45477a.getContentEncoding();
    }

    public int hashCode() {
        return this.f45477a.hashCode();
    }

    public int i() {
        a0();
        return this.f45477a.getContentLength();
    }

    public long j() {
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f45477a.getContentLengthLong();
        }
        return 0L;
    }

    public String k() {
        a0();
        return this.f45477a.getContentType();
    }

    public long l() {
        a0();
        return this.f45477a.getDate();
    }

    public boolean m() {
        return this.f45477a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f45477a.getDoInput();
    }

    public boolean o() {
        return this.f45477a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f45478b.m(this.f45477a.getResponseCode());
        } catch (IOException unused) {
            f45476f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f45477a.getErrorStream();
        return errorStream != null ? new a(errorStream, this.f45478b, this.f45481e) : errorStream;
    }

    public long q() {
        a0();
        return this.f45477a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f45477a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f45477a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f45477a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f45477a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f45477a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f45477a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f45477a.getHeaderFieldLong(str, j10);
        }
        return 0L;
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f45477a.getHeaderFields();
    }

    public long y() {
        return this.f45477a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f45478b.m(this.f45477a.getResponseCode());
        this.f45478b.r(this.f45477a.getContentType());
        try {
            return new a(this.f45477a.getInputStream(), this.f45478b, this.f45481e);
        } catch (IOException e10) {
            this.f45478b.u(this.f45481e.b());
            h.d(this.f45478b);
            throw e10;
        }
    }
}
