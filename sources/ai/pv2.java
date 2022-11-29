package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pv2 extends sh.a {
    public static final Parcelable.Creator<pv2> CREATOR = new qv2();

    /* renamed from: w  reason: collision with root package name */
    public final int f8699w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f8700x;

    /* renamed from: y  reason: collision with root package name */
    public final int f8701y;

    public pv2(int i10, byte[] bArr, int i11) {
        this.f8699w = i10;
        this.f8700x = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f8701y = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f8699w);
        sh.b.f(parcel, 2, this.f8700x, false);
        sh.b.k(parcel, 3, this.f8701y);
        sh.b.b(parcel, a10);
    }

    public pv2(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
