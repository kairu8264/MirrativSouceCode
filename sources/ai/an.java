package ai;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import rh.c;

/* loaded from: classes3.dex */
public final class an extends wg.c<dn> {
    public an(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(we0.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean h0() {
        return ((Boolean) ft.c().c(ox.f8030l1)).booleanValue() && vh.b.c(m(), rg.x.f51394a);
    }

    public final dn i0() throws DeadObjectException {
        return (dn) super.B();
    }

    @Override // rh.c
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof dn) {
            return (dn) queryLocalInterface;
        }
        return new dn(iBinder);
    }

    @Override // rh.c
    public final nh.c[] t() {
        return rg.x.f51395b;
    }
}
