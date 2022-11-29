package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class cn implements Parcelable.Creator<bn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ bn createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 8:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 9:
                    j11 = SafeParcelReader.u(parcel, r10);
                    break;
                case 10:
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 11:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new bn(str, j10, str2, str3, str4, bundle, z10, j11, str5, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ bn[] newArray(int i10) {
        return new bn[i10];
    }
}
