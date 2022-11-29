package w;

import uo.q0;
import uo.r0;

/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<Float, wn.v> f57591a;

    /* renamed from: b  reason: collision with root package name */
    public final j f57592b;

    /* renamed from: c  reason: collision with root package name */
    public final v.e0 f57593c;

    @co.f(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {427}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57594w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v.d0 f57596y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<j, ao.d<? super wn.v>, Object> f57597z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(v.d0 d0Var, io.p<? super j, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f57596y = d0Var;
            this.f57597z = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f57596y, this.f57597z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57594w;
            if (i10 == 0) {
                wn.m.b(obj);
                v.e0 e0Var = d.this.f57593c;
                j jVar = d.this.f57592b;
                v.d0 d0Var = this.f57596y;
                io.p<j, ao.d<? super wn.v>, Object> pVar = this.f57597z;
                this.f57594w = 1;
                if (e0Var.f(jVar, d0Var, pVar, this) == c10) {
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
    public static final class b implements j {
        public b() {
        }

        @Override // w.j
        public void a(float f10) {
            d.this.e().invoke(Float.valueOf(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(io.l<? super Float, wn.v> lVar) {
        jo.p.h(lVar, "onDelta");
        this.f57591a = lVar;
        this.f57592b = new b();
        this.f57593c = new v.e0();
    }

    @Override // w.l
    public Object a(v.d0 d0Var, io.p<? super j, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        Object e10 = r0.e(new a(d0Var, pVar, null), dVar);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    public final io.l<Float, wn.v> e() {
        return this.f57591a;
    }
}
