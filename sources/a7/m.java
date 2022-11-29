package a7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final List<y6.a> f603a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f604b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f605c;

    public m(PointF pointF, boolean z10, List<y6.a> list) {
        this.f604b = pointF;
        this.f605c = z10;
        this.f603a = new ArrayList(list);
    }

    public List<y6.a> a() {
        return this.f603a;
    }

    public PointF b() {
        return this.f604b;
    }

    public void c(m mVar, m mVar2, float f10) {
        if (this.f604b == null) {
            this.f604b = new PointF();
        }
        this.f605c = mVar.d() || mVar2.d();
        if (mVar.a().size() != mVar2.a().size()) {
            f7.d.c("Curves must have the same number of control points. Shape 1: " + mVar.a().size() + "\tShape 2: " + mVar2.a().size());
        }
        int min = Math.min(mVar.a().size(), mVar2.a().size());
        if (this.f603a.size() < min) {
            for (int size = this.f603a.size(); size < min; size++) {
                this.f603a.add(new y6.a());
            }
        } else if (this.f603a.size() > min) {
            for (int size2 = this.f603a.size() - 1; size2 >= min; size2--) {
                List<y6.a> list = this.f603a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = mVar.b();
        PointF b11 = mVar2.b();
        e(f7.g.k(b10.x, b11.x, f10), f7.g.k(b10.y, b11.y, f10));
        for (int size3 = this.f603a.size() - 1; size3 >= 0; size3--) {
            y6.a aVar = mVar.a().get(size3);
            y6.a aVar2 = mVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            this.f603a.get(size3).d(f7.g.k(a10.x, a11.x, f10), f7.g.k(a10.y, a11.y, f10));
            this.f603a.get(size3).e(f7.g.k(b12.x, b13.x, f10), f7.g.k(b12.y, b13.y, f10));
            this.f603a.get(size3).f(f7.g.k(c10.x, c11.x, f10), f7.g.k(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f605c;
    }

    public final void e(float f10, float f11) {
        if (this.f604b == null) {
            this.f604b = new PointF();
        }
        this.f604b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f603a.size() + "closed=" + this.f605c + '}';
    }

    public m() {
        this.f603a = new ArrayList();
    }
}
