package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ud0 implements Parcelable.Creator<td0> {
    public static final td0 a(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        long j10 = 0;
        long j11 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        Bundle bundle = null;
        as asVar = null;
        fs fsVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zj0 zj0Var = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        a00 a00Var = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        tv tvVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        n50 n50Var = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 3:
                    asVar = (as) SafeParcelReader.e(parcel, r10, as.CREATOR);
                    break;
                case 4:
                    fsVar = (fs) SafeParcelReader.e(parcel, r10, fs.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, r10, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, r10, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 9:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 10:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                case 11:
                    zj0Var = (zj0) SafeParcelReader.e(parcel, r10, zj0.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.a(parcel, r10);
                    break;
                case 13:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 14:
                    arrayList = SafeParcelReader.h(parcel, r10);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.a(parcel, r10);
                    break;
                case 16:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
                case 18:
                    i12 = SafeParcelReader.t(parcel, r10);
                    break;
                case 19:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                case 20:
                    f10 = SafeParcelReader.p(parcel, r10);
                    break;
                case 21:
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 25:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 26:
                    str6 = SafeParcelReader.f(parcel, r10);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.h(parcel, r10);
                    break;
                case 28:
                    str7 = SafeParcelReader.f(parcel, r10);
                    break;
                case 29:
                    a00Var = (a00) SafeParcelReader.e(parcel, r10, a00.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.h(parcel, r10);
                    break;
                case 31:
                    j11 = SafeParcelReader.u(parcel, r10);
                    break;
                case 33:
                    str8 = SafeParcelReader.f(parcel, r10);
                    break;
                case 34:
                    f11 = SafeParcelReader.p(parcel, r10);
                    break;
                case 35:
                    i14 = SafeParcelReader.t(parcel, r10);
                    break;
                case 36:
                    i15 = SafeParcelReader.t(parcel, r10);
                    break;
                case 37:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 39:
                    str9 = SafeParcelReader.f(parcel, r10);
                    break;
                case 40:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 41:
                    str10 = SafeParcelReader.f(parcel, r10);
                    break;
                case 42:
                    z13 = SafeParcelReader.m(parcel, r10);
                    break;
                case 43:
                    i16 = SafeParcelReader.t(parcel, r10);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.a(parcel, r10);
                    break;
                case 45:
                    str11 = SafeParcelReader.f(parcel, r10);
                    break;
                case 46:
                    tvVar = (tv) SafeParcelReader.e(parcel, r10, tv.CREATOR);
                    break;
                case 47:
                    z14 = SafeParcelReader.m(parcel, r10);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.a(parcel, r10);
                    break;
                case 49:
                    str12 = SafeParcelReader.f(parcel, r10);
                    break;
                case 50:
                    str13 = SafeParcelReader.f(parcel, r10);
                    break;
                case 51:
                    str14 = SafeParcelReader.f(parcel, r10);
                    break;
                case 52:
                    z15 = SafeParcelReader.m(parcel, r10);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.d(parcel, r10);
                    break;
                case 54:
                    str15 = SafeParcelReader.f(parcel, r10);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.h(parcel, r10);
                    break;
                case 56:
                    i17 = SafeParcelReader.t(parcel, r10);
                    break;
                case 57:
                    z16 = SafeParcelReader.m(parcel, r10);
                    break;
                case 58:
                    z17 = SafeParcelReader.m(parcel, r10);
                    break;
                case 59:
                    z18 = SafeParcelReader.m(parcel, r10);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.h(parcel, r10);
                    break;
                case 61:
                    str16 = SafeParcelReader.f(parcel, r10);
                    break;
                case 63:
                    n50Var = (n50) SafeParcelReader.e(parcel, r10, n50.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.f(parcel, r10);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.a(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new td0(i10, bundle, asVar, fsVar, str, applicationInfo, packageInfo, str2, str3, str4, zj0Var, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j10, str6, arrayList2, str7, a00Var, arrayList3, j11, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, tvVar, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, n50Var, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ td0 createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ td0[] newArray(int i10) {
        return new td0[i10];
    }
}
