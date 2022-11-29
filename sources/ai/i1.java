package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class i1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f5073a;

    /* renamed from: b  reason: collision with root package name */
    public final c64 f5074b;

    public i1(r0 r0Var, c64 c64Var) {
        this.f5073a = r0Var;
        this.f5074b = c64Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f5073a.o() != null) {
            this.f5073a.o().get();
        }
        s64 n10 = this.f5073a.n();
        if (n10 != null) {
            try {
                synchronized (this.f5074b) {
                    c64 c64Var = this.f5074b;
                    byte[] L = n10.L();
                    c64Var.q(L, 0, L.length, di3.a());
                }
                return null;
            } catch (zzggm | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
