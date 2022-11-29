package mh;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 1) {
                SafeParcelReader.x(parcel, r10);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, r10, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
