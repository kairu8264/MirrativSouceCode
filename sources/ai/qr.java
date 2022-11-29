package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class qr extends sh.a {
    public static final Parcelable.Creator<qr> CREATOR = new rr();

    /* renamed from: w  reason: collision with root package name */
    public final String f9064w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9065x;

    public qr(String str, String str2) {
        this.f9064w = str;
        this.f9065x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f9064w, false);
        sh.b.q(parcel, 2, this.f9065x, false);
        sh.b.b(parcel, a10);
    }
}
