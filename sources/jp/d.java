package jp;

import ep.f0;
import ep.r;
import ep.v;
import ep.z;
import java.io.IOException;
import jo.p;
import jp.j;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public j.b f38170a;

    /* renamed from: b  reason: collision with root package name */
    public j f38171b;

    /* renamed from: c  reason: collision with root package name */
    public int f38172c;

    /* renamed from: d  reason: collision with root package name */
    public int f38173d;

    /* renamed from: e  reason: collision with root package name */
    public int f38174e;

    /* renamed from: f  reason: collision with root package name */
    public f0 f38175f;

    /* renamed from: g  reason: collision with root package name */
    public final h f38176g;

    /* renamed from: h  reason: collision with root package name */
    public final ep.a f38177h;

    /* renamed from: i  reason: collision with root package name */
    public final e f38178i;

    /* renamed from: j  reason: collision with root package name */
    public final r f38179j;

    public d(h hVar, ep.a aVar, e eVar, r rVar) {
        p.h(hVar, "connectionPool");
        p.h(aVar, "address");
        p.h(eVar, "call");
        p.h(rVar, "eventListener");
        this.f38176g = hVar;
        this.f38177h = aVar;
        this.f38178i = eVar;
        this.f38179j = rVar;
    }

    public final kp.d a(z zVar, kp.g gVar) {
        p.h(zVar, "client");
        p.h(gVar, "chain");
        try {
            return c(gVar.e(), gVar.g(), gVar.i(), zVar.y(), zVar.E(), !p.c(gVar.h().g(), "GET")).w(zVar, gVar);
        } catch (IOException e10) {
            h(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            h(e11.c());
            throw e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jp.f b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.d.b(int, int, int, int, boolean):jp.f");
    }

    public final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f b10 = b(i10, i11, i12, i13, z10);
            if (b10.u(z11)) {
                return b10;
            }
            b10.y();
            if (this.f38175f == null) {
                j.b bVar = this.f38170a;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f38171b;
                    if (!(jVar != null ? jVar.b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    public final ep.a d() {
        return this.f38177h;
    }

    public final boolean e() {
        j jVar;
        if (this.f38172c == 0 && this.f38173d == 0 && this.f38174e == 0) {
            return false;
        }
        if (this.f38175f != null) {
            return true;
        }
        f0 f10 = f();
        if (f10 != null) {
            this.f38175f = f10;
            return true;
        }
        j.b bVar = this.f38170a;
        if ((bVar == null || !bVar.b()) && (jVar = this.f38171b) != null) {
            return jVar.b();
        }
        return true;
    }

    public final f0 f() {
        f n10;
        if (this.f38172c > 1 || this.f38173d > 1 || this.f38174e > 0 || (n10 = this.f38178i.n()) == null) {
            return null;
        }
        synchronized (n10) {
            if (n10.q() != 0) {
                return null;
            }
            if (fp.b.g(n10.z().a().l(), this.f38177h.l())) {
                return n10.z();
            }
            return null;
        }
    }

    public final boolean g(v vVar) {
        p.h(vVar, "url");
        v l10 = this.f38177h.l();
        return vVar.o() == l10.o() && p.c(vVar.i(), l10.i());
    }

    public final void h(IOException iOException) {
        p.h(iOException, i7.e.f36387u);
        this.f38175f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f45434w == mp.a.REFUSED_STREAM) {
            this.f38172c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f38173d++;
        } else {
            this.f38174e++;
        }
    }
}
