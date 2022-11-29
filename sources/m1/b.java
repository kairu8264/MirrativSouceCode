package m1;

import jo.p;
import jo.q;
import uo.q0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public io.a<? extends q0> f40477a = new a();

    /* renamed from: b  reason: collision with root package name */
    public q0 f40478b;

    /* renamed from: c  reason: collision with root package name */
    public m1.a f40479c;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<q0> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final q0 invoke() {
            return b.this.f();
        }
    }

    @co.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {217}, m = "dispatchPostFling-RZ2iAVY")
    /* renamed from: m1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0587b extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f40481w;

        /* renamed from: y  reason: collision with root package name */
        public int f40483y;

        public C0587b(ao.d<? super C0587b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f40481w = obj;
            this.f40483y |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    @co.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {202}, m = "dispatchPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class c extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f40484w;

        /* renamed from: y  reason: collision with root package name */
        public int f40486y;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f40484w = obj;
            this.f40486y |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, ao.d<? super m2.u> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof m1.b.C0587b
            if (r0 == 0) goto L13
            r0 = r12
            m1.b$b r0 = (m1.b.C0587b) r0
            int r1 = r0.f40483y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40483y = r1
            goto L18
        L13:
            m1.b$b r0 = new m1.b$b
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f40481w
            java.lang.Object r0 = bo.c.c()
            int r1 = r6.f40483y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            wn.m.b(r12)
            goto L44
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            wn.m.b(r12)
            m1.a r1 = r7.f40479c
            if (r1 == 0) goto L4b
            r6.f40483y = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b(r2, r4, r6)
            if (r12 != r0) goto L44
            return r0
        L44:
            m2.u r12 = (m2.u) r12
            long r8 = r12.n()
            goto L51
        L4b:
            m2.u$a r8 = m2.u.f40549b
            long r8 = r8.a()
        L51:
            m2.u r8 = m2.u.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.b.a(long, long, ao.d):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        m1.a aVar = this.f40479c;
        return aVar != null ? aVar.c(j10, j11, i10) : b1.f.f16721b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, ao.d<? super m2.u> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof m1.b.c
            if (r0 == 0) goto L13
            r0 = r7
            m1.b$c r0 = (m1.b.c) r0
            int r1 = r0.f40486y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40486y = r1
            goto L18
        L13:
            m1.b$c r0 = new m1.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f40484w
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f40486y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wn.m.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            wn.m.b(r7)
            m1.a r7 = r4.f40479c
            if (r7 == 0) goto L48
            r0.f40486y = r3
            java.lang.Object r7 = r7.f(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            m2.u r7 = (m2.u) r7
            long r5 = r7.n()
            goto L4e
        L48:
            m2.u$a r5 = m2.u.f40549b
            long r5 = r5.a()
        L4e:
            m2.u r5 = m2.u.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.b.c(long, ao.d):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        m1.a aVar = this.f40479c;
        return aVar != null ? aVar.g(j10, i10) : b1.f.f16721b.c();
    }

    public final q0 e() {
        q0 invoke = this.f40477a.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final q0 f() {
        return this.f40478b;
    }

    public final void g(io.a<? extends q0> aVar) {
        p.h(aVar, "<set-?>");
        this.f40477a = aVar;
    }

    public final void h(q0 q0Var) {
        this.f40478b = q0Var;
    }

    public final void i(m1.a aVar) {
        this.f40479c = aVar;
    }
}
