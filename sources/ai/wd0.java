package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class wd0 implements Parcelable.Creator<vd0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ vd0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 2) {
                z10 = SafeParcelReader.m(parcel, r10);
            } else if (l10 != 3) {
                SafeParcelReader.x(parcel, r10);
            } else {
                arrayList = SafeParcelReader.h(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new vd0(z10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ vd0[] newArray(int i10) {
        return new vd0[i10];
    }
}
