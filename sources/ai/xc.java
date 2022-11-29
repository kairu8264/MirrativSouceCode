package ai;

/* loaded from: classes3.dex */
public abstract class xc {

    /* renamed from: a  reason: collision with root package name */
    public static final xc f11907a = new uc();

    public abstract int a();

    public abstract wc b(int i10, wc wcVar, boolean z10, long j10);

    public abstract int c();

    public abstract vc d(int i10, vc vcVar, boolean z10);

    public abstract int e(Object obj);

    public final boolean f() {
        return a() == 0;
    }

    public final wc g(int i10, wc wcVar, boolean z10) {
        return b(i10, wcVar, false, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((a() - 1) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(int r3, ai.vc r4, ai.wc r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.d(r3, r4, r0)
            r2.g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.a()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = r0
            goto L2a
        L22:
            int r6 = r2.a()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            r4 = r3
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.g(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.xc.h(int, ai.vc, ai.wc, int):int");
    }
}
