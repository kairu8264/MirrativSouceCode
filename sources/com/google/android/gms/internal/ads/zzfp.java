package com.google.android.gms.internal.ads;

import ai.pz2;

/* loaded from: classes3.dex */
public final class zzfp extends Exception {
    public final zzfp A;

    /* renamed from: w  reason: collision with root package name */
    public final String f27281w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f27282x;

    /* renamed from: y  reason: collision with root package name */
    public final pz2 f27283y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27284z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfp(ai.v4 r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r0 = r13.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 36
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r5 = r11.f10960l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 75
            r13.<init>(r14)
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r1.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfp.<init>(ai.v4, java.lang.Throwable, boolean, int):void");
    }

    public static /* synthetic */ zzfp a(zzfp zzfpVar, zzfp zzfpVar2) {
        return new zzfp(zzfpVar.getMessage(), zzfpVar.getCause(), zzfpVar.f27281w, false, zzfpVar.f27283y, zzfpVar.f27284z, zzfpVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfp(ai.v4 r9, java.lang.Throwable r10, boolean r11, ai.pz2 r12) {
        /*
            r8 = this;
            java.lang.String r0 = r12.f8747a
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r4 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "Decoder init failed: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r9.f10960l
            int r0 = ai.sb.f9778a
            r4 = 0
            r6 = 21
            if (r0 < r6) goto L44
            boolean r0 = r10 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L44
            r0 = r10
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
            goto L45
        L44:
            r6 = r4
        L45:
            r4 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfp.<init>(ai.v4, java.lang.Throwable, boolean, ai.pz2):void");
    }

    public zzfp(String str, Throwable th2, String str2, boolean z10, pz2 pz2Var, String str3, zzfp zzfpVar) {
        super(str, th2);
        this.f27281w = str2;
        this.f27282x = false;
        this.f27283y = pz2Var;
        this.f27284z = str3;
        this.A = zzfpVar;
    }
}
