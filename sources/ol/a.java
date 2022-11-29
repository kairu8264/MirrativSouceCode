package ol;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class a extends sh.a {
    public static final Parcelable.Creator<a> CREATOR = new b();
    public Bundle A;
    public Uri B;

    /* renamed from: w  reason: collision with root package name */
    public String f45443w;

    /* renamed from: x  reason: collision with root package name */
    public String f45444x;

    /* renamed from: y  reason: collision with root package name */
    public int f45445y;

    /* renamed from: z  reason: collision with root package name */
    public long f45446z;

    public a(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.f45446z = 0L;
        this.A = null;
        this.f45443w = str;
        this.f45444x = str2;
        this.f45445y = i10;
        this.f45446z = j10;
        this.A = bundle;
        this.B = uri;
    }

    public String P() {
        return this.f45444x;
    }

    public String S() {
        return this.f45443w;
    }

    public Bundle U() {
        Bundle bundle = this.A;
        return bundle == null ? new Bundle() : bundle;
    }

    public int k0() {
        return this.f45445y;
    }

    public long p() {
        return this.f45446z;
    }

    public Uri r0() {
        return this.B;
    }

    public void w0(long j10) {
        this.f45446z = j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        b.c(this, parcel, i10);
    }
}
