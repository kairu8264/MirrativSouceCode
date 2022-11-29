package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class q40 implements Parcelable.Creator<p40> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p40 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 2) {
                strArr = SafeParcelReader.g(parcel, r10);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                strArr2 = SafeParcelReader.g(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new p40(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p40[] newArray(int i10) {
        return new p40[i10];
    }
}
