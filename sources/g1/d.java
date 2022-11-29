package g1;

import g1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f32382a = new ArrayList();

    public final d a(f fVar) {
        this.f32382a.add(fVar);
        return this;
    }

    public final d b() {
        return a(f.b.f32415c);
    }

    public final List<f> c() {
        return this.f32382a;
    }

    public final d d(float f10) {
        return a(new f.d(f10));
    }

    public final d e(float f10, float f11) {
        return a(new f.e(f10, f11));
    }

    public final d f(float f10, float f11) {
        return a(new f.m(f10, f11));
    }

    public final d g(float f10, float f11) {
        return a(new f.C0374f(f10, f11));
    }

    public final d h(float f10) {
        return a(new f.r(f10));
    }
}
