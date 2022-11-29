package ti;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import rh.n0;

/* loaded from: classes3.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        n0 n0Var = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                n0Var = (n0) SafeParcelReader.e(parcel, r10, n0.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new j(i10, n0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
