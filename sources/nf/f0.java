package nf;

import androidx.lifecycle.LiveData;
import ce.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.event.ShooterViewingUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.z0;
import uo.r0;

/* loaded from: classes3.dex */
public final class f0 extends androidx.lifecycle.q0 implements uo.q0 {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f42805h0 = new a(null);

    /* renamed from: i0  reason: collision with root package name */
    public static final int f42806i0 = 8;
    public final androidx.lifecycle.e0<Integer> A;
    public final androidx.lifecycle.e0<Integer> B;
    public final LiveData<Integer> C;
    public final androidx.lifecycle.e0<Integer> D;
    public final LiveData<Integer> E;
    public final androidx.lifecycle.e0<String> F;
    public final LiveData<String> G;
    public final androidx.lifecycle.e0<ShooterMemberType> H;
    public final LiveData<ShooterMemberType> I;
    public final androidx.lifecycle.e0<ShooterTeamStatus> J;
    public final LiveData<ShooterTeamStatus> K;
    public final androidx.lifecycle.e0<Integer> L;
    public final LiveData<Integer> M;
    public final androidx.lifecycle.e0<Integer> N;
    public final LiveData<Integer> O;
    public final androidx.lifecycle.e0<Integer> P;
    public final LiveData<Integer> Q;
    public final wo.f<MRError> R;
    public final androidx.lifecycle.e0<Boolean> S;
    public final LiveData<Boolean> T;
    public final androidx.lifecycle.e0<Long> U;
    public final LiveData<Long> V;
    public final androidx.lifecycle.e0<List<wn.k<ShooterViewingUser, ShooterMemberStatus>>> W;
    public final LiveData<List<wn.k<ShooterViewingUser, ShooterMemberStatus>>> X;
    public final wo.f<MRError> Y;
    public final androidx.lifecycle.e0<Boolean> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final LiveData<Boolean> f42807a0;

    /* renamed from: b0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<String>> f42808b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LiveData<List<String>> f42809c0;

    /* renamed from: d0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<wn.p<String, ShooterMemberStatus, Long>>> f42810d0;

    /* renamed from: e0  reason: collision with root package name */
    public final LiveData<List<wn.p<String, ShooterMemberStatus, Long>>> f42811e0;

