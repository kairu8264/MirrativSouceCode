package ai;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class cs implements Parcelable.Creator<as> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ as createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        rw rwVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        qr qrVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 3:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 4:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(parcel, r10);
                    break;
                case 6:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 7:
                    i12 = SafeParcelReader.t(parcel, r10);
                    break;
                case 8:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 9:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 10:
                    rwVar = (rw) SafeParcelReader.e(parcel, r10, rw.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.e(parcel, r10, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.a(parcel, r10);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.a(parcel, r10);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.h(parcel, r10);
                    break;
                case 16:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 17:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                case 18:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 19:
                    qrVar = (qr) SafeParcelReader.e(parcel, r10, qr.CREATOR);
                    break;
                case 20:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                case 21:
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.h(parcel, r10);
                    break;
                case 23:
                    i14 = SafeParcelReader.t(parcel, r10);
                    break;
                case 24:
                    str6 = SafeParcelReader.f(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new as(i10, j10, bundle, i11, arrayList, z10, i12, z11, str, rwVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, qrVar, i13, str5, arrayList3, i14, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ as[] newArray(int i10) {
        return new as[i10];
    }
}
