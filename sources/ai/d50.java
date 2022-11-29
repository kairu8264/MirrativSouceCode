package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class d50 extends sh.a {
    public static final Parcelable.Creator<d50> CREATOR = new e50();

    /* renamed from: w  reason: collision with root package name */
    public final String f3147w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f3148x;

    /* renamed from: y  reason: collision with root package name */
    public final int f3149y;

    /* renamed from: z  reason: collision with root package name */
    public final String f3150z;

    public d50(String str, boolean z10, int i10, String str2) {
        this.f3147w = str;
        this.f3148x = z10;
        this.f3149y = i10;
        this.f3150z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f3147w, false);
        sh.b.c(parcel, 2, this.f3148x);
        sh.b.k(parcel, 3, this.f3149y);
        sh.b.q(parcel, 4, this.f3150z, false);
        sh.b.b(parcel, a10);
    }
}
