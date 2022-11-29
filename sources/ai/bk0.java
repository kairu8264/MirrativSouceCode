package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class bk0 implements Parcelable.Creator<zj0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zj0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 3) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 4) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 5) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 != 6) {
                SafeParcelReader.x(parcel, r10);
            } else {
                z11 = SafeParcelReader.m(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new zj0(str, i10, i11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zj0[] newArray(int i10) {
        return new zj0[i10];
    }
}
