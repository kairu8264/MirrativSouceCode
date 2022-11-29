package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class gs implements Parcelable.Creator<fs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ fs createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        fs[] fsVarArr = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 4:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 5:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 6:
                    i12 = SafeParcelReader.t(parcel, r10);
                    break;
                case 7:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                case 8:
                    fsVarArr = (fs[]) SafeParcelReader.i(parcel, r10, fs.CREATOR);
                    break;
                case 9:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 10:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 11:
                    z13 = SafeParcelReader.m(parcel, r10);
                    break;
                case 12:
                    z14 = SafeParcelReader.m(parcel, r10);
                    break;
                case 13:
                    z15 = SafeParcelReader.m(parcel, r10);
                    break;
                case 14:
                    z16 = SafeParcelReader.m(parcel, r10);
                    break;
                case 15:
                    z17 = SafeParcelReader.m(parcel, r10);
                    break;
                case 16:
                    z18 = SafeParcelReader.m(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new fs(str, i10, i11, z10, i12, i13, fsVarArr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ fs[] newArray(int i10) {
        return new fs[i10];
    }
}
