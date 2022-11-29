package v6;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f56805i;

    /* renamed from: j  reason: collision with root package name */
    public final PointF f56806j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f56807k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Float, Float> f56808l;

    /* renamed from: m  reason: collision with root package name */
    public g7.c<Float> f56809m;

    /* renamed from: n  reason: collision with root package name */
    public g7.c<Float> f56810n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f56805i = new PointF();
        this.f56806j = new PointF();
        this.f56807k = aVar;
        this.f56808l = aVar2;
        m(f());
    }

    @Override // v6.a
    public void m(float f10) {
        this.f56807k.m(f10);
        this.f56808l.m(f10);
        this.f56805i.set(this.f56807k.h().floatValue(), this.f56808l.h().floatValue());
        for (int i10 = 0; i10 < this.f56768a.size(); i10++) {
            this.f56768a.get(i10).b();
        }
    }

    @Override // v6.a
    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // v6.a
    /* renamed from: q */
    public PointF i(g7.a<PointF> aVar, float f10) {
        Float f11;
        g7.a<Float> b10;
        g7.a<Float> b11;
        Float f12 = null;
        if (this.f56809m == null || (b11 = this.f56807k.b()) == null) {
            f11 = null;
        } else {
            float d10 = this.f56807k.d();
            Float f13 = b11.f32803h;
            g7.c<Float> cVar = this.f56809m;
            float f14 = b11.f32802g;
            f11 = cVar.b(f14, f13 == null ? f14 : f13.floatValue(), b11.f32797b, b11.f32798c, f10, f10, d10);
        }
        if (this.f56810n != null && (b10 = this.f56808l.b()) != null) {
            float d11 = this.f56808l.d();
            Float f15 = b10.f32803h;
            g7.c<Float> cVar2 = this.f56810n;
            float f16 = b10.f32802g;
            f12 = cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), b10.f32797b, b10.f32798c, f10, f10, d11);
        }
        if (f11 == null) {
            this.f56806j.set(this.f56805i.x, 0.0f);
        } else {
            this.f56806j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f56806j;
            pointF.set(pointF.x, this.f56805i.y);
        } else {
            PointF pointF2 = this.f56806j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f56806j;
    }

    public void r(g7.c<Float> cVar) {
        g7.c<Float> cVar2 = this.f56809m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f56809m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void s(g7.c<Float> cVar) {
        g7.c<Float> cVar2 = this.f56810n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f56810n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
