package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.s0;
import uo.r0;

/* loaded from: classes3.dex */
public final class a0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final androidx.lifecycle.e0<String> C;
    public final LiveData<String> D;
    public final s0<List<UrgeUser>> E;
    public final wo.f<MRError> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42389y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42390z;

    @co.f(c = "com.dena.mirrorman.store.ProfileUserListStore$on$1", f = "ProfileUserListStore.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42391w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42391w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = a0.this.E;
                List k10 = xn.s.k();
                this.f42391w = 1;
                if (s0Var.d(k10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.ProfileUserListStore$on$2", f = "ProfileUserListStore.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42393w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0.b f42395y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0.b bVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42395y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42395y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42393w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = a0.this.E;
                List o02 = xn.a0.o0(a0.this.i(), this.f42395y.a().getUsers());
                this.f42393w = 1;
                if (s0Var.d(o02, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.ProfileUserListStore$on$3", f = "ProfileUserListStore.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42396w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0.a f42398y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s0.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42398y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42398y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42396w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = a0.this.F;
                MRError a10 = this.f42398y.a();
                this.f42396w = 1;
                if (fVar.r(a10, this) == c10) {
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

    public a0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42389y = aVar;
        this.f42390z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<String> e0Var2 = new androidx.lifecycle.e0<>("");
        this.C = e0Var2;
        this.D = e0Var2;
        this.E = new nd.s0<>();
        this.F = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42389y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42390z.getCoroutineContext();
    }

    public final List<UrgeUser> i() {
        List<UrgeUser> b10 = this.E.b();
        return b10 == null ? xn.s.k() : b10;
    }

    public final wo.x<List<UrgeUser>> j() {
        return this.E.c();
    }

    public final LiveData<String> k() {
        return this.D;
    }

    public final LiveData<Boolean> l() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s0.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.TRUE);
        this.C.p("");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s0.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s0.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(Boolean.FALSE);
        this.C.p(bVar.a().getNextCursor());
        uo.l.d(this, null, null, new b(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s0.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(Boolean.FALSE);
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }
}
