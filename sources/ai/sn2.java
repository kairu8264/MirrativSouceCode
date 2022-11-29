package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class sn2 implements Parcelable.Creator<rn2> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ rn2 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 3:
                    i12 = SafeParcelReader.t(parcel, r10);
                    break;
                case 4:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                case 5:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 6:
                    i14 = SafeParcelReader.t(parcel, r10);
                    break;
                case 7:
                    i15 = SafeParcelReader.t(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new rn2(i10, i11, i12, i13, str, i14, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ rn2[] newArray(int i10) {
        return new rn2[i10];
    }
}
