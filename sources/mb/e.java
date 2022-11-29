package mb;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import h0.w1;
import hb.b2;
import hb.t1;
import hb.v1;
import io.l;
import jo.p;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.g;
import q1.c0;
import s1.a;
import v.w;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.e0;
import y.f;
import y.g1;
import y.j;
import y.r;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<Integer, v> f40716w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f40717x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Integer, v> lVar, int i10) {
            super(0);
            this.f40716w = lVar;
            this.f40717x = i10;
        }

        public final void a() {
            this.f40716w.invoke(Integer.valueOf(this.f40717x));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.q<z0, i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f40718w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f40719x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, boolean z10) {
            super(3);
            this.f40718w = i10;
            this.f40719x = z10;
        }

        public final void a(z0 z0Var, i iVar, int i10) {
            int i11;
            String b10;
            p.h(z0Var, "$this$Button");
            if ((i10 & 14) == 0) {
                i11 = i10 | (iVar.P(z0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && iVar.j()) {
                iVar.I();
                return;
            }
            f.a aVar = f.f59359u;
            w.a(v1.e.c(v1.ic_emomo_quest_giftgacha_ticket, iVar, 0), null, d1.u(aVar, g.l(24)), null, null, 0.0f, null, iVar, 440, 120);
            g1.a(d1.y(aVar, g.l(4)), iVar, 6);
            String c10 = v1.f.c(b2.text_emomo_quest_gift_gacha_ticket_popup_ticket_count, new Object[]{Integer.valueOf(this.f40718w)}, iVar, 64);
            long a10 = v1.b.a(t1.f34968h, iVar, 0);
            o9.b bVar = o9.b.f44283a;
            w1.c(c10, null, a10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().b(), iVar, 0, 0, 32762);
            g1.a(z0.c(z0Var, aVar, 1.0f, false, 2, null), iVar, 0);
            if (this.f40719x) {
                iVar.x(1554580386);
                b10 = v1.f.b(b2.text_emomo_quest_gift_gacha_ticket_popup_send_all_ticket, iVar, 0);
                iVar.O();
            } else {
                iVar.x(1554580510);
                b10 = v1.f.b(b2.text_emomo_quest_gift_gacha_ticket_popup_send_1_ticket, iVar, 0);
                iVar.O();
            }
            w1.c(b10, null, v1.b.a(t1.f34977r, iVar, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().b(), iVar, 0, 0, 32762);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f40720w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f40721x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<Integer, v> f40722y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f40723z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i10, boolean z10, l<? super Integer, v> lVar, int i11) {
            super(2);
            this.f40720w = i10;
            this.f40721x = z10;
            this.f40722y = lVar;
            this.f40723z = i11;
        }

        public final void a(i iVar, int i10) {
            e.a(this.f40720w, this.f40721x, this.f40722y, iVar, this.f40723z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ mb.b f40724w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Integer, v> f40725x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f40726y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f40727z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(mb.b bVar, l<? super Integer, v> lVar, io.a<v> aVar, int i10) {
            super(2);
            this.f40724w = bVar;
            this.f40725x = lVar;
            this.f40726y = aVar;
            this.f40727z = i10;
        }

        public final void a(i iVar, int i10) {
            e.b(this.f40724w, this.f40725x, this.f40726y, iVar, this.f40727z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(int i10, boolean z10, l<? super Integer, v> lVar, i iVar, int i11) {
        int i12;
        p.h(lVar, "onClickSend");
        i h10 = iVar.h(-1823898079);
        if ((i11 & 14) == 0) {
            i12 = (h10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h10.a(z10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            f v10 = d1.v(f.f59359u, g.l(180), g.l(40));
            e0.f c10 = e0.g.c(g.l(20));
            h0.d dVar = h0.d.f33749a;
            float f10 = 0;
            h0.e b10 = dVar.b(g.l(f10), g.l(f10), 0.0f, 0.0f, 0.0f, h10, 262198, 28);
            h0.c a10 = dVar.a(v1.b.a(t1.f34971l, h10, 0), 0L, 0L, 0L, h10, 32768, 14);
            Integer valueOf = Integer.valueOf(i10);
            h10.x(511388516);
            boolean P = h10.P(valueOf) | h10.P(lVar);
            Object y10 = h10.y();
            if (P || y10 == i.f39065a.a()) {
                y10 = new a(lVar, i10);
                h10.q(y10);
            }
            h10.O();
            h0.f.a((io.a) y10, v10, false, null, b10, c10, null, a10, null, s0.c.b(h10, 752863761, true, new b(i10, z10)), h10, C.ENCODING_PCM_32BIT, 332);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(i10, z10, lVar, i11));
    }

    public static final void b(mb.b bVar, l<? super Integer, v> lVar, io.a<v> aVar, i iVar, int i10) {
        int i11;
        i iVar2;
        int i12;
        p.h(bVar, "bindModel");
        p.h(lVar, "onClickSend");
        p.h(aVar, "onClickClose");
        i h10 = iVar.h(-1851186548);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 731) == 146 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            f.a aVar2 = f.f59359u;
            f d10 = v.e.d(d1.l(aVar2, 0.0f, 1, null), v1.b.a(t1.f34964b, h10, 0), null, 2, null);
            y.f fVar = y.f.f60773a;
            f.e b10 = fVar.b();
            a.C0986a c0986a = x0.a.f59327a;
            a.b g10 = c0986a.g();
            h10.x(-483455358);
            c0 a10 = y.p.a(b10, g10, h10, 54);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = q1.w.a(d10);
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
            x0.f a14 = y.c0.a(d1.y(aVar2, g.l((float) PsExtractor.VIDEO_STREAM_MASK)), e0.Min);
            h10.x(733328855);
            c0 h11 = j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a16 = q1.w.a(a14);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a15);
            } else {
                h10.o();
            }
            h10.E();
            i a17 = h2.a(h10);
            h2.b(a17, h11, c0787a.d());
            h2.b(a17, dVar2, c0787a.b());
            h2.b(a17, qVar2, c0787a.c());
            h2.b(a17, g2Var2, c0787a.f());
            h10.c();
            a16.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar2 = y.l.f60836a;
            float f10 = 12;
            x0.f c10 = v.e.c(r0.m(d1.l(aVar2, 0.0f, 1, null), 0.0f, g.l(50), 0.0f, 0.0f, 13, null), v1.b.a(t1.f34977r, h10, 0), e0.g.c(g.l(f10)));
            h10.x(-483455358);
            c0 a18 = y.p.a(fVar.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(o0.e());
            m2.q qVar3 = (m2.q) h10.G(o0.j());
            g2 g2Var3 = (g2) h10.G(o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a20 = q1.w.a(c10);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a19);
            } else {
                h10.o();
            }
            h10.E();
            i a21 = h2.a(h10);
            h2.b(a21, a18, c0787a.d());
            h2.b(a21, dVar3, c0787a.b());
            h2.b(a21, qVar3, c0787a.c());
            h2.b(a21, g2Var3, c0787a.f());
            h10.c();
            a20.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            x0.f b11 = rVar.b(d1.u(aVar2, g.l(28)), c0986a.j());
            float f11 = 6;
            h0.o0.a(aVar, r0.m(b11, 0.0f, g.l(f11), g.l(f11), 0.0f, 9, null), false, null, mb.a.f40705a.a(), h10, ((i13 >> 6) & 14) | 24576, 12);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            x0.f n10 = d1.n(aVar2, 0.0f, 1, null);
            a.b g11 = c0986a.g();
            h10.x(-483455358);
            c0 a22 = y.p.a(fVar.g(), g11, h10, 48);
            h10.x(-1323940314);
            m2.d dVar4 = (m2.d) h10.G(o0.e());
            m2.q qVar4 = (m2.q) h10.G(o0.j());
            g2 g2Var4 = (g2) h10.G(o0.n());
            io.a<s1.a> a23 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a24 = q1.w.a(n10);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a23);
            } else {
                h10.o();
            }
            h10.E();
            i a25 = h2.a(h10);
            h2.b(a25, a22, c0787a.d());
            h2.b(a25, dVar4, c0787a.b());
            h2.b(a25, qVar4, c0787a.c());
            h2.b(a25, g2Var4, c0787a.f());
            h10.c();
            a24.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            iVar2 = h10;
            w.a(v1.e.c(v1.ic_emomo_quest_giftgacha_capsule, h10, 0), null, d1.u(aVar2, g.l(100)), null, null, 0.0f, null, iVar2, 440, 120);
            String b12 = v1.f.b(b2.text_emomo_quest_gift_gacha_ticket_popup_title, iVar2, 0);
            long a26 = v1.b.a(t1.f34971l, iVar2, 0);
            o9.b bVar2 = o9.b.f44283a;
            w1.c(b12, null, a26, 0L, null, null, null, 0L, null, j2.e.g(j2.e.f37075b.a()), 0L, 0, false, 0, null, bVar2.b().y(), iVar2, 0, 0, 32250);
            g1.a(d1.o(aVar2, g.l(6)), iVar2, 6);
            w.a(v1.e.c(v1.ic_emomo_quest_giftgacha_ticket, iVar2, 0), null, d1.u(aVar2, g.l(80)), null, null, 0.0f, null, iVar2, 440, 120);
            iVar2.x(693286680);
            c0 a27 = y0.a(fVar.f(), c0986a.l(), iVar2, 0);
            iVar2.x(-1323940314);
            m2.d dVar5 = (m2.d) iVar2.G(o0.e());
            m2.q qVar5 = (m2.q) iVar2.G(o0.j());
            g2 g2Var5 = (g2) iVar2.G(o0.n());
            io.a<s1.a> a28 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a29 = q1.w.a(aVar2);
            if (!(iVar2.k() instanceof l0.e)) {
                h.c();
            }
            iVar2.D();
            if (iVar2.f()) {
                iVar2.r(a28);
            } else {
                iVar2.o();
            }
            iVar2.E();
            i a30 = h2.a(iVar2);
            h2.b(a30, a27, c0787a.d());
            h2.b(a30, dVar5, c0787a.b());
            h2.b(a30, qVar5, c0787a.c());
            h2.b(a30, g2Var5, c0787a.f());
            iVar2.c();
            a29.s0(n1.a(n1.b(iVar2)), iVar2, 0);
            iVar2.x(2058660585);
            iVar2.x(-678309503);
            a1 a1Var = a1.f60672a;
            w1.c(v1.f.b(b2.text_emomo_quest_gift_gacha_ticket_popup_own_ticket, iVar2, 0), null, v1.b.a(t1.f34970k, iVar2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar2.b().h(), iVar2, 0, 0, 32762);
            g1.a(d1.y(aVar2, g.l(2)), iVar2, 6);
            w1.c(v1.f.c(b2.text_emomo_quest_gift_gacha_ticket_popup_own_ticket_count, new Object[]{Integer.valueOf(bVar.a())}, iVar2, 64), null, v1.b.a(t1.f34972m, iVar2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar2.b().h(), iVar2, 0, 0, 32762);
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
            g1.a(d1.o(aVar2, g.l(20)), iVar2, 6);
            int i14 = (i13 << 3) & 896;
            a(1, false, lVar, iVar2, i14 | 54);
            iVar2.x(-947607654);
            if (bVar.e()) {
                i12 = 6;
                g1.a(d1.o(aVar2, g.l(f10)), iVar2, 6);
                a(bVar.a(), true, lVar, iVar2, i14 | 48);
            } else {
                i12 = 6;
            }
            iVar2.O();
            g1.a(d1.o(aVar2, g.l(22)), iVar2, i12);
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
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
        l10.a(new d(bVar, lVar, aVar, i10));
    }
}
