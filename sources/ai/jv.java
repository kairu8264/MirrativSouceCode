package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class jv extends k2 implements lv {
    public jv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // ai.lv
    public final String a() throws RemoteException {
        Parcel s02 = s0(2, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.lv
    public final String c() throws RemoteException {
        Parcel s02 = s0(1, i0());
        String readString = s02.readString();
        s02.recycle();
        return readString;
    }

    @Override // ai.lv
    public final List<js> f() throws RemoteException {
        Parcel s02 = s0(3, i0());
        ArrayList createTypedArrayList = s02.createTypedArrayList(js.CREATOR);
        s02.recycle();
        return createTypedArrayList;
    }
}
