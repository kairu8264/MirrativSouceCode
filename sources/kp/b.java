package kp;

import ep.b0;
import ep.c0;
import ep.d0;
import ep.e0;
import ep.w;
import java.io.IOException;
import java.net.ProtocolException;
import jo.p;
import rp.t;
import so.n;

/* loaded from: classes4.dex */
public final class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38912a;

    public b(boolean z10) {
        this.f38912a = z10;
    }

    @Override // ep.w
    public d0 intercept(w.a aVar) throws IOException {
        d0.a aVar2;
        boolean z10;
        d0 c10;
        p.h(aVar, "chain");
        g gVar = (g) aVar;
        jp.c f10 = gVar.f();
        p.e(f10);
        b0 h10 = gVar.h();
        c0 a10 = h10.a();
        long currentTimeMillis = System.currentTimeMillis();
        f10.t(h10);
        if (f.a(h10.g()) && a10 != null) {
            if (n.q("100-continue", h10.d("Expect"), true)) {
                f10.f();
                aVar2 = f10.p(true);
                f10.r();
                z10 = false;
            } else {
                aVar2 = null;
                z10 = true;
            }
            if (aVar2 == null) {
                if (a10.e()) {
                    f10.f();
                    a10.g(t.b(f10.c(h10, true)));
                } else {
                    rp.d b10 = t.b(f10.c(h10, false));
                    a10.g(b10);
                    b10.close();
                }
            } else {
                f10.n();
                if (!f10.h().v()) {
                    f10.m();
                }
            }
        } else {
            f10.n();
            aVar2 = null;
            z10 = true;
        }
        if (a10 == null || !a10.e()) {
            f10.e();
        }
        if (aVar2 == null) {
            aVar2 = f10.p(false);
            p.e(aVar2);
            if (z10) {
                f10.r();
                z10 = false;
            }
        }
        d0 c11 = aVar2.r(h10).i(f10.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
        int h11 = c11.h();
        if (h11 == 100) {
            d0.a p10 = f10.p(false);
            p.e(p10);
            if (z10) {
                f10.r();
            }
            c11 = p10.r(h10).i(f10.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
            h11 = c11.h();
        }
        f10.q(c11);
        if (this.f38912a && h11 == 101) {
            c10 = c11.z().b(fp.b.f32115c).c();
        } else {
            c10 = c11.z().b(f10.o(c11)).c();
        }
        if (n.q("close", c10.G().d("Connection"), true) || n.q("close", d0.o(c10, "Connection", null, 2, null), true)) {
            f10.m();
        }
        if (h11 == 204 || h11 == 205) {
            e0 a11 = c10.a();
            if ((a11 != null ? a11.h() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(h11);
                sb2.append(" had non-zero Content-Length: ");
                e0 a12 = c10.a();
                sb2.append(a12 != null ? Long.valueOf(a12.h()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return c10;
    }
}
