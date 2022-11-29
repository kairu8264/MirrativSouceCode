package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l50 extends sh.a {
    public static final Parcelable.Creator<l50> CREATOR = new m50();

    /* renamed from: w  reason: collision with root package name */
    public final String f6483w;

    /* renamed from: x  reason: collision with root package name */
    public final Bundle f6484x;

    public l50(String str, Bundle bundle) {
        this.f6483w = str;
        this.f6484x = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f6483w, false);
        sh.b.e(parcel, 2, this.f6484x, false);
        sh.b.b(parcel, a10);
    }
}
