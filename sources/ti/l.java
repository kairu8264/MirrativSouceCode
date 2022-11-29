package ti;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import rh.p0;

/* loaded from: classes3.dex */
public final class l extends sh.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: w  reason: collision with root package name */
    public final int f53659w;

    /* renamed from: x  reason: collision with root package name */
    public final ConnectionResult f53660x;

    /* renamed from: y  reason: collision with root package name */
    public final p0 f53661y;

    public l(int i10, ConnectionResult connectionResult, p0 p0Var) {
        this.f53659w = i10;
        this.f53660x = connectionResult;
        this.f53661y = p0Var;
    }

    public final p0 P() {
        return this.f53661y;
    }

    public final ConnectionResult p() {
        return this.f53660x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f53659w);
        sh.b.p(parcel, 2, this.f53660x, i10, false);
        sh.b.p(parcel, 3, this.f53661y, i10, false);
        sh.b.b(parcel, a10);
    }
}
