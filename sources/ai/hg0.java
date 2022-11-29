package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class hg0 extends sh.a {
    public static final Parcelable.Creator<hg0> CREATOR = new ig0();

    /* renamed from: w  reason: collision with root package name */
    public final String f4840w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4841x;

    public hg0(String str, String str2) {
        this.f4840w = str;
        this.f4841x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f4840w, false);
        sh.b.q(parcel, 2, this.f4841x, false);
        sh.b.b(parcel, a10);
    }
}
