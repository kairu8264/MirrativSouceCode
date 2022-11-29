package y6;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f61244a;

    /* renamed from: b  reason: collision with root package name */
    public final PointF f61245b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f61246c;

    public a() {
        this.f61244a = new PointF();
        this.f61245b = new PointF();
        this.f61246c = new PointF();
    }

    public PointF a() {
        return this.f61244a;
    }

    public PointF b() {
        return this.f61245b;
    }

    public PointF c() {
        return this.f61246c;
    }

    public void d(float f10, float f11) {
        this.f61244a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f61245b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f61246c.set(f10, f11);
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f61244a = pointF;
        this.f61245b = pointF2;
        this.f61246c = pointF3;
    }
}
