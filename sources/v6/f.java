package v6;

import java.util.List;

/* loaded from: classes.dex */
public class f extends g<Integer> {
    public f(List<g7.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(g7.a<Integer> aVar, float f10) {
        Integer num;
        if (aVar.f32797b != null && aVar.f32798c != null) {
            g7.c<A> cVar = this.f56772e;
            if (cVar != 0 && (num = (Integer) cVar.b(aVar.f32802g, aVar.f32803h.floatValue(), aVar.f32797b, aVar.f32798c, f10, e(), f())) != null) {
                return num.intValue();
            }
            return f7.g.l(aVar.g(), aVar.d(), f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // v6.a
    /* renamed from: r */
    public Integer i(g7.a<Integer> aVar, float f10) {
        return Integer.valueOf(q(aVar, f10));
    }
}
