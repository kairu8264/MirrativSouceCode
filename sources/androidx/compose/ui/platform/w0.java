package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f14672a = new w0();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f14673b = new AtomicBoolean(false);

    @co.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f14674w;

        /* renamed from: x  reason: collision with root package name */
        public Object f14675x;

        /* renamed from: y  reason: collision with root package name */
        public int f14676y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ wo.i<wn.v> f14677z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wo.i<wn.v> iVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f14677z = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f14677z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x0042, B:19:0x004a), top: B:30:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:16:0x0041). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f14676y
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f14675x
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r7.f14674w
                wo.x r3 = (wo.x) r3
                wn.m.b(r8)     // Catch: java.lang.Throwable -> L63
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L41
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                wn.m.b(r8)
                wo.i<wn.v> r3 = r7.f14677z
                wo.k r8 = r3.iterator()     // Catch: java.lang.Throwable -> L63
                r1 = r8
                r8 = r7
            L2e:
                r8.f14674w = r3     // Catch: java.lang.Throwable -> L63
                r8.f14675x = r1     // Catch: java.lang.Throwable -> L63
                r8.f14676y = r2     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L63
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r6
            L41:
                r5 = 0
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L60
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L60
                if (r8 == 0) goto L5a
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L60
                wn.v r8 = (wn.v) r8     // Catch: java.lang.Throwable -> L60
                v0.h$a r8 = v0.h.f56484e     // Catch: java.lang.Throwable -> L60
                r8.g()     // Catch: java.lang.Throwable -> L60
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L5a:
                wo.n.a(r4, r5)
                wn.v r8 = wn.v.f59242a
                return r8
            L60:
                r8 = move-exception
                r3 = r4
                goto L64
            L63:
                r8 = move-exception
            L64:
                throw r8     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                wo.n.a(r3, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.w0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ wo.i<wn.v> f14678w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wo.i<wn.v> iVar) {
            super(1);
            this.f14678w = iVar;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "it");
            this.f14678w.l(wn.v.f59242a);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    public final void a() {
        if (f14673b.compareAndSet(false, true)) {
            wo.i b10 = wo.l.b(-1, null, null, 6, null);
            uo.l.d(uo.r0.a(c0.H.b()), null, null, new a(b10, null), 3, null);
            v0.h.f56484e.f(new b(b10));
        }
    }
}
