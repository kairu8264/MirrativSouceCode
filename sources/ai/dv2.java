package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class dv2 extends sh.a {
    public static final Parcelable.Creator<dv2> CREATOR = new ev2();

    /* renamed from: w  reason: collision with root package name */
    public final int f3413w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3414x;

    /* renamed from: y  reason: collision with root package name */
    public final String f3415y;

    public dv2(int i10, String str, String str2) {
        this.f3413w = i10;
        this.f3414x = str;
        this.f3415y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f3413w);
        sh.b.q(parcel, 2, this.f3414x, false);
        sh.b.q(parcel, 3, this.f3415y, false);
        sh.b.b(parcel, a10);
    }

    public dv2(String str, String str2) {
        this(1, str, str2);
    }
}
