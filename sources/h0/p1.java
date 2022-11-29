package h0;

import androidx.compose.ui.platform.g2;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.NoSuchElementException;
import l0.c2;
import l0.h2;
import q1.q0;
import s1.a;
import u.z0;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f34091a = m2.g.l(48);

    /* renamed from: b  reason: collision with root package name */
    public static final float f34092b = m2.g.l(72);

    /* renamed from: c  reason: collision with root package name */
    public static final float f34093c = m2.g.l(16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f34094d = m2.g.l(14);

    /* renamed from: e  reason: collision with root package name */
    public static final float f34095e = m2.g.l(6);

    /* renamed from: f  reason: collision with root package name */
    public static final long f34096f = m2.s.d(20);

    /* renamed from: g  reason: collision with root package name */
    public static final float f34097g = m2.g.l(8);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<y.q, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34098w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34099x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34100y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10) {
            super(3);
            this.f34098w = pVar;
            this.f34099x = pVar2;
            this.f34100y = i10;
        }

        public final void a(y.q qVar, l0.i iVar, int i10) {
            jo.p.h(qVar, "$this$Tab");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                p1.c(this.f34098w, this.f34099x, iVar, (this.f34100y >> 12) & 112);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.q qVar, l0.i iVar, Integer num) {
            a(qVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> A;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> B;
        public final /* synthetic */ x.m C;
        public final /* synthetic */ long D;
        public final /* synthetic */ long E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f34101w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34102x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f34103y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f34104z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, io.a<wn.v> aVar, x0.f fVar, boolean z11, io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, x.m mVar, long j10, long j11, int i10, int i11) {
            super(2);
            this.f34101w = z10;
            this.f34102x = aVar;
            this.f34103y = fVar;
            this.f34104z = z11;
            this.A = pVar;
            this.B = pVar2;
            this.C = mVar;
            this.D = j10;
            this.E = j11;
            this.F = i10;
            this.G = i11;
        }

        public final void a(l0.i iVar, int i10) {
            p1.a(this.f34101w, this.f34102x, this.f34103y, this.f34104z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1, this.G);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ io.a<wn.v> B;
        public final /* synthetic */ io.q<y.q, l0.i, Integer, wn.v> C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f34105w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34106x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x.m f34107y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ v.x f34108z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x0.f fVar, boolean z10, x.m mVar, v.x xVar, boolean z11, io.a<wn.v> aVar, io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar, int i10) {
            super(2);
            this.f34105w = fVar;
            this.f34106x = z10;
            this.f34107y = mVar;
            this.f34108z = xVar;
            this.A = z11;
            this.B = aVar;
            this.C = qVar;
            this.D = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            x0.f n10 = y.d1.n(d0.b.a(this.f34105w, this.f34106x, this.f34107y, this.f34108z, this.A, w1.h.g(w1.h.f57895b.f()), this.B), 0.0f, 1, null);
            a.b g10 = x0.a.f59327a.g();
            f.e b10 = y.f.f60773a.b();
            io.q<y.q, l0.i, Integer, wn.v> qVar = this.C;
            int i11 = ((this.D >> 12) & 7168) | 432;
            iVar.x(-483455358);
            int i12 = i11 >> 3;
            q1.c0 a10 = y.p.a(b10, g10, iVar, (i12 & 112) | (i12 & 14));
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(n10);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a11);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a13 = h2.a(iVar);
            h2.b(a13, a10, c0787a.d());
            h2.b(a13, dVar, c0787a.b());
            h2.b(a13, qVar2, c0787a.c());
            h2.b(a13, g2Var, c0787a.f());
            iVar.c();
            a12.s0(l0.n1.a(l0.n1.b(iVar)), iVar, Integer.valueOf((i13 >> 3) & 112));
            iVar.x(2058660585);
            iVar.x(-1163856341);
            if (((i13 >> 9) & 14 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                qVar.s0(y.r.f60913a, iVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
            }
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ x.m A;
        public final /* synthetic */ long B;
        public final /* synthetic */ long C;
        public final /* synthetic */ io.q<y.q, l0.i, Integer, wn.v> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f34109w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34110x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f34111y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f34112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z10, io.a<wn.v> aVar, x0.f fVar, boolean z11, x.m mVar, long j10, long j11, io.q<? super y.q, ? super l0.i, ? super Integer, wn.v> qVar, int i10, int i11) {
            super(2);
            this.f34109w = z10;
            this.f34110x = aVar;
            this.f34111y = fVar;
            this.f34112z = z11;
            this.A = mVar;
            this.B = j10;
            this.C = j11;
            this.D = qVar;
            this.E = i10;
            this.F = i11;
        }

        public final void a(l0.i iVar, int i10) {
            p1.b(this.f34109w, this.f34110x, this.f34111y, this.f34112z, this.A, this.B, this.C, this.D, iVar, this.E | 1, this.F);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34113w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f34114x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f34113w = pVar;
            this.f34114x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            y1.d0 b10;
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            b10 = r3.b((r42 & 1) != 0 ? r3.f61077a.f() : 0L, (r42 & 2) != 0 ? r3.f61077a.i() : 0L, (r42 & 4) != 0 ? r3.f61077a.l() : null, (r42 & 8) != 0 ? r3.f61077a.j() : null, (r42 & 16) != 0 ? r3.f61077a.k() : null, (r42 & 32) != 0 ? r3.f61077a.g() : null, (r42 & 64) != 0 ? r3.f61077a.h() : null, (r42 & 128) != 0 ? r3.f61077a.m() : 0L, (r42 & 256) != 0 ? r3.f61077a.d() : null, (r42 & 512) != 0 ? r3.f61077a.s() : null, (r42 & 1024) != 0 ? r3.f61077a.n() : null, (r42 & 2048) != 0 ? r3.f61077a.c() : 0L, (r42 & 4096) != 0 ? r3.f61077a.q() : null, (r42 & 8192) != 0 ? r3.f61077a.p() : null, (r42 & 16384) != 0 ? r3.f61078b.f() : j2.e.g(j2.e.f37075b.a()), (r42 & 32768) != 0 ? r3.f61078b.g() : null, (r42 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? r3.f61078b.c() : 0L, (r42 & 131072) != 0 ? q0.f34133a.c(iVar, 6).b().f61078b.h() : null);
            w1.a(b10, this.f34113w, iVar, (this.f34114x >> 9) & 112);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34115a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34116b;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {
            public final /* synthetic */ int A;
            public final /* synthetic */ Integer B;
            public final /* synthetic */ Integer C;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f34117w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f34118x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ q1.e0 f34119y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f34120z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1.q0 q0Var, q1.q0 q0Var2, q1.e0 e0Var, int i10, int i11, Integer num, Integer num2) {
                super(1);
                this.f34117w = q0Var;
                this.f34118x = q0Var2;
                this.f34119y = e0Var;
                this.f34120z = i10;
                this.A = i11;
                this.B = num;
                this.C = num2;
            }

            public final void a(q0.a aVar) {
                q1.q0 q0Var;
                jo.p.h(aVar, "$this$layout");
                q1.q0 q0Var2 = this.f34117w;
                if (q0Var2 == null || (q0Var = this.f34118x) == null) {
                    if (q0Var2 != null) {
                        p1.m(aVar, q0Var2, this.A);
                        return;
                    }
                    q1.q0 q0Var3 = this.f34118x;
                    if (q0Var3 != null) {
                        p1.m(aVar, q0Var3, this.A);
                        return;
                    }
                    return;
                }
                q1.e0 e0Var = this.f34119y;
                int i10 = this.f34120z;
                int i11 = this.A;
                Integer num = this.B;
                jo.p.e(num);
                int intValue = num.intValue();
                Integer num2 = this.C;
                jo.p.e(num2);
                p1.l(aVar, e0Var, q0Var2, q0Var, i10, i11, intValue, num2.intValue());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2) {
            this.f34115a = pVar;
            this.f34116b = pVar2;
        }

        @Override // q1.c0
        public final q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            q1.q0 M;
            q1.q0 q0Var;
            jo.p.h(e0Var, "$this$Layout");
            jo.p.h(list, "measurables");
            if (this.f34115a != null) {
                for (q1.b0 b0Var : list) {
                    M = jo.p.c(q1.t.a(b0Var), "text") ? b0Var.M(m2.b.e(j10, 0, 0, 0, 0, 11, null)) : null;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (this.f34116b != null) {
                for (q1.b0 b0Var2 : list) {
                    if (jo.p.c(q1.t.a(b0Var2), "icon")) {
                        q0Var = b0Var2.M(j10);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            q0Var = null;
            int max = Math.max(M != null ? M.r0() : 0, q0Var != null ? q0Var.r0() : 0);
            int X = e0Var.X((M == null || q0Var == null) ? p1.f34091a : p1.f34092b);
            return q1.e0.O0(e0Var, max, X, null, new a(M, q0Var, e0Var, max, X, M != null ? Integer.valueOf(M.L(q1.b.a())) : null, M != null ? Integer.valueOf(M.L(q1.b.b())) : null), 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34121w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34122x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10) {
            super(2);
            this.f34121w = pVar;
            this.f34122x = pVar2;
            this.f34123y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            p1.c(this.f34121w, this.f34122x, iVar, this.f34123y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f34124w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f34125x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f34126y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f34127z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(long j10, long j11, boolean z10, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f34124w = j10;
            this.f34125x = j11;
            this.f34126y = z10;
            this.f34127z = pVar;
            this.A = i10;
        }

        public final void a(l0.i iVar, int i10) {
            p1.d(this.f34124w, this.f34125x, this.f34126y, this.f34127z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.q<z0.b<Boolean>, l0.i, Integer, u.c0<c1.c0>> {

        /* renamed from: w  reason: collision with root package name */
        public static final i f34128w = new i();

        public i() {
            super(3);
        }

        public final u.c0<c1.c0> a(z0.b<Boolean> bVar, l0.i iVar, int i10) {
            u.b1 i11;
            jo.p.h(bVar, "$this$animateColor");
            iVar.x(-2120892502);
            if (bVar.c(Boolean.FALSE, Boolean.TRUE)) {
                i11 = u.j.h(150, 100, u.b0.c());
            } else {
                i11 = u.j.i(100, 0, u.b0.c(), 2, null);
            }
            iVar.O();
            return i11;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ u.c0<c1.c0> s0(z0.b<Boolean> bVar, l0.i iVar, Integer num) {
            return a(bVar, iVar, num.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r29, io.a<wn.v> r30, x0.f r31, boolean r32, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r33, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r34, x.m r35, long r36, long r38, l0.i r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.p1.a(boolean, io.a, x0.f, boolean, io.p, io.p, x.m, long, long, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r27, io.a<wn.v> r28, x0.f r29, boolean r30, x.m r31, long r32, long r34, io.q<? super y.q, ? super l0.i, ? super java.lang.Integer, wn.v> r36, l0.i r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.p1.b(boolean, io.a, x0.f, boolean, x.m, long, long, io.q, l0.i, int, int):void");
    }

    public static final void c(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(1249848471);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(pVar2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            f fVar = new f(pVar, pVar2);
            h10.x(-1323940314);
            f.a aVar = x0.f.f59359u;
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(aVar);
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
            h2.b(a12, fVar, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(1142473408);
            h10.x(-2141028452);
            if (pVar != null) {
                x0.f k10 = y.r0.k(q1.t.b(aVar, "text"), f34093c, 0.0f, 2, null);
                h10.x(733328855);
                q1.c0 h11 = y.j.h(x0.a.f59327a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                g2 g2Var2 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a13 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a14 = q1.w.a(k10);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a13);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a15 = h2.a(h10);
                h2.b(a15, h11, c0787a.d());
                h2.b(a15, dVar2, c0787a.b());
                h2.b(a15, qVar2, c0787a.c());
                h2.b(a15, g2Var2, c0787a.f());
                h10.c();
                a14.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar = y.l.f60836a;
                h10.x(-459869377);
                pVar.invoke(h10, Integer.valueOf(i11 & 14));
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
            }
            h10.O();
            if (pVar2 != null) {
                x0.f b10 = q1.t.b(aVar, "icon");
                h10.x(733328855);
                q1.c0 h12 = y.j.h(x0.a.f59327a.o(), false, h10, 0);
                h10.x(-1323940314);
                m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
                g2 g2Var3 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
                io.a<s1.a> a16 = c0787a.a();
                io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a17 = q1.w.a(b10);
                if (!(h10.k() instanceof l0.e)) {
                    l0.h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a16);
                } else {
                    h10.o();
                }
                h10.E();
                l0.i a18 = h2.a(h10);
                h2.b(a18, h12, c0787a.d());
                h2.b(a18, dVar3, c0787a.b());
                h2.b(a18, qVar3, c0787a.c());
                h2.b(a18, g2Var3, c0787a.f());
                h10.c();
                a17.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-2137368960);
                y.l lVar2 = y.l.f60836a;
                h10.x(892169960);
                pVar2.invoke(h10, Integer.valueOf((i11 >> 3) & 14));
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new g(pVar, pVar2, i10));
    }

    public static final void d(long j10, long j11, boolean z10, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(-405571117);
        if ((i10 & 14) == 0) {
            i11 = (h10.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.e(j11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.a(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(pVar) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && h10.j()) {
            h10.I();
        } else {
            int i12 = i11 >> 6;
            u.z0 d10 = u.a1.d(Boolean.valueOf(z10), null, h10, i12 & 14, 2);
            i iVar2 = i.f34128w;
            h10.x(-1462136984);
            boolean booleanValue = ((Boolean) d10.m()).booleanValue();
            h10.x(1445938070);
            long j12 = booleanValue ? j10 : j11;
            h10.O();
            d1.c p10 = c1.c0.p(j12);
            h10.x(-3686930);
            boolean P = h10.P(p10);
            u.c1<c1.c0, u.o> y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = t.j.d(c1.c0.f18634b).invoke(p10);
                h10.q(y10);
            }
            h10.O();
            u.c1 c1Var = (u.c1) y10;
            h10.x(1847725064);
            boolean booleanValue2 = ((Boolean) d10.g()).booleanValue();
            h10.x(1445938070);
            long j13 = booleanValue2 ? j10 : j11;
            h10.O();
            c1.c0 g10 = c1.c0.g(j13);
            boolean booleanValue3 = ((Boolean) d10.m()).booleanValue();
            h10.x(1445938070);
            long j14 = booleanValue3 ? j10 : j11;
            h10.O();
            c2 c10 = u.a1.c(d10, g10, c1.c0.g(j14), iVar2.s0(d10.k(), h10, 0), c1Var, "ColorAnimation", h10, 32768);
            h10.O();
            h10.O();
            l0.r.a(new l0.d1[]{p.a().c(c1.c0.g(c1.c0.k(e(c10), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), o.a().c(Float.valueOf(c1.c0.n(e(c10))))}, pVar, h10, (i12 & 112) | 8);
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new h(j10, j11, z10, pVar, i10));
    }

    public static final long e(c2<c1.c0> c2Var) {
        return c2Var.getValue().u();
    }

    public static final void l(q0.a aVar, m2.d dVar, q1.q0 q0Var, q1.q0 q0Var2, int i10, int i11, int i12, int i13) {
        float f10;
        if (i12 == i13) {
            f10 = f34094d;
        } else {
            f10 = f34095e;
        }
        int X = dVar.X(f10) + dVar.X(r1.f34156a.c());
        int i14 = (i11 - i13) - X;
        q0.a.n(aVar, q0Var, (i10 - q0Var.r0()) / 2, i14, 0.0f, 4, null);
        q0.a.n(aVar, q0Var2, (i10 - q0Var2.r0()) / 2, i14 - ((q0Var2.f0() + dVar.N0(f34096f)) - i12), 0.0f, 4, null);
    }

    public static final void m(q0.a aVar, q1.q0 q0Var, int i10) {
        q0.a.n(aVar, q0Var, 0, (i10 - q0Var.f0()) / 2, 0.0f, 4, null);
    }
}
