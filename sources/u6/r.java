package u6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class r extends a {

    /* renamed from: r  reason: collision with root package name */
    public final b7.b f54581r;

    /* renamed from: s  reason: collision with root package name */
    public final String f54582s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f54583t;

    /* renamed from: u  reason: collision with root package name */
    public final v6.a<Integer, Integer> f54584u;

    /* renamed from: v  reason: collision with root package name */
    public v6.a<ColorFilter, ColorFilter> f54585v;

    public r(s6.f fVar, b7.b bVar, a7.q qVar) {
        super(fVar, bVar, qVar.b().a(), qVar.e().a(), qVar.g(), qVar.i(), qVar.j(), qVar.f(), qVar.d());
        this.f54581r = bVar;
        this.f54582s = qVar.h();
        this.f54583t = qVar.k();
        v6.a<Integer, Integer> a10 = qVar.c().a();
        this.f54584u = a10;
        a10.a(this);
        bVar.h(a10);
    }

    @Override // u6.a, y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        super.a(t10, cVar);
        if (t10 == s6.k.f52139b) {
            this.f54584u.n(cVar);
        } else if (t10 == s6.k.K) {
            v6.a<ColorFilter, ColorFilter> aVar = this.f54585v;
            if (aVar != null) {
                this.f54581r.F(aVar);
            }
            if (cVar == null) {
                this.f54585v = null;
                return;
            }
            v6.q qVar = new v6.q(cVar);
            this.f54585v = qVar;
            qVar.a(this);
            this.f54581r.h(this.f54584u);
        }
    }

    @Override // u6.a, u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f54583t) {
            return;
        }
        this.f54458i.setColor(((v6.b) this.f54584u).p());
        v6.a<ColorFilter, ColorFilter> aVar = this.f54585v;
        if (aVar != null) {
            this.f54458i.setColorFilter(aVar.h());
        }
        super.g(canvas, matrix, i10);
    }

    @Override // u6.c
    public String getName() {
        return this.f54582s;
    }
}
