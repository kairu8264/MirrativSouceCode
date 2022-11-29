package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class ms implements Parcelable.Creator<ls> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ls createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i10 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new ls(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ls[] newArray(int i10) {
        return new ls[i10];
    }
}
