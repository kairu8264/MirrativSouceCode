package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class p40 extends sh.a {
    public static final Parcelable.Creator<p40> CREATOR = new q40();

    /* renamed from: w  reason: collision with root package name */
    public final String f8294w;

    /* renamed from: x  reason: collision with root package name */
    public final String[] f8295x;

    /* renamed from: y  reason: collision with root package name */
    public final String[] f8296y;

    public p40(String str, String[] strArr, String[] strArr2) {
        this.f8294w = str;
        this.f8295x = strArr;
        this.f8296y = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f8294w, false);
        sh.b.r(parcel, 2, this.f8295x, false);
        sh.b.r(parcel, 3, this.f8296y, false);
        sh.b.b(parcel, a10);
    }
}
