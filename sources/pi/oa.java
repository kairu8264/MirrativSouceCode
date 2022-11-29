package pi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class oa implements Parcelable.Creator<na> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ na createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j15 = -2147483648L;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                case 6:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 7:
                    j11 = SafeParcelReader.u(parcel, r10);
                    break;
                case 8:
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 9:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 10:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 11:
                    j15 = SafeParcelReader.u(parcel, r10);
                    break;
                case 12:
                    str6 = SafeParcelReader.f(parcel, r10);
                    break;
                case 13:
                    j12 = SafeParcelReader.u(parcel, r10);
                    break;
                case 14:
                    j13 = SafeParcelReader.u(parcel, r10);
                    break;
                case 15:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 16:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
                case 18:
                    z13 = SafeParcelReader.m(parcel, r10);
                    break;
                case 19:
                    str7 = SafeParcelReader.f(parcel, r10);
                    break;
                case 21:
                    bool = SafeParcelReader.n(parcel, r10);
                    break;
                case 22:
                    j14 = SafeParcelReader.u(parcel, r10);
                    break;
                case 23:
                    arrayList = SafeParcelReader.h(parcel, r10);
                    break;
                case 24:
                    str8 = SafeParcelReader.f(parcel, r10);
                    break;
                case 25:
                    str9 = SafeParcelReader.f(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new na(str, str2, str3, str4, j10, j11, str5, z10, z12, j15, str6, j12, j13, i10, z11, z13, str7, bool, j14, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na[] newArray(int i10) {
        return new na[i10];
    }
}
