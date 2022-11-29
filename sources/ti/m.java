package ti;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import rh.p0;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        p0 p0Var = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, r10, ConnectionResult.CREATOR);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                p0Var = (p0) SafeParcelReader.e(parcel, r10, p0.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new l(i10, connectionResult, p0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
