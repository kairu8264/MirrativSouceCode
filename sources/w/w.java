package w;

import l0.c2;

/* loaded from: classes.dex */
public final class w implements s, r {

    /* renamed from: a  reason: collision with root package name */
    public final c2<d0> f57852a;

    /* renamed from: b  reason: collision with root package name */
    public y f57853b;

    @co.f(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {445}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<y, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57854w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57855x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<r, ao.d<? super wn.v>, Object> f57857z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super r, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f57857z = pVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(y yVar, ao.d<? super wn.v> dVar) {
            return ((a) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f57857z, dVar);
            aVar.f57855x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57854w;
            if (i10 == 0) {
                wn.m.b(obj);
                w.this.c((y) this.f57855x);
                io.p<r, ao.d<? super wn.v>, Object> pVar = this.f57857z;
                w wVar = w.this;
                this.f57854w = 1;
                if (pVar.invoke(wVar, this) == c10) {
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

    public w(c2<d0> c2Var) {
        y yVar;
        jo.p.h(c2Var, "scrollLogic");
        this.f57852a = c2Var;
        yVar = a0.f57543a;
        this.f57853b = yVar;
    }

    @Override // w.s
    public Object a(v.d0 d0Var, io.p<? super r, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        Object a10 = this.f57852a.getValue().d().a(d0Var, new a(pVar, null), dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    @Override // w.r
    public void b(float f10, long j10) {
        d0 value = this.f57852a.getValue();
        value.a(this.f57853b, value.l(f10), b1.f.d(j10), m1.f.f40505a.a());
    }

    public final void c(y yVar) {
        jo.p.h(yVar, "<set-?>");
        this.f57853b = yVar;
    }
}
