package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class sg implements Parcelable.Creator<tg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tg createFromParcel(Parcel parcel) {
        return new tg(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tg[] newArray(int i10) {
        return new tg[i10];
    }
}
