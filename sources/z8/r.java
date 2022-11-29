package z8;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Mission;
import com.dena.mirrorman.net.api.response.MissionCategory;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.MissionStatus;
import com.dena.mirrorman.util.FragmentRunner;
import ha.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import kotlin.NoWhenBranchMatchedException;
import kq.a;
import r8.b1;
import r8.d1;
import r8.h1;
import tb.c;
import uo.q0;
import uo.r0;

/* loaded from: classes.dex */
public final class r extends Fragment implements q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final AutoClearedValue E0;
    public final FragmentRunner F0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f62728x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public b f62729y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f62730z0;
    public static final /* synthetic */ qo.h<Object>[] H0 = {f0.d(new jo.s(r.class, "binding", "getBinding()Lcom/dena/mirrativ/catalog/databinding/FragmentMissionTabBinding;", 0))};
    public static final a G0 = new a(null);
    public static final int I0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r a(z8.j jVar, String str) {
            jo.p.h(jVar, "period");
            jo.p.h(str, "referer");
            r rVar = new r();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_REFERER", str);
            bundle.putSerializable("EXTRA_PERIOD", jVar);
            rVar.V2(bundle);
            return rVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void e1();

        void t();
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62731a;

        static {
            int[] iArr = new int[z8.j.values().length];
            iArr[z8.j.DAILY.ordinal()] = 1;
            iArr[z8.j.WEEKLY.ordinal()] = 2;
            f62731a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends RecyclerView.u {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            MissionInfoResponse f10 = r.this.x3().f().f();
            if (f10 == null) {
                return;
            }
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int l22 = ((LinearLayoutManager) layoutManager).l2();
            if (f10.getCategorySecond().isActivation()) {
                return;
            }
            if (l22 < 2) {
                b u32 = r.this.u3();
                if (u32 != null) {
                    u32.e1();
                    return;
                }
                return;
            }
            b u33 = r.this.u3();
            if (u33 != null) {
                u33.t();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ MissionReceiveRewardResponse f62734x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f62735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MissionReceiveRewardResponse missionReceiveRewardResponse, boolean z10) {
            super(0);
            this.f62734x = missionReceiveRewardResponse;
            this.f62735y = z10;
        }

        public final void a() {
            tb.a h10 = c.a.h(r.this.t3(), this.f62734x.getRewardTitle(), this.f62734x.getRewardImageUrl(), null, this.f62735y, 4, null);
            h10.a().z3(r.this.p0(), h10.b());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Integer, wn.v> {
        public f() {
            super(1);
        }

        public final void a(int i10) {
            r.this.r3().c(r.this.w3(), i10, false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<Integer, wn.v> {
        public g() {
            super(1);
        }

        public final void a(int i10) {
            r.this.r3().c(r.this.w3(), i10, true);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<z8.g, wn.v> {
        public h() {
            super(1);
        }

        public final void a(z8.g gVar) {
            jo.p.h(gVar, Referer.MISSION);
            a9.b.N0.a(a9.c.B.a(gVar.h(), gVar.i(), gVar.j(), gVar.a())).z3(r.this.p0(), "MissionRewardDetailPopupDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(z8.g gVar) {
            a(gVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<z8.j> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final z8.j invoke() {
            Serializable serializable = r.this.M2().getSerializable("EXTRA_PERIOD");
            jo.p.e(serializable);
            return (z8.j) serializable;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f62740w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f62741x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f62742y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f62740w = componentCallbacks;
            this.f62741x = aVar;
            this.f62742y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f62740w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f62741x, this.f62742y);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<z8.l> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f62743w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f62744x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f62745y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f62743w = componentCallbacks;
            this.f62744x = aVar;
            this.f62745y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [z8.l, java.lang.Object] */
        @Override // io.a
        public final z8.l invoke() {
            ComponentCallbacks componentCallbacks = this.f62743w;
            return gq.a.a(componentCallbacks).c(f0.b(z8.l.class), this.f62744x, this.f62745y);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f62746w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f62747x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f62748y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f62746w = componentCallbacks;
            this.f62747x = aVar;
            this.f62748y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f62746w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f62747x, this.f62748y);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f62749w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f62749w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f62749w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f62750w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f62750w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f62750w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f62751w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f62752x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f62753y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f62754z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f62751w = aVar;
            this.f62752x = aVar2;
            this.f62753y = aVar3;
            this.f62754z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f62751w;
            vq.a aVar2 = this.f62752x;
            io.a aVar3 = this.f62753y;
            xq.a aVar4 = this.f62754z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(v.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f62755w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f62755w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f62755w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public r() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f62730z0 = wn.g.b(iVar, new j(this, null, null));
        this.A0 = wn.g.a(new i());
        this.B0 = wn.g.b(iVar, new k(this, null, null));
        this.C0 = wn.g.b(iVar, new l(this, null, null));
        m mVar = new m(this);
        xq.a a10 = gq.a.a(this);
        n nVar = new n(mVar);
        this.D0 = e0.a(this, f0.b(v.class), new p(nVar), new o(mVar, null, null, a10));
        this.E0 = nd.a.a(this);
        this.F0 = new FragmentRunner(this);
    }

    public static final void A3(z8.n nVar, r rVar, wn.p pVar) {
        Object obj;
        boolean z10;
        jo.p.h(nVar, "$adapter");
        jo.p.h(rVar, "this$0");
        MissionReceiveRewardResponse missionReceiveRewardResponse = (MissionReceiveRewardResponse) pVar.d();
        int intValue = ((Number) pVar.e()).intValue();
        boolean booleanValue = ((Boolean) pVar.f()).booleanValue();
        if (!booleanValue) {
            Iterator<T> it = nVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((t) obj).e().b() == intValue) {
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
            t tVar = (t) obj;
            if (tVar != null) {
                tVar.e().c().p(MissionStatus.REWARD_RECEIVED);
            }
        }
        rVar.F0.c(new e(missionReceiveRewardResponse, booleanValue));
    }

    public static final void y3(r rVar, ha.a aVar) {
        jo.p.h(rVar, "this$0");
        if (aVar instanceof a.d) {
            rVar.s3().D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            rVar.s3().D.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            rVar.s3().D.b(StatusView.b.c.f20791w);
            of.n nVar = of.n.f45411a;
            Context N2 = rVar.N2();
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = rVar.U0(h1.f49918a);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            nVar.B(N2, message, false);
        } else {
            Log.d("MissionTabFragment", "Status.Unknown");
        }
    }

    public static final void z3(r rVar, z8.n nVar, MissionInfoResponse missionInfoResponse) {
        jo.p.h(rVar, "this$0");
        jo.p.h(nVar, "$adapter");
        if (missionInfoResponse == null) {
            return;
        }
        rVar.B3(missionInfoResponse.getCategoryFirst(), missionInfoResponse.getCategorySecond());
        nVar.b(rVar.q3(missionInfoResponse));
    }

    public final void B3(MissionCategory missionCategory, MissionCategory missionCategory2) {
        String str;
        List<Mission> D0 = xn.a0.D0(missionCategory.getMissions());
        D0.addAll(xn.a0.D0(missionCategory2.getMissions()));
        ArrayList<Mission> arrayList = new ArrayList();
        Iterator it = D0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Mission) next).getMissionStatus() == MissionStatus.COMPLETED) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
        for (Mission mission : arrayList) {
            arrayList2.add(Integer.valueOf(mission.getId()));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("achieved_not_get_missions_num", String.valueOf(arrayList2.size()));
        hashMap.put("achieved_not_get_mission_ids", xn.a0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        for (Mission mission2 : D0) {
            hashMap.put("id_" + mission2.getId() + "_status", String.valueOf(mission2.getMissionStatus().getRawValue()));
        }
        int i10 = c.f62731a[w3().ordinal()];
        if (i10 == 1) {
            str = MRLog.ACTION_TYPE_DAILY_MISSION_IMP;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = MRLog.ACTION_TYPE_WEEKLY_MISSION_IMP;
        }
        MRLogger v32 = v3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(str);
        Serializable serializable = M2().getSerializable("EXTRA_REFERER");
        jo.p.e(serializable);
        builder.setPageId((String) serializable);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new xm.e().s(hashMap))));
        v32.sendLog(builder.build());
    }

    public final void C3(t8.u uVar) {
        this.E0.a(this, H0[0], uVar);
    }

    public final void D3(b bVar) {
        this.f62729y0 = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        t8.u T = t8.u.T(LayoutInflater.from(N2()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        C3(T);
        int i10 = c.f62731a[w3().ordinal()];
        if (i10 == 1) {
            s3().B.setBackgroundColor(O0().getColor(b1.sunYellowOrange, null));
            s3().F.setBackgroundResource(d1.bg_mission_daily_tab_header);
        } else if (i10 == 2) {
            s3().B.setBackgroundColor(O0().getColor(b1.f49837g, null));
            s3().F.setBackgroundResource(d1.bg_mission_weekly_tab_header);
        }
        s3().E.k(new d());
        final z8.n nVar = new z8.n(w3(), this, new f(), new g(), new h());
        s3().E.setAdapter(nVar);
        s3().E.g(new p001if.c(0, 0, 0, 0, de.e.b(this, 20), 0, 32, null));
        x3().g().i(a1(), new androidx.lifecycle.f0() { // from class: z8.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r.y3(r.this, (ha.a) obj);
            }
        });
        x3().f().i(a1(), new androidx.lifecycle.f0() { // from class: z8.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r.z3(r.this, nVar, (MissionInfoResponse) obj);
            }
        });
        x3().h().i(a1(), new androidx.lifecycle.f0() { // from class: z8.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r.A3(n.this, this, (wn.p) obj);
            }
        });
        r3().d(w3());
        View u10 = s3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        r0.d(this, null, 1, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f62728x0.getCoroutineContext();
    }

    public final List<t> q3(MissionInfoResponse missionInfoResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t.f62765h.a(missionInfoResponse));
        List<Mission> missions = missionInfoResponse.getCategorySecond().getMissions();
        ArrayList arrayList2 = new ArrayList(xn.t.u(missions, 10));
        int i10 = 0;
        for (Object obj : missions) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            Mission mission = (Mission) obj;
            arrayList2.add(Boolean.valueOf(arrayList.add(t.f62765h.b(missionInfoResponse, i10))));
            i10 = i11;
        }
        return arrayList;
    }

    public final z8.l r3() {
        return (z8.l) this.B0.getValue();
    }

    public final t8.u s3() {
        return (t8.u) this.E0.b(this, H0[0]);
    }

    public final tb.c t3() {
        return (tb.c) this.f62730z0.getValue();
    }

    public final b u3() {
        return this.f62729y0;
    }

    public final MRLogger v3() {
        return (MRLogger) this.C0.getValue();
    }

    public final z8.j w3() {
        return (z8.j) this.A0.getValue();
    }

    public final v x3() {
        return (v) this.D0.getValue();
    }
}
