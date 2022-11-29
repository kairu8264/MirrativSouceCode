package v6;

import java.util.List;

/* loaded from: classes.dex */
public class l extends g<g7.d> {

    /* renamed from: i  reason: collision with root package name */
    public final g7.d f56802i;

    public l(List<g7.a<g7.d>> list) {
        super(list);
        this.f56802i = new g7.d();
    }

    @Override // v6.a
    /* renamed from: p */
    public g7.d i(g7.a<g7.d> aVar, float f10) {
        g7.d dVar;
        g7.d dVar2;
        g7.d dVar3 = aVar.f32797b;
        if (dVar3 != null && (dVar = aVar.f32798c) != null) {
            g7.d dVar4 = dVar3;
            g7.d dVar5 = dVar;
            g7.c<A> cVar = this.f56772e;
            if (cVar == 0 || (dVar2 = (g7.d) cVar.b(aVar.f32802g, aVar.f32803h.floatValue(), dVar4, dVar5, f10, e(), f())) == null) {
                this.f56802i.d(f7.g.k(dVar4.b(), dVar5.b(), f10), f7.g.k(dVar4.c(), dVar5.c(), f10));
                return this.f56802i;
            }
            return dVar2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
