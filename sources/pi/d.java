package pi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class d implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        ea eaVar = null;
        String str3 = null;
        u uVar = null;
        u uVar2 = null;
        u uVar3 = null;
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
                    eaVar = (ea) SafeParcelReader.e(parcel, r10, ea.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 6:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                    uVar = (u) SafeParcelReader.e(parcel, r10, u.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.u(parcel, r10);
                    break;
                case 10:
                    uVar2 = (u) SafeParcelReader.e(parcel, r10, u.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.u(parcel, r10);
                    break;
                case 12:
                    uVar3 = (u) SafeParcelReader.e(parcel, r10, u.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new c(str, str2, eaVar, j10, z10, str3, uVar, j11, uVar2, j12, uVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
