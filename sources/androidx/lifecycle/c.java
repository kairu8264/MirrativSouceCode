package androidx.lifecycle;

import uo.b1;
import uo.d2;
import uo.g1;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f15509a;

    /* renamed from: b  reason: collision with root package name */
    public final io.p<a0<T>, ao.d<? super wn.v>, Object> f15510b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15511c;

    /* renamed from: d  reason: collision with root package name */
    public final uo.q0 f15512d;

    /* renamed from: e  reason: collision with root package name */
    public final io.a<wn.v> f15513e;

    /* renamed from: f  reason: collision with root package name */
    public d2 f15514f;

    /* renamed from: g  reason: collision with root package name */
    public d2 f15515g;

    @co.f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f15516w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c<T> f15517x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f15517x = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f15517x, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f15516w;
            if (i10 == 0) {
                wn.m.b(obj);
                long j10 = this.f15517x.f15511c;
                this.f15516w = 1;
                if (b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            if (!this.f15517x.f15509a.h()) {
                d2 d2Var = this.f15517x.f15514f;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                this.f15517x.f15514f = null;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f15518w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f15519x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c<T> f15520y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c<T> cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f15520y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f15520y, dVar);
            bVar.f15519x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f15518w;
            if (i10 == 0) {
                wn.m.b(obj);
                b0 b0Var = new b0(this.f15520y.f15509a, ((uo.q0) this.f15519x).getCoroutineContext());
                io.p pVar = this.f15520y.f15510b;
                this.f15518w = 1;
                if (pVar.invoke(b0Var, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f15520y.f15513e.invoke();
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(f<T> fVar, io.p<? super a0<T>, ? super ao.d<? super wn.v>, ? extends Object> pVar, long j10, uo.q0 q0Var, io.a<wn.v> aVar) {
        jo.p.h(fVar, "liveData");
        jo.p.h(pVar, "block");
        jo.p.h(q0Var, "scope");
        jo.p.h(aVar, "onDone");
        this.f15509a = fVar;
        this.f15510b = pVar;
        this.f15511c = j10;
        this.f15512d = q0Var;
        this.f15513e = aVar;
    }

    public final void g() {
        d2 d10;
        if (this.f15515g == null) {
            d10 = uo.l.d(this.f15512d, g1.c().h0(), null, new a(this, null), 2, null);
            this.f15515g = d10;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    public final void h() {
        d2 d10;
        d2 d2Var = this.f15515g;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f15515g = null;
        if (this.f15514f != null) {
            return;
        }
        d10 = uo.l.d(this.f15512d, null, null, new b(this, null), 3, null);
        this.f15514f = d10;
    }
}
