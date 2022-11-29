package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ls extends sh.a {
    public static final Parcelable.Creator<ls> CREATOR = new ms();

    /* renamed from: w  reason: collision with root package name */
    public final int f6652w;

    public ls(int i10) {
        this.f6652w = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 2, this.f6652w);
        sh.b.b(parcel, a10);
    }
}
