package wg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        String str = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 2:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 3:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 6:
                    f10 = SafeParcelReader.p(parcel, r10);
                    break;
                case 7:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 8:
                    z13 = SafeParcelReader.m(parcel, r10);
                    break;
                case 9:
                    z14 = SafeParcelReader.m(parcel, r10);
                    break;
                case 10:
                    z15 = SafeParcelReader.m(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new j(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
