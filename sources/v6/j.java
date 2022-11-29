package v6;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f56797i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f56798j;

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f56799k;

    /* renamed from: l  reason: collision with root package name */
    public i f56800l;

    public j(List<? extends g7.a<PointF>> list) {
        super(list);
        this.f56797i = new PointF();
        this.f56798j = new float[2];
        this.f56799k = new PathMeasure();
    }

    @Override // v6.a
    /* renamed from: p */
    public PointF i(g7.a<PointF> aVar, float f10) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j10 = iVar.j();
        if (j10 == null) {
            return aVar.f32797b;
        }
        g7.c<A> cVar = this.f56772e;
        if (cVar == 0 || (pointF = (PointF) cVar.b(iVar.f32802g, iVar.f32803h.floatValue(), (PointF) iVar.f32797b, (PointF) iVar.f32798c, e(), f10, f())) == null) {
            if (this.f56800l != iVar) {
                this.f56799k.setPath(j10, false);
                this.f56800l = iVar;
            }
            PathMeasure pathMeasure = this.f56799k;
            pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f56798j, null);
            PointF pointF2 = this.f56797i;
            float[] fArr = this.f56798j;
            pointF2.set(fArr[0], fArr[1]);
            return this.f56797i;
        }
        return pointF;
    }
}
