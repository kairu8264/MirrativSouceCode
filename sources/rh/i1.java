package rh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class i1 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    rVar = (r) SafeParcelReader.e(parcel, r10, r.CREATOR);
                    break;
                case 2:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 3:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 4:
                    iArr = SafeParcelReader.c(parcel, r10);
                    break;
                case 5:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.c(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new e(rVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
