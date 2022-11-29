package ai;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pm3 implements sp3 {

    /* renamed from: a  reason: collision with root package name */
    public final sv3 f8477a;

    /* renamed from: b  reason: collision with root package name */
    public mv3 f8478b;

    /* renamed from: c  reason: collision with root package name */
    public nv3 f8479c;

    public pm3(sv3 sv3Var) {
        this.f8477a = sv3Var;
    }

    @Override // ai.sp3
    public final int a(iw3 iw3Var) throws IOException {
        mv3 mv3Var = this.f8478b;
        Objects.requireNonNull(mv3Var);
        nv3 nv3Var = this.f8479c;
        Objects.requireNonNull(nv3Var);
        return mv3Var.e(nv3Var, iw3Var);
    }

    @Override // ai.sp3
    public final void b() {
        mv3 mv3Var = this.f8478b;
        if (mv3Var instanceof jy3) {
            ((jy3) mv3Var).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.n() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r6.n() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        r1 = false;
     */
    @Override // ai.sp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(ai.a6 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, ai.pv3 r15) throws java.io.IOException {
        /*
            r7 = this;
            ai.hv3 r6 = new ai.hv3
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f8479c = r6
            ai.mv3 r8 = r7.f8478b
            if (r8 == 0) goto L10
            return
        L10:
            ai.sv3 r8 = r7.f8477a
            ai.mv3[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f8478b = r8
            goto L73
        L20:
            r0 = r13
        L21:
            if (r0 >= r10) goto L6f
            r1 = r8[r0]
            boolean r2 = r1.i(r6)     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            if (r2 == 0) goto L34
            r7.f8478b = r1     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            ai.u9.d(r14)
            r6.j()
            goto L6f
        L34:
            ai.mv3 r1 = r7.f8478b
            if (r1 != 0) goto L65
            long r1 = r6.n()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L63
            goto L65
        L41:
            r8 = move-exception
            ai.mv3 r9 = r7.f8478b
            if (r9 != 0) goto L4e
            long r9 = r6.n()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L4f
        L4e:
            r13 = r14
        L4f:
            ai.u9.d(r13)
            r6.j()
            throw r8
        L56:
            ai.mv3 r1 = r7.f8478b
            if (r1 != 0) goto L65
            long r1 = r6.n()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L63
            goto L65
        L63:
            r1 = r13
            goto L66
        L65:
            r1 = r14
        L66:
            ai.u9.d(r1)
            r6.j()
            int r0 = r0 + 1
            goto L21
        L6f:
            ai.mv3 r10 = r7.f8478b
            if (r10 == 0) goto L79
        L73:
            ai.mv3 r8 = r7.f8478b
            r8.h(r15)
            return
        L79:
            com.google.android.gms.internal.ads.zzjb r10 = new com.google.android.gms.internal.ads.zzjb
            java.lang.String r8 = ai.sb.m(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r8.length()
            int r12 = r12 + 58
            r11.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.pm3.c(ai.a6, android.net.Uri, java.util.Map, long, long, ai.pv3):void");
    }

    @Override // ai.sp3
    public final long d() {
        nv3 nv3Var = this.f8479c;
        if (nv3Var != null) {
            return nv3Var.n();
        }
        return -1L;
    }

    @Override // ai.sp3
    public final void g(long j10, long j11) {
        mv3 mv3Var = this.f8478b;
        Objects.requireNonNull(mv3Var);
        mv3Var.g(j10, j11);
    }

    @Override // ai.sp3
    public final void zzb() {
        if (this.f8478b != null) {
            this.f8478b = null;
        }
        this.f8479c = null;
    }
}
