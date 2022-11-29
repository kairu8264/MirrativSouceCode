package rg;

import ai.dt;
import ai.fs;
import ai.nj0;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f51358a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51359b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51360c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f51361d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f51362e;

    /* renamed from: f  reason: collision with root package name */
    public int f51363f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f51364g;

    /* renamed from: h  reason: collision with root package name */
    public int f51365h;
    @RecentlyNonNull

    /* renamed from: i  reason: collision with root package name */
    public static final g f51347i = new g(320, 50, "320x50_mb");
    @RecentlyNonNull

    /* renamed from: j  reason: collision with root package name */
    public static final g f51348j = new g(468, 60, "468x60_as");
    @RecentlyNonNull

    /* renamed from: k  reason: collision with root package name */
    public static final g f51349k = new g(320, 100, "320x100_as");
    @RecentlyNonNull

    /* renamed from: l  reason: collision with root package name */
    public static final g f51350l = new g(728, 90, "728x90_as");
    @RecentlyNonNull

    /* renamed from: m  reason: collision with root package name */
    public static final g f51351m = new g(300, ListPopupWindow.EXPAND_LIST_TIMEOUT, "300x250_as");
    @RecentlyNonNull

    /* renamed from: n  reason: collision with root package name */
    public static final g f51352n = new g(160, 600, "160x600_as");
    @RecentlyNonNull
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final g f51353o = new g(-1, -2, "smart_banner");
    @RecentlyNonNull

    /* renamed from: p  reason: collision with root package name */
    public static final g f51354p = new g(-3, -4, "fluid");
    @RecentlyNonNull

    /* renamed from: q  reason: collision with root package name */
    public static final g f51355q = new g(0, 0, "invalid");
    @RecentlyNonNull

    /* renamed from: s  reason: collision with root package name */
    public static final g f51357s = new g(50, 50, "50x50_mb");
    @RecentlyNonNull

    /* renamed from: r  reason: collision with root package name */
    public static final g f51356r = new g(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.g.<init>(int, int):void");
    }

    public int a() {
        return this.f51359b;
    }

    public int b(@RecentlyNonNull Context context) {
        int i10 = this.f51359b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 != -2) {
            dt.a();
            return nj0.q(context, this.f51359b);
        }
        return fs.p(context.getResources().getDisplayMetrics());
    }

    public int c() {
        return this.f51358a;
    }

    public int d(@RecentlyNonNull Context context) {
        int i10 = this.f51358a;
        if (i10 != -3) {
            if (i10 != -1) {
                dt.a();
                return nj0.q(context, this.f51358a);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<fs> creator = fs.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public boolean e() {
        return this.f51358a == -3 && this.f51359b == -4;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f51358a == gVar.f51358a && this.f51359b == gVar.f51359b && this.f51360c.equals(gVar.f51360c);
        }
        return false;
    }

    public final boolean f() {
        return this.f51361d;
    }

    public final boolean g() {
        return this.f51362e;
    }

    public final void h(boolean z10) {
        this.f51362e = true;
    }

    public int hashCode() {
        return this.f51360c.hashCode();
    }

    public final void i(int i10) {
        this.f51363f = i10;
    }

    public final int j() {
        return this.f51363f;
    }

    public final boolean k() {
        return this.f51364g;
    }

    public final void l(boolean z10) {
        this.f51364g = true;
    }

    public final int m() {
        return this.f51365h;
    }

    public final void n(int i10) {
        this.f51365h = i10;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f51360c;
    }

    public g(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Invalid width for AdSize: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 < 0 && i11 != -2 && i11 != -4) {
            StringBuilder sb3 = new StringBuilder(38);
            sb3.append("Invalid height for AdSize: ");
            sb3.append(i11);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            this.f51358a = i10;
            this.f51359b = i11;
            this.f51360c = str;
        }
    }
}
