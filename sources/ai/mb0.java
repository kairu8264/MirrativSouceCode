package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class mb0 implements Parcelable.Creator<lb0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lb0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i12 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new lb0(i10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lb0[] newArray(int i10) {
        return new lb0[i10];
    }
}
