package ol;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public class b implements Parcelable.Creator<a> {
    public static void c(a aVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, aVar.S(), false);
        sh.b.q(parcel, 2, aVar.P(), false);
        sh.b.k(parcel, 3, aVar.k0());
        sh.b.n(parcel, 4, aVar.p());
        sh.b.e(parcel, 5, aVar.U(), false);
        sh.b.p(parcel, 6, aVar.r0(), i10, false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 4:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 5:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, r10, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new a(str, str2, i10, j10, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public a[] newArray(int i10) {
        return new a[i10];
    }
}
