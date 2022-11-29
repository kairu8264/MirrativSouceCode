package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class si0 implements Parcelable.Creator<ri0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ri0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        fs fsVar = null;
        as asVar = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 2) {
                str2 = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 3) {
                fsVar = (fs) SafeParcelReader.e(parcel, r10, fs.CREATOR);
            } else if (l10 != 4) {
                SafeParcelReader.x(parcel, r10);
            } else {
                asVar = (as) SafeParcelReader.e(parcel, r10, as.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new ri0(str, str2, fsVar, asVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ri0[] newArray(int i10) {
        return new ri0[i10];
    }
}
