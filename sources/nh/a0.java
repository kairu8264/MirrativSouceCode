package nh;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a0 extends sh.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: w  reason: collision with root package name */
    public final boolean f43523w;

    /* renamed from: x  reason: collision with root package name */
    public final String f43524x;

    /* renamed from: y  reason: collision with root package name */
    public final int f43525y;

    public a0(boolean z10, String str, int i10) {
        this.f43523w = z10;
        this.f43524x = str;
        this.f43525y = z.a(i10) - 1;
    }

    public final boolean P() {
        return this.f43523w;
    }

    public final int S() {
        return z.a(this.f43525y);
    }

    public final String p() {
        return this.f43524x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 1, this.f43523w);
        sh.b.q(parcel, 2, this.f43524x, false);
        sh.b.k(parcel, 3, this.f43525y);
        sh.b.b(parcel, a10);
    }
}
