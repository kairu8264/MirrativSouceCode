package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class ld0 implements Parcelable.Creator<kd0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ kd0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                iBinder = SafeParcelReader.s(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                iBinder2 = SafeParcelReader.s(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new kd0(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ kd0[] newArray(int i10) {
        return new kd0[i10];
    }
}
