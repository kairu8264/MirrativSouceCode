package pi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class v implements Parcelable.Creator<u> {
    public static void a(u uVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, uVar.f48250w, false);
        sh.b.p(parcel, 3, uVar.f48251x, i10, false);
        sh.b.q(parcel, 4, uVar.f48252y, false);
        sh.b.n(parcel, 5, uVar.f48253z);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ u createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        s sVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 3) {
                sVar = (s) SafeParcelReader.e(parcel, r10, s.CREATOR);
            } else if (l10 == 4) {
                str2 = SafeParcelReader.f(parcel, r10);
            } else if (l10 != 5) {
                SafeParcelReader.x(parcel, r10);
            } else {
                j10 = SafeParcelReader.u(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new u(str, sVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u[] newArray(int i10) {
        return new u[i10];
    }
}
