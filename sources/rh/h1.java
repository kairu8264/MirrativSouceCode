package rh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class h1 implements Parcelable.Creator<g1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g1 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Bundle bundle = null;
        e eVar = null;
        int i10 = 0;
        nh.c[] cVarArr = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                bundle = SafeParcelReader.a(parcel, r10);
            } else if (l10 == 2) {
                cVarArr = (nh.c[]) SafeParcelReader.i(parcel, r10, nh.c.CREATOR);
            } else if (l10 == 3) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 4) {
                SafeParcelReader.x(parcel, r10);
            } else {
                eVar = (e) SafeParcelReader.e(parcel, r10, e.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new g1(bundle, cVarArr, i10, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g1[] newArray(int i10) {
        return new g1[i10];
    }
}
