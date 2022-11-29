package androidx.lifecycle;

import uo.b3;
import uo.d2;
import uo.g1;

/* loaded from: classes.dex */
public final class f<T> extends c0<T> {

    /* renamed from: m  reason: collision with root package name */
    public c<T> f15534m;

    /* renamed from: n  reason: collision with root package name */
    public j f15535n;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f<T> f15536w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<T> fVar) {
            super(0);
            this.f15536w = fVar;
        }

        public final void a() {
            this.f15536w.f15534m = null;
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {234}, m = "clearSource$lifecycle_livedata_ktx_release")
    /* loaded from: classes.dex */
    public static final class b extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f15537w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f15538x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f<T> f15539y;

        /* renamed from: z  reason: collision with root package name */
        public int f15540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f<T> fVar, ao.d<? super b> dVar) {
            super(dVar);
            this.f15539y = fVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f15538x = obj;
            this.f15540z |= Integer.MIN_VALUE;
            return this.f15539y.s(this);
        }
    }

    public f(ao.g gVar, long j10, io.p<? super a0<T>, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        jo.p.h(gVar, "context");
        jo.p.h(pVar, "block");
        this.f15534m = new c<>(this, pVar, j10, uo.r0.a(g1.c().h0().plus(gVar).plus(b3.a((d2) gVar.get(d2.f56001s)))), new a(this));
    }

    @Override // androidx.lifecycle.c0, androidx.lifecycle.LiveData
    public void k() {
        super.k();
        c<T> cVar = this.f15534m;
        if (cVar == null) {
            return;
        }
        cVar.h();
    }

    @Override // androidx.lifecycle.c0, androidx.lifecycle.LiveData
    public void l() {
        super.l();
        c<T> cVar = this.f15534m;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(ao.d<? super wn.v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.f.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.f.b) r0
            int r1 = r0.f15540z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15540z = r1
            goto L18
        L13:
            androidx.lifecycle.f$b r0 = new androidx.lifecycle.f$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f15538x
            bo.c.c()
            int r1 = r0.f15540z
            if (r1 == 0) goto L34
            r2 = 1
            if (r1 != r2) goto L2c
            java.lang.Object r0 = r0.f15537w
            androidx.lifecycle.f r0 = (androidx.lifecycle.f) r0
            wn.m.b(r5)
            goto L38
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            wn.m.b(r5)
            r0 = r4
        L38:
            r5 = 0
            r0.f15535n = r5
            wn.v r5 = wn.v.f59242a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.s(ao.d):java.lang.Object");
    }
}
