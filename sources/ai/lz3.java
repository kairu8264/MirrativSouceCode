package ai;

/* loaded from: classes3.dex */
public final class lz3 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.UUID a(byte[] r9) {
        /*
            ai.hb r0 = new ai.hb
            r0.<init>(r9)
            int r9 = r0.m()
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto L10
        Le:
            r9 = r1
            goto L7c
        L10:
            r9 = 0
            r0.p(r9)
            int r2 = r0.D()
            int r3 = r0.l()
            int r3 = r3 + 4
            if (r2 == r3) goto L21
            goto Le
        L21:
            int r2 = r0.D()
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r3) goto L2b
            goto Le
        L2b:
            int r2 = r0.D()
            int r2 = ai.qy3.a(r2)
            r3 = 1
            if (r2 <= r3) goto L4f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 37
            r9.<init>(r0)
            java.lang.String r0 = "Unsupported pssh version: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "PsshAtomUtil"
            android.util.Log.w(r0, r9)
            goto Le
        L4f:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.F()
            long r7 = r0.F()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L67
            int r3 = r0.b()
            int r3 = r3 * 16
            r0.s(r3)
        L67:
            int r3 = r0.b()
            int r5 = r0.l()
            if (r3 == r5) goto L72
            goto Le
        L72:
            byte[] r5 = new byte[r3]
            r0.u(r5, r9, r3)
            ai.kz3 r9 = new ai.kz3
            r9.<init>(r4, r2, r5)
        L7c:
            if (r9 != 0) goto L7f
            return r1
        L7f:
            java.util.UUID r9 = ai.kz3.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.lz3.a(byte[]):java.util.UUID");
    }
}
