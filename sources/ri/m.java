package ri;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class m extends sh.a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* renamed from: w  reason: collision with root package name */
    public final int f51544w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f51545x;

    public m(int i10, boolean z10) {
        this.f51544w = i10;
        this.f51545x = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 2, this.f51544w);
        sh.b.c(parcel, 3, this.f51545x);
        sh.b.b(parcel, a10);
    }
}
