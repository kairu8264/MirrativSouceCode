package xg;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class d implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z10 = false;
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
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 7:
                    str6 = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                    str7 = SafeParcelReader.f(parcel, r10);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.e(parcel, r10, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = SafeParcelReader.s(parcel, r10);
                    break;
                case 11:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new e(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
