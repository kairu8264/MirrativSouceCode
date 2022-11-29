package ai;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public final class ie0 extends sh.a {
    public static final Parcelable.Creator<ie0> CREATOR = new je0();
    public final List<String> A;
    public final PackageInfo B;
    public final String C;
    public final String D;
    public rn2 E;
    public String F;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f5201w;

    /* renamed from: x  reason: collision with root package name */
    public final zj0 f5202x;

    /* renamed from: y  reason: collision with root package name */
    public final ApplicationInfo f5203y;

    /* renamed from: z  reason: collision with root package name */
    public final String f5204z;

    public ie0(Bundle bundle, zj0 zj0Var, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, rn2 rn2Var, String str4) {
        this.f5201w = bundle;
        this.f5202x = zj0Var;
        this.f5204z = str;
        this.f5203y = applicationInfo;
        this.A = list;
        this.B = packageInfo;
        this.C = str2;
        this.D = str3;
        this.E = rn2Var;
        this.F = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.e(parcel, 1, this.f5201w, false);
        sh.b.p(parcel, 2, this.f5202x, i10, false);
        sh.b.p(parcel, 3, this.f5203y, i10, false);
        sh.b.q(parcel, 4, this.f5204z, false);
        sh.b.s(parcel, 5, this.A, false);
        sh.b.p(parcel, 6, this.B, i10, false);
        sh.b.q(parcel, 7, this.C, false);
        sh.b.q(parcel, 9, this.D, false);
        sh.b.p(parcel, 10, this.E, i10, false);
        sh.b.q(parcel, 11, this.F, false);
        sh.b.b(parcel, a10);
    }
}
