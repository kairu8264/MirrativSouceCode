package ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ds2 {

    /* renamed from: c  reason: collision with root package name */
    public static final ds2 f3391c = new ds2();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<sr2> f3392a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<sr2> f3393b = new ArrayList<>();

    public static ds2 a() {
        return f3391c;
    }

    public final void b(sr2 sr2Var) {
        this.f3392a.add(sr2Var);
    }

    public final void c(sr2 sr2Var) {
        boolean g10 = g();
        this.f3393b.add(sr2Var);
        if (g10) {
            return;
        }
        ks2.a().c();
    }

    public final void d(sr2 sr2Var) {
        boolean g10 = g();
        this.f3392a.remove(sr2Var);
        this.f3393b.remove(sr2Var);
        if (!g10 || g()) {
            return;
        }
        ks2.a().d();
    }

    public final Collection<sr2> e() {
        return Collections.unmodifiableCollection(this.f3392a);
    }

    public final Collection<sr2> f() {
        return Collections.unmodifiableCollection(this.f3393b);
    }

    public final boolean g() {
        return this.f3393b.size() > 0;
    }
}
