package ab;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.z;
import d2.x;
import h0.w1;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import s1.a;
import x0.f;
import y.d1;
import y.g1;

/* loaded from: classes2.dex */
public final class o {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f803w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f803w = aVar;
        }

        public final void a() {
            this.f803w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f804w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(0);
            this.f804w = aVar;
        }

        public final void a() {
            this.f804w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f805w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f806x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f807y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar, io.a<wn.v> aVar2, int i10) {
            super(2);
            this.f805w = aVar;
            this.f806x = aVar2;
            this.f807y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            o.a(this.f805w, this.f806x, iVar, this.f807y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(io.a<wn.v> aVar, io.a<wn.v> aVar2, l0.i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "onClickNotice");
        jo.p.h(aVar2, "onClickRestore");
        l0.i h10 = iVar.h(1228682030);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f.a aVar3 = x0.f.f59359u;
            x0.f n10 = d1.n(aVar3, 0.0f, 1, null);
            h10.x(-483455358);
            c0 a10 = y.p.a(y.f.f60773a.g(), x0.a.f59327a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(n10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a11);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a13 = h2.a(h10);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            h10.c();
            a12.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            String b10 = v1.f.b(wa.j.text_coin_for_minor, h10, 0);
            int i12 = wa.c.f58523o;
            long a14 = v1.b.a(i12, h10, 0);
            x.a aVar4 = x.f29149x;
            w1.c(b10, null, a14, m2.s.d(8), null, aVar4.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            float f10 = 6;
            g1.a(d1.o(aVar3, m2.g.l(f10)), h10, 6);
            u uVar = u.f839a;
            Context context = (Context) h10.G(z.g());
            String b11 = v1.f.b(wa.j.text_notice_buy_coin, h10, 0);
            String b12 = v1.f.b(wa.j.text_notice_paid_coin_url, h10, 0);
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar);
                h10.q(y10);
            }
            h10.O();
            SpannableString a15 = uVar.a(context, b11, b12, (io.a) y10);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            jo.p.g(typeface, "DEFAULT_BOLD");
            v.a(a15, null, i12, 8.0f, typeface, h10, 35848, 2);
            g1.a(d1.o(aVar3, m2.g.l(f10)), h10, 6);
            Context context2 = (Context) h10.G(z.g());
            String b13 = v1.f.b(wa.j.text_notice_paid_restore, h10, 0);
            String b14 = v1.f.b(wa.j.text_notice_paid_restore2, h10, 0);
            h10.x(1157296644);
            boolean P2 = h10.P(aVar2);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = new b(aVar2);
                h10.q(y11);
            }
            h10.O();
            SpannableString a16 = uVar.a(context2, b13, b14, (io.a) y11);
            Typeface typeface2 = Typeface.DEFAULT_BOLD;
            jo.p.g(typeface2, "DEFAULT_BOLD");
            v.a(a16, null, i12, 8.0f, typeface2, h10, 35848, 2);
            g1.a(d1.o(aVar3, m2.g.l(f10)), h10, 6);
            w1.c(v1.f.b(wa.j.text_notice_omake_coin, h10, 0), null, v1.b.a(i12, h10, 0), m2.s.d(8), null, aVar4.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(aVar, aVar2, i10));
    }
}
