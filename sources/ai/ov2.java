package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class ov2 implements Parcelable.Creator<mv2> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ mv2 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
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
            } else if (l10 == 3) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 4) {
                str2 = SafeParcelReader.f(parcel, r10);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i12 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new mv2(i10, i11, i12, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ mv2[] newArray(int i10) {
        return new mv2[i10];
    }
}
