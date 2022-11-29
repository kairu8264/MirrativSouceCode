package ai;

/* loaded from: classes3.dex */
public final class pz3 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8754a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8755b;

    /* renamed from: c  reason: collision with root package name */
    public final ow3 f8756c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8757d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f8758e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r6.equals(com.google.android.exoplayer2.C.CENC_TYPE_cenc) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pz3(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            ai.u9.a(r2)
            r4.f8754a = r5
            r4.f8755b = r6
            r4.f8757d = r7
            r4.f8758e = r11
            ai.ow3 r5 = new ai.ow3
            r7 = 2
            if (r6 != 0) goto L21
            goto L7d
        L21:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r1
            goto L52
        L34:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r2
            goto L52
        L47:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r7
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L7d
            if (r0 == r1) goto L7d
            if (r0 == r7) goto L7c
            if (r0 == r2) goto L7c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r11 = r6.length()
            int r11 = r11 + 68
            r7.<init>(r11)
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L7d
        L7c:
            r1 = r7
        L7d:
            r5.<init>(r1, r8, r9, r10)
            r4.f8756c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.pz3.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
