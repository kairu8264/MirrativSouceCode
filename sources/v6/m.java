package v6;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a<a7.m, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final a7.m f56803i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f56804j;

    public m(List<g7.a<a7.m>> list) {
        super(list);
        this.f56803i = new a7.m();
        this.f56804j = new Path();
    }

    @Override // v6.a
    /* renamed from: p */
    public Path i(g7.a<a7.m> aVar, float f10) {
        this.f56803i.c(aVar.f32797b, aVar.f32798c, f10);
        f7.g.i(this.f56803i, this.f56804j);
        return this.f56804j;
    }
}
