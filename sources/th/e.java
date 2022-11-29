package th;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ph.j;
import rh.g;
import rh.w;

/* loaded from: classes3.dex */
public final class e extends g<a> {

    /* renamed from: e0  reason: collision with root package name */
    public final w f53646e0;

    public e(Context context, Looper looper, rh.d dVar, w wVar, ph.d dVar2, j jVar) {
        super(context, looper, 270, dVar, dVar2, jVar);
        this.f53646e0 = wVar;
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // rh.c
    public final boolean G() {
        return true;
    }

    @Override // rh.c
    public final int l() {
        return 203400000;
    }

    @Override // rh.c
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // rh.c
    public final nh.c[] t() {
        return di.d.f29656b;
    }

    @Override // rh.c
    public final Bundle y() {
        return this.f53646e0.d();
    }
}
