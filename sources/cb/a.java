package cb;

import da.i;
import jo.h;

/* loaded from: classes2.dex */
public enum a {
    Ratio1by1(1.0f, 1.0f, da.e.ic_aspect_ratio_1_1, i.text_aspect_ratio_1_1),
    Ratio4by3(4.0f, 3.0f, da.e.ic_aspect_ratio_4_3, i.text_aspect_ratio_4_3),
    Ratio16by9(16.0f, 9.0f, da.e.ic_aspect_ratio_16_9, i.text_aspect_ratio_16_9),
    Ratio3by4(3.0f, 4.0f, da.e.ic_aspect_ratio_3_4, i.text_aspect_ratio_3_4),
    Ratio9by16(9.0f, 16.0f, da.e.ic_aspect_ratio_9_16, i.text_aspect_ratio_9_16);
    
    public static final C0141a Companion = new C0141a(null);
    private final float heightAspectRatio;
    private final int imageDrawableRes;
    private final int stringRes;
    private final float widthAspectRatio;

    /* renamed from: cb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0141a {
        public C0141a() {
        }

        public /* synthetic */ C0141a(h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
            if ((r4.c() == r9) != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final cb.a a(float r8, float r9) {
            /*
                r7 = this;
                cb.a[] r0 = cb.a.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L7:
                if (r3 >= r1) goto L2e
                r4 = r0[r3]
                float r5 = r4.i()
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                r6 = 1
                if (r5 != 0) goto L16
                r5 = r6
                goto L17
            L16:
                r5 = r2
            L17:
                if (r5 == 0) goto L27
                float r5 = r4.c()
                int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r5 != 0) goto L23
                r5 = r6
                goto L24
            L23:
                r5 = r2
            L24:
                if (r5 == 0) goto L27
                goto L28
            L27:
                r6 = r2
            L28:
                if (r6 == 0) goto L2b
                return r4
            L2b:
                int r3 = r3 + 1
                goto L7
            L2e:
                java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
                java.lang.String r9 = "Array contains no element matching the predicate."
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.a.C0141a.a(float, float):cb.a");
        }
    }

    a(float f10, float f11, int i10, int i11) {
        this.widthAspectRatio = f10;
        this.heightAspectRatio = f11;
        this.imageDrawableRes = i10;
        this.stringRes = i11;
    }

    public final float c() {
        return this.heightAspectRatio;
    }

    public final int e() {
        return this.imageDrawableRes;
    }

    public final int h() {
        return this.stringRes;
    }

    public final float i() {
        return this.widthAspectRatio;
    }
}
