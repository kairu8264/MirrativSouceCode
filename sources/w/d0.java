package w;

import l0.c2;
import v.i0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f57599a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f57600b;

    /* renamed from: c  reason: collision with root package name */
    public final c2<m1.b> f57601c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f57602d;

    /* renamed from: e  reason: collision with root package name */
    public final m f57603e;

    /* renamed from: f  reason: collision with root package name */
    public final i0 f57604f;

    @co.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {399}, m = "doFlingAnimation-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57605w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57606x;

        /* renamed from: z  reason: collision with root package name */
        public int f57608z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57606x = obj;
            this.f57608z |= Integer.MIN_VALUE;
            return d0.this.b(0L, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {412}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<y, ao.d<? super wn.v>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ jo.d0 C;
        public final /* synthetic */ long D;

        /* renamed from: w  reason: collision with root package name */
        public Object f57609w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57610x;

        /* renamed from: y  reason: collision with root package name */
        public long f57611y;

        /* renamed from: z  reason: collision with root package name */
        public int f57612z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<b1.f, b1.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d0 f57613w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ y f57614x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 d0Var, y yVar) {
                super(1);
                this.f57613w = d0Var;
                this.f57614x = yVar;
            }

            public final long a(long j10) {
                d0 d0Var = this.f57613w;
                return b1.f.q(j10, this.f57613w.h(d0Var.a(this.f57614x, d0Var.h(j10), null, m1.f.f40505a.b())));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ b1.f invoke(b1.f fVar) {
                return b1.f.d(a(fVar.u()));
            }
        }

        /* renamed from: w.d0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0937b implements y {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d0 f57615a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ io.l<b1.f, b1.f> f57616b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0937b(d0 d0Var, io.l<? super b1.f, b1.f> lVar) {
                this.f57615a = d0Var;
                this.f57616b = lVar;
            }

            @Override // w.y
            public float a(float f10) {
                d0 d0Var = this.f57615a;
                return d0Var.k(this.f57616b.invoke(b1.f.d(d0Var.l(f10))).u());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jo.d0 d0Var, long j10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.C = d0Var;
            this.D = j10;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(y yVar, ao.d<? super wn.v> dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.C, this.D, dVar);
            bVar.A = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            d0 d0Var;
            jo.d0 d0Var2;
            d0 d0Var3;
            long j10;
            Object c10 = bo.c.c();
            int i10 = this.f57612z;
            if (i10 == 0) {
                wn.m.b(obj);
                C0937b c0937b = new C0937b(d0.this, new a(d0.this, (y) this.A));
                d0Var = d0.this;
                jo.d0 d0Var4 = this.C;
                long j11 = this.D;
                m c11 = d0Var.c();
                long j12 = d0Var4.f38135w;
                float g10 = d0Var.g(d0Var.j(j11));
                this.A = d0Var;
                this.f57609w = d0Var;
                this.f57610x = d0Var4;
                this.f57611y = j12;
                this.f57612z = 1;
                obj = c11.a(c0937b, g10, this);
                if (obj == c10) {
                    return c10;
                }
                d0Var2 = d0Var4;
                d0Var3 = d0Var;
                j10 = j12;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                j10 = this.f57611y;
                d0Var2 = (jo.d0) this.f57610x;
                d0Var = (d0) this.f57609w;
                d0Var3 = (d0) this.A;
                wn.m.b(obj);
            }
            d0Var2.f38135w = d0Var.n(j10, d0Var3.g(((Number) obj).floatValue()));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {378, 383, 385, 387, 393}, m = "onDragStopped")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f57617w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57618x;

        /* renamed from: y  reason: collision with root package name */
        public float f57619y;

        /* renamed from: z  reason: collision with root package name */
        public long f57620z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return d0.this.e(0.0f, this);
        }
    }

    public d0(q qVar, boolean z10, c2<m1.b> c2Var, b0 b0Var, m mVar, i0 i0Var) {
        jo.p.h(qVar, "orientation");
        jo.p.h(c2Var, "nestedScrollDispatcher");
        jo.p.h(b0Var, "scrollableState");
        jo.p.h(mVar, "flingBehavior");
        this.f57599a = qVar;
        this.f57600b = z10;
        this.f57601c = c2Var;
        this.f57602d = b0Var;
        this.f57603e = mVar;
        this.f57604f = i0Var;
    }

    public final long a(y yVar, long j10, b1.f fVar, int i10) {
        long c10;
        jo.p.h(yVar, "$this$dispatchScroll");
        i0 i0Var = this.f57604f;
        if (i0Var != null && i0Var.isEnabled()) {
            c10 = this.f57604f.f(j10, fVar, i10);
        } else {
            c10 = b1.f.f16721b.c();
        }
        long q10 = b1.f.q(j10, c10);
        m1.b value = this.f57601c.getValue();
        long q11 = b1.f.q(q10, value.d(q10, i10));
        long h10 = h(l(yVar.a(k(h(q11)))));
        long q12 = b1.f.q(q11, h10);
        long b10 = value.b(h10, q12, i10);
        i0 i0Var2 = this.f57604f;
        if (i0Var2 != null && i0Var2.isEnabled()) {
            this.f57604f.a(q11, b1.f.q(q12, b10), fVar, i10);
        }
        return q12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r13, ao.d<? super m2.u> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof w.d0.a
            if (r0 == 0) goto L13
            r0 = r15
            w.d0$a r0 = (w.d0.a) r0
            int r1 = r0.f57608z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57608z = r1
            goto L18
        L13:
            w.d0$a r0 = new w.d0$a
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.f57606x
            java.lang.Object r0 = bo.c.c()
            int r1 = r4.f57608z
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.f57605w
            jo.d0 r13 = (jo.d0) r13
            wn.m.b(r15)
            goto L5d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            wn.m.b(r15)
            jo.d0 r15 = new jo.d0
            r15.<init>()
            r15.f38135w = r13
            w.b0 r1 = r12.f57602d
            r3 = 0
            w.d0$b r11 = new w.d0$b
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f57605w = r15
            r4.f57608z = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = w.b0.b(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            return r0
        L5c:
            r13 = r15
        L5d:
            long r13 = r13.f38135w
            m2.u r13 = m2.u.b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d0.b(long, ao.d):java.lang.Object");
    }

    public final m c() {
        return this.f57603e;
    }

    public final b0 d() {
        return this.f57602d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r13, ao.d<? super wn.v> r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d0.e(float, ao.d):java.lang.Object");
    }

    public final long f(long j10) {
        if (this.f57602d.c()) {
            return b1.f.f16721b.c();
        }
        return l(g(this.f57602d.d(g(k(j10)))));
    }

    public final float g(float f10) {
        return this.f57600b ? f10 * (-1) : f10;
    }

    public final long h(long j10) {
        return this.f57600b ? b1.f.s(j10, -1.0f) : j10;
    }

    public final boolean i() {
        if (!this.f57602d.c()) {
            i0 i0Var = this.f57604f;
            if (!(i0Var != null ? i0Var.c() : false)) {
                return false;
            }
        }
        return true;
    }

    public final float j(long j10) {
        return this.f57599a == q.Horizontal ? m2.u.h(j10) : m2.u.i(j10);
    }

    public final float k(long j10) {
        return this.f57599a == q.Horizontal ? b1.f.m(j10) : b1.f.n(j10);
    }

    public final long l(float f10) {
        if (f10 == 0.0f) {
            return b1.f.f16721b.c();
        }
        return this.f57599a == q.Horizontal ? b1.g.a(f10, 0.0f) : b1.g.a(0.0f, f10);
    }

    public final long m(float f10) {
        return this.f57599a == q.Horizontal ? m2.v.a(f10, 0.0f) : m2.v.a(0.0f, f10);
    }

    public final long n(long j10, float f10) {
        return this.f57599a == q.Horizontal ? m2.u.e(j10, f10, 0.0f, 2, null) : m2.u.e(j10, 0.0f, f10, 1, null);
    }
}
