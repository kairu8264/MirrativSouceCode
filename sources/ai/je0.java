package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class je0 implements Parcelable.Creator<ie0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ie0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Bundle bundle = null;
        zj0 zj0Var = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        rn2 rn2Var = null;
        String str4 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 2:
                    zj0Var = (zj0) SafeParcelReader.e(parcel, r10, zj0.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, r10, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(parcel, r10);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, r10, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
                case 9:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 10:
                    rn2Var = (rn2) SafeParcelReader.e(parcel, r10, rn2.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new ie0(bundle, zj0Var, applicationInfo, str, arrayList, packageInfo, str2, str3, rn2Var, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ie0[] newArray(int i10) {
        return new ie0[i10];
    }
}
