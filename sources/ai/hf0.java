package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class hf0 implements Parcelable.Creator<gf0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ gf0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        as asVar = null;
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                asVar = (as) SafeParcelReader.e(parcel, r10, as.CREATOR);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                str = SafeParcelReader.f(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new gf0(asVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ gf0[] newArray(int i10) {
        return new gf0[i10];
    }
}
