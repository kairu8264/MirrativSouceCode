package ai;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes3.dex */
public final class vu3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11364a = {2002, 2000, 1920, 1601, 1600, AnalyticsListener.EVENT_LOAD_COMPLETED, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11365b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r11 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r11 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
        if (r11 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.uu3 a(ai.gb r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3d
            r1 = r3
        L2c:
            int r5 = r11.h(r0)
            int r1 = r1 + r5
            boolean r5 = r11.g()
            if (r5 != 0) goto L39
            int r1 = r1 + r4
            goto L3d
        L39:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3d:
            r5 = 10
            int r5 = r11.h(r5)
            boolean r6 = r11.g()
            if (r6 == 0) goto L52
            int r6 = r11.h(r4)
            if (r6 <= 0) goto L52
            r11.f(r0)
        L52:
            boolean r6 = r11.g()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L61
            r6 = r8
            goto L62
        L61:
            r6 = r9
        L62:
            int r11 = r11.h(r2)
            if (r6 != r8) goto L72
            r8 = 13
            if (r11 != r8) goto L72
            int[] r11 = ai.vu3.f11364a
            r11 = r11[r8]
            r8 = r11
            goto L9e
        L72:
            if (r6 != r9) goto L9d
            r8 = 14
            if (r11 >= r8) goto L9d
            int[] r3 = ai.vu3.f11364a
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L97
            r9 = 11
            if (r5 == r0) goto L92
            if (r5 == r4) goto L97
            if (r5 == r2) goto L8b
            goto L9d
        L8b:
            if (r11 == r4) goto L9b
            if (r11 == r8) goto L9b
            if (r11 != r9) goto L9d
            goto L9b
        L92:
            if (r11 == r8) goto L9b
            if (r11 != r9) goto L9d
            goto L9b
        L97:
            if (r11 == r4) goto L9b
            if (r11 != r8) goto L9d
        L9b:
            int r3 = r3 + 1
        L9d:
            r8 = r3
        L9e:
            ai.uu3 r11 = new ai.uu3
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vu3.a(ai.gb):ai.uu3");
    }

    public static void b(int i10, hb hbVar) {
        hbVar.i(7);
        byte[] q10 = hbVar.q();
        q10[0] = -84;
        q10[1] = 64;
        q10[2] = -1;
        q10[3] = -1;
        q10[4] = (byte) ((i10 >> 16) & 255);
        q10[5] = (byte) ((i10 >> 8) & 255);
        q10[6] = (byte) (i10 & 255);
    }
}
