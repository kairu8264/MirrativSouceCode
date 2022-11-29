package la;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import io.p;
import la.b;
import org.greenrobot.eventbus.ThreadMode;
import pd.a0;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;
import wn.m;
import wn.v;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class g extends q0 implements uo.q0 {
    public final ao.g A;
    public final e0<Boolean> B;
    public final LiveData<Boolean> C;
    public final r<LiveGameStartResponse> D;
    public final w<LiveGameStartResponse> E;
    public final r<MRError> F;
    public final w<MRError> G;
    public final r<v> H;
    public final r<v> I;

    /* renamed from: y  reason: collision with root package name */
    public final String f39765y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f39766z;

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailStore$on$1", f = "LiveGameDetailStore.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39767w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.C0571b f39769y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.C0571b c0571b, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f39769y = c0571b;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f39769y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39767w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = g.this.D;
                LiveGameStartResponse a10 = this.f39769y.a();
                this.f39767w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailStore$on$2", f = "LiveGameDetailStore.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39770w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f39772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f39772y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f39772y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39770w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = g.this.F;
                MRError a10 = this.f39772y.a();
                this.f39770w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailStore$on$3", f = "LiveGameDetailStore.kt", l = {81}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39773w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39773w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = g.this.H;
                v vVar = v.f59242a;
                this.f39773w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    public g(String str, q8.a aVar) {
        b0 b10;
        jo.p.h(str, "actionId");
        jo.p.h(aVar, "dispatcher");
        this.f39765y = str;
        this.f39766z = aVar;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.A = c10.plus(b10);
        e0<Boolean> e0Var = new e0<>(Boolean.FALSE);
        this.B = e0Var;
        this.C = e0Var;
        r<LiveGameStartResponse> b11 = y.b(0, 0, null, 7, null);
        this.D = b11;
        this.E = b11;
        r<MRError> b12 = y.b(0, 0, null, 7, null);
        this.F = b12;
        this.G = b12;
        r<v> b13 = y.b(0, 0, null, 7, null);
        this.H = b13;
        this.I = b13;
        aVar.b(this);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f39766z.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final w<MRError> i() {
        return this.G;
    }

    public final w<LiveGameStartResponse> j() {
        return this.E;
    }

    public final r<v> k() {
        return this.I;
    }

    public final LiveData<Boolean> l() {
        return this.C;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f39765y, fVar.a())) {
            this.B.p(Boolean.FALSE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f39765y, dVar.a()) && dVar.c().getList().isEmpty() && dVar.d()) {
            this.B.p(Boolean.TRUE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0571b c0571b) {
        jo.p.h(c0571b, "event");
        uo.l.d(this, null, null, new a(c0571b, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }
}
