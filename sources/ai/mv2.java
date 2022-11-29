package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class mv2 extends sh.a {
    public static final Parcelable.Creator<mv2> CREATOR = new ov2();
    public final int A;

    /* renamed from: w  reason: collision with root package name */
    public final int f7071w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7072x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7073y;

    /* renamed from: z  reason: collision with root package name */
    public final String f7074z;

    public mv2(int i10, int i11, int i12, String str, String str2) {
        this.f7071w = i10;
        this.f7072x = i11;
        this.f7073y = str;
        this.f7074z = str2;
        this.A = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f7071w);
        sh.b.k(parcel, 2, this.f7072x);
        sh.b.q(parcel, 3, this.f7073y, false);
        sh.b.q(parcel, 4, this.f7074z, false);
        sh.b.k(parcel, 5, this.A);
        sh.b.b(parcel, a10);
    }

    public mv2(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }
}
