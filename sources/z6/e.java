package z6;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final List<g7.a<PointF>> f62580a;

    public e(List<g7.a<PointF>> list) {
        this.f62580a = list;
    }

    @Override // z6.m
    public v6.a<PointF, PointF> a() {
        if (this.f62580a.get(0).h()) {
            return new v6.k(this.f62580a);
        }
        return new v6.j(this.f62580a);
    }

    @Override // z6.m
    public List<g7.a<PointF>> b() {
        return this.f62580a;
    }

    @Override // z6.m
    public boolean c() {
        return this.f62580a.size() == 1 && this.f62580a.get(0).h();
    }
}
