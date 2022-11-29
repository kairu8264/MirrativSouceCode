package ci;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class d extends rh.g<g> {
    public d(Context context, Looper looper, rh.d dVar, ph.d dVar2, ph.j jVar) {
        super(context, looper, 300, dVar, dVar2, jVar);
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // rh.c
    public final boolean G() {
        return true;
    }

    @Override // rh.c
    public final boolean Q() {
        return true;
    }

    @Override // rh.c
    public final int l() {
        return 212800000;
    }

    @Override // rh.c
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // rh.c
    public final nh.c[] t() {
        return ih.h.f36824b;
    }
}
