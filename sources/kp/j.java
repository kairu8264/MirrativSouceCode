package kp;

import com.google.android.exoplayer2.util.FileTypes;
import ep.b0;
import ep.c0;
import ep.d0;
import ep.e0;
import ep.f0;
import ep.v;
import ep.w;
import ep.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import jo.p;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import xn.a0;
import xn.s;

/* loaded from: classes4.dex */
public final class j implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38931b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final z f38932a;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public j(z zVar) {
        p.h(zVar, "client");
        this.f38932a = zVar;
    }

    public final b0 a(d0 d0Var, String str) {
        String o10;
        v u10;
        if (!this.f38932a.s() || (o10 = d0.o(d0Var, "Location", null, 2, null)) == null || (u10 = d0Var.G().j().u(o10)) == null) {
            return null;
        }
        if (p.c(u10.v(), d0Var.G().j().v()) || this.f38932a.t()) {
            b0.a h10 = d0Var.G().h();
            if (f.a(str)) {
                int h11 = d0Var.h();
                f fVar = f.f38918a;
                boolean z10 = fVar.c(str) || h11 == 308 || h11 == 307;
                if (fVar.b(str) && h11 != 308 && h11 != 307) {
                    h10.f("GET", null);
                } else {
                    h10.f(str, z10 ? d0Var.G().a() : null);
                }
                if (!z10) {
                    h10.g("Transfer-Encoding");
                    h10.g("Content-Length");
                    h10.g(FileTypes.HEADER_CONTENT_TYPE);
                }
            }
            if (!fp.b.g(d0Var.G().j(), u10)) {
                h10.g("Authorization");
            }
            return h10.i(u10).b();
        }
        return null;
    }

    public final b0 b(d0 d0Var, jp.c cVar) throws IOException {
        jp.f h10;
        f0 z10 = (cVar == null || (h10 = cVar.h()) == null) ? null : h10.z();
        int h11 = d0Var.h();
        String g10 = d0Var.G().g();
        if (h11 != 307 && h11 != 308) {
            if (h11 != 401) {
                if (h11 == 421) {
                    c0 a10 = d0Var.G().a();
                    if ((a10 == null || !a10.f()) && cVar != null && cVar.k()) {
                        cVar.h().x();
                        return d0Var.G();
                    }
                    return null;
                } else if (h11 == 503) {
                    d0 C = d0Var.C();
                    if ((C == null || C.h() != 503) && f(d0Var, Integer.MAX_VALUE) == 0) {
                        return d0Var.G();
                    }
                    return null;
                } else if (h11 == 407) {
                    p.e(z10);
                    if (z10.b().type() == Proxy.Type.HTTP) {
                        return this.f38932a.B().a(z10, d0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (h11 == 408) {
                    if (this.f38932a.E()) {
                        c0 a11 = d0Var.G().a();
                        if (a11 == null || !a11.f()) {
                            d0 C2 = d0Var.C();
                            if ((C2 == null || C2.h() != 408) && f(d0Var, 0) <= 0) {
                                return d0Var.G();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (h11) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f38932a.f().a(z10, d0Var);
            }
        }
        return a(d0Var, g10);
    }

    public final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean d(IOException iOException, jp.e eVar, b0 b0Var, boolean z10) {
        if (this.f38932a.E()) {
            return !(z10 && e(iOException, b0Var)) && c(iOException, z10) && eVar.z();
        }
        return false;
    }

    public final boolean e(IOException iOException, b0 b0Var) {
        c0 a10 = b0Var.a();
        return (a10 != null && a10.f()) || (iOException instanceof FileNotFoundException);
    }

    public final int f(d0 d0Var, int i10) {
        String o10 = d0.o(d0Var, "Retry-After", null, 2, null);
        if (o10 != null) {
            if (new so.e("\\d+").a(o10)) {
                Integer valueOf = Integer.valueOf(o10);
                p.g(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    @Override // ep.w
    public d0 intercept(w.a aVar) throws IOException {
        jp.c r10;
        b0 b10;
        p.h(aVar, "chain");
        g gVar = (g) aVar;
        b0 h10 = gVar.h();
        jp.e d10 = gVar.d();
        List k10 = s.k();
        d0 d0Var = null;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            d10.k(h10, z10);
            try {
                if (!d10.p()) {
                    try {
                        d0 a10 = gVar.a(h10);
                        if (d0Var != null) {
                            a10 = a10.z().o(d0Var.z().b(null).c()).c();
                        }
                        d0Var = a10;
                        r10 = d10.r();
                        b10 = b(d0Var, r10);
                    } catch (IOException e10) {
                        if (d(e10, d10, h10, !(e10 instanceof ConnectionShutdownException))) {
                            k10 = a0.p0(k10, e10);
                            d10.l(true);
                            z10 = false;
                        } else {
                            throw fp.b.U(e10, k10);
                        }
                    } catch (RouteException e11) {
                        if (d(e11.c(), d10, h10, false)) {
                            k10 = a0.p0(k10, e11.b());
                            d10.l(true);
                            z10 = false;
                        } else {
                            throw fp.b.U(e11.b(), k10);
                        }
                    }
                    if (b10 == null) {
                        if (r10 != null && r10.l()) {
                            d10.B();
                        }
                        d10.l(false);
                        return d0Var;
                    }
                    c0 a11 = b10.a();
                    if (a11 != null && a11.f()) {
                        d10.l(false);
                        return d0Var;
                    }
                    e0 a12 = d0Var.a();
                    if (a12 != null) {
                        fp.b.j(a12);
                    }
                    i10++;
                    if (i10 <= 20) {
                        d10.l(true);
                        h10 = b10;
                        z10 = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th2) {
                d10.l(true);
                throw th2;
            }
        }
    }
}
