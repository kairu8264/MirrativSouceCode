package ai;

import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class jn2 {

    /* renamed from: b  reason: collision with root package name */
    public final int f5852b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5853c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<tn2<?, ?>> f5851a = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    public final jo2 f5854d = new jo2();

    public jn2(int i10, int i11) {
        this.f5852b = i10;
        this.f5853c = i11;
    }

    public final boolean a(tn2<?, ?> tn2Var) {
        this.f5854d.a();
        i();
        if (this.f5851a.size() == this.f5852b) {
            return false;
        }
        this.f5851a.add(tn2Var);
        return true;
    }

    public final tn2<?, ?> b() {
        this.f5854d.a();
        i();
        if (this.f5851a.isEmpty()) {
            return null;
        }
        tn2<?, ?> remove = this.f5851a.remove();
        if (remove != null) {
            this.f5854d.b();
        }
        return remove;
    }

    public final int c() {
        i();
        return this.f5851a.size();
    }

    public final long d() {
        return this.f5854d.d();
    }

    public final long e() {
        return this.f5854d.e();
    }

    public final int f() {
        return this.f5854d.f();
    }

    public final String g() {
        return this.f5854d.h();
    }

    public final ho2 h() {
        return this.f5854d.g();
    }

    public final void i() {
        while (!this.f5851a.isEmpty() && wg.t.k().currentTimeMillis() - this.f5851a.getFirst().f10358d >= this.f5853c) {
            this.f5854d.c();
            this.f5851a.remove();
        }
    }
}
