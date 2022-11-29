package ol;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.c;
import ol.h;
import ol.i;

/* loaded from: classes4.dex */
public class e extends rh.g<i> {
    public e(Context context, Looper looper, rh.d dVar, c.a aVar, c.b bVar) {
        super(context, looper, 131, dVar, aVar, bVar);
    }

    @Override // rh.c
    public String C() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // rh.c
    public String D() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // rh.c
    public boolean Q() {
        return true;
    }

    @Override // rh.c
    /* renamed from: j0 */
    public i q(IBinder iBinder) {
        return i.a.i0(iBinder);
    }

    public void k0(h.a aVar, String str) {
        try {
            ((i) B()).K0(aVar, str);
        } catch (RemoteException unused) {
        }
    }

    @Override // rh.c
    public int l() {
        return nh.g.f43544a;
    }
}
