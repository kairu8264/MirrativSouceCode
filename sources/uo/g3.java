package uo;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes4.dex */
public final class g3 {

    @co.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
    /* loaded from: classes4.dex */
    public static final class a<T> extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public long f56022w;

        /* renamed from: x  reason: collision with root package name */
        public Object f56023x;

        /* renamed from: y  reason: collision with root package name */
        public Object f56024y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f56025z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f56025z = obj;
            this.A |= Integer.MIN_VALUE;
            return g3.d(0L, null, this);
        }
    }

    public static final TimeoutCancellationException a(long j10, d2 d2Var) {
        return new TimeoutCancellationException("Timed out waiting for " + j10 + " ms", d2Var);
    }

    public static final <U, T extends U> Object b(f3<U, ? super T> f3Var, io.p<? super q0, ? super ao.d<? super T>, ? extends Object> pVar) {
        g2.i(f3Var, b1.b(f3Var.f63289y.getContext()).d(f3Var.f56017z, f3Var, f3Var.getContext()));
        return ap.b.d(f3Var, f3Var, pVar);
    }

    public static final <T> Object c(long j10, io.p<? super q0, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        if (j10 > 0) {
            Object b10 = b(new f3(j10, dVar), pVar);
            if (b10 == bo.c.c()) {
                co.h.c(dVar);
            }
            return b10;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [uo.f3, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(long r7, io.p<? super uo.q0, ? super ao.d<? super T>, ? extends java.lang.Object> r9, ao.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof uo.g3.a
            if (r0 == 0) goto L13
            r0 = r10
            uo.g3$a r0 = (uo.g3.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            uo.g3$a r0 = new uo.g3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f56025z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f56024y
            jo.e0 r7 = (jo.e0) r7
            java.lang.Object r8 = r0.f56023x
            io.p r8 = (io.p) r8
            wn.m.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            wn.m.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            jo.e0 r10 = new jo.e0
            r10.<init>()
            r0.f56023x = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f56024y = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f56022w = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.A = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            uo.f3 r2 = new uo.f3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r10.f38136w = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r8 = bo.c.c()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            if (r7 != r8) goto L67
            co.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            uo.d2 r9 = r8.f38909w
            T r7 = r7.f38136w
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.g3.d(long, io.p, ao.d):java.lang.Object");
    }
}
