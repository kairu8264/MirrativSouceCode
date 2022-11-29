package v6;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class i extends g7.a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    public Path f56795q;

    /* renamed from: r  reason: collision with root package name */
    public final g7.a<PointF> f56796r;

    public i(s6.d dVar, g7.a<PointF> aVar) {
        super(dVar, aVar.f32797b, aVar.f32798c, aVar.f32799d, aVar.f32800e, aVar.f32801f, aVar.f32802g, aVar.f32803h);
        this.f56796r = aVar;
        i();
    }

    public void i() {
        T t10;
        T t11;
        T t12 = this.f32798c;
        boolean z10 = (t12 == 0 || (t11 = this.f32797b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f32797b;
        if (t13 == 0 || (t10 = this.f32798c) == 0 || z10) {
            return;
        }
        g7.a<PointF> aVar = this.f56796r;
        this.f56795q = f7.h.d((PointF) t13, (PointF) t10, aVar.f32810o, aVar.f32811p);
    }

    public Path j() {
        return this.f56795q;
    }
}
