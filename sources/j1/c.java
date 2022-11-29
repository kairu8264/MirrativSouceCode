package j1;

import io.l;
import jo.h;
import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final l<a, Boolean> f37053a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f37054b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i10, l<? super a, Boolean> lVar) {
        s0 e10;
        this.f37053a = lVar;
        e10 = z1.e(a.c(i10), null, 2, null);
        this.f37054b = e10;
    }

    public /* synthetic */ c(int i10, l lVar, h hVar) {
        this(i10, lVar);
    }

    @Override // j1.b
    public int a() {
        return ((a) this.f37054b.getValue()).i();
    }

    public void b(int i10) {
        this.f37054b.setValue(a.c(i10));
    }
}
