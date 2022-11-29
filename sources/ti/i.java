package ti;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                arrayList = SafeParcelReader.h(parcel, r10);
            } else if (l10 != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                str = SafeParcelReader.f(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
