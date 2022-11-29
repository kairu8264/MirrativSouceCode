package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class av2 extends sh.a {
    public static final Parcelable.Creator<av2> CREATOR = new bv2();

    /* renamed from: w  reason: collision with root package name */
    public final int f2136w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f2137x;

    public av2(int i10, byte[] bArr) {
        this.f2136w = i10;
        this.f2137x = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f2136w);
        sh.b.f(parcel, 2, this.f2137x, false);
        sh.b.b(parcel, a10);
    }

    public av2(byte[] bArr) {
        this(1, bArr);
    }
}
