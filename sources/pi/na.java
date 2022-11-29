package pi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class na extends sh.a {
    public static final Parcelable.Creator<na> CREATOR = new oa();
    public final long A;
    public final long B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final long F;
    public final String G;
    public final long H;
    public final long I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final String M;
    public final Boolean N;
    public final long O;
    public final List<String> P;
    public final String Q;
    public final String R;

    /* renamed from: w  reason: collision with root package name */
    public final String f48080w;

    /* renamed from: x  reason: collision with root package name */
    public final String f48081x;

    /* renamed from: y  reason: collision with root package name */
    public final String f48082y;

    /* renamed from: z  reason: collision with root package name */
    public final String f48083z;

    public na(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        rh.p.e(str);
        this.f48080w = str;
        this.f48081x = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f48082y = str3;
        this.F = j10;
        this.f48083z = str4;
        this.A = j11;
        this.B = j12;
        this.C = str5;
        this.D = z10;
        this.E = z11;
        this.G = str6;
        this.H = j13;
        this.I = j14;
        this.J = i10;
        this.K = z12;
        this.L = z13;
        this.M = str7;
        this.N = bool;
        this.O = j15;
        this.P = list;
        this.Q = str8;
        this.R = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f48080w, false);
        sh.b.q(parcel, 3, this.f48081x, false);
        sh.b.q(parcel, 4, this.f48082y, false);
        sh.b.q(parcel, 5, this.f48083z, false);
        sh.b.n(parcel, 6, this.A);
        sh.b.n(parcel, 7, this.B);
        sh.b.q(parcel, 8, this.C, false);
        sh.b.c(parcel, 9, this.D);
        sh.b.c(parcel, 10, this.E);
        sh.b.n(parcel, 11, this.F);
        sh.b.q(parcel, 12, this.G, false);
        sh.b.n(parcel, 13, this.H);
        sh.b.n(parcel, 14, this.I);
        sh.b.k(parcel, 15, this.J);
        sh.b.c(parcel, 16, this.K);
        sh.b.c(parcel, 18, this.L);
        sh.b.q(parcel, 19, this.M, false);
        sh.b.d(parcel, 21, this.N, false);
        sh.b.n(parcel, 22, this.O);
        sh.b.s(parcel, 23, this.P, false);
        sh.b.q(parcel, 24, this.Q, false);
        sh.b.q(parcel, 25, this.R, false);
        sh.b.b(parcel, a10);
    }

    public na(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        this.f48080w = str;
        this.f48081x = str2;
        this.f48082y = str3;
        this.F = j12;
        this.f48083z = str4;
        this.A = j10;
        this.B = j11;
        this.C = str5;
        this.D = z10;
        this.E = z11;
        this.G = str6;
        this.H = j13;
        this.I = j14;
        this.J = i10;
        this.K = z12;
        this.L = z13;
        this.M = str7;
        this.N = bool;
        this.O = j15;
        this.P = list;
        this.Q = str8;
        this.R = str9;
    }
}
