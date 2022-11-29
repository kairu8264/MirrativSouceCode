package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class bv2 implements Parcelable.Creator<av2> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ av2 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                bArr = SafeParcelReader.b(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new av2(i10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ av2[] newArray(int i10) {
        return new av2[i10];
    }
}
