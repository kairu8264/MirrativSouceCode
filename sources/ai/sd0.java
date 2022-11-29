package ai;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import rh.c;

/* loaded from: classes3.dex */
public final class sd0 extends wg.c<ae0> {
    public sd0(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(we0.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.ads.service.START";
    }

    public final ae0 h0() throws DeadObjectException {
        return (ae0) super.B();
    }

    @Override // rh.c
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof ae0) {
            return (ae0) queryLocalInterface;
        }
        return new xd0(iBinder);
    }
}
