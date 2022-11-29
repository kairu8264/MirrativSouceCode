package pg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yf.b;
import yf.c;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: pg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0724a extends b implements a {

        /* renamed from: pg.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0725a extends yf.a implements a {
            public C0725a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // pg.a
            public final Bundle z1(Bundle bundle) throws RemoteException {
                Parcel i02 = i0();
                c.b(i02, bundle);
                Parcel s02 = s0(i02);
                Bundle bundle2 = (Bundle) c.a(s02, Bundle.CREATOR);
                s02.recycle();
                return bundle2;
            }
        }

        public static a i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0725a(iBinder);
        }
    }

    Bundle z1(Bundle bundle) throws RemoteException;
}
