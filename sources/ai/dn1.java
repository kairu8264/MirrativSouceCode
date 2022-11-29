package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class dn1 implements q51 {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f3353w;

    public dn1(rp0 rp0Var) {
        this.f3353w = rp0Var;
    }

    @Override // ai.q51
    public final void p(Context context) {
        rp0 rp0Var = this.f3353w;
        if (rp0Var != null) {
            rp0Var.onPause();
        }
    }

    @Override // ai.q51
    public final void t(Context context) {
        rp0 rp0Var = this.f3353w;
        if (rp0Var != null) {
            rp0Var.destroy();
        }
    }

    @Override // ai.q51
    public final void y(Context context) {
        rp0 rp0Var = this.f3353w;
        if (rp0Var != null) {
            rp0Var.onResume();
        }
    }
}
