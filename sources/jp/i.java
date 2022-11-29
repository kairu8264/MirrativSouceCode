package jp;

import ep.f0;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.p;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<f0> f38219a = new LinkedHashSet();

    public final synchronized void a(f0 f0Var) {
        p.h(f0Var, "route");
        this.f38219a.remove(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        p.h(f0Var, "failedRoute");
        this.f38219a.add(f0Var);
    }

    public final synchronized boolean c(f0 f0Var) {
        p.h(f0Var, "route");
        return this.f38219a.contains(f0Var);
    }
}
