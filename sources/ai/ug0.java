package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ug0 implements Parcelable.Creator<tg0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tg0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 4:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 5:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 6:
                    arrayList = SafeParcelReader.h(parcel, r10);
                    break;
                case 7:
                    z12 = SafeParcelReader.m(parcel, r10);
                    break;
                case 8:
                    z13 = SafeParcelReader.m(parcel, r10);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.h(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new tg0(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tg0[] newArray(int i10) {
        return new tg0[i10];
    }
}
