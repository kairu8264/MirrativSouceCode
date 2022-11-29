package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class m50 implements Parcelable.Creator<l50> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l50 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                bundle = SafeParcelReader.a(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new l50(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l50[] newArray(int i10) {
        return new l50[i10];
    }
}
