package l9;

import android.content.Context;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import com.dena.mirrativ.customview.StatusView;
import ha.a;
import io.l;
import io.p;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.f;
import y.d1;
import y.g1;
import y.r;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p<i, Integer, v> f39721w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39722x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super i, ? super Integer, v> pVar, int i10) {
            super(2);
            this.f39721w = pVar;
            this.f39722x = i10;
        }

        public final void a(i iVar, int i10) {
            e.a(this.f39721w, iVar, this.f39722x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f39723w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39724x;

        /* loaded from: classes.dex */
        public static final class a extends q implements l<Context, StatusView> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f39725w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(1);
                this.f39725w = str;
            }

            @Override // io.l
            /* renamed from: a */
            public final StatusView invoke(Context context) {
                jo.p.h(context, "it");
                StatusView statusView = new StatusView(context, null, 0, 6, null);
                statusView.b(new StatusView.b.d(this.f39725w, 0.0f, 2, null));
                return statusView;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10) {
            super(2);
            this.f39723w = str;
            this.f39724x = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r9v0, types: [l0.i] */
        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            String str = this.f39723w;
            iVar.x(1157296644);
            boolean P = iVar.P(str);
            Object y10 = iVar.y();
            if (P || y10 == i.f39065a.a()) {
                y10 = new a(str);
                iVar.q(y10);
            }
            iVar.O();
            o2.e.a(y10, d1.n(x0.f.f59359u, 0.0f, 1, null), null, iVar, 48, 4);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ha.a f39726w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f39727x;

        /* loaded from: classes.dex */
        public static final class a extends q implements l<Context, StatusView> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ha.a f39728w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f39729x;

            /* renamed from: l9.e$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0569a extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f39730w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0569a(io.a<v> aVar) {
                    super(0);
                    this.f39730w = aVar;
                }

                public final void a() {
                    this.f39730w.invoke();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ha.a aVar, io.a<v> aVar2) {
                super(1);
                this.f39728w = aVar;
                this.f39729x = aVar2;
            }

            @Override // io.l
            /* renamed from: a */
            public final StatusView invoke(Context context) {
                jo.p.h(context, "it");
                StatusView statusView = new StatusView(context, null, 0, 6, null);
                ha.a aVar = this.f39728w;
                io.a<v> aVar2 = this.f39729x;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = statusView.getResources().getString(da.i.f29338a);
                    jo.p.g(message, "resources.getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new C0569a(aVar2)));
                return statusView;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ha.a aVar, io.a<v> aVar2) {
            super(2);
            this.f39726w = aVar;
            this.f39727x = aVar2;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                o2.e.a(new a(this.f39726w, this.f39727x), d1.n(x0.f.f59359u, 0.0f, 1, null), null, iVar, 48, 4);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ha.a f39731w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f39732x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f39733y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f39734z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ha.a aVar, String str, io.a<v> aVar2, int i10) {
            super(2);
            this.f39731w = aVar;
            this.f39732x = str;
            this.f39733y = aVar2;
            this.f39734z = i10;
        }

        public final void a(i iVar, int i10) {
            e.b(this.f39731w, this.f39732x, this.f39733y, iVar, this.f39734z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(p<? super i, ? super Integer, v> pVar, i iVar, int i10) {
        int i11;
        i h10 = iVar.h(-118205530);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            x0.f n10 = d1.n(aVar, 0.0f, 1, null);
            h10.x(-483455358);
            c0 a10 = y.p.a(y.f.f60773a.g(), x0.a.f59327a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(n10);
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
            float f10 = 32;
            g1.a(d1.o(aVar, m2.g.l(f10)), h10, 6);
            pVar.invoke(h10, Integer.valueOf(i11 & 14));
            g1.a(d1.o(aVar, m2.g.l(f10)), h10, 6);
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
        l10.a(new a(pVar, i10));
    }

    public static final void b(ha.a aVar, String str, io.a<v> aVar2, i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "statusState");
        jo.p.h(str, "notFoundMessage");
        jo.p.h(aVar2, "onClickRetry");
        i h10 = iVar.h(-925294641);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(str) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar2) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else if (aVar.a()) {
            h10.x(-1099695683);
            a(l9.b.f39693a.a(), h10, 6);
            h10.O();
        } else if (aVar instanceof a.e) {
            h10.x(-1099695388);
            a(s0.c.b(h10, -1750564790, true, new b(str, i11)), h10, 6);
            h10.O();
        } else if (aVar instanceof a.C0439a) {
            h10.x(-1099695078);
            a(s0.c.b(h10, 1903316363, true, new c(aVar, aVar2)), h10, 6);
            h10.O();
        } else {
            h10.x(-1099694570);
            h10.O();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(aVar, str, aVar2, i10));
    }
}
