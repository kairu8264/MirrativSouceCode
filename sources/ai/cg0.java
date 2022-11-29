package ai;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class cg0 extends gh.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2804a;

    /* renamed from: b  reason: collision with root package name */
    public final sf0 f2805b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2806c;

    /* renamed from: d  reason: collision with root package name */
    public final kg0 f2807d = new kg0();

    /* renamed from: e  reason: collision with root package name */
    public rg.l f2808e;

    public cg0(Context context, String str) {
        this.f2806c = context.getApplicationContext();
        this.f2804a = str;
        this.f2805b = dt.b().i(context, str, new w80());
    }

    @Override // gh.b
    public final void b(rg.l lVar) {
        this.f2808e = lVar;
        this.f2807d.R5(lVar);
    }

    @Override // gh.b
    public final void c(Activity activity, rg.q qVar) {
        this.f2807d.S5(qVar);
        if (activity == null) {
            uj0.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            sf0 sf0Var = this.f2805b;
            if (sf0Var != null) {
                sf0Var.o4(this.f2807d);
                this.f2805b.S(yh.b.h1(activity));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d(wv wvVar, gh.c cVar) {
        try {
            sf0 sf0Var = this.f2805b;
            if (sf0Var != null) {
                sf0Var.t5(es.f3758a.a(this.f2806c, wvVar), new gg0(cVar, this));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }
}
