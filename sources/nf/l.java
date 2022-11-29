package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import ha.a;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.o;
import uo.r0;

/* loaded from: classes3.dex */
public final class l extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final androidx.lifecycle.e0<Integer> C;
    public final LiveData<Integer> D;
    public final androidx.lifecycle.e0<List<UrgeUser>> E;
    public final LiveData<List<UrgeUser>> F;
    public final wo.f<MRError> G;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43002y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43003z;

    @co.f(c = "com.dena.mirrorman.store.FollowPushSettingsStore$on$3", f = "FollowPushSettingsStore.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43004w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o.a f43006y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43006y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43006y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43004w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = l.this.G;
                MRError a10 = this.f43006y.a();
                this.f43004w = 1;
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

    public l(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43002y = aVar;
        this.f43003z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(0);
        this.C = e0Var2;
        this.D = e0Var2;
        androidx.lifecycle.e0<List<UrgeUser>> e0Var3 = new androidx.lifecycle.e0<>(xn.s.k());
        this.E = e0Var3;
        this.F = e0Var3;
        this.G = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43002y.c(this);
        super.d();
    }

    public final wo.x<MRError> g() {
        return this.G.g();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43003z.getCoroutineContext();
    }

    public final LiveData<Integer> h() {
        return this.D;
    }

    public final LiveData<ha.a> i() {
        return this.B;
    }

    public final LiveData<List<UrgeUser>> j() {
        return this.F;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o.e eVar) {
        jo.p.h(eVar, "event");
        this.A.p(a.b.f34695b);
        this.E.p(xn.s.k());
        this.C.p(0);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o.c cVar) {
        jo.p.h(cVar, "event");
        this.C.p(Integer.valueOf(cVar.a().getNextPage()));
        androidx.lifecycle.e0<List<UrgeUser>> e0Var = this.E;
        List<UrgeUser> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        e0Var.p(xn.a0.o0(f10, cVar.a().getFollowings()));
        List<UrgeUser> f11 = this.E.f();
        boolean z10 = true;
        if (f11 == null || !f11.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.A.p(a.e.f34698b);
        } else {
            this.A.p(a.d.f34697b);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(new a.C0439a(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o.f fVar) {
        ArrayList arrayList;
        jo.p.h(fVar, "event");
        androidx.lifecycle.e0<List<UrgeUser>> e0Var = this.E;
        List<UrgeUser> f10 = this.F.f();
        if (f10 != null) {
            arrayList = new ArrayList(xn.t.u(f10, 10));
            for (UrgeUser urgeUser : f10) {
                if (jo.p.c(urgeUser.getUserId(), fVar.a())) {
                    urgeUser.setPushEnabled(fVar.b());
                }
                arrayList.add(urgeUser);
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o.a aVar) {
        ArrayList arrayList;
        jo.p.h(aVar, "event");
        androidx.lifecycle.e0<List<UrgeUser>> e0Var = this.E;
        List<UrgeUser> f10 = this.F.f();
        if (f10 != null) {
            arrayList = new ArrayList(xn.t.u(f10, 10));
            for (UrgeUser urgeUser : f10) {
                if (jo.p.c(urgeUser.getUserId(), aVar.b())) {
                    urgeUser.setPushEnabled(aVar.c());
                }
                arrayList.add(urgeUser);
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
        uo.l.d(this, null, null, new a(aVar, null), 3, null);
    }
}
