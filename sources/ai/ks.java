package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class ks implements Parcelable.Creator<js> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ js createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        sr srVar = null;
        Bundle bundle = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 2) {
                j10 = SafeParcelReader.u(parcel, r10);
            } else if (l10 == 3) {
                srVar = (sr) SafeParcelReader.e(parcel, r10, sr.CREATOR);
            } else if (l10 != 4) {
                SafeParcelReader.x(parcel, r10);
            } else {
                bundle = SafeParcelReader.a(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new js(str, j10, srVar, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ js[] newArray(int i10) {
        return new js[i10];
    }
}
