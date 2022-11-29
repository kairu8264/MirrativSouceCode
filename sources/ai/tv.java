package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class tv extends sh.a {
    public static final Parcelable.Creator<tv> CREATOR = new uv();

    /* renamed from: w  reason: collision with root package name */
    public final int f10471w;

    public tv(int i10) {
        this.f10471w = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 2, this.f10471w);
        sh.b.b(parcel, a10);
    }
}
