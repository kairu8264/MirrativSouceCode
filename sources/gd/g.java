package gd;

import ad.l2;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin.CoinHistory;
import dq.l;
import gd.d;
import ha.a;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import v0.s;
import xn.a0;
import xn.t;

/* loaded from: classes2.dex */
public final class g extends q0 {
    public final e0<Integer> A;
    public final LiveData<Integer> B;
    public final s0<ha.a> C;
    public final c2<ha.a> D;
    public final s0<Integer> E;
    public final c2<Integer> F;
    public final s0<Integer> G;
    public final c2<Integer> H;
    public final s0<Integer> I;
    public final c2<Integer> J;
    public final s0<id.d> K;
    public final c2<id.d> L;
    public final s<j> M;
    public final List<j> N;
    public final s0<Boolean> O;
    public final s0<Boolean> P;
    public final e0<Integer> Q;
    public final LiveData<Integer> R;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f33239y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f33240z;

    public g(q8.a aVar, Resources resources) {
        s0<ha.a> e10;
        s0<Integer> e11;
        s0<Integer> e12;
        s0<Integer> e13;
        s0<id.d> e14;
        s0<Boolean> e15;
        p.h(aVar, "dispatcher");
        p.h(resources, "resources");
        this.f33239y = aVar;
        this.f33240z = resources;
        aVar.b(this);
        e0<Integer> e0Var = new e0<>(0);
        this.A = e0Var;
        this.B = e0Var;
        e10 = z1.e(a.d.f34697b, null, 2, null);
        this.C = e10;
        this.D = e10;
        e11 = z1.e(0, null, 2, null);
        this.E = e11;
        this.F = e11;
        e12 = z1.e(0, null, 2, null);
        this.G = e12;
        this.H = e12;
        e13 = z1.e(0, null, 2, null);
        this.I = e13;
        this.J = e13;
        e14 = z1.e(null, null, 2, null);
        this.K = e14;
        this.L = e14;
        s<j> c10 = u1.c();
        this.M = c10;
        this.N = c10;
        e15 = z1.e(Boolean.FALSE, null, 2, null);
        this.O = e15;
        this.P = e15;
        e0<Integer> e0Var2 = new e0<>(null);
        this.Q = e0Var2;
        this.R = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f33239y.c(this);
        super.d();
    }

    public final LiveData<Integer> f() {
        return this.R;
    }

    public final c2<Integer> g() {
        return this.H;
    }

    public final List<j> h() {
        return this.N;
    }

    public final LiveData<Integer> i() {
        return this.B;
    }

    public final c2<Integer> j() {
        return this.J;
    }

    public final c2<Integer> k() {
        return this.F;
    }

    public final c2<id.d> l() {
        return this.L;
    }

    public final c2<ha.a> m() {
        return this.D;
    }

    public final s0<Boolean> n() {
        return this.P;
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.h hVar) {
        p.h(hVar, "event");
        this.C.setValue(a.b.f34695b);
        this.M.clear();
        this.A.p(0);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.f fVar) {
        p.h(fVar, "event");
        this.C.setValue(a.c.f34696b);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.C0401d c0401d) {
        p.h(c0401d, "event");
        this.C.setValue((this.N.isEmpty() && c0401d.a().getHistories().isEmpty()) ? a.e.f34698b : a.d.f34697b);
        this.A.p(Integer.valueOf(c0401d.a().getNextPage()));
        s<j> sVar = this.M;
        List<CoinHistory> histories = c0401d.a().getHistories();
        ArrayList arrayList = new ArrayList(t.u(histories, 10));
        for (CoinHistory coinHistory : histories) {
            arrayList.add(j.f33247e.a(this.f33240z, coinHistory));
        }
        sVar.addAll(arrayList);
        this.E.setValue(Integer.valueOf((int) c0401d.a().getCoin()));
        this.G.setValue(Integer.valueOf((int) c0401d.a().getFreeCoin()));
        this.I.setValue(Integer.valueOf((int) c0401d.a().getPaidCoin()));
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.b bVar) {
        p.h(bVar, "event");
        this.C.setValue(new a.C0439a(bVar.a()));
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.e eVar) {
        p.h(eVar, "event");
        s0<id.d> s0Var = this.K;
        id.d b10 = id.d.f36757i.b(eVar.a());
        if (!(b10.e() != l2.NOT_RANK)) {
            b10 = null;
        }
        s0Var.setValue(b10);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.a aVar) {
        p.h(aVar, "event");
        this.O.setValue(Boolean.valueOf(a0.Z(aVar.a().getRewardAdIds()) != null));
        this.Q.p(a0.Z(aVar.a().getRewardAdIds()));
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(d.i iVar) {
        p.h(iVar, "event");
        if (this.Q.f() == null) {
            this.O.setValue(Boolean.FALSE);
        } else {
            this.O.setValue(Boolean.valueOf(iVar.a()));
        }
    }
}
