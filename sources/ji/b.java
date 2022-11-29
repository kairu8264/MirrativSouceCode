package ji;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.billingclient.api.BillingClient;

/* loaded from: classes3.dex */
public final class b extends e implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // ji.d
    public final Bundle B3(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(10);
        i02.writeString(str);
        i02.writeString(str2);
        g.b(i02, bundle);
        g.b(i02, bundle2);
        Parcel s02 = s0(901, i02);
        Bundle bundle3 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle3;
    }

    @Override // ji.d
    public final Bundle D1(int i10, String str, String str2, String str3) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(3);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(str3);
        Parcel s02 = s0(4, i02);
        Bundle bundle = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle;
    }

    @Override // ji.d
    public final Bundle I5(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(9);
        i02.writeString(str);
        i02.writeString(str2);
        g.b(i02, bundle);
        Parcel s02 = s0(902, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }

    @Override // ji.d
    public final Bundle K3(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(9);
        i02.writeString(str);
        i02.writeString(str2);
        g.b(i02, bundle);
        Parcel s02 = s0(12, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }

    @Override // ji.d
    public final int L1(int i10, String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        i02.writeString(str);
        i02.writeString(str2);
        Parcel s02 = s0(1, i02);
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }

    @Override // ji.d
    public final Bundle P3(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(6);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(str3);
        g.b(i02, bundle);
        Parcel s02 = s0(9, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }

    @Override // ji.d
    public final int Q0(int i10, String str, String str2) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(3);
        i02.writeString(str);
        i02.writeString(str2);
        Parcel s02 = s0(5, i02);
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }

    @Override // ji.d
    public final Bundle U2(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(9);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(str3);
        g.b(i02, bundle);
        Parcel s02 = s0(11, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }

    @Override // ji.d
    public final Bundle l2(int i10, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(i10);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(str3);
        i02.writeString(null);
        g.b(i02, bundle);
        Parcel s02 = s0(8, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }

    @Override // ji.d
    public final Bundle q2(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(3);
        i02.writeString(str);
        i02.writeString(str2);
        g.b(i02, bundle);
        Parcel s02 = s0(2, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }

    @Override // ji.d
    public final Bundle u4(int i10, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(3);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(str3);
        i02.writeString(null);
        Parcel s02 = s0(3, i02);
        Bundle bundle = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle;
    }

    @Override // ji.d
    public final int u5(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(7);
        i02.writeString(str);
        i02.writeString(str2);
        g.b(i02, bundle);
        Parcel s02 = s0(10, i02);
        int readInt = s02.readInt();
        s02.recycle();
        return readInt;
    }

    @Override // ji.d
    public final Bundle w1(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(8);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeString(BillingClient.SkuType.SUBS);
        g.b(i02, bundle);
        Parcel s02 = s0(801, i02);
        Bundle bundle2 = (Bundle) g.a(s02, Bundle.CREATOR);
        s02.recycle();
        return bundle2;
    }
}
