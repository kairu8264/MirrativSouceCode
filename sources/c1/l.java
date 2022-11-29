package c1;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class l implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f18710a;

    public l(PathMeasure pathMeasure) {
        jo.p.h(pathMeasure, "internalPathMeasure");
        this.f18710a = pathMeasure;
    }

    @Override // c1.x0
    public void a(u0 u0Var, boolean z10) {
        Path path;
        PathMeasure pathMeasure = this.f18710a;
        if (u0Var == null) {
            path = null;
        } else if (u0Var instanceof j) {
            path = ((j) u0Var).s();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, z10);
    }

    @Override // c1.x0
    public boolean b(float f10, float f11, u0 u0Var, boolean z10) {
        jo.p.h(u0Var, "destination");
        PathMeasure pathMeasure = this.f18710a;
        if (u0Var instanceof j) {
            return pathMeasure.getSegment(f10, f11, ((j) u0Var).s(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // c1.x0
    public float getLength() {
        return this.f18710a.getLength();
    }
}
