package hp;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.FileTypes;
import ep.a0;
import ep.b0;
import ep.c;
import ep.d0;
import ep.e;
import ep.e0;
import ep.r;
import ep.u;
import ep.w;
import hp.b;
import java.io.IOException;
import jo.h;
import jo.p;
import so.n;

/* loaded from: classes4.dex */
public final class a implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final C0459a f36294b = new C0459a(null);

    /* renamed from: a  reason: collision with root package name */
    public final c f36295a;

    /* renamed from: hp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0459a {
        public C0459a() {
        }

        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = uVar.g(i10);
                String m10 = uVar.m(i10);
                if ((!n.q("Warning", g10, true) || !n.C(m10, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, 2, null)) && (d(g10) || !e(g10) || uVar2.d(g10) == null)) {
                    aVar.e(g10, m10);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String g11 = uVar2.g(i11);
                if (!d(g11) && e(g11)) {
                    aVar.e(g11, uVar2.m(i11));
                }
            }
            return aVar.g();
        }

        public final boolean d(String str) {
            return n.q("Content-Length", str, true) || n.q("Content-Encoding", str, true) || n.q(FileTypes.HEADER_CONTENT_TYPE, str, true);
        }

        public final boolean e(String str) {
            return (n.q("Connection", str, true) || n.q("Keep-Alive", str, true) || n.q("Proxy-Authenticate", str, true) || n.q("Proxy-Authorization", str, true) || n.q("TE", str, true) || n.q("Trailers", str, true) || n.q("Transfer-Encoding", str, true) || n.q("Upgrade", str, true)) ? false : true;
        }

        public final d0 f(d0 d0Var) {
            return (d0Var != null ? d0Var.a() : null) != null ? d0Var.z().b(null).c() : d0Var;
        }

        public /* synthetic */ C0459a(h hVar) {
            this();
        }
    }

    public a(c cVar) {
    }

    @Override // ep.w
    public d0 intercept(w.a aVar) throws IOException {
        r rVar;
        p.h(aVar, "chain");
        e call = aVar.call();
        b b10 = new b.C0460b(System.currentTimeMillis(), aVar.j(), null).b();
        b0 b11 = b10.b();
        d0 a10 = b10.a();
        jp.e eVar = (jp.e) (!(call instanceof jp.e) ? null : call);
        if (eVar == null || (rVar = eVar.o()) == null) {
            rVar = r.f30994a;
        }
        if (b11 == null && a10 == null) {
            d0 c10 = new d0.a().r(aVar.j()).p(a0.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(fp.b.f32115c).s(-1L).q(System.currentTimeMillis()).c();
            rVar.z(call, c10);
            return c10;
        } else if (b11 == null) {
            p.e(a10);
            d0 c11 = a10.z().d(f36294b.f(a10)).c();
            rVar.b(call, c11);
            return c11;
        } else {
            if (a10 != null) {
                rVar.a(call, a10);
            }
            d0 a11 = aVar.a(b11);
            if (a10 != null) {
                if (a11 != null && a11.h() == 304) {
                    d0.a z10 = a10.z();
                    C0459a c0459a = f36294b;
                    z10.k(c0459a.c(a10.p(), a11.p())).s(a11.I()).q(a11.F()).d(c0459a.f(a10)).n(c0459a.f(a11)).c();
                    e0 a12 = a11.a();
                    p.e(a12);
                    a12.close();
                    p.e(this.f36295a);
                    throw null;
                }
                e0 a13 = a10.a();
                if (a13 != null) {
                    fp.b.j(a13);
                }
            }
            p.e(a11);
            d0.a z11 = a11.z();
            C0459a c0459a2 = f36294b;
            return z11.d(c0459a2.f(a10)).n(c0459a2.f(a11)).c();
        }
    }
}
