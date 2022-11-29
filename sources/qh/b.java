package qh;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                strArr = SafeParcelReader.g(parcel, r10);
            } else if (l10 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, r10, CursorWindow.CREATOR);
            } else if (l10 == 3) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 4) {
                bundle = SafeParcelReader.a(parcel, r10);
            } else if (l10 != 1000) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i10 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.S();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
