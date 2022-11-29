package ai;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class fd0 extends k2 implements hd0 {
    public fd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // ai.hd0
    public final void s(String str) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        z0(2, i02);
    }

    @Override // ai.hd0
    public final void v0(List<Uri> list) throws RemoteException {
        Parcel i02 = i0();
        i02.writeTypedList(list);
        z0(1, i02);
    }
}
