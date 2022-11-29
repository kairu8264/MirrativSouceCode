package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class by0 extends u01 {

    /* renamed from: i  reason: collision with root package name */
    public final View f2583i;

    /* renamed from: j  reason: collision with root package name */
    public final rp0 f2584j;

    /* renamed from: k  reason: collision with root package name */
    public final il2 f2585k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2586l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2587m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2588n;

    /* renamed from: o  reason: collision with root package name */
    public final tx0 f2589o;

    /* renamed from: p  reason: collision with root package name */
    public qm f2590p;

    public by0(t01 t01Var, View view, rp0 rp0Var, il2 il2Var, int i10, boolean z10, boolean z11, tx0 tx0Var) {
        super(t01Var);
        this.f2583i = view;
        this.f2584j = rp0Var;
        this.f2585k = il2Var;
        this.f2586l = i10;
        this.f2587m = z10;
        this.f2588n = z11;
        this.f2589o = tx0Var;
    }

    public final il2 g() {
        return cm2.a(this.f10528b.f4107r, this.f2585k);
    }

    public final View h() {
        return this.f2583i;
    }

    public final int i() {
        return this.f2586l;
    }

    public final boolean j() {
        return this.f2587m;
    }

    public final boolean k() {
        return this.f2588n;
    }

    public final boolean l() {
        return this.f2584j.i0() != null && this.f2584j.i0().d();
    }

    public final boolean m() {
        return this.f2584j.P0();
    }

    public final void n(jm jmVar) {
        this.f2584j.R0(jmVar);
    }

    public final void o(long j10, int i10) {
        this.f2589o.a(j10, i10);
    }

    public final void p(qm qmVar) {
        this.f2590p = qmVar;
    }

    public final qm q() {
        return this.f2590p;
    }
}
