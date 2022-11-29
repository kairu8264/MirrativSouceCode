package ai;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public final class fs extends sh.a {
    public static final Parcelable.Creator<fs> CREATOR = new gs();
    public final int A;
    public final int B;
    public final fs[] C;
    public final boolean D;
    public final boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;

    /* renamed from: w  reason: collision with root package name */
    public final String f4173w;

    /* renamed from: x  reason: collision with root package name */
    public final int f4174x;

    /* renamed from: y  reason: collision with root package name */
    public final int f4175y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f4176z;

    public fs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static fs P() {
        return new fs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static fs S() {
        return new fs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static fs U() {
        return new fs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static fs k0() {
        return new fs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    public static int p(DisplayMetrics displayMetrics) {
        return (int) (r0(displayMetrics) * displayMetrics.density);
    }

    public static int r0(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f4173w, false);
        sh.b.k(parcel, 3, this.f4174x);
        sh.b.k(parcel, 4, this.f4175y);
        sh.b.c(parcel, 5, this.f4176z);
        sh.b.k(parcel, 6, this.A);
        sh.b.k(parcel, 7, this.B);
        sh.b.t(parcel, 8, this.C, i10, false);
        sh.b.c(parcel, 9, this.D);
        sh.b.c(parcel, 10, this.E);
        sh.b.c(parcel, 11, this.F);
        sh.b.c(parcel, 12, this.G);
        sh.b.c(parcel, 13, this.H);
        sh.b.c(parcel, 14, this.I);
        sh.b.c(parcel, 15, this.J);
        sh.b.c(parcel, 16, this.K);
        sh.b.b(parcel, a10);
    }

    public fs(Context context, rg.g gVar) {
        this(context, new rg.g[]{gVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fs(android.content.Context r13, rg.g[] r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.fs.<init>(android.content.Context, rg.g[]):void");
    }

    public fs(String str, int i10, int i11, boolean z10, int i12, int i13, fs[] fsVarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f4173w = str;
        this.f4174x = i10;
        this.f4175y = i11;
        this.f4176z = z10;
        this.A = i12;
        this.B = i13;
        this.C = fsVarArr;
        this.D = z11;
        this.E = z12;
        this.F = z13;
        this.G = z14;
        this.H = z15;
        this.I = z16;
        this.J = z17;
        this.K = z18;
    }
}
