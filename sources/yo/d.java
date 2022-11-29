package yo;

import java.util.ArrayList;
import uo.q0;
import uo.r0;
import uo.s0;
import uo.u0;
import uo.v0;
import xn.a0;

/* loaded from: classes4.dex */
public abstract class d<T> implements n<T> {

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f62081w;

    /* renamed from: x  reason: collision with root package name */
    public final int f62082x;

    /* renamed from: y  reason: collision with root package name */
    public final wo.h f62083y;

    @co.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62084w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f62085x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xo.d<T> f62086y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ d<T> f62087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xo.d<? super T> dVar, d<T> dVar2, ao.d<? super a> dVar3) {
            super(2, dVar3);
            this.f62086y = dVar;
            this.f62087z = dVar2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f62086y, this.f62087z, dVar);
            aVar.f62085x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62084w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.d<T> dVar = this.f62086y;
                wo.x<T> n10 = this.f62087z.n((q0) this.f62085x);
                this.f62084w = 1;
                if (xo.e.m(dVar, n10, this) == c10) {
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

    @co.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends co.l implements io.p<wo.v<? super T>, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62088w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f62089x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d<T> f62090y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<T> dVar, ao.d<? super b> dVar2) {
            super(2, dVar2);
            this.f62090y = dVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(wo.v<? super T> vVar, ao.d<? super wn.v> dVar) {
            return ((b) create(vVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f62090y, dVar);
            bVar.f62089x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62088w;
            if (i10 == 0) {
                wn.m.b(obj);
                d<T> dVar = this.f62090y;
                this.f62088w = 1;
                if (dVar.i((wo.v) this.f62089x, this) == c10) {
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

    public d(ao.g gVar, int i10, wo.h hVar) {
        this.f62081w = gVar;
        this.f62082x = i10;
        this.f62083y = hVar;
        if (u0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
    }

    public static /* synthetic */ Object h(d dVar, xo.d dVar2, ao.d dVar3) {
        Object e10 = r0.e(new a(dVar2, dVar, null), dVar3);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    @Override // xo.c
    public Object a(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
        return h(this, dVar, dVar2);
    }

    @Override // yo.n
    public xo.c<T> d(ao.g gVar, int i10, wo.h hVar) {
        if (u0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        ao.g plus = gVar.plus(this.f62081w);
        if (hVar == wo.h.SUSPEND) {
            int i11 = this.f62082x;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            if (u0.a()) {
                                if (!(this.f62082x >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (u0.a()) {
                                if (!(i10 >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            i11 = this.f62082x + i10;
                            if (i11 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            hVar = this.f62083y;
        }
        return (jo.p.c(plus, this.f62081w) && i10 == this.f62082x && hVar == this.f62083y) ? this : j(plus, i10, hVar);
    }

    public String g() {
        return null;
    }

    public abstract Object i(wo.v<? super T> vVar, ao.d<? super wn.v> dVar);

    public abstract d<T> j(ao.g gVar, int i10, wo.h hVar);

    public xo.c<T> k() {
        return null;
    }

    public final io.p<wo.v<? super T>, ao.d<? super wn.v>, Object> l() {
        return new b(this, null);
    }

    public final int m() {
        int i10 = this.f62082x;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public wo.x<T> n(q0 q0Var) {
        return wo.t.b(q0Var, this.f62081w, m(), this.f62083y, s0.ATOMIC, null, l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g10 = g();
        if (g10 != null) {
            arrayList.add(g10);
        }
        ao.g gVar = this.f62081w;
        if (gVar != ao.h.f16651w) {
            arrayList.add(jo.p.o("context=", gVar));
        }
        int i10 = this.f62082x;
        if (i10 != -3) {
            arrayList.add(jo.p.o("capacity=", Integer.valueOf(i10)));
        }
        wo.h hVar = this.f62083y;
        if (hVar != wo.h.SUSPEND) {
            arrayList.add(jo.p.o("onBufferOverflow=", hVar));
        }
        return v0.a(this) + '[' + a0.g0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
