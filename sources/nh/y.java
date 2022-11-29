package nh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class y implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ x createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 2) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 3) {
                z11 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 4) {
                iBinder = SafeParcelReader.s(parcel, r10);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                z12 = SafeParcelReader.m(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new x(str, z10, z11, iBinder, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x[] newArray(int i10) {
        return new x[i10];
    }
}
