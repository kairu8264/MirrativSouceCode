package ol;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import ol.j;

/* loaded from: classes4.dex */
public class l implements Parcelable.Creator<j.a> {
    public static void c(j.a aVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, aVar.p(), false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public j.a createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                str = SafeParcelReader.f(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new j.a(str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public j.a[] newArray(int i10) {
        return new j.a[i10];
    }
}