    /* renamed from: f0  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f42812f0;

    /* renamed from: g0  reason: collision with root package name */
    public final LiveData<String> f42813g0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42814y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42815z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ShooterInviteStore$on$1", f = "ShooterInviteStore.kt", l = {98}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42816w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z0.a f42818y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z0.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42818y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42818y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42816w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f0.this.R;
                MRError a10 = this.f42818y.a();
                this.f42816w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterInviteStore$on$2", f = "ShooterInviteStore.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42819w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z0.n f42821y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z0.n nVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42821y = nVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42821y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42819w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f0.this.R;
                MRError a10 = this.f42821y.a();
                this.f42819w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterInviteStore$on$5", f = "ShooterInviteStore.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42822w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z0.d f42824y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z0.d dVar, ao.d<? super d> dVar2) {
            super(2, dVar2);
            this.f42824y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42824y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42822w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f0.this.Y;
                MRError a10 = this.f42824y.a();
                this.f42822w = 1;
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

    @co.f(c = "com.dena.mirrorman.store.ShooterInviteStore$on$7", f = "ShooterInviteStore.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42825w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ z0.f f42827y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z0.f fVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f42827y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f42827y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42825w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f0.this.R;
                MRError a10 = this.f42827y.a();
                this.f42825w = 1;
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

    public f0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42814y = aVar;
        this.f42815z = r0.b();
        aVar.b(this);
        this.A = new androidx.lifecycle.e0<>();
        androidx.lifecycle.e0<Integer> e0Var = new androidx.lifecycle.e0<>();
        this.B = e0Var;
        this.C = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>();
        this.D = e0Var2;
        this.E = e0Var2;
        androidx.lifecycle.e0<String> e0Var3 = new androidx.lifecycle.e0<>();
        this.F = e0Var3;
        this.G = e0Var3;
        androidx.lifecycle.e0<ShooterMemberType> e0Var4 = new androidx.lifecycle.e0<>();
        this.H = e0Var4;
        this.I = e0Var4;
        androidx.lifecycle.e0<ShooterTeamStatus> e0Var5 = new androidx.lifecycle.e0<>();
        this.J = e0Var5;
        this.K = e0Var5;
        androidx.lifecycle.e0<Integer> e0Var6 = new androidx.lifecycle.e0<>();
        this.L = e0Var6;
        this.M = e0Var6;
        androidx.lifecycle.e0<Integer> e0Var7 = new androidx.lifecycle.e0<>();
        this.N = e0Var7;
        this.O = e0Var7;
        androidx.lifecycle.e0<Integer> e0Var8 = new androidx.lifecycle.e0<>();
        this.P = e0Var8;
        this.Q = e0Var8;
        this.R = wo.g.a(-2);
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var9 = new androidx.lifecycle.e0<>(bool);
        this.S = e0Var9;
        this.T = e0Var9;
        androidx.lifecycle.e0<Long> e0Var10 = new androidx.lifecycle.e0<>(1L);
        this.U = e0Var10;
        this.V = e0Var10;
        androidx.lifecycle.e0<List<wn.k<ShooterViewingUser, ShooterMemberStatus>>> e0Var11 = new androidx.lifecycle.e0<>();
        this.W = e0Var11;
        this.X = e0Var11;
        this.Y = wo.g.a(-2);
        androidx.lifecycle.e0<Boolean> e0Var12 = new androidx.lifecycle.e0<>(bool);
        this.Z = e0Var12;
        this.f42807a0 = e0Var12;
        androidx.lifecycle.e0<List<String>> e0Var13 = new androidx.lifecycle.e0<>(xn.s.k());
        this.f42808b0 = e0Var13;
        this.f42809c0 = e0Var13;
        androidx.lifecycle.e0<List<wn.p<String, ShooterMemberStatus, Long>>> e0Var14 = new androidx.lifecycle.e0<>(xn.s.k());
        this.f42810d0 = e0Var14;
        this.f42811e0 = e0Var14;
        androidx.lifecycle.e0<String> e0Var15 = new androidx.lifecycle.e0<>("");
        this.f42812f0 = e0Var15;
        this.f42813g0 = e0Var15;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42814y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42815z.getCoroutineContext();
    }

    public final LiveData<List<String>> h() {
        return this.f42809c0;
    }

    public final xo.c<MRError> i() {
        return xo.e.a(this.Y);
    }

    public final xo.c<MRError> j() {
        return xo.e.a(this.R);
    }

    public final LiveData<Integer> k() {
        return this.E;
    }

    public final LiveData<ShooterMemberType> l() {
        return this.I;
    }

    public final LiveData<List<wn.p<String, ShooterMemberStatus, Long>>> m() {
        return this.f42811e0;
    }

    public final LiveData<Integer> n() {
        return this.Q;
    }

    public final LiveData<Integer> o() {
        return this.O;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(Integer.valueOf(bVar.a().getSeasonId()));
        this.B.p(Integer.valueOf(bVar.a().getTeamId()));
        this.J.p(bVar.a().getTeamStatus());
        this.L.p(Integer.valueOf(bVar.a().getWaitInterval()));
        this.N.p(Integer.valueOf(bVar.a().getInvitingWaitInterval()));
        this.P.p(Integer.valueOf(bVar.a().getInvitedWaitInterval()));
    }

    public final LiveData<Long> p() {
        return this.V;
    }

    public final LiveData<String> q() {
        return this.f42813g0;
    }

    public final LiveData<String> r() {
        return this.G;
    }

    public final LiveData<Integer> s() {
        return this.C;
    }

    public final LiveData<ShooterTeamStatus> t() {
        return this.K;
    }

    public final LiveData<List<wn.k<ShooterViewingUser, ShooterMemberStatus>>> u() {
        return this.X;
    }

    public final LiveData<Integer> v() {
        return this.M;
    }

    public final LiveData<Boolean> w() {
        return this.T;
    }

    public final LiveData<Boolean> x() {
        return this.f42807a0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.n nVar) {
        jo.p.h(nVar, "event");
        uo.l.d(this, null, null, new c(nVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.m mVar) {
        jo.p.h(mVar, "event");
        this.S.p(Boolean.TRUE);
        this.W.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.i iVar) {
        jo.p.h(iVar, "event");
        this.S.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.e eVar) {
        Object obj;
        ShooterMemberStatus shooterMemberStatus;
        jo.p.h(eVar, "event");
        this.S.p(Boolean.FALSE);
        this.U.p(Long.valueOf(eVar.a()));
        androidx.lifecycle.e0<List<wn.k<ShooterViewingUser, ShooterMemberStatus>>> e0Var = this.W;
        List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10 = e0Var.f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        List<ShooterViewingUser> b10 = eVar.b();
        ArrayList arrayList = new ArrayList(xn.t.u(b10, 10));
        for (ShooterViewingUser shooterViewingUser : b10) {
            List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f11 = this.W.f();
            if (f11 == null) {
                f11 = xn.s.k();
            } else {
                jo.p.g(f11, "mutableViewingUsers.value ?: listOf()");
            }
            Iterator<T> it = f11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((ShooterViewingUser) ((wn.k) obj).a()).getUserId(), shooterViewingUser.getUserId())) {
                    break;
                }
            }
            wn.k kVar = (wn.k) obj;
            if (kVar == null || (shooterMemberStatus = (ShooterMemberStatus) kVar.d()) == null) {
                shooterMemberStatus = ShooterMemberStatus.NONE;
            }
            arrayList.add(wn.q.a(shooterViewingUser, shooterMemberStatus));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((ShooterViewingUser) ((wn.k) obj2).a()).getUserId())) {
                arrayList2.add(obj2);
            }
        }
        e0Var.p(xn.a0.o0(f10, arrayList2));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.d dVar) {
        jo.p.h(dVar, "event");
        this.S.p(Boolean.FALSE);
        uo.l.d(this, null, null, new d(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.g gVar) {
        int i10;
        jo.p.h(gVar, "event");
        List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10 = this.W.f();
        if (f10 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : f10) {
                if (((ShooterMemberStatus) ((wn.k) obj).b()).didInvite()) {
                    arrayList.add(obj);
                }
            }
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.Z.p(Boolean.valueOf(i10 + (gVar.a().didInvite() ? 1 : -1) >= 3));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.f fVar) {
        int i10;
        jo.p.h(fVar, "event");
        androidx.lifecycle.e0<Boolean> e0Var = this.Z;
        List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10 = this.W.f();
        if (f10 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : f10) {
                if (((ShooterMemberStatus) ((wn.k) obj).b()).didInvite()) {
                    arrayList.add(obj);
                }
            }
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        e0Var.p(Boolean.valueOf(i10 >= 3));
        uo.l.d(this, null, null, new e(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.l lVar) {
        jo.p.h(lVar, "event");
        this.f42812f0.p(lVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.k kVar) {
        jo.p.h(kVar, "event");
        this.f42812f0.p("");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(z0.j jVar) {
        jo.p.h(jVar, "event");
        this.f42812f0.p("");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d7  */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(ce.l.i1 r10) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f0.on(ce.l$i1):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.h1 h1Var) {
        jo.p.h(h1Var, "event");
        int seasonId = h1Var.b().getSeasonId();
        Integer f10 = this.A.f();
        if (f10 != null && seasonId == f10.intValue()) {
            int teamId = h1Var.b().getTeamId();
            Integer f11 = this.B.f();
            if (f11 != null && teamId == f11.intValue()) {
                if (this.J.f() == ShooterTeamStatus.MATCHED && xn.s.m(ShooterTeamStatus.MATCHING, ShooterTeamStatus.FORCE_MATCHING).contains(h1Var.b().getMatchingStatus())) {
                    return;
                }
                this.D.p(h1Var.b().getGroupId());
                this.F.p(h1Var.b().getStageId());
                this.H.p(h1Var.b().getHostMemberType());
                this.J.p(h1Var.b().getMatchingStatus());
            }
        }
    }
}
