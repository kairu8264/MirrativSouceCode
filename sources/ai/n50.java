package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class n50 extends sh.a {
    public static final Parcelable.Creator<n50> CREATOR = new o50();

    /* renamed from: w  reason: collision with root package name */
    public final int f7194w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7195x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7196y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7197z;

    public n50(int i10, int i11, String str, int i12) {
        this.f7194w = i10;
        this.f7195x = i11;
        this.f7196y = str;
        this.f7197z = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f7195x);
        sh.b.q(parcel, 2, this.f7196y, false);
        sh.b.k(parcel, 3, this.f7197z);
        sh.b.k(parcel, 1000, this.f7194w);
        sh.b.b(parcel, a10);
    }
}
