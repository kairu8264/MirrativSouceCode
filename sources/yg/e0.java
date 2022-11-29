package yg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class e0 implements Parcelable.Creator<d0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i10 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new d0(str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d0[] newArray(int i10) {
        return new d0[i10];
    }
}
