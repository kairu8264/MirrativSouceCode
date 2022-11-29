package h0;

import androidx.compose.ui.platform.g2;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.List;
import java.util.NoSuchElementException;
import l0.h2;
import q1.q0;
import s1.a;
import x0.a;
import x0.f;
import y.f;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final float f33819c;

    /* renamed from: f  reason: collision with root package name */
    public static final float f33822f;

    /* renamed from: a  reason: collision with root package name */
    public static final float f33817a = m2.g.l(30);

    /* renamed from: b  reason: collision with root package name */
    public static final float f33818b = m2.g.l(16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f33820d = m2.g.l(2);

    /* renamed from: e  reason: collision with root package name */
    public static final float f33821e = m2.g.l(6);

    /* renamed from: g  reason: collision with root package name */
    public static final float f33823g = m2.g.l(12);

    /* renamed from: h  reason: collision with root package name */
    public static final float f33824h = m2.g.l(48);

    /* renamed from: i  reason: collision with root package name */
    public static final float f33825i = m2.g.l(68);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33826w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33827x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33828y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10) {
            super(2);
            this.f33826w = pVar;
            this.f33827x = pVar2;
            this.f33828y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f1.a(this.f33826w, this.f33827x, iVar, this.f33828y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f33829a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f33830b;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f33831w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f33832x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f33833y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f33834z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1.q0 q0Var, int i10, q1.q0 q0Var2, int i11, int i12) {
                super(1);
                this.f33831w = q0Var;
                this.f33832x = i10;
                this.f33833y = q0Var2;
                this.f33834z = i11;
                this.A = i12;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                q0.a.n(aVar, this.f33831w, 0, this.f33832x, 0.0f, 4, null);
                q0.a.n(aVar, this.f33833y, this.f33834z, this.A, 0.0f, 4, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        public b(String str, String str2) {
            this.f33829a = str;
            this.f33830b = str2;
        }

        @Override // q1.c0
        public final q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            int max;
            int i10;
            int f02;
            jo.p.h(e0Var, "$this$Layout");
            jo.p.h(list, "measurables");
            String str = this.f33829a;
            for (q1.b0 b0Var : list) {
                if (jo.p.c(q1.t.a(b0Var), str)) {
                    q1.q0 M = b0Var.M(j10);
                    int d10 = po.n.d((m2.b.n(j10) - M.r0()) - e0Var.X(f1.f33822f), m2.b.p(j10));
                    String str2 = this.f33830b;
                    for (q1.b0 b0Var2 : list) {
                        if (jo.p.c(q1.t.a(b0Var2), str2)) {
                            q1.q0 M2 = b0Var2.M(m2.b.e(j10, 0, d10, 0, 0, 9, null));
                            int L = M2.L(q1.b.a());
                            if (L != Integer.MIN_VALUE) {
                                int L2 = M2.L(q1.b.b());
                                if (L2 != Integer.MIN_VALUE) {
                                    boolean z10 = L == L2;
                                    int n10 = m2.b.n(j10) - M.r0();
                                    if (!z10) {
                                        int X = e0Var.X(f1.f33817a) - L;
                                        max = Math.max(e0Var.X(f1.f33825i), M2.f0() + X);
                                        i10 = X;
                                        f02 = (max - M.f0()) / 2;
                                    } else {
                                        int max2 = Math.max(e0Var.X(f1.f33824h), M.f0());
                                        int f03 = (max2 - M2.f0()) / 2;
                                        int L3 = M.L(q1.b.a());
                                        int i11 = L3 != Integer.MIN_VALUE ? (L + f03) - L3 : 0;
                                        max = max2;
                                        f02 = i11;
                                        i10 = f03;
                                    }
                                    return q1.e0.O0(e0Var, m2.b.n(j10), max, null, new a(M2, i10, M, n10, f02), 4, null);
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33835w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33836x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33837y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10) {
            super(2);
            this.f33835w = pVar;
            this.f33836x = pVar2;
            this.f33837y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f1.b(this.f33835w, this.f33836x, iVar, this.f33837y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33838w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33839x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33840y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f33841z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33842w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33843x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f33844y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ boolean f33845z;

            /* renamed from: h0.f1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0417a extends jo.q implements io.p<l0.i, Integer, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33846w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33847x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ int f33848y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ boolean f33849z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0417a(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10, boolean z10) {
                    super(2);
                    this.f33846w = pVar;
                    this.f33847x = pVar2;
                    this.f33848y = i10;
                    this.f33849z = z10;
                }

                public final void a(l0.i iVar, int i10) {
                    if ((i10 & 11) == 2 && iVar.j()) {
                        iVar.I();
                    } else if (this.f33846w == null) {
                        iVar.x(59708346);
                        f1.e(this.f33847x, iVar, (this.f33848y >> 21) & 14);
                        iVar.O();
                    } else if (this.f33849z) {
                        iVar.x(59708411);
                        io.p<l0.i, Integer, wn.v> pVar = this.f33847x;
                        io.p<l0.i, Integer, wn.v> pVar2 = this.f33846w;
                        int i11 = this.f33848y;
                        f1.a(pVar, pVar2, iVar, (i11 & 112) | ((i11 >> 21) & 14));
                        iVar.O();
                    } else {
                        iVar.x(59708478);
                        io.p<l0.i, Integer, wn.v> pVar3 = this.f33847x;
                        io.p<l0.i, Integer, wn.v> pVar4 = this.f33846w;
                        int i12 = this.f33848y;
                        f1.b(pVar3, pVar4, iVar, (i12 & 112) | ((i12 >> 21) & 14));
                        iVar.O();
                    }
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                    a(iVar, num.intValue());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10, boolean z10) {
                super(2);
                this.f33842w = pVar;
                this.f33843x = pVar2;
                this.f33844y = i10;
                this.f33845z = z10;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    w1.a(q0.f34133a.c(iVar, 6).a(), s0.c.b(iVar, 225114541, true, new C0417a(this.f33842w, this.f33843x, this.f33844y, this.f33845z)), iVar, 48);
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10, boolean z10) {
            super(2);
            this.f33838w = pVar;
            this.f33839x = pVar2;
            this.f33840y = i10;
            this.f33841z = z10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                l0.r.a(new l0.d1[]{o.a().c(Float.valueOf(n.f34046a.c(iVar, 6)))}, s0.c.b(iVar, 1939362236, true, new a(this.f33838w, this.f33839x, this.f33840y, this.f33841z)), iVar, 56);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ long B;
        public final /* synthetic */ float C;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f33850w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33851x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f33852y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f33853z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, boolean z10, c1.g1 g1Var, long j10, long j11, float f10, io.p<? super l0.i, ? super Integer, wn.v> pVar2, int i10, int i11) {
            super(2);
            this.f33850w = fVar;
            this.f33851x = pVar;
            this.f33852y = z10;
            this.f33853z = g1Var;
            this.A = j10;
            this.B = j11;
            this.C = f10;
            this.D = pVar2;
            this.E = i10;
            this.F = i11;
        }

        public final void a(l0.i iVar, int i10) {
            f1.c(this.f33850w, this.f33851x, this.f33852y, this.f33853z, this.A, this.B, this.C, this.D, iVar, this.E | 1, this.F);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a1 f33854w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a1 a1Var) {
            super(2);
            this.f33854w = a1Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(this.f33854w.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ long B;
        public final /* synthetic */ long C;
        public final /* synthetic */ float D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a1 f33855w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f33856x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f33857y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c1.g1 f33858z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a1 a1Var, x0.f fVar, boolean z10, c1.g1 g1Var, long j10, long j11, long j12, float f10, int i10, int i11) {
            super(2);
            this.f33855w = a1Var;
            this.f33856x = fVar;
            this.f33857y = z10;
            this.f33858z = g1Var;
            this.A = j10;
            this.B = j11;
            this.C = j12;
            this.D = f10;
            this.E = i10;
            this.F = i11;
        }

        public final void a(l0.i iVar, int i10) {
            f1.d(this.f33855w, this.f33856x, this.f33857y, this.f33858z, this.A, this.B, this.C, this.D, iVar, this.E | 1, this.F);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f33859w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f33860x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a1 f33861y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f33862z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a1 f33863w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a1 a1Var) {
                super(0);
                this.f33863w = a1Var;
            }

            public final void a() {
                this.f33863w.c();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.q<y.z0, l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f33864w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(3);
                this.f33864w = str;
            }

            public final void a(y.z0 z0Var, l0.i iVar, int i10) {
                jo.p.h(z0Var, "$this$TextButton");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                } else {
                    w1.c(this.f33864w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                }
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(y.z0 z0Var, l0.i iVar, Integer num) {
                a(z0Var, iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j10, int i10, a1 a1Var, String str) {
            super(2);
            this.f33859w = j10;
            this.f33860x = i10;
            this.f33861y = a1Var;
            this.f33862z = str;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            h0.f.d(new a(this.f33861y), null, false, null, null, null, null, h0.d.f33749a.i(0L, this.f33859w, 0L, iVar, ((this.f33860x >> 15) & 112) | 3072, 5), null, s0.c.b(iVar, -929149933, true, new b(this.f33862z)), iVar, C.ENCODING_PCM_32BIT, 382);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements q1.c0 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f33865a = new i();

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f33866w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q1.q0 f33867x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, q1.q0 q0Var) {
                super(1);
                this.f33866w = i10;
                this.f33867x = q0Var;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                q0.a.n(aVar, this.f33867x, 0, (this.f33866w - this.f33867x.f0()) / 2, 0.0f, 4, null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        @Override // q1.c0
        public final q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            jo.p.h(e0Var, "$this$Layout");
            jo.p.h(list, "measurables");
            if (list.size() == 1) {
                q1.q0 M = ((q1.b0) xn.a0.X(list)).M(j10);
                int L = M.L(q1.b.a());
                int L2 = M.L(q1.b.b());
                if (L != Integer.MIN_VALUE) {
                    if (L2 != Integer.MIN_VALUE) {
                        int max = Math.max(e0Var.X(L == L2 ? f1.f33824h : f1.f33825i), M.f0());
                        return q1.e0.O0(e0Var, m2.b.n(j10), max, null, new a(max, M), 4, null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f33868w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f33869x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f33868w = pVar;
            this.f33869x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f1.e(this.f33868w, iVar, this.f33869x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    static {
        float f10 = 8;
        f33819c = m2.g.l(f10);
        f33822f = m2.g.l(f10);
    }

    public static final void a(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(-1229075900);
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
            f.a aVar = x0.f.f59359u;
            x0.f n10 = y.d1.n(aVar, 0.0f, 1, null);
            float f10 = f33818b;
            float f11 = f33819c;
            x0.f m10 = y.r0.m(n10, f10, 0.0f, f11, f33820d, 2, null);
            h10.x(-483455358);
            f.l g10 = y.f.f60773a.g();
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a12 = q1.w.a(m10);
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
            a12.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            h10.x(-1214415430);
            x0.f m11 = y.r0.m(y.a.g(aVar, f33817a, f33823g), 0.0f, 0.0f, f11, 0.0f, 11, null);
            h10.x(733328855);
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var2 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(m11);
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
            h2.b(a16, h11, c0787a.d());
            h2.b(a16, dVar2, c0787a.b());
            h2.b(a16, qVar2, c0787a.c());
            h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar = y.l.f60836a;
            h10.x(1193033152);
            pVar.invoke(h10, Integer.valueOf(i11 & 14));
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            x0.f b10 = rVar.b(aVar, c0986a.j());
            h10.x(733328855);
            q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var3 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a17 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a18 = q1.w.a(b10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a17);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a19 = h2.a(h10);
            h2.b(a19, h12, c0787a.d());
            h2.b(a19, dVar3, c0787a.b());
            h2.b(a19, qVar3, c0787a.c());
            h2.b(a19, g2Var3, c0787a.f());
            h10.c();
            a18.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            h10.x(-2100387721);
            pVar2.invoke(h10, Integer.valueOf((i11 >> 3) & 14));
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(pVar, pVar2, i10));
    }

    public static final void b(io.p<? super l0.i, ? super Integer, wn.v> pVar, io.p<? super l0.i, ? super Integer, wn.v> pVar2, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(-534813202);
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
            f.a aVar = x0.f.f59359u;
            x0.f m10 = y.r0.m(aVar, f33818b, 0.0f, f33819c, 0.0f, 10, null);
            b bVar = new b(ActionLogBase.ACTION, "text");
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(m10);
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
            h2.b(a12, bVar, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-643033641);
            x0.f k10 = y.r0.k(q1.t.b(aVar, "text"), 0.0f, f33821e, 1, null);
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
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
            h10.x(1616738193);
            pVar.invoke(h10, Integer.valueOf(i11 & 14));
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            x0.f b10 = q1.t.b(aVar, ActionLogBase.ACTION);
            h10.x(733328855);
            q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
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
            h10.x(-1690150342);
            pVar2.invoke(h10, Integer.valueOf((i11 >> 3) & 14));
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(pVar, pVar2, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(x0.f r29, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r30, boolean r31, c1.g1 r32, long r33, long r35, float r37, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r38, l0.i r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.f1.c(x0.f, io.p, boolean, c1.g1, long, long, float, io.p, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(h0.a1 r29, x0.f r30, boolean r31, c1.g1 r32, long r33, long r35, long r37, float r39, l0.i r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.f1.d(h0.a1, x0.f, boolean, c1.g1, long, long, long, float, l0.i, int, int):void");
    }

    public static final void e(io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        int i11;
        l0.i h10 = iVar.h(917397959);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            i iVar2 = i.f33865a;
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
            h2.b(a12, iVar2, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-266728784);
            x0.f j10 = y.r0.j(aVar, f33818b, f33821e);
            h10.x(733328855);
            q1.c0 h11 = y.j.h(x0.a.f59327a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var2 = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a13 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a14 = q1.w.a(j10);
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
            h10.x(1392363114);
            pVar.invoke(h10, Integer.valueOf(i11 & 14));
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new j(pVar, i10));
    }
}
