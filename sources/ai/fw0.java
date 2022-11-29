package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfaw;

/* loaded from: classes3.dex */
public final class fw0 implements q51 {

    /* renamed from: w  reason: collision with root package name */
    public final pm2 f4225w;

    public fw0(pm2 pm2Var) {
        this.f4225w = pm2Var;
    }

    @Override // ai.q51
    public final void p(Context context) {
        try {
            this.f4225w.l();
        } catch (zzfaw e10) {
            uj0.g("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // ai.q51
    public final void t(Context context) {
        try {
            this.f4225w.i();
        } catch (zzfaw e10) {
            uj0.g("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // ai.q51
    public final void y(Context context) {
        try {
            this.f4225w.m();
            if (context != null) {
                this.f4225w.s(context);
            }
        } catch (zzfaw e10) {
            uj0.g("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
