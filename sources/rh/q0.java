package rh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class q0 implements Parcelable.Creator<p0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                iBinder = SafeParcelReader.s(parcel, r10);
            } else if (l10 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, r10, ConnectionResult.CREATOR);
            } else if (l10 == 4) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                z11 = SafeParcelReader.m(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new p0(i10, iBinder, connectionResult, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p0[] newArray(int i10) {
        return new p0[i10];
    }
}
