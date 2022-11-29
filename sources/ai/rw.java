package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class rw extends sh.a {
    public static final Parcelable.Creator<rw> CREATOR = new sw();

    /* renamed from: w  reason: collision with root package name */
    public final String f9608w;

    public rw(String str) {
        this.f9608w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 15, this.f9608w, false);
        sh.b.b(parcel, a10);
    }
}
