package ai;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class y50<AdT> extends sg.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12448a;

    /* renamed from: b  reason: collision with root package name */
    public final es f12449b;

    /* renamed from: c  reason: collision with root package name */
    public final au f12450c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12451d;

    /* renamed from: e  reason: collision with root package name */
    public final w80 f12452e;

    /* renamed from: f  reason: collision with root package name */
    public rg.l f12453f;

    public y50(Context context, String str) {
        w80 w80Var = new w80();
        this.f12452e = w80Var;
        this.f12448a = context;
        this.f12451d = str;
        this.f12449b = es.f3758a;
        this.f12450c = dt.b().g(context, new fs(), str, w80Var);
    }

    @Override // zg.a
    public final void b(rg.l lVar) {
        try {
            this.f12453f = lVar;
            au auVar = this.f12450c;
            if (auVar != null) {
                auVar.N1(new gt(lVar));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // zg.a
    public final void c(boolean z10) {
        try {
            au auVar = this.f12450c;
            if (auVar != null) {
                auVar.n0(z10);
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // zg.a
    public final void d(Activity activity) {
        if (activity == null) {
            uj0.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            au auVar = this.f12450c;
            if (auVar != null) {
                auVar.E3(yh.b.h1(activity));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void e(wv wvVar, rg.d<AdT> dVar) {
        try {
            if (this.f12450c != null) {
                this.f12452e.S5(wvVar.l());
                this.f12450c.V3(this.f12449b.a(this.f12448a, wvVar), new wr(dVar, this));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            dVar.a(new rg.m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
