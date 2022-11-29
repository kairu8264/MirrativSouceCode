package v6;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f56801i;

    public k(List<g7.a<PointF>> list) {
        super(list);
        this.f56801i = new PointF();
    }

    @Override // v6.a
    /* renamed from: p */
    public PointF i(g7.a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    @Override // v6.a
    /* renamed from: q */
    public PointF j(g7.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f32797b;
        if (pointF3 != null && (pointF = aVar.f32798c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            g7.c<A> cVar = this.f56772e;
            if (cVar == 0 || (pointF2 = (PointF) cVar.b(aVar.f32802g, aVar.f32803h.floatValue(), pointF4, pointF5, f10, e(), f())) == null) {
                PointF pointF6 = this.f56801i;
                float f13 = pointF4.x;
                float f14 = f13 + (f11 * (pointF5.x - f13));
                float f15 = pointF4.y;
                pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
                return this.f56801i;
            }
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
