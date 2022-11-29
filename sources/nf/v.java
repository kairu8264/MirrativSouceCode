package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserGroup;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ha.a;
import java.util.ArrayList;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.c1;
import uo.r0;

/* loaded from: classes3.dex */
public final class v extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<List<a>> A;
    public final LiveData<List<a>> B;
    public final androidx.lifecycle.e0<List<b>> C;
    public final androidx.lifecycle.e0<List<b>> D;
    public final androidx.lifecycle.e0<ha.a> E;
    public final LiveData<ha.a> F;
    public final androidx.lifecycle.e0<ha.a> G;
    public final LiveData<ha.a> H;
    public final androidx.lifecycle.e0<MRError> I;
    public final LiveData<MRError> J;
    public final androidx.lifecycle.e0<Integer> K;
    public final LiveData<Integer> L;
    public final wo.f<wn.v> M;
    public final s0<ye.c> N;
    public final wo.f<MRError> O;
    public List<? extends UserBasicParams> P;
    public List<UserGroup> Q;
    public List<? extends UserBasicParams> R;
    public List<UserGroup> S;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43264y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43265z;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final UserGroup f43266a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f43267b;

        public a(UserGroup userGroup, boolean z10) {
            jo.p.h(userGroup, "group");
            this.f43266a = userGroup;
            this.f43267b = z10;
        }

        public final UserGroup a() {
            return this.f43266a;
        }

        public final boolean b() {
            return this.f43267b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f43266a, aVar.f43266a) && this.f43267b == aVar.f43267b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f43266a.hashCode() * 31;
            boolean z10 = this.f43267b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "GroupWithCheckedStatus(group=" + this.f43266a + ", isChecked=" + this.f43267b + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final UserBasicParams f43268a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f43269b;

        public b(UserBasicParams userBasicParams, boolean z10) {
            jo.p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
            this.f43268a = userBasicParams;
            this.f43269b = z10;
        }

        public final UserBasicParams a() {
            return this.f43268a;
        }

        public final boolean b() {
            return this.f43269b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f43268a, bVar.f43268a) && this.f43269b == bVar.f43269b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f43268a.hashCode() * 31;
            boolean z10 = this.f43269b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "UserWithCheckedStatus(user=" + this.f43268a + ", isChecked=" + this.f43269b + ')';
        }
    }

    @co.f(c = "com.dena.mirrorman.store.LivePrepareForFriendStore$on$1", f = "LivePrepareForFriendStore.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43270w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43270w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = v.this.M;
                wn.v vVar = wn.v.f59242a;
                this.f43270w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LivePrepareForFriendStore$on$2", f = "LivePrepareForFriendStore.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43272w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43272w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = v.this.M;
                wn.v vVar = wn.v.f59242a;
                this.f43272w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LivePrepareForFriendStore$on$4", f = "LivePrepareForFriendStore.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43274w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43274w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = v.this.M;
                wn.v vVar = wn.v.f59242a;
                this.f43274w = 1;
                if (fVar.r(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LivePrepareForFriendStore$on$5", f = "LivePrepareForFriendStore.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43276w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c1.e f43278y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c1.e eVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f43278y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f43278y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43276w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = v.this.N;
                ye.c a10 = this.f43278y.a();
                this.f43276w = 1;
                if (s0Var.d(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.LivePrepareForFriendStore$on$6", f = "LivePrepareForFriendStore.kt", l = {159}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43279w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c1.d f43281y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c1.d dVar, ao.d<? super g> dVar2) {
            super(2, dVar2);
            this.f43281y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f43281y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43279w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = v.this.O;
                MRError a10 = this.f43281y.a();
                this.f43279w = 1;
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

    public v(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43264y = aVar;
        this.f43265z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<List<a>> e0Var = new androidx.lifecycle.e0<>(xn.s.k());
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<List<b>> e0Var2 = new androidx.lifecycle.e0<>(xn.s.k());
        this.C = e0Var2;
        this.D = e0Var2;
        a.d dVar = a.d.f34697b;
        androidx.lifecycle.e0<ha.a> e0Var3 = new androidx.lifecycle.e0<>(dVar);
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<ha.a> e0Var4 = new androidx.lifecycle.e0<>(dVar);
        this.G = e0Var4;
        this.H = e0Var4;
        androidx.lifecycle.e0<MRError> e0Var5 = new androidx.lifecycle.e0<>();
        this.I = e0Var5;
        this.J = e0Var5;
        androidx.lifecycle.e0<Integer> e0Var6 = new androidx.lifecycle.e0<>();
        this.K = e0Var6;
        this.L = e0Var6;
        this.M = wo.g.a(-2);
        this.N = new s0<>();
        this.O = wo.g.a(-2);
        this.P = xn.s.k();
        this.Q = xn.s.k();
        this.R = xn.s.k();
        this.S = xn.s.k();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f43264y.c(this);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43265z.getCoroutineContext();
    }

    public final wo.x<MRError> i() {
        return this.O.g();
    }

    public final LiveData<List<a>> j() {
        return this.B;
    }

    public final List<UserGroup> k() {
        return this.Q;
    }

    public final List<UserBasicParams> l() {
        return this.P;
    }

    public final LiveData<Integer> m() {
        return this.L;
    }

    public final LiveData<MRError> n() {
        return this.J;
    }

    public final ye.c o() {
        return this.N.b();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.f fVar) {
        jo.p.h(fVar, "event");
        this.Q = fVar.b().getGroups();
        this.P = fVar.b().getUsers();
        this.R = fVar.c().getUsers();
        this.S = fVar.a().getGroups();
        u();
        this.K.p(Integer.valueOf(fVar.c().getNextPage()));
        uo.l.d(this, null, null, new c(null), 3, null);
        this.G.p(a.d.f34697b);
    }

    public final LiveData<ha.a> p() {
        return this.F;
    }

    public final wo.x<wn.v> q() {
        return this.M.g();
    }

    public final LiveData<ha.a> r() {
        return this.H;
    }

    public final wo.x<ye.c> s() {
        return this.N.c();
    }

    public final androidx.lifecycle.e0<List<b>> t() {
        return this.D;
    }

    public final void u() {
        List<UserGroup> list = this.Q;
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        for (UserGroup userGroup : list) {
            arrayList.add(userGroup.getId());
        }
        List<UserGroup> list2 = this.S;
        ArrayList<UserGroup> arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (true ^ arrayList.contains(((UserGroup) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        List<UserGroup> list3 = this.Q;
        ArrayList arrayList3 = new ArrayList(xn.t.u(list3, 10));
        for (UserGroup userGroup2 : list3) {
            arrayList3.add(new a(userGroup2, true));
        }
        ArrayList arrayList4 = new ArrayList(xn.t.u(arrayList2, 10));
        for (UserGroup userGroup3 : arrayList2) {
            arrayList4.add(new a(userGroup3, false));
        }
        this.A.p(xn.a0.o0(arrayList3, arrayList4));
        List<? extends UserBasicParams> list4 = this.P;
        ArrayList arrayList5 = new ArrayList(xn.t.u(list4, 10));
        for (UserBasicParams userBasicParams : list4) {
            arrayList5.add(userBasicParams.getUserId());
        }
        List<? extends UserBasicParams> list5 = this.R;
        ArrayList<UserBasicParams> arrayList6 = new ArrayList();
        for (Object obj2 : list5) {
            if (!arrayList5.contains(((UserBasicParams) obj2).getUserId())) {
                arrayList6.add(obj2);
            }
        }
        List<? extends UserBasicParams> list6 = this.P;
        ArrayList arrayList7 = new ArrayList(xn.t.u(list6, 10));
        for (UserBasicParams userBasicParams2 : list6) {
            arrayList7.add(new b(userBasicParams2, true));
        }
        ArrayList arrayList8 = new ArrayList(xn.t.u(arrayList6, 10));
        for (UserBasicParams userBasicParams3 : arrayList6) {
            arrayList8.add(new b(userBasicParams3, false));
        }
        this.C.p(xn.a0.o0(arrayList7, arrayList8));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.a aVar) {
        jo.p.h(aVar, "event");
        this.I.p(aVar.a());
        this.E.p(new a.C0439a(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.h hVar) {
        jo.p.h(hVar, "event");
        this.E.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.k kVar) {
        jo.p.h(kVar, "event");
        this.Q = kVar.a();
        this.P = kVar.b();
        u();
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.i iVar) {
        jo.p.h(iVar, "event");
        this.R = xn.s.k();
        this.A.p(xn.s.k());
        this.G.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.j jVar) {
        jo.p.h(jVar, "event");
        this.G.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.g gVar) {
        ha.a aVar;
        jo.p.h(gVar, "event");
        List<? extends UserBasicParams> o02 = xn.a0.o0(this.R, gVar.a().getUsers());
        this.R = o02;
        androidx.lifecycle.e0<List<b>> e0Var = this.C;
        ArrayList arrayList = new ArrayList(xn.t.u(o02, 10));
        for (UserBasicParams userBasicParams : o02) {
            List<? extends UserBasicParams> list = this.P;
            ArrayList arrayList2 = new ArrayList(xn.t.u(list, 10));
            for (UserBasicParams userBasicParams2 : list) {
                arrayList2.add(userBasicParams2.getUserId());
            }
            arrayList.add(new b(userBasicParams, arrayList2.contains(userBasicParams.getUserId())));
        }
        e0Var.p(arrayList);
        this.K.p(Integer.valueOf(gVar.a().getNextPage()));
        uo.l.d(this, null, null, new e(null), 3, null);
        androidx.lifecycle.e0<ha.a> e0Var2 = this.G;
        if (this.R.isEmpty()) {
            aVar = a.e.f34698b;
        } else {
            aVar = a.d.f34697b;
        }
        e0Var2.p(aVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.c cVar) {
        jo.p.h(cVar, "event");
        this.G.p(new a.C0439a(cVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new f(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c1.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new g(dVar, null), 3, null);
    }
}
