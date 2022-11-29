package v6;

import java.util.List;

/* loaded from: classes.dex */
public class d extends g<Float> {
    public d(List<g7.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    public float q(g7.a<Float> aVar, float f10) {
        Float f11;
        if (aVar.f32797b != null && aVar.f32798c != null) {
            g7.c<A> cVar = this.f56772e;
            if (cVar != 0 && (f11 = (Float) cVar.b(aVar.f32802g, aVar.f32803h.floatValue(), aVar.f32797b, aVar.f32798c, f10, e(), f())) != null) {
                return f11.floatValue();
            }
            return f7.g.k(aVar.f(), aVar.c(), f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // v6.a
    /* renamed from: r */
    public Float i(g7.a<Float> aVar, float f10) {
        return Float.valueOf(q(aVar, f10));
    }
}
