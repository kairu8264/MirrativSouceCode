package sh;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import rh.p;

/* loaded from: classes3.dex */
public final class d {
    public static <T extends c> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        p.i(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public static <T extends c> T b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }
}
