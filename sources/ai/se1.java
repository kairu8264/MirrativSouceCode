package ai;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes3.dex */
public final class se1 implements v41, xb1 {
    public String A;
    public final yn B;

    /* renamed from: w  reason: collision with root package name */
    public final hh0 f9809w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f9810x;

    /* renamed from: y  reason: collision with root package name */
    public final ai0 f9811y;

    /* renamed from: z  reason: collision with root package name */
    public final View f9812z;

    public se1(hh0 hh0Var, Context context, ai0 ai0Var, View view, yn ynVar) {
        this.f9809w = hh0Var;
        this.f9810x = context;
        this.f9811y = ai0Var;
        this.f9812z = view;
        this.B = ynVar;
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
        if (this.f9811y.g(this.f9810x)) {
            try {
                ai0 ai0Var = this.f9811y;
                Context context = this.f9810x;
                ai0Var.w(context, ai0Var.q(context), this.f9809w.b(), ye0Var.zzb(), ye0Var.b());
            } catch (RemoteException e10) {
                uj0.g("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // ai.xb1
    public final void d() {
        String m10 = this.f9811y.m(this.f9810x);
        this.A = m10;
        String valueOf = String.valueOf(m10);
        String str = this.B == yn.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.A = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // ai.v41
    public final void e() {
        View view = this.f9812z;
        if (view != null && this.A != null) {
            this.f9811y.n(view.getContext(), this.A);
        }
        this.f9809w.a(true);
    }

    @Override // ai.v41
    public final void g() {
    }

    @Override // ai.v41
    public final void h() {
        this.f9809w.a(false);
    }

    @Override // ai.v41
    public final void j() {
    }

    @Override // ai.v41
    public final void k() {
    }

    @Override // ai.xb1
    public final void zzb() {
    }
}
