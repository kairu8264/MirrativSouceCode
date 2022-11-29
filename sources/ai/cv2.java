package ai;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import rh.c;

/* loaded from: classes3.dex */
public final class cv2 extends wg.c<hv2> {

    /* renamed from: b0  reason: collision with root package name */
    public final int f3050b0;

    public cv2(Context context, Looper looper, c.a aVar, c.b bVar, int i10) {
        super(context, looper, 116, aVar, bVar, null);
        this.f3050b0 = i10;
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.gass.START";
    }

    public final hv2 h0() throws DeadObjectException {
        return (hv2) super.B();
    }

    @Override // rh.c
    public final int l() {
        return this.f3050b0;
    }

    @Override // rh.c
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof hv2) {
            return (hv2) queryLocalInterface;
        }
        return new hv2(iBinder);
    }
}
