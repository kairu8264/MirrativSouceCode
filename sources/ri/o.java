package ri;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class o implements Parcelable.Creator<b> {
    public static void a(b bVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, bVar.U(), false);
        sh.b.p(parcel, 3, bVar.S(), i10, false);
        sh.b.p(parcel, 4, bVar.p(), i10, false);
        sh.b.n(parcel, 5, bVar.P());
        sh.b.f(parcel, 6, bVar.k0(), false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 3) {
                dataHolder = (DataHolder) SafeParcelReader.e(parcel, r10, DataHolder.CREATOR);
            } else if (l10 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, r10, ParcelFileDescriptor.CREATOR);
            } else if (l10 == 5) {
                j10 = SafeParcelReader.u(parcel, r10);
            } else if (l10 != 6) {
                SafeParcelReader.x(parcel, r10);
            } else {
                bArr = SafeParcelReader.b(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new b(str, dataHolder, parcelFileDescriptor, j10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
