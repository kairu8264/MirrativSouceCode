package pi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class t implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                bundle = SafeParcelReader.a(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new s(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i10) {
        return new s[i10];
    }
}
