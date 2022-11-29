package zb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import io.p;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.h;
import uo.r0;
import wn.m;
import wn.v;
import xn.a0;
import xn.s;

/* loaded from: classes2.dex */
public final class k extends q0 implements uo.q0 {
    public final e0<Boolean> A;
    public final LiveData<Boolean> B;
    public final e0<Integer> C;
    public final LiveData<Integer> D;
    public final e0<List<CollabInvitableUser>> E;
    public final LiveData<List<CollabInvitableUser>> F;
    public final wo.f<MRError> G;
    public final e0<Boolean> H;
    public final LiveData<Boolean> I;
    public final wo.f<CollabInvitableUser> J;
    public final wo.f<MRError> K;
    public final wo.f<v> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f63050y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f63051z;

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersStore$on$1", f = "CollabCandidateViewersStore.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63052w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63052w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = k.this.L;
                v vVar = v.f59242a;
                this.f63052w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersStore$on$2", f = "CollabCandidateViewersStore.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63054w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h.b f63056y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h.b bVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f63056y = bVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f63056y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63054w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = k.this.G;
                MRError a10 = this.f63056y.a();
                this.f63054w = 1;
                if (fVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersStore$on$3", f = "CollabCandidateViewersStore.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63057w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h.c f63059y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h.c cVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f63059y = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f63059y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63057w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = k.this.J;
                CollabInvitableUser b10 = this.f63059y.b();
                this.f63057w = 1;
                if (fVar.r(b10, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersStore$on$4", f = "CollabCandidateViewersStore.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63060w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h.a f63062y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h.a aVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f63062y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f63062y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63060w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = k.this.K;
                MRError a10 = this.f63062y.a();
                this.f63060w = 1;
                if (fVar.r(a10, this) == c10) {
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

    public k(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f63050y = aVar;
        this.f63051z = r0.b();
        aVar.b(this);
        Boolean bool = Boolean.FALSE;
        e0<Boolean> e0Var = new e0<>(bool);
        this.A = e0Var;
        this.B = e0Var;
        e0<Integer> e0Var2 = new e0<>(1);
        this.C = e0Var2;
        this.D = e0Var2;
        e0<List<CollabInvitableUser>> e0Var3 = new e0<>(s.k());
        this.E = e0Var3;
        this.F = e0Var3;
        this.G = wo.g.a(-2);
        e0<Boolean> e0Var4 = new e0<>(bool);
        this.H = e0Var4;
        this.I = e0Var4;
        this.J = wo.g.a(-2);
        this.K = wo.g.a(-2);
        this.L = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f63050y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f63051z.getCoroutineContext();
    }

    public final xo.c<MRError> j() {
        return xo.e.a(this.G);
    }

    public final xo.c<MRError> k() {
        return xo.e.a(this.K);
    }

    public final LiveData<Integer> l() {
        return this.D;
    }

    public final xo.c<CollabInvitableUser> m() {
        return xo.e.a(this.J);
    }

    public final xo.c<v> n() {
        return xo.e.a(this.L);
    }

    public final LiveData<List<CollabInvitableUser>> o() {
        return this.F;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.g gVar) {
        jo.p.h(gVar, "event");
        this.A.p(Boolean.TRUE);
        this.C.p(1);
        this.E.p(s.k());
    }

    public final LiveData<Boolean> p() {
        return this.I;
    }

    public final LiveData<Boolean> q() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.f fVar) {
        jo.p.h(fVar, "event");
        this.A.p(Boolean.FALSE);
        this.C.p(Integer.valueOf(fVar.a()));
        e0<List<CollabInvitableUser>> e0Var = this.E;
        List<CollabInvitableUser> f10 = e0Var.f();
        if (f10 == null) {
            f10 = s.k();
        }
        e0Var.p(a0.o0(f10, fVar.b()));
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(Boolean.FALSE);
        this.C.p(Integer.valueOf(dVar.a()));
        e0<List<CollabInvitableUser>> e0Var = this.E;
        List<CollabInvitableUser> f10 = e0Var.f();
        if (f10 == null) {
            f10 = s.k();
        }
        e0Var.p(a0.o0(f10, dVar.b()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(Boolean.FALSE);
        uo.l.d(this, null, null, new b(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.C0716h c0716h) {
        jo.p.h(c0716h, "event");
        this.H.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.c cVar) {
        jo.p.h(cVar, "event");
        this.H.p(Boolean.FALSE);
        uo.l.d(this, null, null, new c(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h.a aVar) {
        jo.p.h(aVar, "event");
        this.H.p(Boolean.FALSE);
        uo.l.d(this, null, null, new d(aVar, null), 3, null);
    }
}
