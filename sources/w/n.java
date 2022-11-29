package w;

import java.util.List;

/* loaded from: classes.dex */
public final class n {

    @co.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {

        /* renamed from: x  reason: collision with root package name */
        public int f57826x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f57827y;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f57827y = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57826x;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f57826x = 1;
                if (n.b((n1.c) this.f57827y, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {79}, m = "awaitAllPointersUp")
    /* loaded from: classes.dex */
    public static final class b extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57828w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57829x;

        /* renamed from: y  reason: collision with root package name */
        public int f57830y;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57829x = obj;
            this.f57830y |= Integer.MIN_VALUE;
            return n.b(null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {41, 44, 49}, m = "forEachGesture")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f57831w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57832x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57833y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f57834z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57834z = obj;
            this.A |= Integer.MIN_VALUE;
            return n.d(null, null, this);
        }
    }

    public static final boolean a(n1.c cVar) {
        jo.p.h(cVar, "<this>");
        List<n1.w> c10 = cVar.o0().c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (c10.get(i10).g()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (a(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r8 = n1.o.Final;
        r0.f57828w = r7;
        r0.f57830y = 1;
        r8 = r7.t0(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        return wn.v.f59242a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(n1.c r7, ao.d<? super wn.v> r8) {
        /*
            boolean r0 = r8 instanceof w.n.b
            if (r0 == 0) goto L13
            r0 = r8
            w.n$b r0 = (w.n.b) r0
            int r1 = r0.f57830y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57830y = r1
            goto L18
        L13:
            w.n$b r0 = new w.n$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f57829x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f57830y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f57828w
            n1.c r7 = (n1.c) r7
            wn.m.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            wn.m.b(r8)
            boolean r8 = a(r7)
            if (r8 != 0) goto L6c
        L3e:
            n1.o r8 = n1.o.Final
            r0.f57828w = r7
            r0.f57830y = r3
            java.lang.Object r8 = r7.t0(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            n1.m r8 = (n1.m) r8
            java.util.List r8 = r8.c()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L57:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r8.get(r5)
            n1.w r6 = (n1.w) r6
            boolean r6 = r6.g()
            if (r6 == 0) goto L67
            r4 = r3
            goto L6a
        L67:
            int r5 = r5 + 1
            goto L57
        L6a:
            if (r4 != 0) goto L3e
        L6c:
            wn.v r7 = wn.v.f59242a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.b(n1.c, ao.d):java.lang.Object");
    }

    public static final Object c(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
        Object N = e0Var.N(new a(null), dVar);
        return N == bo.c.c() ? N : wn.v.f59242a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:37|38))(2:39|40)|13|14|(3:19|20|(1:22)(6:23|24|(1:26)|13|14|(2:16|17)(0)))(0))(7:41|42|24|(0)|13|14|(0)(0)))(3:43|14|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [n1.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [n1.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ao.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(n1.e0 r8, io.p<? super n1.e0, ? super ao.d<? super wn.v>, ? extends java.lang.Object> r9, ao.d<? super wn.v> r10) {
        /*
            boolean r0 = r10 instanceof w.n.c
            if (r0 == 0) goto L13
            r0 = r10
            w.n$c r0 = (w.n.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w.n$c r0 = new w.n$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f57834z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f57833y
            ao.g r8 = (ao.g) r8
            java.lang.Object r9 = r0.f57832x
            io.p r9 = (io.p) r9
            java.lang.Object r2 = r0.f57831w
            n1.e0 r2 = (n1.e0) r2
            wn.m.b(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.f57833y
            ao.g r8 = (ao.g) r8
            java.lang.Object r9 = r0.f57832x
            io.p r9 = (io.p) r9
            java.lang.Object r2 = r0.f57831w
            n1.e0 r2 = (n1.e0) r2
            wn.m.b(r10)     // Catch: java.util.concurrent.CancellationException -> L65
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            java.lang.Object r8 = r0.f57833y
            ao.g r8 = (ao.g) r8
            java.lang.Object r9 = r0.f57832x
            io.p r9 = (io.p) r9
            java.lang.Object r2 = r0.f57831w
            n1.e0 r2 = (n1.e0) r2
            wn.m.b(r10)     // Catch: java.util.concurrent.CancellationException -> L65
            goto L85
        L65:
            r10 = move-exception
            goto L99
        L67:
            wn.m.b(r10)
            ao.g r10 = r0.getContext()
        L6e:
            boolean r2 = uo.g2.m(r10)
            if (r2 == 0) goto Laf
            r0.f57831w = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f57832x = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f57833y = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.A = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            return r1
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.f57831w = r2     // Catch: java.util.concurrent.CancellationException -> L65
            r0.f57832x = r9     // Catch: java.util.concurrent.CancellationException -> L65
            r0.f57833y = r8     // Catch: java.util.concurrent.CancellationException -> L65
            r0.A = r4     // Catch: java.util.concurrent.CancellationException -> L65
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L65
            if (r10 != r1) goto L52
            return r1
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = uo.g2.m(r8)
            if (r6 == 0) goto Lae
            r0.f57831w = r2
            r0.f57832x = r9
            r0.f57833y = r8
            r0.A = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L52
            return r1
        Lae:
            throw r10
        Laf:
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.d(n1.e0, io.p, ao.d):java.lang.Object");
    }
}
