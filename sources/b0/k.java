package b0;

import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f16696a;

    /* loaded from: classes.dex */
    public interface a {
        void cancel();
    }

    /* loaded from: classes.dex */
    public interface b {
        a d(int i10, long j10);
    }

    public k() {
        s0 e10;
        e10 = z1.e(null, null, 2, null);
        this.f16696a = e10;
    }

    public final b a() {
        return (b) this.f16696a.getValue();
    }

    public final a b(int i10, long j10) {
        a d10;
        b a10 = a();
        return (a10 == null || (d10 = a10.d(i10, j10)) == null) ? b0.b.f16664a : d10;
    }

    public final void c(b bVar) {
        this.f16696a.setValue(bVar);
    }
}
