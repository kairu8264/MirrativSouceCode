package hi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class o1 extends sh.a {
    public static final Parcelable.Creator<o1> CREATOR = new p1();
    public final String A;
    public final String B;
    public final Bundle C;
    public final String D;

    /* renamed from: w  reason: collision with root package name */
    public final long f35889w;

    /* renamed from: x  reason: collision with root package name */
    public final long f35890x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f35891y;

    /* renamed from: z  reason: collision with root package name */
    public final String f35892z;

    public o1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f35889w = j10;
        this.f35890x = j11;
        this.f35891y = z10;
        this.f35892z = str;
        this.A = str2;
        this.B = str3;
        this.C = bundle;
        this.D = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.n(parcel, 1, this.f35889w);
        sh.b.n(parcel, 2, this.f35890x);
        sh.b.c(parcel, 3, this.f35891y);
        sh.b.q(parcel, 4, this.f35892z, false);
        sh.b.q(parcel, 5, this.A, false);
        sh.b.q(parcel, 6, this.B, false);
        sh.b.e(parcel, 7, this.C, false);
        sh.b.q(parcel, 8, this.D, false);
        sh.b.b(parcel, a10);
    }
}
