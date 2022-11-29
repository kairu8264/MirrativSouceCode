package u6;

import a7.r;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    public final String f54482b;

    /* renamed from: c  reason: collision with root package name */
    public final s6.f f54483c;

    /* renamed from: d  reason: collision with root package name */
    public final v6.a<?, PointF> f54484d;

    /* renamed from: e  reason: collision with root package name */
    public final v6.a<?, PointF> f54485e;

    /* renamed from: f  reason: collision with root package name */
    public final a7.b f54486f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f54488h;

    /* renamed from: a  reason: collision with root package name */
    public final Path f54481a = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final b f54487g = new b();

    public f(s6.f fVar, b7.b bVar, a7.b bVar2) {
        this.f54482b = bVar2.b();
        this.f54483c = fVar;
        v6.a<PointF, PointF> a10 = bVar2.d().a();
        this.f54484d = a10;
        v6.a<PointF, PointF> a11 = bVar2.c().a();
        this.f54485e = a11;
        this.f54486f = bVar2;
        bVar.h(a10);
        bVar.h(a11);
        a10.a(this);
        a11.a(this);
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        if (t10 == s6.k.f52148k) {
            this.f54484d.n(cVar);
        } else if (t10 == s6.k.f52151n) {
            this.f54485e.n(cVar);
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
                    this.f54487g.a(sVar);
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
        this.f54488h = false;
        this.f54483c.invalidateSelf();
    }

    @Override // u6.c
    public String getName() {
        return this.f54482b;
    }

    @Override // u6.m
    public Path getPath() {
        if (this.f54488h) {
            return this.f54481a;
        }
        this.f54481a.reset();
        if (this.f54486f.e()) {
            this.f54488h = true;
            return this.f54481a;
        }
        PointF h10 = this.f54484d.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f54481a.reset();
        if (this.f54486f.f()) {
            float f14 = -f11;
            this.f54481a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f54481a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f54481a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f54481a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f54481a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f54481a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f54481a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f54481a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f54481a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f54481a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF h11 = this.f54485e.h();
        this.f54481a.offset(h11.x, h11.y);
        this.f54481a.close();
        this.f54487g.b(this.f54481a);
        this.f54488h = true;
        return this.f54481a;
    }
}
