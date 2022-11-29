package ai;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import rh.c;

/* loaded from: classes3.dex */
public final class o40 extends wg.c<w40> {
    public o40(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(we0.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final w40 h0() throws DeadObjectException {
        return (w40) super.B();
    }

    @Override // rh.c
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof w40) {
            return (w40) queryLocalInterface;
        }
        return new w40(iBinder);
    }
}
