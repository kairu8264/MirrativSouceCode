package xg;

import ai.zj0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class p implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        e eVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zj0 zj0Var = null;
        String str4 = null;
        wg.j jVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 2:
                    eVar = (e) SafeParcelReader.e(parcel, r10, e.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.s(parcel, r10);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.s(parcel, r10);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.s(parcel, r10);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.s(parcel, r10);
                    break;
                case 7:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 9:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.s(parcel, r10);
                    break;
                case 11:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 12:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 13:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 14:
                    zj0Var = (zj0) SafeParcelReader.e(parcel, r10, zj0.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
                case 16:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                case 17:
                    jVar = (wg.j) SafeParcelReader.e(parcel, r10, wg.j.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.s(parcel, r10);
                    break;
                case 19:
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 20:
                    iBinder7 = SafeParcelReader.s(parcel, r10);
                    break;
                case 21:
                    iBinder8 = SafeParcelReader.s(parcel, r10);
                    break;
                case 22:
                    iBinder9 = SafeParcelReader.s(parcel, r10);
                    break;
                case 23:
                    iBinder10 = SafeParcelReader.s(parcel, r10);
                    break;
                case 24:
                    str6 = SafeParcelReader.f(parcel, r10);
                    break;
                case 25:
                    str7 = SafeParcelReader.f(parcel, r10);
                    break;
                case 26:
                    iBinder11 = SafeParcelReader.s(parcel, r10);
                    break;
                case 27:
                    iBinder12 = SafeParcelReader.s(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new AdOverlayInfoParcel(eVar, iBinder, iBinder2, iBinder3, iBinder4, str, z10, str2, iBinder5, i10, i11, str3, zj0Var, str4, jVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdOverlayInfoParcel[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
