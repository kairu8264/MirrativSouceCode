package ih;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class f extends sh.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: w  reason: collision with root package name */
    public final String f36821w;

    /* renamed from: x  reason: collision with root package name */
    public final int f36822x;

    public f(String str, int i10) {
        this.f36821w = str;
        this.f36822x = i10;
    }

    public final String P() {
        return this.f36821w;
    }

    public final int p() {
        return this.f36822x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f36821w, false);
        sh.b.k(parcel, 2, this.f36822x);
        sh.b.b(parcel, a10);
    }
}
