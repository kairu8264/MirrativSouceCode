package ya;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.q0;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignAward;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignMission;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceiveStatus;
import com.dena.mirrorman.net.api.response.campaign.SharingAward;
import ha.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.f1;
import nd.i1;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.b;
import uo.r0;
import ya.b;
import ya.d;

/* loaded from: classes2.dex */
public final class a0 extends q0 implements uo.q0 {
    public final i1 A;
    public final /* synthetic */ uo.q0 B;
    public final androidx.lifecycle.e0<AppUserDetailResponse> C;
    public final LiveData<AppUserDetailResponse> D;
    public final wo.f<String> E;
    public final wo.x<String> F;
    public final wo.f<AppUserDetailResponse> G;
    public final wo.x<AppUserDetailResponse> H;
    public final wo.f<wn.k<CampaignMission, CampaignMissionReceivePrizesResponse>> I;
    public final wo.x<wn.k<CampaignMission, CampaignMissionReceivePrizesResponse>> J;
    public final androidx.lifecycle.e0<ha.a> K;
    public final LiveData<ha.a> L;
    public final androidx.lifecycle.e0<Boolean> M;
    public final LiveData<Boolean> N;
    public final androidx.lifecycle.e0<CampaignDetailResponse> O;
    public final LiveData<CampaignDetailResponse> P;
    public final androidx.lifecycle.e0<List<ud.l>> Q;
    public final LiveData<List<ud.l>> R;
    public final s0<Boolean> S;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f61372y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f61373z;

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$1", f = "CampaignDetailStore.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61374w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.k f61376y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.k kVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f61376y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f61376y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61374w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = a0.this.G;
                AppUserDetailResponse a10 = this.f61376y.a();
                this.f61374w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$2", f = "CampaignDetailStore.kt", l = {125}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61377w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.j f61379y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.j jVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f61379y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f61379y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61377w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = a0.this.E;
                String message = this.f61379y.a().getMessage();
                if (message == null) {
                    message = a0.this.f61373z.getString(f1.f41966c);
                    jo.p.g(message, "applicationContext.getSt…ng(R.string.error_access)");
                }
                this.f61377w = 1;
                if (fVar.r(message, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$3", f = "CampaignDetailStore.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61380w;

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
            int i10 = this.f61380w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = a0.this.S;
                Boolean a10 = co.b.a(true);
                this.f61380w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$4", f = "CampaignDetailStore.kt", l = {142}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61382w;

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
            int i10 = this.f61382w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = a0.this.S;
                Boolean a10 = co.b.a(false);
                this.f61382w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$5", f = "CampaignDetailStore.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61384w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ CampaignMission f61386y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ b.d f61387z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CampaignMission campaignMission, b.d dVar, ao.d<? super e> dVar2) {
            super(2, dVar2);
            this.f61386y = campaignMission;
            this.f61387z = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f61386y, this.f61387z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61384w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = a0.this.I;
                wn.k kVar = new wn.k(this.f61386y, this.f61387z.b());
                this.f61384w = 1;
                if (fVar.r(kVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$6", f = "CampaignDetailStore.kt", l = {159}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61388w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61388w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = a0.this.S;
                Boolean a10 = co.b.a(false);
                this.f61388w = 1;
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

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailStore$on$7", f = "CampaignDetailStore.kt", l = {166}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61390w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.c f61392y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b.c cVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f61392y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f61392y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61390w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = a0.this.E;
                String message = this.f61392y.a().getMessage();
                if (message == null) {
                    message = a0.this.f61373z.getString(f1.f41966c);
                    jo.p.g(message, "applicationContext.getSt…ng(R.string.error_access)");
                }
                this.f61390w = 1;
                if (fVar.r(message, this) == c10) {
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

    public a0(q8.a aVar, Context context, i1 i1Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(context, "applicationContext");
        jo.p.h(i1Var, "sharedApplicationModel");
        this.f61372y = aVar;
        this.f61373z = context;
        this.A = i1Var;
        this.B = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<AppUserDetailResponse> e0Var = new androidx.lifecycle.e0<>(null);
        this.C = e0Var;
        this.D = e0Var;
        wo.f<String> a10 = wo.g.a(-2);
        this.E = a10;
        this.F = a10.g();
        wo.f<AppUserDetailResponse> a11 = wo.g.a(-2);
        this.G = a11;
        this.H = a11.g();
        wo.f<wn.k<CampaignMission, CampaignMissionReceivePrizesResponse>> a12 = wo.g.a(-2);
        this.I = a12;
        this.J = a12.g();
        androidx.lifecycle.e0<ha.a> e0Var2 = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.K = e0Var2;
        this.L = e0Var2;
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.M = e0Var3;
        this.N = e0Var3;
        androidx.lifecycle.e0<CampaignDetailResponse> e0Var4 = new androidx.lifecycle.e0<>(null);
        this.O = e0Var4;
        this.P = e0Var4;
        androidx.lifecycle.e0<List<ud.l>> e0Var5 = new androidx.lifecycle.e0<>(xn.s.k());
        this.Q = e0Var5;
        this.R = e0Var5;
        s0<Boolean> s0Var = new s0<>();
        s0Var.c();
        this.S = s0Var;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f61372y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    public final List<ud.l> k(CampaignDetailResponse campaignDetailResponse) {
        List<CampaignMission> missions;
        ArrayList arrayList = new ArrayList();
        arrayList.add(v.f61570m.a(campaignDetailResponse));
        boolean z10 = false;
        if (campaignDetailResponse.getApp().getUseAppUserId()) {
            if (campaignDetailResponse.getApp().getAppUserId().length() == 0) {
                d.a aVar = ya.d.f61408f;
                Resources resources = this.f61373z.getResources();
                jo.p.g(resources, "applicationContext.resources");
                arrayList.add(aVar.a(resources, campaignDetailResponse));
            } else {
                boolean v10 = v(campaignDetailResponse);
                b.a aVar2 = ya.b.f61393f;
                Resources resources2 = this.f61373z.getResources();
                jo.p.g(resources2, "applicationContext.resources");
                arrayList.add(aVar2.a(resources2, campaignDetailResponse, v10));
            }
        }
        if (!campaignDetailResponse.getBroadcastAwards().getMissions().isEmpty()) {
            arrayList.add(l.f61530l.a(this.f61373z, campaignDetailResponse.getBroadcastAwards()));
        }
        CampaignAward viewingAwards = campaignDetailResponse.getViewingAwards();
        if (viewingAwards != null && (missions = viewingAwards.getMissions()) != null && (!missions.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            arrayList.add(d0.f61414l.a(this.f61373z, viewingAwards));
        }
        SharingAward sharingAward = campaignDetailResponse.getSharingAward();
        if (sharingAward != null) {
            arrayList.add(x.f61590f.a(this.f61373z, sharingAward));
        }
        arrayList.add(m.f61543r.a(campaignDetailResponse));
        return arrayList;
    }

    public final za.b l(int i10) {
        boolean z10;
        List<ud.l> f10 = this.Q.f();
        Object obj = null;
        if (f10 == null) {
            return null;
        }
        ArrayList<u> arrayList = new ArrayList();
        for (ud.l lVar : f10) {
            u uVar = lVar instanceof u ? (u) lVar : null;
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        ArrayList<ud.a> arrayList2 = new ArrayList();
        for (u uVar2 : arrayList) {
            xn.x.y(arrayList2, uVar2.b());
        }
        ArrayList arrayList3 = new ArrayList();
        for (ud.a aVar : arrayList2) {
            za.b bVar = aVar instanceof za.b ? (za.b) aVar : null;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((za.b) next).getId() == i10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (za.b) obj;
    }

    public final LiveData<CampaignDetailResponse> m() {
        return this.P;
    }

    public final LiveData<List<ud.l>> n() {
        return this.R;
    }

    public final LiveData<AppUserDetailResponse> o() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        jo.p.h(fVar, "event");
        this.K.p(a.b.f34695b);
    }

    public final wo.x<String> p() {
        return this.F;
    }

    public final wo.x<AppUserDetailResponse> q() {
        return this.H;
    }

    public final wo.x<wn.k<CampaignMission, CampaignMissionReceivePrizesResponse>> r() {
        return this.J;
    }

    public final LiveData<ha.a> s() {
        return this.L;
    }

    public final boolean t() {
        Boolean b10 = this.S.b();
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public final LiveData<Boolean> u() {
        return this.N;
    }

    public final boolean v(CampaignDetailResponse campaignDetailResponse) {
        if (this.A.a().c()) {
            if (campaignDetailResponse.getApp().isAppUserIdHidden()) {
                return true;
            }
            return !campaignDetailResponse.getApp().isPublishedUserId();
        }
        return false;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0711b c0711b) {
        jo.p.h(c0711b, "event");
        this.K.p(a.d.f34697b);
        CampaignDetailResponse a10 = c0711b.a();
        this.O.p(a10);
        this.Q.p(k(a10));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        this.K.p(new a.C0439a(aVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.i iVar) {
        jo.p.h(iVar, "event");
        this.M.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.k kVar) {
        jo.p.h(kVar, "event");
        this.M.p(Boolean.FALSE);
        if (!kVar.a().getRequireConfirmation()) {
            uo.l.d(this, null, null, new a(kVar, null), 3, null);
            CampaignDetailResponse f10 = this.P.f();
            if (f10 == null) {
                return;
            }
            f10.getApp().setAppUserId(kVar.a().getUserId());
            f10.getApp().setPublishedUserId(kVar.a().isPublishedUserId());
            this.O.p(f10);
            this.Q.p(k(f10));
            return;
        }
        this.C.p(kVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.j jVar) {
        jo.p.h(jVar, "event");
        this.M.p(Boolean.FALSE);
        uo.l.d(this, null, null, new b(jVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
        za.b l10 = l(eVar.a());
        if (l10 == null) {
            return;
        }
        l10.a().p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        List<CampaignMission> k10;
        Object obj;
        boolean z10;
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
        za.b l10 = l(dVar.a());
        if (l10 == null) {
            return;
        }
        l10.a().p(Boolean.FALSE);
        l10.b().p(za.m.f62945e.a(this.f61373z, CampaignMissionReceiveStatus.ALREADY_RECEIVED, false));
        CampaignDetailResponse f10 = this.O.f();
        if (f10 == null) {
            return;
        }
        List<CampaignMission> missions = f10.getBroadcastAwards().getMissions();
        CampaignAward viewingAwards = f10.getViewingAwards();
        if (viewingAwards == null || (k10 = viewingAwards.getMissions()) == null) {
            k10 = xn.s.k();
        }
        Iterator it = xn.a0.o0(missions, k10).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CampaignMission) obj).getId() == dVar.a()) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        CampaignMission campaignMission = (CampaignMission) obj;
        if (campaignMission == null) {
            return;
        }
        uo.l.d(this, null, null, new e(campaignMission, dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new f(null), 3, null);
        za.b l10 = l(cVar.b());
        if (l10 == null) {
            return;
        }
        l10.a().p(Boolean.FALSE);
        uo.l.d(this, null, null, new g(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.h hVar) {
        CampaignDetailResponse f10;
        List<CampaignMission> missions;
        jo.p.h(hVar, "event");
        SharingAward a10 = hVar.a();
        if (a10 == null || (f10 = this.O.f()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(v.f61570m.a(f10));
        boolean z10 = false;
        if (f10.getApp().getUseAppUserId()) {
            if (f10.getApp().getAppUserId().length() == 0) {
                d.a aVar = ya.d.f61408f;
                Resources resources = this.f61373z.getResources();
                jo.p.g(resources, "applicationContext.resources");
                arrayList.add(aVar.a(resources, f10));
            } else {
                boolean v10 = v(f10);
                b.a aVar2 = ya.b.f61393f;
                Resources resources2 = this.f61373z.getResources();
                jo.p.g(resources2, "applicationContext.resources");
                arrayList.add(aVar2.a(resources2, f10, v10));
            }
        }
        if (!f10.getBroadcastAwards().getMissions().isEmpty()) {
            arrayList.add(l.f61530l.a(this.f61373z, f10.getBroadcastAwards()));
        }
        CampaignAward viewingAwards = f10.getViewingAwards();
        if (viewingAwards != null && (missions = viewingAwards.getMissions()) != null && (!missions.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            arrayList.add(d0.f61414l.a(this.f61373z, viewingAwards));
        }
        arrayList.add(x.f61590f.a(this.f61373z, a10));
        arrayList.add(m.f61543r.a(f10));
        this.Q.p(arrayList);
    }
}
