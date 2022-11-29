package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class ze {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12943a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final Stack<we> f12944b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    public final gf f12945c = new gf();

    /* renamed from: d  reason: collision with root package name */
    public int f12946d;

    /* renamed from: e  reason: collision with root package name */
    public int f12947e;

    /* renamed from: f  reason: collision with root package name */
    public long f12948f;

    /* renamed from: g  reason: collision with root package name */
    public bf f12949g;

    public final void a() {
        this.f12946d = 0;
        this.f12944b.clear();
        this.f12945c.a();
    }

    public final void b(bf bfVar) {
        this.f12949g = bfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(ai.le r12) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ze.c(ai.le):boolean");
    }

    public final long d(le leVar, int i10) throws IOException, InterruptedException {
        leVar.b(this.f12943a, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f12943a[i11] & TagConstant.TAG_CAT_RESERVED);
        }
        return j10;
    }
}
