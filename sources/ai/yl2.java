package ai;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import tg.e;

/* loaded from: classes3.dex */
public final class yl2 {

    /* renamed from: a  reason: collision with root package name */
    public final uw f12647a;

    /* renamed from: b  reason: collision with root package name */
    public final n50 f12648b;

    /* renamed from: c  reason: collision with root package name */
    public final b62 f12649c;

    /* renamed from: d  reason: collision with root package name */
    public final as f12650d;

    /* renamed from: e  reason: collision with root package name */
    public final fs f12651e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12652f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<String> f12653g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<String> f12654h;

    /* renamed from: i  reason: collision with root package name */
    public final a00 f12655i;

    /* renamed from: j  reason: collision with root package name */
    public final ls f12656j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12657k;

    /* renamed from: l  reason: collision with root package name */
    public final tg.a f12658l;

    /* renamed from: m  reason: collision with root package name */
    public final tg.g f12659m;

    /* renamed from: n  reason: collision with root package name */
    public final hu f12660n;

    /* renamed from: o  reason: collision with root package name */
    public final ol2 f12661o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f12662p;

    /* renamed from: q  reason: collision with root package name */
    public final lu f12663q;

    public /* synthetic */ yl2(wl2 wl2Var, xl2 xl2Var) {
        uw uwVar;
        a00 a00Var;
        this.f12651e = wl2.q(wl2Var);
        this.f12652f = wl2.r(wl2Var);
        this.f12663q = wl2.n(wl2Var);
        int i10 = wl2.p(wl2Var).f1983w;
        long j10 = wl2.p(wl2Var).f1984x;
        Bundle bundle = wl2.p(wl2Var).f1985y;
        int i11 = wl2.p(wl2Var).f1986z;
        List<String> list = wl2.p(wl2Var).A;
        boolean z10 = wl2.p(wl2Var).B;
        int i12 = wl2.p(wl2Var).C;
        boolean z11 = true;
        if (!wl2.p(wl2Var).D && !wl2.t(wl2Var)) {
            z11 = false;
        }
        this.f12650d = new as(i10, j10, bundle, i11, list, z10, i12, z11, wl2.p(wl2Var).E, wl2.p(wl2Var).F, wl2.p(wl2Var).G, wl2.p(wl2Var).H, wl2.p(wl2Var).I, wl2.p(wl2Var).J, wl2.p(wl2Var).K, wl2.p(wl2Var).L, wl2.p(wl2Var).M, wl2.p(wl2Var).N, wl2.p(wl2Var).O, wl2.p(wl2Var).P, wl2.p(wl2Var).Q, wl2.p(wl2Var).R, yg.d2.L(wl2.p(wl2Var).S), wl2.p(wl2Var).T);
        if (wl2.s(wl2Var) != null) {
            uwVar = wl2.s(wl2Var);
        } else {
            uwVar = wl2.w(wl2Var) != null ? wl2.w(wl2Var).B : null;
        }
        this.f12647a = uwVar;
        this.f12653g = wl2.u(wl2Var);
        this.f12654h = wl2.v(wl2Var);
        if (wl2.u(wl2Var) == null) {
            a00Var = null;
        } else {
            a00Var = wl2.w(wl2Var) == null ? new a00(new e.a().a()) : wl2.w(wl2Var);
        }
        this.f12655i = a00Var;
        this.f12656j = wl2.x(wl2Var);
        this.f12657k = wl2.B(wl2Var);
        this.f12658l = wl2.y(wl2Var);
        this.f12659m = wl2.z(wl2Var);
        this.f12660n = wl2.A(wl2Var);
        this.f12648b = wl2.C(wl2Var);
        this.f12661o = new ol2(wl2.D(wl2Var), null);
        this.f12662p = wl2.E(wl2Var);
        this.f12649c = wl2.F(wl2Var);
    }

    public final a20 a() {
        tg.g gVar = this.f12659m;
        if (gVar == null && this.f12658l == null) {
            return null;
        }
        return gVar != null ? gVar.P() : this.f12658l.P();
    }
}
