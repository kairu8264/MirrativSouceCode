package ai;

import java.util.Set;
import rg.u;

/* loaded from: classes3.dex */
public final class fd1 extends ja1<u.a> {

    /* renamed from: x  reason: collision with root package name */
    public boolean f3993x;

    public fd1(Set<gc1<u.a>> set) {
        super(set);
    }

    public final synchronized void b() {
        C0(cd1.f2789a);
        this.f3993x = true;
    }

    public final synchronized void d() {
        if (!this.f3993x) {
            C0(dd1.f3205a);
            this.f3993x = true;
        }
        C0(ed1.f3613a);
    }

    public final void zza() {
        C0(ad1.f1825a);
    }

    public final void zzb() {
        C0(bd1.f2293a);
    }
}
