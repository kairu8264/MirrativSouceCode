package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 2) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                j10 = SafeParcelReader.u(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new c(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
