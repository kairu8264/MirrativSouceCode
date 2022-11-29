package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class ig0 implements Parcelable.Creator<hg0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hg0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                str2 = SafeParcelReader.f(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new hg0(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hg0[] newArray(int i10) {
        return new hg0[i10];
    }
}
