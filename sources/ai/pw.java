package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class pw extends sh.a {
    public static final Parcelable.Creator<pw> CREATOR = new qw();

    /* renamed from: w  reason: collision with root package name */
    public final int f8703w;

    /* renamed from: x  reason: collision with root package name */
    public final int f8704x;

    public pw(int i10, int i11) {
        this.f8703w = i10;
        this.f8704x = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f8703w);
        sh.b.k(parcel, 2, this.f8704x);
        sh.b.b(parcel, a10);
    }
}
