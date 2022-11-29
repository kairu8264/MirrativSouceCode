package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zj0 extends sh.a {
    public static final Parcelable.Creator<zj0> CREATOR = new bk0();
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public String f13013w;

    /* renamed from: x  reason: collision with root package name */
    public int f13014x;

    /* renamed from: y  reason: collision with root package name */
    public int f13015y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f13016z;

    public zj0(int i10, int i11, boolean z10, boolean z11) {
        this(213806000, i11, true, false, false);
    }

    public static zj0 p() {
        return new zj0((int) nh.g.f43544a, (int) nh.g.f43544a, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f13013w, false);
        sh.b.k(parcel, 3, this.f13014x);
        sh.b.k(parcel, 4, this.f13015y);
        sh.b.c(parcel, 5, this.f13016z);
        sh.b.c(parcel, 6, this.A);
        sh.b.b(parcel, a10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zj0(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r0 = r11.length()
            int r0 = r0 + 36
            r12.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = "."
            r12.append(r0)
            r12.append(r9)
            r12.append(r0)
            r12.append(r11)
            java.lang.String r2 = r12.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.zj0.<init>(int, int, boolean, boolean, boolean):void");
    }

    public zj0(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f13013w = str;
        this.f13014x = i10;
        this.f13015y = i11;
        this.f13016z = z10;
        this.A = z11;
    }
}
