package pi;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import rh.c;

/* loaded from: classes3.dex */
public final class m3 extends rh.c<g3> {
    public m3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // rh.c
    public final int l() {
        return nh.g.f43544a;
    }

    @Override // rh.c
    public final /* synthetic */ g3 q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof g3 ? (g3) queryLocalInterface : new d3(iBinder);
    }
}
