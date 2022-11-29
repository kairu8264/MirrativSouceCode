package ai;

import java.io.File;

/* loaded from: classes3.dex */
public final class jv2 {

    /* renamed from: a  reason: collision with root package name */
    public final j2 f5934a;

    /* renamed from: b  reason: collision with root package name */
    public final File f5935b;

    /* renamed from: c  reason: collision with root package name */
    public final File f5936c;

    /* renamed from: d  reason: collision with root package name */
    public final File f5937d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5938e;

    public jv2(j2 j2Var, File file, File file2, File file3) {
        this.f5934a = j2Var;
        this.f5935b = file;
        this.f5936c = file3;
        this.f5937d = file2;
    }

    public final j2 a() {
        return this.f5934a;
    }

    public final File b() {
        return this.f5935b;
    }

    public final File c() {
        return this.f5936c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] d() {
        /*
            r3 = this;
            byte[] r0 = r3.f5938e
            r1 = 0
            if (r0 != 0) goto L27
            java.io.File r0 = r3.f5937d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            ai.oh3 r0 = ai.oh3.R(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            byte[] r0 = r0.U()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            vh.l.a(r2)
            goto L25
        L18:
            r0 = move-exception
            r1 = r2
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            vh.l.a(r1)
            throw r0
        L20:
            r2 = r1
        L21:
            vh.l.a(r2)
            r0 = r1
        L25:
            r3.f5938e = r0
        L27:
            byte[] r0 = r3.f5938e
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.jv2.d():byte[]");
    }

    public final boolean e(long j10) {
        return this.f5934a.D() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
