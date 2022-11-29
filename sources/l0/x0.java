package l0;

import ao.g;
import l0.n0;

/* loaded from: classes.dex */
public final class x0 implements n0 {

    /* renamed from: w  reason: collision with root package name */
    public final n0 f39303w;

    /* renamed from: x  reason: collision with root package name */
    public final k0 f39304x;

    @co.f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* loaded from: classes.dex */
    public static final class a<R> extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f39305w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39306x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f39307y;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f39307y = obj;
            this.A |= Integer.MIN_VALUE;
            return x0.this.L(null, this);
        }
    }

    public x0(n0 n0Var) {
        jo.p.h(n0Var, "frameClock");
        this.f39303w = n0Var;
        this.f39304x = new k0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // l0.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object L(io.l<? super java.lang.Long, ? extends R> r6, ao.d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l0.x0.a
            if (r0 == 0) goto L13
            r0 = r7
            l0.x0$a r0 = (l0.x0.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            l0.x0$a r0 = new l0.x0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39307y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wn.m.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f39306x
            io.l r6 = (io.l) r6
            java.lang.Object r2 = r0.f39305w
            l0.x0 r2 = (l0.x0) r2
            wn.m.b(r7)
            goto L53
        L40:
            wn.m.b(r7)
            l0.k0 r7 = r5.f39304x
            r0.f39305w = r5
            r0.f39306x = r6
            r0.A = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            l0.n0 r7 = r2.f39303w
            r2 = 0
            r0.f39305w = r2
            r0.f39306x = r2
            r0.A = r3
            java.lang.Object r7 = r7.L(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.x0.L(io.l, ao.d):java.lang.Object");
    }

    public final void b() {
        this.f39304x.d();
    }

    public final void d() {
        this.f39304x.f();
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n0.a.a(this, r10, pVar);
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) n0.a.b(this, cVar);
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return n0.a.c(this, cVar);
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return n0.a.d(this, gVar);
    }
}
