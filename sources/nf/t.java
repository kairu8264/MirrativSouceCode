package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.SeasonYellYelledRank;
import com.dena.mirrorman.net.api.response.YelledUser;
import ha.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import ud.x1;
import uo.r0;

/* loaded from: classes3.dex */
public final class t extends androidx.lifecycle.q0 implements uo.q0 {
    public final jf.x A;
    public final androidx.lifecycle.e0<ha.a> B;
    public final LiveData<ha.a> C;
    public final androidx.lifecycle.e0<List<x1>> D;
    public final LiveData<List<x1>> E;
    public final wo.f<MRError> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43249y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43250z;

    @co.f(c = "com.dena.mirrorman.store.LiveGIftCheerUsersStore$on$1", f = "LiveGIftCheerUsersStore.kt", l = {61}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43251w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ pd.b0 f43253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pd.b0 b0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43253y = b0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43253y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43251w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = t.this.F;
                MRError a10 = this.f43253y.a();
                this.f43251w = 1;
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

    public t(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43249y = aVar;
        this.f43250z = r0.b();
        aVar.b(this);
        this.A = jf.x.CHEER;
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.B = e0Var;
        this.C = e0Var;
        androidx.lifecycle.e0<List<x1>> e0Var2 = new androidx.lifecycle.e0<>();
        this.D = e0Var2;
        this.E = e0Var2;
        this.F = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43249y.c(this);
        super.d();
    }

    public final LiveData<List<x1>> g() {
        return this.E;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43250z.getCoroutineContext();
    }

    public final LiveData<ha.a> h() {
        return this.C;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(pd.d0 d0Var) {
        jo.p.h(d0Var, "event");
        if (d0Var.a() != this.A) {
            return;
        }
        this.B.p(a.b.f34695b);
        this.D.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(pd.b0 b0Var) {
        jo.p.h(b0Var, "event");
        if (b0Var.b() != this.A) {
            return;
        }
        this.B.p(new a.C0439a(b0Var.a()));
        uo.l.d(this, null, null, new a(b0Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(pd.c0 c0Var) {
        ArrayList arrayList;
        ha.a aVar;
        jo.p.h(c0Var, "event");
        if (c0Var.a() != this.A) {
            return;
        }
        List d10 = xn.r.d(new x1.a(c0Var.b().getBannerUrl(), c0Var.b().getYellLpUrl()));
        androidx.lifecycle.e0<List<x1>> e0Var = this.D;
        List<SeasonYellYelledRank> list = c0Var.b().getList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            SeasonYellYelledRank seasonYellYelledRank = (SeasonYellYelledRank) it.next();
            List d11 = xn.r.d(new x1.d(we.g.Companion.a(seasonYellYelledRank.getYellRank().getRawValue()), seasonYellYelledRank.getYellBonusDescription()));
            List d12 = xn.r.d(x1.c.f55672a);
            int size = seasonYellYelledRank.getUsers().size() - 1;
            List<YelledUser> users = seasonYellYelledRank.getUsers();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 0;
            for (Object obj : users) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                xn.x.y(arrayList3, xn.s.m(x1.e.f55676h.a((YelledUser) obj), i10 == size ? x1.c.f55672a : x1.b.f55671a));
                i10 = i11;
            }
            xn.x.y(arrayList2, xn.a0.o0(xn.a0.o0(d11, d12), arrayList3));
        }
        e0Var.p(xn.a0.o0(d10, arrayList2));
        androidx.lifecycle.e0<ha.a> e0Var2 = this.B;
        List<x1> f10 = this.D.f();
        if (f10 != null) {
            arrayList = new ArrayList();
            for (Object obj2 : f10) {
                if (obj2 instanceof x1.e) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if ((arrayList == null || arrayList.isEmpty()) ? true : true) {
            aVar = a.e.f34698b;
        } else {
            aVar = a.d.f34697b;
        }
        e0Var2.p(aVar);
    }
}
