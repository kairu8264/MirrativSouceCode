package w9;

import android.content.res.Configuration;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.z;
import com.google.android.exoplayer2.C;
import java.util.List;
import l0.c2;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import l0.s0;
import l0.z1;
import q1.w;
import s1.a;
import x0.a;
import x0.f;
import xn.a0;
import y.a1;
import y.d1;
import y.y0;
import z.c0;

/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c0, wn.v> {
        public final /* synthetic */ io.l<Integer, wn.v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ io.l<Integer, wn.v> C;
        public final /* synthetic */ io.l<Integer, wn.v> D;
        public final /* synthetic */ s0<Boolean> E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x9.a f58477w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f58478x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f58479y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f58480z;

        /* renamed from: w9.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0963a extends jo.q implements io.q<z.h, l0.i, Integer, wn.v> {
            public final /* synthetic */ io.l<Integer, wn.v> A;
            public final /* synthetic */ int B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ x9.a f58481w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ boolean f58482x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f58483y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f58484z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0963a(x9.a aVar, boolean z10, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, int i10) {
                super(3);
                this.f58481w = aVar;
                this.f58482x = z10;
                this.f58483y = lVar;
                this.f58484z = lVar2;
                this.A = lVar3;
                this.B = i10;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                j c10 = this.f58481w.c();
                boolean z10 = this.f58482x;
                io.l<String, wn.v> lVar = this.f58483y;
                io.l<String, wn.v> lVar2 = this.f58484z;
                io.l<Integer, wn.v> lVar3 = this.A;
                int i11 = this.B;
                k.b(c10, z10, lVar, lVar2, lVar3, iVar, ((i11 >> 3) & 112) | 8 | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168) | ((i11 >> 6) & 57344));
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.q<z.h, l0.i, Integer, wn.v> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ x9.a f58485w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l<String, wn.v> f58486x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<Integer, wn.v> f58487y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.l<Integer, wn.v> f58488z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(x9.a aVar, io.l<? super String, wn.v> lVar, io.l<? super Integer, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, int i10) {
                super(3);
                this.f58485w = aVar;
                this.f58486x = lVar;
                this.f58487y = lVar2;
                this.f58488z = lVar3;
                this.A = i10;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                s e10 = this.f58485w.e();
                io.l<String, wn.v> lVar = this.f58486x;
                io.l<Integer, wn.v> lVar2 = this.f58487y;
                io.l<Integer, wn.v> lVar3 = this.f58488z;
                int i11 = this.A;
                u.a(e10, lVar, lVar2, lVar3, iVar, ((i11 >> 9) & 112) | 8 | ((i11 >> 15) & 896) | ((i11 >> 6) & 7168));
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.q<z.h, l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h f58489w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l<Integer, wn.v> f58490x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f58491y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(h hVar, io.l<? super Integer, wn.v> lVar, int i10) {
                super(3);
                this.f58489w = hVar;
                this.f58490x = lVar;
                this.f58491y = i10;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                } else {
                    i.g(null, this.f58489w, this.f58490x, iVar, (this.f58491y >> 9) & 896, 1);
                }
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.q<z.h, l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f58492w;

            /* renamed from: w9.v$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0964a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ s0<Boolean> f58493w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0964a(s0<Boolean> s0Var) {
                    super(0);
                    this.f58493w = s0Var;
                }

                public final void a() {
                    v.c(this.f58493w, true);
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(s0<Boolean> s0Var) {
                super(3);
                this.f58492w = s0Var;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                s0<Boolean> s0Var = this.f58492w;
                iVar.x(1157296644);
                boolean P = iVar.P(s0Var);
                Object y10 = iVar.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new C0964a(s0Var);
                    iVar.q(y10);
                }
                iVar.O();
                i.c(null, (io.a) y10, iVar, 0, 1);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.q<z.h, l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ x9.a f58494w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(x9.a aVar) {
                super(3);
                this.f58494w = aVar;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                } else {
                    f.a(this.f58494w.a(), iVar, 8);
                }
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x9.a aVar, boolean z10, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, int i10, io.l<? super Integer, wn.v> lVar4, io.l<? super Integer, wn.v> lVar5, s0<Boolean> s0Var) {
            super(1);
            this.f58477w = aVar;
            this.f58478x = z10;
            this.f58479y = lVar;
            this.f58480z = lVar2;
            this.A = lVar3;
            this.B = i10;
            this.C = lVar4;
            this.D = lVar5;
            this.E = s0Var;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyColumn");
            c0.d(c0Var, null, null, s0.c.c(89714757, true, new C0963a(this.f58477w, this.f58478x, this.f58479y, this.f58480z, this.A, this.B)), 3, null);
            c0.d(c0Var, null, null, s0.c.c(-1751932100, true, new b(this.f58477w, this.f58480z, this.C, this.D, this.B)), 3, null);
            w9.b bVar = w9.b.f58265a;
            c0.d(c0Var, null, null, bVar.a(), 3, null);
            if (this.f58477w.d().d()) {
                c0.d(c0Var, null, null, bVar.b(), 3, null);
                int size = v.b(this.E) ? this.f58477w.d().b().size() : 5;
                List<h> w02 = a0.w0(this.f58477w.d().b(), size);
                io.l<Integer, wn.v> lVar = this.D;
                int i10 = this.B;
                for (h hVar : w02) {
                    c0.d(c0Var, null, null, s0.c.c(2048579010, true, new c(hVar, lVar, i10)), 3, null);
                }
                if (this.f58477w.d().b().size() > size) {
                    c0.d(c0Var, null, null, s0.c.c(-1107769669, true, new d(this.E)), 3, null);
                }
                c0.d(c0Var, null, null, w9.b.f58265a.c(), 3, null);
            } else {
                c0.d(c0Var, null, null, bVar.d(), 3, null);
            }
            c0.d(c0Var, null, null, s0.c.c(1895018430, true, new e(this.f58477w)), 3, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c0 c0Var) {
            a(c0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f58495w = new b();

        public b() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<String, wn.v> A;
        public final /* synthetic */ io.l<Integer, wn.v> B;
        public final /* synthetic */ io.l<Integer, wn.v> C;
        public final /* synthetic */ io.l<Integer, wn.v> D;
        public final /* synthetic */ io.a<wn.v> E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<ha.a> f58496w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<x9.a> f58497x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f58498y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f58499z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(c2<? extends ha.a> c2Var, c2<x9.a> c2Var2, boolean z10, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, io.l<? super Integer, wn.v> lVar4, io.l<? super Integer, wn.v> lVar5, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f58496w = c2Var;
            this.f58497x = c2Var2;
            this.f58498y = z10;
            this.f58499z = lVar;
            this.A = lVar2;
            this.B = lVar3;
            this.C = lVar4;
            this.D = lVar5;
            this.E = aVar;
            this.F = i10;
        }

        public final void a(l0.i iVar, int i10) {
            v.a(this.f58496w, this.f58497x, this.f58498y, this.f58499z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(c2<? extends ha.a> c2Var, c2<x9.a> c2Var2, boolean z10, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, io.l<? super Integer, wn.v> lVar4, io.l<? super Integer, wn.v> lVar5, io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        l0.i iVar2;
        jo.p.h(c2Var, "statusState");
        jo.p.h(c2Var2, "bindModelState");
        jo.p.h(lVar, "onClickRule");
        jo.p.h(lVar2, "onClickLp");
        jo.p.h(lVar3, "onClickProfile");
        jo.p.h(lVar4, "onClickStageReward");
        jo.p.h(lVar5, "onClickRankingReward");
        jo.p.h(aVar, "onClickPlay");
        l0.i h10 = iVar.h(-508097456);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(c2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(c2Var2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.a(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(lVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(lVar2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= h10.P(lVar3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((3670016 & i10) == 0) {
            i11 |= h10.P(lVar4) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= h10.P(lVar5) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= h10.P(aVar) ? 67108864 : 33554432;
        }
        int i12 = i11;
        if ((i12 & 191739611) == 38347922 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar2 = l0.i.f39065a;
            if (y10 == aVar2.a()) {
                y10 = z1.e(Boolean.FALSE, null, 2, null);
                h10.q(y10);
            }
            h10.O();
            s0 s0Var = (s0) y10;
            f.a aVar3 = x0.f.f59359u;
            x0.f l10 = d1.l(aVar3, 0.0f, 1, null);
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = w.a(l10);
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
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar6 = y.l.f60836a;
            x9.a value = c2Var2.getValue();
            if (value != null) {
                h10.x(1241692378);
                z.g.a(d1.l(aVar3, 0.0f, 1, null), null, null, false, null, null, null, false, new a(value, z10, lVar, lVar2, lVar4, i12, lVar5, lVar3, s0Var), h10, 6, 254);
                if (z10) {
                    x0.f a13 = lVar6.a(d1.D(aVar3, c0986a.b(), true), c0986a.b());
                    h10.x(733328855);
                    q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
                    h10.x(-1323940314);
                    m2.d dVar2 = (m2.d) h10.G(o0.e());
                    m2.q qVar2 = (m2.q) h10.G(o0.j());
                    g2 g2Var2 = (g2) h10.G(o0.n());
                    io.a<s1.a> a14 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, wn.v> a15 = w.a(a13);
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
                    h2.b(a16, h12, c0787a.d());
                    h2.b(a16, dVar2, c0787a.b());
                    h2.b(a16, qVar2, c0787a.c());
                    h2.b(a16, g2Var2, c0787a.f());
                    h10.c();
                    a15.s0(n1.a(n1.b(h10)), h10, 0);
                    h10.x(2058660585);
                    h10.x(-2137368960);
                    l9.d.c(value.b(), y.g.b(d1.y(aVar3, m2.g.l(((Configuration) h10.G(z.f())).screenWidthDp * 1.3333334f)), 4.1666665f, false, 2, null), null, 0, null, null, h10, 0, 60);
                    h10.O();
                    h10.O();
                    h10.s();
                    h10.O();
                    h10.O();
                    x0.f a17 = lVar6.a(y.g.b(d1.n(aVar3, 0.0f, 1, null), 3.125f, false, 2, null), c0986a.b());
                    x0.a e10 = c0986a.e();
                    iVar2 = h10;
                    iVar2.x(733328855);
                    q1.c0 h13 = y.j.h(e10, false, iVar2, 6);
                    iVar2.x(-1323940314);
                    m2.d dVar3 = (m2.d) iVar2.G(o0.e());
                    m2.q qVar3 = (m2.q) iVar2.G(o0.j());
                    g2 g2Var3 = (g2) iVar2.G(o0.n());
                    io.a<s1.a> a18 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, wn.v> a19 = w.a(a17);
                    if (!(iVar2.k() instanceof l0.e)) {
                        l0.h.c();
                    }
                    iVar2.D();
                    if (iVar2.f()) {
                        iVar2.r(a18);
                    } else {
                        iVar2.o();
                    }
                    iVar2.E();
                    l0.i a20 = h2.a(iVar2);
                    h2.b(a20, h13, c0787a.d());
                    h2.b(a20, dVar3, c0787a.b());
                    h2.b(a20, qVar3, c0787a.c());
                    h2.b(a20, g2Var3, c0787a.f());
                    iVar2.c();
                    a19.s0(n1.a(n1.b(iVar2)), iVar2, 0);
                    iVar2.x(2058660585);
                    iVar2.x(-2137368960);
                    x0.f b10 = y.g.b(d1.m(aVar3, 0.5f), 3.125f, false, 2, null);
                    iVar2.x(-492369756);
                    Object y11 = iVar2.y();
                    if (y11 == aVar2.a()) {
                        y11 = x.l.a();
                        iVar2.q(y11);
                    }
                    iVar2.O();
                    y.j.a(v.l.c(b10, (x.m) y11, null, false, null, null, aVar, 28, null), iVar2, 0);
                    iVar2.O();
                    iVar2.O();
                    iVar2.s();
                    iVar2.O();
                    iVar2.O();
                } else {
                    iVar2 = h10;
                }
                iVar2.O();
            } else {
                iVar2 = h10;
                iVar2.x(1241696739);
                x0.f l11 = d1.l(aVar3, 0.0f, 1, null);
                a.c i13 = c0986a.i();
                iVar2.x(693286680);
                q1.c0 a21 = y0.a(y.f.f60773a.f(), i13, iVar2, 48);
                iVar2.x(-1323940314);
                m2.d dVar4 = (m2.d) iVar2.G(o0.e());
                m2.q qVar4 = (m2.q) iVar2.G(o0.j());
                g2 g2Var4 = (g2) iVar2.G(o0.n());
                io.a<s1.a> a22 = c0787a.a();
                io.q<n1<s1.a>, l0.i, Integer, wn.v> a23 = w.a(l11);
                if (!(iVar2.k() instanceof l0.e)) {
                    l0.h.c();
                }
                iVar2.D();
                if (iVar2.f()) {
                    iVar2.r(a22);
                } else {
                    iVar2.o();
                }
                iVar2.E();
                l0.i a24 = h2.a(iVar2);
                h2.b(a24, a21, c0787a.d());
                h2.b(a24, dVar4, c0787a.b());
                h2.b(a24, qVar4, c0787a.c());
                h2.b(a24, g2Var4, c0787a.f());
                iVar2.c();
                a23.s0(n1.a(n1.b(iVar2)), iVar2, 0);
                iVar2.x(2058660585);
                iVar2.x(-678309503);
                a1 a1Var = a1.f60672a;
                l9.e.b(c2Var.getValue(), "", b.f58495w, iVar2, ha.a.f34693a | 432);
                iVar2.O();
                iVar2.O();
                iVar2.s();
                iVar2.O();
                iVar2.O();
                iVar2.O();
            }
            iVar2.O();
            iVar2.O();
            iVar2.s();
            iVar2.O();
            iVar2.O();
        }
        l1 l12 = iVar2.l();
        if (l12 == null) {
            return;
        }
        l12.a(new c(c2Var, c2Var2, z10, lVar, lVar2, lVar3, lVar4, lVar5, aVar, i10));
    }

    public static final boolean b(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final void c(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }
}
