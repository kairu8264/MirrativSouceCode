package u6;

import a7.r;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c  reason: collision with root package name */
    public final String f54556c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f54557d;

    /* renamed from: e  reason: collision with root package name */
    public final s6.f f54558e;

    /* renamed from: f  reason: collision with root package name */
    public final v6.a<?, PointF> f54559f;

    /* renamed from: g  reason: collision with root package name */
    public final v6.a<?, PointF> f54560g;

    /* renamed from: h  reason: collision with root package name */
    public final v6.a<?, Float> f54561h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f54563j;

    /* renamed from: a  reason: collision with root package name */
    public final Path f54554a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f54555b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    public final b f54562i = new b();

    public o(s6.f fVar, b7.b bVar, a7.k kVar) {
        this.f54556c = kVar.c();
        this.f54557d = kVar.f();
        this.f54558e = fVar;
        v6.a<PointF, PointF> a10 = kVar.d().a();
        this.f54559f = a10;
        v6.a<PointF, PointF> a11 = kVar.e().a();
        this.f54560g = a11;
        v6.a<Float, Float> a12 = kVar.b().a();
        this.f54561h = a12;
        bVar.h(a10);
        bVar.h(a11);
        bVar.h(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        if (t10 == s6.k.f52149l) {
            this.f54560g.n(cVar);
        } else if (t10 == s6.k.f52151n) {
            this.f54559f.n(cVar);
        } else if (t10 == s6.k.f52150m) {
            this.f54561h.n(cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        f();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.f54562i.a(sVar);
                    sVar.a(this);
                }
            }
        }
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        f7.g.m(eVar, i10, list, eVar2, this);
    }

    public final void f() {
        this.f54563j = false;
        this.f54558e.invalidateSelf();
    }

    @Override // u6.c
    public String getName() {
        return this.f54556c;
    }

    @Override // u6.m
    public Path getPath() {
        if (this.f54563j) {
            return this.f54554a;
        }
        this.f54554a.reset();
        if (this.f54557d) {
            this.f54563j = true;
            return this.f54554a;
        }
        PointF h10 = this.f54560g.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        v6.a<?, Float> aVar = this.f54561h;
        float p10 = aVar == null ? 0.0f : ((v6.d) aVar).p();
        float min = Math.min(f10, f11);
        if (p10 > min) {
            p10 = min;
        }
        PointF h11 = this.f54559f.h();
        this.f54554a.moveTo(h11.x + f10, (h11.y - f11) + p10);
        this.f54554a.lineTo(h11.x + f10, (h11.y + f11) - p10);
        int i10 = (p10 > 0.0f ? 1 : (p10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f54555b;
            float f12 = h11.x;
            float f13 = p10 * 2.0f;
            float f14 = h11.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f54554a.arcTo(this.f54555b, 0.0f, 90.0f, false);
        }
        this.f54554a.lineTo((h11.x - f10) + p10, h11.y + f11);
        if (i10 > 0) {
            RectF rectF2 = this.f54555b;
            float f15 = h11.x;
            float f16 = h11.y;
            float f17 = p10 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f54554a.arcTo(this.f54555b, 90.0f, 90.0f, false);
        }
        this.f54554a.lineTo(h11.x - f10, (h11.y - f11) + p10);
        if (i10 > 0) {
            RectF rectF3 = this.f54555b;
            float f18 = h11.x;
            float f19 = h11.y;
            float f20 = p10 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f54554a.arcTo(this.f54555b, 180.0f, 90.0f, false);
        }
        this.f54554a.lineTo((h11.x + f10) - p10, h11.y - f11);
        if (i10 > 0) {
            RectF rectF4 = this.f54555b;
            float f21 = h11.x;
            float f22 = p10 * 2.0f;
            float f23 = h11.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f54554a.arcTo(this.f54555b, 270.0f, 90.0f, false);
        }
        this.f54554a.close();
        this.f54562i.b(this.f54554a);
        this.f54563j = true;
        return this.f54554a;
    }
}
