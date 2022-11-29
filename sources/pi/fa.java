package pi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class fa implements Parcelable.Creator<ea> {
    public static void a(ea eaVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, eaVar.f47792w);
        sh.b.q(parcel, 2, eaVar.f47793x, false);
        sh.b.n(parcel, 3, eaVar.f47794y);
        sh.b.o(parcel, 4, eaVar.f47795z, false);
        sh.b.i(parcel, 5, null, false);
        sh.b.q(parcel, 6, eaVar.A, false);
        sh.b.q(parcel, 7, eaVar.B, false);
        sh.b.g(parcel, 8, eaVar.C, false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ea createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 4:
                    l10 = SafeParcelReader.v(parcel, r10);
                    break;
                case 5:
                    f10 = SafeParcelReader.q(parcel, r10);
                    break;
                case 6:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                    d10 = SafeParcelReader.o(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new ea(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ea[] newArray(int i10) {
        return new ea[i10];
    }
}
