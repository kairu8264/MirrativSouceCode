package mh;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i createFromParcel(Parcel parcel) {
        return new i(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
