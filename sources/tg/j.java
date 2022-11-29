package tg;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class j implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                iBinder = SafeParcelReader.s(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new a(z10, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
