package dp;

import java.util.concurrent.atomic.AtomicReferenceArray;
import zo.h0;
import zo.k0;

/* loaded from: classes4.dex */
public final class i extends h0<i> {

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f29776e;

    public i(long j10, i iVar, int i10) {
        super(j10, iVar, i10);
        int i11;
        i11 = h.f29775f;
        this.f29776e = new AtomicReferenceArray(i11);
    }

    @Override // zo.h0
    public int n() {
        int i10;
        i10 = h.f29775f;
        return i10;
    }

    public final void q(int i10) {
        k0 k0Var;
        k0Var = h.f29774e;
        this.f29776e.set(i10, k0Var);
        o();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + m() + ", hashCode=" + hashCode() + ']';
    }
}
