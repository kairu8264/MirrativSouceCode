package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class e50 implements Parcelable.Creator<d50> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d50 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 2) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 3) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 4) {
                SafeParcelReader.x(parcel, r10);
            } else {
                str2 = SafeParcelReader.f(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new d50(str, z10, i10, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d50[] newArray(int i10) {
        return new d50[i10];
    }
}
