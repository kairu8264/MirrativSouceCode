package ri;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        a[] aVarArr = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                j10 = SafeParcelReader.u(parcel, r10);
            } else if (l10 == 3) {
                aVarArr = (a[]) SafeParcelReader.i(parcel, r10, a.CREATOR);
            } else if (l10 == 4) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                z10 = SafeParcelReader.m(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new i(j10, aVarArr, i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
