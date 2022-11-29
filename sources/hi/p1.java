package hi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class p1 implements Parcelable.Creator<o1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o1 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 2:
                    j11 = SafeParcelReader.u(parcel, r10);
                    break;
                case 3:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 8:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new o1(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o1[] newArray(int i10) {
        return new o1[i10];
    }
}
