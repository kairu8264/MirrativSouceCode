package tg;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        IBinder iBinder = null;
        boolean z10 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 == 2) {
                iBinder = SafeParcelReader.s(parcel, r10);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                iBinder2 = SafeParcelReader.s(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new g(z10, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g[] newArray(int i10) {
        return new g[i10];
    }
}
