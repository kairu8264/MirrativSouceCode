package u6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import v6.a;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f54564a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f54565b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final s6.f f54566c;

    /* renamed from: d  reason: collision with root package name */
    public final b7.b f54567d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54568e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f54569f;

    /* renamed from: g  reason: collision with root package name */
    public final v6.a<Float, Float> f54570g;

    /* renamed from: h  reason: collision with root package name */
    public final v6.a<Float, Float> f54571h;

    /* renamed from: i  reason: collision with root package name */
    public final v6.p f54572i;

    /* renamed from: j  reason: collision with root package name */
    public d f54573j;

    public p(s6.f fVar, b7.b bVar, a7.l lVar) {
        this.f54566c = fVar;
        this.f54567d = bVar;
        this.f54568e = lVar.c();
        this.f54569f = lVar.f();
        v6.a<Float, Float> a10 = lVar.b().a();
        this.f54570g = a10;
        bVar.h(a10);
        a10.a(this);
        v6.a<Float, Float> a11 = lVar.d().a();
        this.f54571h = a11;
        bVar.h(a11);
        a11.a(this);
        v6.p b10 = lVar.e().b();
        this.f54572i = b10;
        b10.a(bVar);
        b10.b(this);
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        if (this.f54572i.c(t10, cVar)) {
            return;
        }
        if (t10 == s6.k.f52158u) {
            this.f54570g.n(cVar);
        } else if (t10 == s6.k.f52159v) {
            this.f54571h.n(cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        this.f54566c.invalidateSelf();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        this.f54573j.c(list, list2);
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        f7.g.m(eVar, i10, list, eVar2, this);
    }

    @Override // u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f54573j.e(rectF, matrix, z10);
    }

    @Override // u6.j
    public void f(ListIterator<c> listIterator) {
        if (this.f54573j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f54573j = new d(this.f54566c, this.f54567d, "Repeater", this.f54569f, arrayList, null);
    }

    @Override // u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f54570g.h().floatValue();
        float floatValue2 = this.f54571h.h().floatValue();
        float floatValue3 = this.f54572i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f54572i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f54564a.set(matrix);
            float f10 = i11;
            this.f54564a.preConcat(this.f54572i.g(f10 + floatValue2));
            this.f54573j.g(canvas, this.f54564a, (int) (i10 * f7.g.k(floatValue3, floatValue4, f10 / floatValue)));
        }
    }

    @Override // u6.c
    public String getName() {
        return this.f54568e;
    }

    @Override // u6.m
    public Path getPath() {
        Path path = this.f54573j.getPath();
        this.f54565b.reset();
        float floatValue = this.f54570g.h().floatValue();
        float floatValue2 = this.f54571h.h().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f54564a.set(this.f54572i.g(i10 + floatValue2));
            this.f54565b.addPath(path, this.f54564a);
        }
        return this.f54565b;
    }
}
