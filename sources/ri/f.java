package ri;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class f extends sh.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: w  reason: collision with root package name */
    public final String f51538w;

    public f(String str) {
        this.f51538w = str;
    }

    public final String p() {
        return this.f51538w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f51538w, false);
        sh.b.b(parcel, a10);
    }
}
