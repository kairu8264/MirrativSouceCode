package aa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.i1;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import h0.w1;
import io.p;
import j2.e;
import j2.k;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import y.j;
import y.l;
import y.r;
import y.r0;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f696w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f697x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f698y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.f fVar, d dVar, int i10, int i11) {
            super(2);
            this.f696w = fVar;
            this.f697x = dVar;
            this.f698y = i10;
            this.f699z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f696w, this.f697x, iVar, this.f698y | 1, this.f699z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(x0.f fVar, d dVar, l0.i iVar, int i10, int i11) {
        Object obj;
        int i12;
        f.a aVar;
        l lVar;
        jo.p.h(dVar, "bindModel");
        l0.i h10 = iVar.h(-1267866321);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            obj = fVar;
        } else if ((i10 & 14) == 0) {
            obj = fVar;
            i12 = (h10.P(obj) ? 4 : 2) | i10;
        } else {
            obj = fVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= h10.P(dVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = i13 != 0 ? x0.f.f59359u : obj;
            h10.x(733328855);
            f.a aVar3 = x0.f.f59359u;
            a.C0986a c0986a = x0.a.f59327a;
            c0 h11 = j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(aVar3);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a10);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar2, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l lVar2 = l.f60836a;
            float f10 = 12;
            x0.f b10 = v.e.b(d1.q(r0.m(aVar2, 0.0f, m2.g.l(3), 0.0f, 0.0f, 13, null), m2.g.l(400), 0.0f, 2, null), new i1(v1.b.a(q9.d.G, h10, 0), null), e0.g.c(m2.g.l(f10)), 0.0f, 4, null);
            a.b g10 = c0986a.g();
            h10.x(-483455358);
            c0 a13 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a15 = w.a(b10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a14);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a16 = h2.a(h10);
            h2.b(a16, a13, c0787a.d());
            h2.b(a16, dVar3, c0787a.b());
            h2.b(a16, qVar2, c0787a.c());
            h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            r rVar = r.f60913a;
            g1.a(d1.o(aVar3, m2.g.l(24)), h10, 6);
            float f11 = 20;
            l9.d.c(dVar.g(), d1.u(r0.k(aVar3, m2.g.l(f11), 0.0f, 2, null), m2.g.l((float) PsExtractor.VIDEO_STREAM_MASK)), null, q9.f.Q, null, null, h10, 48, 52);
            g1.a(d1.o(aVar3, m2.g.l(6)), h10, 6);
            h10.x(835739368);
            if (dVar.k()) {
                l9.g.a(dVar.f(), d1.o(aVar3, m2.g.l(f11)), h10, 48, 0);
                g1.a(d1.o(aVar3, m2.g.l(2)), h10, 6);
            }
            h10.O();
            String c10 = dVar.c();
            long a17 = v1.b.a(q9.d.f48816t, h10, 0);
            o9.b bVar = o9.b.f44283a;
            w1.c(c10, null, a17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().s(), h10, 0, 0, 32762);
            g1.a(d1.o(aVar3, m2.g.l(2)), h10, 6);
            x0.f n10 = d1.n(r0.k(aVar3, m2.g.l(f11), 0.0f, 2, null), 0.0f, 1, null);
            String e10 = dVar.e();
            e.a aVar4 = j2.e.f37075b;
            w1.c(e10, n10, v1.b.a(q9.d.f48806d, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, bVar.b().a(), h10, 48, 0, 32248);
            h10.x(835740247);
            if (dVar.j()) {
                g1.a(d1.o(aVar3, m2.g.l(f10)), h10, 6);
                aVar = aVar3;
                w1.c(dVar.d(), d1.n(r0.k(aVar3, m2.g.l(f11), 0.0f, 2, null), 0.0f, 1, null), v1.b.a(q9.d.f48810n, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, k.f37107a.b(), false, 0, null, bVar.b().p(), h10, 48, 48, 30200);
            } else {
                aVar = aVar3;
            }
            h10.O();
            f.a aVar5 = aVar;
            g1.a(d1.o(aVar5, m2.g.l(10)), h10, 6);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.x(-440614854);
            if (dVar.h()) {
                lVar = lVar2;
                l9.d.c(dVar.a(), d1.v(r0.m(lVar.a(aVar5, c0986a.o()), m2.g.l(16), 0.0f, 0.0f, 0.0f, 14, null), m2.g.l(36), m2.g.l(43)), null, 0, null, null, h10, 0, 60);
            } else {
                lVar = lVar2;
            }
            h10.O();
            if (dVar.i()) {
                l9.d.c(dVar.b(), d1.u(r0.m(lVar.a(aVar5, c0986a.n()), 0.0f, m2.g.l(f10), m2.g.l(f10), 0.0f, 9, null), m2.g.l(32)), null, q9.f.f48823v, null, null, h10, 0, 52);
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            obj = aVar2;
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(obj, dVar, i10, i11));
    }
}
