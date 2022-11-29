package ri;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class a extends sh.a {
    public static final Parcelable.Creator<a> CREATOR = new h();

    /* renamed from: w  reason: collision with root package name */
    public final String f51526w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f51527x;

    /* renamed from: y  reason: collision with root package name */
    public final int f51528y;

    public a(String str, byte[] bArr, int i10) {
        this.f51526w = str;
        this.f51527x = bArr;
        this.f51528y = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f51526w, false);
        sh.b.f(parcel, 3, this.f51527x, false);
        sh.b.k(parcel, 4, this.f51528y);
        sh.b.b(parcel, a10);
    }
}
