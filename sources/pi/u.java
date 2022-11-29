package pi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class u extends sh.a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: w  reason: collision with root package name */
    public final String f48250w;

    /* renamed from: x  reason: collision with root package name */
    public final s f48251x;

    /* renamed from: y  reason: collision with root package name */
    public final String f48252y;

    /* renamed from: z  reason: collision with root package name */
    public final long f48253z;

    public u(u uVar, long j10) {
        rh.p.i(uVar);
        this.f48250w = uVar.f48250w;
        this.f48251x = uVar.f48251x;
        this.f48252y = uVar.f48252y;
        this.f48253z = j10;
    }

    public final String toString() {
        String str = this.f48252y;
        String str2 = this.f48250w;
        String valueOf = String.valueOf(this.f48251x);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        v.a(this, parcel, i10);
    }

    public u(String str, s sVar, String str2, long j10) {
        this.f48250w = str;
        this.f48251x = sVar;
        this.f48252y = str2;
        this.f48253z = j10;
    }
}
