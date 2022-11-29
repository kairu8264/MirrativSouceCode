package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class ur implements Parcelable.Creator<sr> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ sr createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        sr srVar = null;
        IBinder iBinder = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 3) {
                str2 = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 4) {
                srVar = (sr) SafeParcelReader.e(parcel, r10, sr.CREATOR);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                iBinder = SafeParcelReader.s(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new sr(i10, str, str2, srVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ sr[] newArray(int i10) {
        return new sr[i10];
    }
}
