package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class sw implements Parcelable.Creator<rw> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ rw createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 15) {
                SafeParcelReader.x(parcel, r10);
            } else {
                str = SafeParcelReader.f(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new rw(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ rw[] newArray(int i10) {
        return new rw[i10];
    }
}
