package com.google.android.gms.internal.ads;

import ai.g3;
import ai.rv3;
import ai.sb;
import ai.u9;
import ai.v4;
import ai.x2;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzaeg extends zzahc {
    public static final x2<zzaeg> G = g3.f4315a;
    public final String A;
    public final int B;
    public final v4 C;
    public final int D;
    public final rv3 E;
    public final boolean F;

    /* renamed from: z  reason: collision with root package name */
    public final int f27249z;

    public zzaeg(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static zzaeg a(IOException iOException, int i10) {
        return new zzaeg(0, iOException, i10);
    }

    public static zzaeg b(Throwable th2, String str, int i10, v4 v4Var, int i11, boolean z10, int i12) {
        return new zzaeg(1, th2, null, i12, str, i10, v4Var, v4Var == null ? 4 : i11, z10);
    }

    public static zzaeg c(RuntimeException runtimeException, int i10) {
        return new zzaeg(2, runtimeException, i10);
    }

    public final zzaeg d(rv3 rv3Var) {
        String message = getMessage();
        int i10 = sb.f9778a;
        return new zzaeg(message, getCause(), this.f27254w, this.f27249z, this.A, this.B, this.C, this.D, rv3Var, this.f27255x, this.F);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaeg(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, ai.v4 r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L52
            r0 = 1
            if (r4 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r6 = r18
            r7 = r19
            goto L58
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = ai.y2.d(r21)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            int r3 = r0.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r3 = r1.length()
            int r2 = r2 + r3
            r5.<init>(r2)
            r6 = r18
            r5.append(r6)
            java.lang.String r2 = " error, index="
            r5.append(r2)
            r7 = r19
            r5.append(r7)
            java.lang.String r2 = ", format="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ", format_supported="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            goto L58
        L52:
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L58:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L65
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L65:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeg.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, ai.v4, int, boolean):void");
    }

    public zzaeg(String str, Throwable th2, int i10, int i11, String str2, int i12, v4 v4Var, int i13, rv3 rv3Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        int i14;
        boolean z11;
        if (z10) {
            i14 = i11;
            if (i14 == 1) {
                i14 = 1;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            i14 = i11;
            z11 = true;
        }
        u9.a(z11);
        u9.a(th2 != null);
        this.f27249z = i14;
        this.A = str2;
        this.B = i12;
        this.C = v4Var;
        this.D = i13;
        this.E = rv3Var;
        this.F = z10;
    }
}
