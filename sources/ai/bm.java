package ai;

import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class bm {
    public static int a(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return vh.m.a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c8, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] b(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.bm.b(java.lang.String, boolean):java.lang.String[]");
    }
}
