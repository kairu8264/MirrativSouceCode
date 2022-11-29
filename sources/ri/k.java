package ri;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class k extends sh.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: w  reason: collision with root package name */
    public final String f51543w;

    public k(String str) {
        this.f51543w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f51543w, false);
        sh.b.b(parcel, a10);
    }
}
