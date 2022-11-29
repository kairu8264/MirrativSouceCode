package xo;

/* loaded from: classes4.dex */
public abstract class a<T> implements c<T> {

    @co.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: xo.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1014a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f60463w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60464x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a<T> f60465y;

        /* renamed from: z  reason: collision with root package name */
        public int f60466z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1014a(a<T> aVar, ao.d<? super C1014a> dVar) {
            super(dVar);
            this.f60465y = aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f60464x = obj;
            this.f60466z |= Integer.MIN_VALUE;
            return this.f60465y.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // xo.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xo.d<? super T> r6, ao.d<? super wn.v> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xo.a.C1014a
            if (r0 == 0) goto L13
            r0 = r7
            xo.a$a r0 = (xo.a.C1014a) r0
            int r1 = r0.f60466z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60466z = r1
            goto L18
        L13:
            xo.a$a r0 = new xo.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f60464x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f60466z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f60463w
            yo.r r6 = (yo.r) r6
            wn.m.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            wn.m.b(r7)
            yo.r r7 = new yo.r
            ao.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f60463w = r7     // Catch: java.lang.Throwable -> L55
            r0.f60466z = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.g(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            wn.v r6 = wn.v.f59242a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.a.a(xo.d, ao.d):java.lang.Object");
    }

    public abstract Object g(d<? super T> dVar, ao.d<? super wn.v> dVar2);
}
