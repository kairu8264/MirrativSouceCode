package ai;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class he0 implements Parcelable.Creator<ge0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ge0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, r10, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new ge0(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ge0[] newArray(int i10) {
        return new ge0[i10];
    }
}
