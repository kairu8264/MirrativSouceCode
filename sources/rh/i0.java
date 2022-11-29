package rh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class i0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
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
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 5:
                    j11 = SafeParcelReader.u(parcel, r10);
                    break;
                case 6:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                case 9:
                    i14 = SafeParcelReader.t(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new m(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
