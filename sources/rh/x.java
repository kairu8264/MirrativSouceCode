package rh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                arrayList = SafeParcelReader.j(parcel, r10, m.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new t(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i10) {
        return new t[i10];
    }
}
