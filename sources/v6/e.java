package v6;

import java.util.List;

/* loaded from: classes.dex */
public class e extends g<a7.d> {

    /* renamed from: i  reason: collision with root package name */
    public final a7.d f56791i;

    public e(List<g7.a<a7.d>> list) {
        super(list);
        a7.d dVar = list.get(0).f32797b;
        int c10 = dVar != null ? dVar.c() : 0;
        this.f56791i = new a7.d(new float[c10], new int[c10]);
    }

    @Override // v6.a
    /* renamed from: p */
    public a7.d i(g7.a<a7.d> aVar, float f10) {
        this.f56791i.d(aVar.f32797b, aVar.f32798c, f10);
        return this.f56791i;
    }
}
