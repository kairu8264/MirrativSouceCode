package nm;

import android.content.Context;
import java.net.URI;
import sm.i;
import tm.h;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final lm.a f43706c = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final h f43707a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f43708b;

    public c(h hVar, Context context) {
        this.f43708b = context;
        this.f43707a = hVar;
    }

    @Override // nm.e
    public boolean c() {
        if (j(this.f43707a.v0())) {
            lm.a aVar = f43706c;
            aVar.j("URL is missing:" + this.f43707a.v0());
            return false;
        }
        URI g10 = g(this.f43707a.v0());
        if (g10 == null) {
            f43706c.j("URL cannot be parsed");
            return false;
        } else if (!h(g10, this.f43708b)) {
            lm.a aVar2 = f43706c;
            aVar2.j("URL fails allowlist rule: " + g10);
            return false;
        } else if (!k(g10.getHost())) {
            f43706c.j("URL host is null or invalid");
            return false;
        } else if (!p(g10.getScheme())) {
            f43706c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g10.getUserInfo())) {
            f43706c.j("URL user info is null");
            return false;
        } else if (!o(g10.getPort())) {
            f43706c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (!l(this.f43707a.x0() ? this.f43707a.j0() : null)) {
                lm.a aVar3 = f43706c;
                aVar3.j("HTTP Method is null or invalid: " + this.f43707a.j0());
                return false;
            } else if (this.f43707a.y0() && !m(this.f43707a.l0())) {
                lm.a aVar4 = f43706c;
                aVar4.j("HTTP ResponseCode is a negative value:" + this.f43707a.l0());
                return false;
            } else if (this.f43707a.z0() && !n(this.f43707a.o0())) {
                lm.a aVar5 = f43706c;
                aVar5.j("Request Payload is a negative value:" + this.f43707a.o0());
                return false;
            } else if (this.f43707a.A0() && !n(this.f43707a.q0())) {
                lm.a aVar6 = f43706c;
                aVar6.j("Response Payload is a negative value:" + this.f43707a.q0());
                return false;
            } else if (this.f43707a.w0() && this.f43707a.h0() > 0) {
                if (this.f43707a.B0() && !q(this.f43707a.s0())) {
                    lm.a aVar7 = f43706c;
                    aVar7.j("Time to complete the request is a negative value:" + this.f43707a.s0());
                    return false;
                } else if (this.f43707a.D0() && !q(this.f43707a.u0())) {
                    lm.a aVar8 = f43706c;
                    aVar8.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f43707a.u0());
                    return false;
                } else if (this.f43707a.C0() && this.f43707a.t0() > 0) {
                    if (this.f43707a.y0()) {
                        return true;
                    }
                    f43706c.j("Did not receive a HTTP Response Code");
                    return false;
                } else {
                    lm.a aVar9 = f43706c;
                    aVar9.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f43707a.t0());
                    return false;
                }
            } else {
                lm.a aVar10 = f43706c;
                aVar10.j("Start time of the request is null, or zero, or a negative value:" + this.f43707a.h0());
                return false;
            }
        }
    }

    public final URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f43706c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    public final boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return i.a(uri, context);
    }

    public final boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public final boolean j(String str) {
        return i(str);
    }

    public final boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    public boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    public final boolean m(int i10) {
        return i10 > 0;
    }

    public final boolean n(long j10) {
        return j10 >= 0;
    }

    public final boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    public final boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    public final boolean q(long j10) {
        return j10 >= 0;
    }

    public final boolean r(String str) {
        return str == null;
    }
}
