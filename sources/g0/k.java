package g0;

/* loaded from: classes.dex */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32240a = a.f32241a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f32241a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final k f32242b = new c();

        /* renamed from: c  reason: collision with root package name */
        public static final k f32243c = new C0366a();

        /* renamed from: d  reason: collision with root package name */
        public static final k f32244d = new e();

        /* renamed from: e  reason: collision with root package name */
        public static final k f32245e = new d();

        /* renamed from: f  reason: collision with root package name */
        public static final k f32246f = new b();

        /* renamed from: g0.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0366a implements k {
            @Override // g0.k
            public long a(y1.z zVar, long j10, int i10, boolean z10, y1.b0 b0Var) {
                jo.p.h(zVar, "textLayoutResult");
                if (y1.b0.h(j10)) {
                    return l.a(y1.b0.n(j10), so.o.O(zVar.k().j()), z10, b0Var != null ? y1.b0.m(b0Var.r()) : false);
                }
                return j10;
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements k {
            @Override // g0.k
            public long a(y1.z zVar, long j10, int i10, boolean z10, y1.b0 b0Var) {
                int e10;
                int i11;
                jo.p.h(zVar, "textLayoutResult");
                if (b0Var == null) {
                    return a.f32241a.g().a(zVar, j10, i10, z10, b0Var);
                }
                if (y1.b0.h(j10)) {
                    return l.a(y1.b0.n(j10), so.o.O(zVar.k().j()), z10, y1.b0.m(b0Var.r()));
                }
                if (z10) {
                    i11 = e(zVar, y1.b0.n(j10), i10, y1.b0.n(b0Var.r()), y1.b0.i(j10), true, y1.b0.m(j10));
                    e10 = y1.b0.i(j10);
                } else {
                    int n10 = y1.b0.n(j10);
                    e10 = e(zVar, y1.b0.i(j10), i10, y1.b0.i(b0Var.r()), y1.b0.n(j10), false, y1.b0.m(j10));
                    i11 = n10;
                }
                return y1.c0.b(i11, e10);
            }

            public final boolean b(y1.z zVar, int i10) {
                long B = zVar.B(i10);
                return i10 == y1.b0.n(B) || i10 == y1.b0.i(B);
            }

            public final boolean c(int i10, int i11, boolean z10, boolean z11) {
                if (i11 == -1) {
                    return true;
                }
                if (i10 == i11) {
                    return false;
                }
                if (z10 ^ z11) {
                    if (i10 < i11) {
                        return true;
                    }
                } else if (i10 > i11) {
                    return true;
                }
                return false;
            }

            public final int d(y1.z zVar, int i10, int i11, int i12, boolean z10, boolean z11) {
                int t10;
                int o10;
                long B = zVar.B(i10);
                if (zVar.p(y1.b0.n(B)) == i11) {
                    t10 = y1.b0.n(B);
                } else {
                    t10 = zVar.t(i11);
                }
                if (zVar.p(y1.b0.i(B)) == i11) {
                    o10 = y1.b0.i(B);
                } else {
                    o10 = y1.z.o(zVar, i11, false, 2, null);
                }
                if (t10 == i12) {
                    return o10;
                }
                if (o10 == i12) {
                    return t10;
                }
                int i13 = (t10 + o10) / 2;
                if (z10 ^ z11) {
                    if (i10 <= i13) {
                        return t10;
                    }
                } else if (i10 < i13) {
                    return t10;
                }
                return o10;
            }

            public final int e(y1.z zVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
                if (i10 == i11) {
                    return i12;
                }
                int p10 = zVar.p(i10);
                if (p10 != zVar.p(i12)) {
                    return d(zVar, i10, p10, i13, z10, z11);
                }
                return (c(i10, i11, z10, z11) && b(zVar, i12)) ? d(zVar, i10, p10, i13, z10, z11) : i10;
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements k {
            @Override // g0.k
            public long a(y1.z zVar, long j10, int i10, boolean z10, y1.b0 b0Var) {
                jo.p.h(zVar, "textLayoutResult");
                return j10;
            }
        }

        /* loaded from: classes.dex */
        public static final class d implements k {

            /* renamed from: g0.k$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0367a extends jo.m implements io.l<Integer, y1.b0> {
                public C0367a(Object obj) {
                    super(1, obj, f0.z.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                }

                public final long i(int i10) {
                    return f0.z.c((CharSequence) this.f38131x, i10);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ y1.b0 invoke(Integer num) {
                    return y1.b0.b(i(num.intValue()));
                }
            }

            @Override // g0.k
            public long a(y1.z zVar, long j10, int i10, boolean z10, y1.b0 b0Var) {
                jo.p.h(zVar, "textLayoutResult");
                return a.f32241a.b(zVar, j10, new C0367a(zVar.k().j()));
            }
        }

        /* loaded from: classes.dex */
        public static final class e implements k {

            /* renamed from: g0.k$a$e$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0368a extends jo.m implements io.l<Integer, y1.b0> {
                public C0368a(Object obj) {
                    super(1, obj, y1.z.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                }

                public final long i(int i10) {
                    return ((y1.z) this.f38131x).B(i10);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ y1.b0 invoke(Integer num) {
                    return y1.b0.b(i(num.intValue()));
                }
            }

            @Override // g0.k
            public long a(y1.z zVar, long j10, int i10, boolean z10, y1.b0 b0Var) {
                jo.p.h(zVar, "textLayoutResult");
                return a.f32241a.b(zVar, j10, new C0368a(zVar));
            }
        }

        public final long b(y1.z zVar, long j10, io.l<? super Integer, y1.b0> lVar) {
            if (zVar.k().j().length() == 0) {
                return y1.b0.f61064b.a();
            }
            int O = so.o.O(zVar.k().j());
            long r10 = lVar.invoke(Integer.valueOf(po.n.m(y1.b0.n(j10), 0, O))).r();
            long r11 = lVar.invoke(Integer.valueOf(po.n.m(y1.b0.i(j10), 0, O))).r();
            return y1.c0.b(y1.b0.m(j10) ? y1.b0.i(r10) : y1.b0.n(r10), y1.b0.m(j10) ? y1.b0.n(r11) : y1.b0.i(r11));
        }

        public final k c() {
            return f32243c;
        }

        public final k d() {
            return f32246f;
        }

        public final k e() {
            return f32242b;
        }

        public final k f() {
            return f32245e;
        }

        public final k g() {
            return f32244d;
        }
    }

    long a(y1.z zVar, long j10, int i10, boolean z10, y1.b0 b0Var);
}
