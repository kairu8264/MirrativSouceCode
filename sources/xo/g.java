package xo;

/* loaded from: classes4.dex */
public final /* synthetic */ class g {

    /* loaded from: classes4.dex */
    public static final class a implements c<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ wo.f f60501w;

        public a(wo.f fVar) {
            this.f60501w = fVar;
        }

        @Override // xo.c
        public Object a(d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            Object m10 = e.m(dVar, this.f60501w.g(), dVar2);
            return m10 == bo.c.c() ? m10 : wn.v.f59242a;
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* loaded from: classes4.dex */
    public static final class b<T> extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f60502w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60503x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f60504y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f60505z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f60505z = obj;
            this.A |= Integer.MIN_VALUE;
            return g.d(null, null, false, this);
        }
    }

    public static final <T> c<T> b(wo.f<T> fVar) {
        return new a(fVar);
    }

    public static final <T> Object c(d<? super T> dVar, wo.x<? extends T> xVar, ao.d<? super wn.v> dVar2) {
        Object d10 = d(dVar, xVar, true, dVar2);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(xo.d<? super T> r7, wo.x<? extends T> r8, boolean r9, ao.d<? super wn.v> r10) {
        /*
            boolean r0 = r10 instanceof xo.g.b
            if (r0 == 0) goto L13
            r0 = r10
            xo.g$b r0 = (xo.g.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xo.g$b r0 = new xo.g$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f60505z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.f60504y
            java.lang.Object r8 = r0.f60503x
            wo.x r8 = (wo.x) r8
            java.lang.Object r9 = r0.f60502w
            xo.d r9 = (xo.d) r9
            wn.m.b(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.f60504y
            java.lang.Object r8 = r0.f60503x
            wo.x r8 = (wo.x) r8
            java.lang.Object r9 = r0.f60502w
            xo.d r9 = (xo.d) r9
            wn.m.b(r10)     // Catch: java.lang.Throwable -> L55
            wo.m r10 = (wo.m) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.l()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9c
        L57:
            wn.m.b(r10)
            xo.e.n(r7)
        L5d:
            r0.f60502w = r7     // Catch: java.lang.Throwable -> L98
            r0.f60503x = r8     // Catch: java.lang.Throwable -> L98
            r0.f60504y = r9     // Catch: java.lang.Throwable -> L98
            r0.A = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r8.f(r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = wo.m.i(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = wo.m.e(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            wo.n.a(r8, r2)
        L81:
            wn.v r7 = wn.v.f59242a
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r10 = wo.m.g(r10)     // Catch: java.lang.Throwable -> L55
            r0.f60502w = r9     // Catch: java.lang.Throwable -> L55
            r0.f60503x = r8     // Catch: java.lang.Throwable -> L55
            r0.f60504y = r7     // Catch: java.lang.Throwable -> L55
            r0.A = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L98:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r7 == 0) goto La3
            wo.n.a(r8, r9)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.g.d(xo.d, wo.x, boolean, ao.d):java.lang.Object");
    }
}
