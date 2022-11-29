package ai;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zm implements Parcelable.Creator<ym> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ym createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, r10, ParcelFileDescriptor.CREATOR);
            } else if (l10 == 3) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 4) {
                z11 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 5) {
                j10 = SafeParcelReader.u(parcel, r10);
            } else if (l10 != 6) {
                SafeParcelReader.x(parcel, r10);
            } else {
                z12 = SafeParcelReader.m(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new ym(parcelFileDescriptor, z10, z11, j10, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ym[] newArray(int i10) {
        return new ym[i10];
    }
}
