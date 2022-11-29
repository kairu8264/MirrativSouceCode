package z6;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f62581a;

    /* renamed from: b  reason: collision with root package name */
    public final b f62582b;

    public i(b bVar, b bVar2) {
        this.f62581a = bVar;
        this.f62582b = bVar2;
    }

    @Override // z6.m
    public v6.a<PointF, PointF> a() {
        return new v6.n(this.f62581a.a(), this.f62582b.a());
    }

    @Override // z6.m
    public List<g7.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // z6.m
    public boolean c() {
        return this.f62581a.c() && this.f62582b.c();
    }
}
