package v6;

import android.graphics.Color;
import android.graphics.Paint;
import v6.a;

/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f56782a;

    /* renamed from: b  reason: collision with root package name */
    public final v6.a<Integer, Integer> f56783b;

    /* renamed from: c  reason: collision with root package name */
    public final v6.a<Float, Float> f56784c;

    /* renamed from: d  reason: collision with root package name */
    public final v6.a<Float, Float> f56785d;

    /* renamed from: e  reason: collision with root package name */
    public final v6.a<Float, Float> f56786e;

    /* renamed from: f  reason: collision with root package name */
    public final v6.a<Float, Float> f56787f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f56788g = true;

    /* loaded from: classes.dex */
    public class a extends g7.c<Float> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g7.c f56789d;

        public a(g7.c cVar) {
            this.f56789d = cVar;
        }

        @Override // g7.c
        /* renamed from: d */
        public Float a(g7.b<Float> bVar) {
            Float f10 = (Float) this.f56789d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, b7.b bVar2, d7.j jVar) {
        this.f56782a = bVar;
        v6.a<Integer, Integer> a10 = jVar.a().a();
        this.f56783b = a10;
        a10.a(this);
        bVar2.h(a10);
        v6.a<Float, Float> a11 = jVar.d().a();
        this.f56784c = a11;
        a11.a(this);
        bVar2.h(a11);
        v6.a<Float, Float> a12 = jVar.b().a();
        this.f56785d = a12;
        a12.a(this);
        bVar2.h(a12);
        v6.a<Float, Float> a13 = jVar.c().a();
        this.f56786e = a13;
        a13.a(this);
        bVar2.h(a13);
        v6.a<Float, Float> a14 = jVar.e().a();
        this.f56787f = a14;
        a14.a(this);
        bVar2.h(a14);
    }

    public void a(Paint paint) {
        if (this.f56788g) {
            this.f56788g = false;
            double floatValue = this.f56785d.h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f56786e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f56783b.h().intValue();
            paint.setShadowLayer(this.f56787f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f56784c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    @Override // v6.a.b
    public void b() {
        this.f56788g = true;
        this.f56782a.b();
    }

    public void c(g7.c<Integer> cVar) {
        this.f56783b.n(cVar);
    }

    public void d(g7.c<Float> cVar) {
        this.f56785d.n(cVar);
    }

    public void e(g7.c<Float> cVar) {
        this.f56786e.n(cVar);
    }

    public void f(g7.c<Float> cVar) {
        if (cVar == null) {
            this.f56784c.n(null);
        } else {
            this.f56784c.n(new a(cVar));
        }
    }

    public void g(g7.c<Float> cVar) {
        this.f56787f.n(cVar);
    }
}
