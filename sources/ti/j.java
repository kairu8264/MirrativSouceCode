package ti;

import android.os.Parcel;
import android.os.Parcelable;
import rh.n0;

/* loaded from: classes3.dex */
public final class j extends sh.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: w  reason: collision with root package name */
    public final int f53657w;

    /* renamed from: x  reason: collision with root package name */
    public final n0 f53658x;

    public j(int i10, n0 n0Var) {
        this.f53657w = i10;
        this.f53658x = n0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f53657w);
        sh.b.p(parcel, 2, this.f53658x, i10, false);
        sh.b.b(parcel, a10);
    }
}
