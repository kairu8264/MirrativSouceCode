package w;

import l0.s0;
import l0.z1;
import uo.q0;
import uo.r0;

/* loaded from: classes.dex */
public final class f implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<Float, Float> f57683a;

    /* renamed from: b  reason: collision with root package name */
    public final y f57684b;

    /* renamed from: c  reason: collision with root package name */
    public final v.e0 f57685c;

    /* renamed from: d  reason: collision with root package name */
    public final s0<Boolean> f57686d;

    @co.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {147}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57687w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v.d0 f57689y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<y, ao.d<? super wn.v>, Object> f57690z;

        @co.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {150}, m = "invokeSuspend")
        /* renamed from: w.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0942a extends co.l implements io.p<y, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57691w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f57692x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ f f57693y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.p<y, ao.d<? super wn.v>, Object> f57694z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0942a(f fVar, io.p<? super y, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super C0942a> dVar) {
                super(2, dVar);
                this.f57693y = fVar;
                this.f57694z = pVar;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(y yVar, ao.d<? super wn.v> dVar) {
                return ((C0942a) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                C0942a c0942a = new C0942a(this.f57693y, this.f57694z, dVar);
                c0942a.f57692x = obj;
                return c0942a;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57691w;
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        y yVar = (y) this.f57692x;
                        this.f57693y.f57686d.setValue(co.b.a(true));
                        io.p<y, ao.d<? super wn.v>, Object> pVar = this.f57694z;
                        this.f57691w = 1;
                        if (pVar.invoke(yVar, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    this.f57693y.f57686d.setValue(co.b.a(false));
                    return wn.v.f59242a;
                } catch (Throwable th2) {
                    this.f57693y.f57686d.setValue(co.b.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(v.d0 d0Var, io.p<? super y, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f57689y = d0Var;
            this.f57690z = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f57689y, this.f57690z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57687w;
            if (i10 == 0) {
                wn.m.b(obj);
                v.e0 e0Var = f.this.f57685c;
                y yVar = f.this.f57684b;
                v.d0 d0Var = this.f57689y;
                C0942a c0942a = new C0942a(f.this, this.f57690z, null);
                this.f57687w = 1;
                if (e0Var.f(yVar, d0Var, c0942a, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class b implements y {
        public b() {
        }

        @Override // w.y
        public float a(float f10) {
            return f.this.h().invoke(Float.valueOf(f10)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(io.l<? super Float, Float> lVar) {
        s0<Boolean> e10;
        jo.p.h(lVar, "onDelta");
        this.f57683a = lVar;
        this.f57684b = new b();
        this.f57685c = new v.e0();
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f57686d = e10;
    }

    @Override // w.b0
    public Object a(v.d0 d0Var, io.p<? super y, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        Object e10 = r0.e(new a(d0Var, pVar, null), dVar);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    @Override // w.b0
    public boolean c() {
        return this.f57686d.getValue().booleanValue();
    }

    @Override // w.b0
    public float d(float f10) {
        return this.f57683a.invoke(Float.valueOf(f10)).floatValue();
    }

    public final io.l<Float, Float> h() {
        return this.f57683a;
    }
}
