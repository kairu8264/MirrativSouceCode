package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class ux3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10870a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<rx3> f10871b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final dy3 f10872c = new dy3();

    /* renamed from: d  reason: collision with root package name */
    public vx3 f10873d;

    /* renamed from: e  reason: collision with root package name */
    public int f10874e;

    /* renamed from: f  reason: collision with root package name */
    public int f10875f;

    /* renamed from: g  reason: collision with root package name */
    public long f10876g;

    public final void a(vx3 vx3Var) {
        this.f10873d = vx3Var;
    }

    public final void b() {
        this.f10874e = 0;
        this.f10871b.clear();
        this.f10872c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(ai.nv3 r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ux3.c(ai.nv3):boolean");
    }

    public final long d(nv3 nv3Var, int i10) throws IOException {
        ((hv3) nv3Var).f(this.f10870a, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f10870a[i11] & TagConstant.TAG_CAT_RESERVED);
        }
        return j10;
    }
}
