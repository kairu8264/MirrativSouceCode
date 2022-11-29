package zc;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.p;
import j2.e;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.g;
import q1.c0;
import q1.w;
import s1.a;
import v.e;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.g1;
import y.r;
import y.r0;
import y1.d0;
import z0.d;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f63070w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f63070w = aVar;
        }

        public final void a() {
            this.f63070w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: zc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1094b extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f63071w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f63072x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f63073y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1094b(io.a<v> aVar, io.a<v> aVar2, int i10) {
            super(2);
            this.f63071w = aVar;
            this.f63072x = aVar2;
            this.f63073y = i10;
        }

        public final void a(i iVar, int i10) {
            b.a(this.f63071w, this.f63072x, iVar, this.f63073y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(io.a<v> aVar, io.a<v> aVar2, i iVar, int i10) {
        int i11;
        i iVar2;
        jo.p.h(aVar, "onClickRegister");
        jo.p.h(aVar2, "onClickCancel");
        i h10 = iVar.h(1212154737);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            a.b g10 = x0.a.f59327a.g();
            f.a aVar3 = f.f59359u;
            f k10 = r0.k(e.d(d.a(d1.y(d1.E(aVar3, null, false, 3, null), g.l(280)), e0.g.c(g.l(12))), v1.b.a(nc.b.F, h10, 0), null, 2, null), 0.0f, g.l(32), 1, null);
            h10.x(-483455358);
            c0 a10 = y.p.a(y.f.f60773a.g(), g10, h10, 48);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(k10);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a11);
            } else {
                h10.o();
            }
            h10.E();
            i a13 = h2.a(h10);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            r rVar = r.f60913a;
            String b10 = v1.f.b(nc.i.text_chat_confirmation_request_title, h10, 0);
            o9.b bVar = o9.b.f44283a;
            d0 y10 = bVar.b().y();
            e.a aVar4 = j2.e.f37075b;
            w1.c(b10, null, v1.b.a(nc.b.f41794e, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, y10, h10, 0, 0, 32250);
            float f10 = 8;
            g1.a(d1.o(aVar3, g.l(f10)), h10, 6);
            String b11 = v1.f.b(nc.i.text_chat_confirmation_request_content, h10, 0);
            d0 d10 = bVar.b().d();
            int a14 = aVar4.a();
            int i13 = nc.b.f41802v;
            w1.c(b11, null, v1.b.a(i13, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(a14), 0L, 0, false, 0, null, d10, h10, 0, 0, 32250);
            float f11 = 16;
            g1.a(d1.o(aVar3, g.l(f11)), h10, 6);
            v.w.a(v1.e.c(nc.d.img_bow, h10, 0), null, d1.u(aVar3, g.l(114)), null, null, 0.0f, null, h10, 440, 120);
            g1.a(d1.o(aVar3, g.l(20)), h10, 6);
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y11 = h10.y();
            if (P || y11 == i.f39065a.a()) {
                y11 = new a(aVar);
                h10.q(y11);
            }
            h10.O();
            float f12 = 200;
            float f13 = 40;
            f v10 = d1.v(aVar3, g.l(f12), g.l(f13));
            c cVar = c.f63074a;
            k9.c.a((io.a) y11, v10, null, 0.0f, false, null, null, cVar.a(), h10, 12582960, 124);
            g1.a(d1.o(aVar3, g.l(f10)), h10, 6);
            k9.c.a(aVar2, d1.v(aVar3, g.l(f12), g.l(f13)), new k9.a(bVar.a().B(), bVar.a().q(), bVar.a().q(), 0L, 0L, 0L, 56, null), g.l(1), false, null, null, cVar.b(), h10, 12586032 | ((i12 >> 3) & 14) | (k9.a.C << 6), 112);
            g1.a(d1.o(aVar3, g.l(f11)), h10, 6);
            iVar2 = h10;
            w1.c(v1.f.b(nc.i.text_chat_confirmation_request_notice, h10, 0), null, v1.b.a(i13, iVar2, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, bVar.b().m(), iVar2, 0, 0, 32250);
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C1094b(aVar, aVar2, i10));
    }
}
