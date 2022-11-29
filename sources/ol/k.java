package ol;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import ol.j;

/* loaded from: classes4.dex */
public class k implements Parcelable.Creator<j> {
    public static void c(j jVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.p(parcel, 1, jVar.P(), i10, false);
        sh.b.p(parcel, 2, jVar.p(), i10, false);
        sh.b.u(parcel, 3, jVar.S(), false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public j createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                uri = (Uri) SafeParcelReader.e(parcel, r10, Uri.CREATOR);
            } else if (l10 == 2) {
                uri2 = (Uri) SafeParcelReader.e(parcel, r10, Uri.CREATOR);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                arrayList = SafeParcelReader.j(parcel, r10, j.a.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new j(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public j[] newArray(int i10) {
        return new j[i10];
    }
}
