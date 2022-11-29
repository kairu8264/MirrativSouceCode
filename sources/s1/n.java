package s1;

import s1.n;
import x0.f;

/* loaded from: classes.dex */
public class n<T extends n<T, M>, M extends x0.f> {

    /* renamed from: w  reason: collision with root package name */
    public final p f51908w;

    /* renamed from: x  reason: collision with root package name */
    public final M f51909x;

    /* renamed from: y  reason: collision with root package name */
    public T f51910y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f51911z;

    public n(p pVar, M m10) {
        jo.p.h(pVar, "layoutNodeWrapper");
        jo.p.h(m10, "modifier");
        this.f51908w = pVar;
        this.f51909x = m10;
    }

    public final k a() {
        return this.f51908w.z1();
    }

    public final p b() {
        return this.f51908w;
    }

    public final M c() {
        return this.f51909x;
    }

    public final T d() {
        return this.f51910y;
    }

    public final long e() {
        return this.f51908w.a();
    }

    public final boolean f() {
        return this.f51911z;
    }

    public void g() {
        this.f51911z = true;
    }

    public void h() {
        this.f51911z = false;
    }

    public final void i(T t10) {
        this.f51910y = t10;
    }
}
