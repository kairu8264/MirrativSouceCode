package rh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class z0 implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 3) {
                z11 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 4) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i12 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new r(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i10) {
        return new r[i10];
    }
}
