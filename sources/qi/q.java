package qi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.c;
import java.util.List;

/* loaded from: classes3.dex */
public final class q extends rh.g<d> {
    public q(Context context, Looper looper, rh.d dVar, c.a aVar, c.b bVar) {
        super(context, looper, 185, dVar, aVar, bVar);
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    public final synchronized String j0(ii.c cVar) throws RemoteException {
        d n02;
        n02 = n0();
        if (n02 != null) {
        } else {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return n02.A(cVar.toString());
    }

    public final synchronized String k0(String str) throws RemoteException {
        d n02;
        n02 = n0();
        if (n02 != null) {
        } else {
            throw new RemoteException("no service for getListLayoutPackage call");
        }
        return n02.v(str);
    }

    @Override // rh.c
    public final int l() {
        return 12600000;
    }

    public final synchronized List<ii.c> l0(List<ii.c> list) throws RemoteException {
        d n02;
        n02 = n0();
        if (n02 != null) {
        } else {
            throw new RemoteException("no service for getLicenseList call");
        }
        return n02.p4(list);
    }

    public final synchronized String m0(String str) throws RemoteException {
        d n02;
        n02 = n0();
        if (n02 != null) {
        } else {
            throw new RemoteException("no service for getLicenseLayoutPackage call");
        }
        return n02.t(str);
    }

    public final d n0() {
        try {
            return (d) super.B();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // rh.c
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new e(iBinder);
    }

    @Override // rh.c
    public final boolean r() {
        return true;
    }
}
