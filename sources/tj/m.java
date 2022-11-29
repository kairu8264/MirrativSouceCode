package tj;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f53740a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f53741b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f53742c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f53743d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f53744e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f53745f;

    /* renamed from: g  reason: collision with root package name */
    public final List<f> f53746g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f53747h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f53748i;

    /* loaded from: classes3.dex */
    public class a extends g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f53749b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Matrix f53750c;

        public a(List list, Matrix matrix) {
            this.f53749b = list;
            this.f53750c = matrix;
        }

        @Override // tj.m.g
        public void a(Matrix matrix, sj.a aVar, int i10, Canvas canvas) {
            for (g gVar : this.f53749b) {
                gVar.a(this.f53750c, aVar, i10, canvas);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        public final d f53752b;

        public b(d dVar) {
            this.f53752b = dVar;
        }

        @Override // tj.m.g
        public void a(Matrix matrix, sj.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f53752b.k(), this.f53752b.o(), this.f53752b.l(), this.f53752b.j()), i10, this.f53752b.m(), this.f53752b.n());
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        public final e f53753b;

        /* renamed from: c  reason: collision with root package name */
        public final float f53754c;

        /* renamed from: d  reason: collision with root package name */
        public final float f53755d;

        public c(e eVar, float f10, float f11) {
            this.f53753b = eVar;
            this.f53754c = f10;
            this.f53755d = f11;
        }

        @Override // tj.m.g
        public void a(Matrix matrix, sj.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f53753b.f53764c - this.f53755d, this.f53753b.f53763b - this.f53754c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f53754c, this.f53755d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f53753b.f53764c - this.f53755d) / (this.f53753b.f53763b - this.f53754c)));
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f53756h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f53757b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f53758c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f53759d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f53760e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f53761f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f53762g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // tj.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f53765a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f53756h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f53760e;
        }

        public final float k() {
            return this.f53757b;
        }

        public final float l() {
            return this.f53759d;
        }

        public final float m() {
            return this.f53761f;
        }

        public final float n() {
            return this.f53762g;
        }

        public final float o() {
            return this.f53758c;
        }

        public final void p(float f10) {
            this.f53760e = f10;
        }

        public final void q(float f10) {
            this.f53757b = f10;
        }

        public final void r(float f10) {
            this.f53759d = f10;
        }

        public final void s(float f10) {
            this.f53761f = f10;
        }

        public final void t(float f10) {
            this.f53762g = f10;
        }

        public final void u(float f10) {
            this.f53758c = f10;
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        public float f53763b;

        /* renamed from: c  reason: collision with root package name */
        public float f53764c;

        @Override // tj.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f53765a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f53763b, this.f53764c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f53765a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes3.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f53766a = new Matrix();

        public abstract void a(Matrix matrix, sj.a aVar, int i10, Canvas canvas);

        public final void b(sj.a aVar, int i10, Canvas canvas) {
            a(f53766a, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f53746g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f53747h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f53747h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f53746g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f53746g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f53748i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f53747h), new Matrix(matrix));
    }

    public final float g() {
        return this.f53744e;
    }

    public final float h() {
        return this.f53745f;
    }

    public float i() {
        return this.f53742c;
    }

    public float j() {
        return this.f53743d;
    }

    public float k() {
        return this.f53740a;
    }

    public float l() {
        return this.f53741b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f53763b = f10;
        eVar.f53764c = f11;
        this.f53746g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f53746g.clear();
        this.f53747h.clear();
        this.f53748i = false;
    }

    public final void p(float f10) {
        this.f53744e = f10;
    }

    public final void q(float f10) {
        this.f53745f = f10;
    }

    public final void r(float f10) {
        this.f53742c = f10;
    }

    public final void s(float f10) {
        this.f53743d = f10;
    }

    public final void t(float f10) {
        this.f53740a = f10;
    }

    public final void u(float f10) {
        this.f53741b = f10;
    }
}
