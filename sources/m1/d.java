package m1;

import jo.p;
import jo.q;
import l0.s0;
import l0.z1;
import uo.q0;

/* loaded from: classes.dex */
public final class d implements r1.b, r1.d<d>, m1.a {

    /* renamed from: w  reason: collision with root package name */
    public final m1.b f40491w;

    /* renamed from: x  reason: collision with root package name */
    public final m1.a f40492x;

    /* renamed from: y  reason: collision with root package name */
    public final s0 f40493y;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<q0> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final q0 invoke() {
            return d.this.l();
        }
    }

    @co.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {94, 96}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class b extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f40495w;

        /* renamed from: x  reason: collision with root package name */
        public long f40496x;

        /* renamed from: y  reason: collision with root package name */
        public long f40497y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f40498z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f40498z = obj;
            this.B |= Integer.MIN_VALUE;
            return d.this.b(0L, 0L, this);
        }
    }

    @co.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {88, 89}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f40499w;

        /* renamed from: x  reason: collision with root package name */
        public long f40500x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f40501y;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f40501y = obj;
            this.A |= Integer.MIN_VALUE;
            return d.this.f(0L, this);
        }
    }

    public d(m1.b bVar, m1.a aVar) {
        s0 e10;
        p.h(bVar, "dispatcher");
        p.h(aVar, "connection");
        this.f40491w = bVar;
        this.f40492x = aVar;
        bVar.g(new a());
        e10 = z1.e(null, null, 2, null);
        this.f40493y = e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // m1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(long r16, long r18, ao.d<? super m2.u> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof m1.d.b
            if (r2 == 0) goto L16
            r2 = r1
            m1.d$b r2 = (m1.d.b) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.B = r3
            goto L1b
        L16:
            m1.d$b r2 = new m1.d$b
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f40498z
            java.lang.Object r9 = bo.c.c()
            int r3 = r2.B
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f40496x
            wn.m.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f40497y
            long r5 = r2.f40496x
            java.lang.Object r7 = r2.f40495w
            m1.d r7 = (m1.d) r7
            wn.m.b(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            wn.m.b(r1)
            m1.a r3 = r0.f40492x
            r2.f40495w = r0
            r11 = r16
            r2.f40496x = r11
            r13 = r18
            r2.f40497y = r13
            r2.B = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.b(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            m2.u r1 = (m2.u) r1
            long r4 = r1.n()
            m1.d r3 = r7.m()
            if (r3 == 0) goto L94
            long r6 = m2.u.l(r11, r4)
            long r11 = m2.u.k(r13, r4)
            r1 = 0
            r2.f40495w = r1
            r2.f40496x = r4
            r2.B = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.b(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            m2.u r1 = (m2.u) r1
            long r4 = r1.n()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            m2.u$a r1 = m2.u.f40549b
            long r4 = r1.a()
        L9b:
            long r1 = m2.u.l(r13, r4)
            m2.u r1 = m2.u.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.d.b(long, long, ao.d):java.lang.Object");
    }

    @Override // m1.a
    public long c(long j10, long j11, int i10) {
        long c10 = this.f40492x.c(j10, j11, i10);
        d m10 = m();
        return b1.f.r(c10, m10 != null ? m10.c(b1.f.r(j10, c10), b1.f.q(j11, c10), i10) : b1.f.f16721b.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    @Override // m1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(long r9, ao.d<? super m2.u> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof m1.d.c
            if (r0 == 0) goto L13
            r0 = r11
            m1.d$c r0 = (m1.d.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            m1.d$c r0 = new m1.d$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f40501y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f40500x
            wn.m.b(r11)
            goto L7c
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f40500x
            java.lang.Object r2 = r0.f40499w
            m1.d r2 = (m1.d) r2
            wn.m.b(r11)
            goto L57
        L40:
            wn.m.b(r11)
            m1.d r11 = r8.m()
            if (r11 == 0) goto L5e
            r0.f40499w = r8
            r0.f40500x = r9
            r0.A = r4
            java.lang.Object r11 = r11.f(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            m2.u r11 = (m2.u) r11
            long r4 = r11.n()
            goto L65
        L5e:
            m2.u$a r11 = m2.u.f40549b
            long r4 = r11.a()
            r2 = r8
        L65:
            r6 = r9
            r9 = r4
            r4 = r6
            m1.a r11 = r2.f40492x
            long r4 = m2.u.k(r4, r9)
            r2 = 0
            r0.f40499w = r2
            r0.f40500x = r9
            r0.A = r3
            java.lang.Object r11 = r11.f(r4, r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            m2.u r11 = (m2.u) r11
            long r0 = r11.n()
            long r9 = m2.u.l(r9, r0)
            m2.u r9 = m2.u.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.d.f(long, ao.d):java.lang.Object");
    }

    @Override // m1.a
    public long g(long j10, int i10) {
        d m10 = m();
        long g10 = m10 != null ? m10.g(j10, i10) : b1.f.f16721b.c();
        return b1.f.r(g10, this.f40492x.g(b1.f.q(j10, g10), i10));
    }

    @Override // r1.d
    public r1.f<d> getKey() {
        return e.a();
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        p.h(eVar, "scope");
        p((d) eVar.a(e.a()));
        this.f40491w.i(m());
    }

    public final q0 l() {
        q0 f10;
        d m10 = m();
        if ((m10 == null || (f10 = m10.l()) == null) && (f10 = this.f40491w.f()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return f10;
    }

    public final d m() {
        return (d) this.f40493y.getValue();
    }

    @Override // r1.d
    /* renamed from: n */
    public d getValue() {
        return this;
    }

    public final void p(d dVar) {
        this.f40493y.setValue(dVar);
    }
}
