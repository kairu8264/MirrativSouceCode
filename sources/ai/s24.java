package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class s24 implements mv3 {

    /* renamed from: f  reason: collision with root package name */
    public static final sv3 f9690f = o24.f7630a;

    /* renamed from: a  reason: collision with root package name */
    public pv3 f9691a;

    /* renamed from: b  reason: collision with root package name */
    public pw3 f9692b;

    /* renamed from: c  reason: collision with root package name */
    public q24 f9693c;

    /* renamed from: d  reason: collision with root package name */
    public int f9694d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f9695e = -1;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r15 != 65534) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r14, ai.iw3 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.s24.e(ai.nv3, ai.iw3):int");
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        q24 q24Var = this.f9693c;
        if (q24Var != null) {
            q24Var.a(j11);
        }
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f9691a = pv3Var;
        this.f9692b = pv3Var.p(0, 1);
        pv3Var.x();
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        return v24.a(nv3Var) != null;
    }
}
