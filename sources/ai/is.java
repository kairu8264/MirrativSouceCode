package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class is implements Parcelable.Creator<hs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hs createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 3) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 != 4) {
                SafeParcelReader.x(parcel, r10);
            } else {
                j10 = SafeParcelReader.u(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new hs(i10, i11, str, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hs[] newArray(int i10) {
        return new hs[i10];
    }
}
