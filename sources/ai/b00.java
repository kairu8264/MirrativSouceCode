package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class b00 implements Parcelable.Creator<a00> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a00 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        uw uwVar = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 3:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 4:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 5:
                    i12 = SafeParcelReader.t(parcel, r10);
                    break;
                case 6:
                    uwVar = (uw) SafeParcelReader.e(parcel, r10, uw.CREATOR);
                    break;
                case 7:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 8:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new a00(i10, z10, i11, z11, i12, uwVar, z12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a00[] newArray(int i10) {
        return new a00[i10];
    }
}
