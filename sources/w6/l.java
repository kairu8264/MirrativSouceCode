package w6;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.Iterator;
import java.util.List;
import jo.p;
import w6.m;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Integer>> f58182a;

    /* renamed from: b  reason: collision with root package name */
    public final List<n<PointF>> f58183b;

    /* renamed from: c  reason: collision with root package name */
    public final List<n<Float>> f58184c;

    /* renamed from: d  reason: collision with root package name */
    public final List<n<g7.d>> f58185d;

    /* renamed from: e  reason: collision with root package name */
    public final List<n<ColorFilter>> f58186e;

    /* renamed from: f  reason: collision with root package name */
    public final List<n<int[]>> f58187f;

    /* renamed from: g  reason: collision with root package name */
    public final List<n<Typeface>> f58188g;

    /* renamed from: h  reason: collision with root package name */
    public final List<n<Bitmap>> f58189h;

    public final void a(s6.f fVar) {
        m.a b10;
        m.a b11;
        m.a b12;
        m.a b13;
        m.a b14;
        m.a b15;
        m.a b16;
        m.a b17;
        p.h(fVar, "drawable");
        Iterator<T> it = this.f58182a.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            y6.e b18 = nVar.b();
            Object c10 = nVar.c();
            b17 = m.b(nVar.a());
            fVar.d(b18, c10, b17);
        }
        Iterator<T> it2 = this.f58183b.iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            y6.e b19 = nVar2.b();
            Object c11 = nVar2.c();
            b16 = m.b(nVar2.a());
            fVar.d(b19, c11, b16);
        }
        Iterator<T> it3 = this.f58184c.iterator();
        while (it3.hasNext()) {
            n nVar3 = (n) it3.next();
            y6.e b20 = nVar3.b();
            Object c12 = nVar3.c();
            b15 = m.b(nVar3.a());
            fVar.d(b20, c12, b15);
        }
        Iterator<T> it4 = this.f58185d.iterator();
        while (it4.hasNext()) {
            n nVar4 = (n) it4.next();
            y6.e b21 = nVar4.b();
            Object c13 = nVar4.c();
            b14 = m.b(nVar4.a());
            fVar.d(b21, c13, b14);
        }
        Iterator<T> it5 = this.f58186e.iterator();
        while (it5.hasNext()) {
            n nVar5 = (n) it5.next();
            y6.e b22 = nVar5.b();
            Object c14 = nVar5.c();
            b13 = m.b(nVar5.a());
            fVar.d(b22, c14, b13);
        }
        Iterator<T> it6 = this.f58187f.iterator();
        while (it6.hasNext()) {
            n nVar6 = (n) it6.next();
            y6.e b23 = nVar6.b();
            Object c15 = nVar6.c();
            b12 = m.b(nVar6.a());
            fVar.d(b23, c15, b12);
        }
        Iterator<T> it7 = this.f58188g.iterator();
        while (it7.hasNext()) {
            n nVar7 = (n) it7.next();
            y6.e b24 = nVar7.b();
            Object c16 = nVar7.c();
            b11 = m.b(nVar7.a());
            fVar.d(b24, c16, b11);
        }
        Iterator<T> it8 = this.f58189h.iterator();
        while (it8.hasNext()) {
            n nVar8 = (n) it8.next();
            y6.e b25 = nVar8.b();
            Object c17 = nVar8.c();
            b10 = m.b(nVar8.a());
            fVar.d(b25, c17, b10);
        }
    }

    public final void b(s6.f fVar) {
        p.h(fVar, "drawable");
        Iterator<T> it = this.f58182a.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            fVar.d(nVar.b(), nVar.c(), null);
        }
        Iterator<T> it2 = this.f58183b.iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            fVar.d(nVar2.b(), nVar2.c(), null);
        }
        Iterator<T> it3 = this.f58184c.iterator();
        while (it3.hasNext()) {
            n nVar3 = (n) it3.next();
            fVar.d(nVar3.b(), nVar3.c(), null);
        }
        Iterator<T> it4 = this.f58185d.iterator();
        while (it4.hasNext()) {
            n nVar4 = (n) it4.next();
            fVar.d(nVar4.b(), nVar4.c(), null);
        }
        Iterator<T> it5 = this.f58186e.iterator();
        while (it5.hasNext()) {
            n nVar5 = (n) it5.next();
            fVar.d(nVar5.b(), nVar5.c(), null);
        }
        Iterator<T> it6 = this.f58187f.iterator();
        while (it6.hasNext()) {
            n nVar6 = (n) it6.next();
            fVar.d(nVar6.b(), nVar6.c(), null);
        }
        Iterator<T> it7 = this.f58188g.iterator();
        while (it7.hasNext()) {
            n nVar7 = (n) it7.next();
            fVar.d(nVar7.b(), nVar7.c(), null);
        }
        Iterator<T> it8 = this.f58189h.iterator();
        while (it8.hasNext()) {
            n nVar8 = (n) it8.next();
            fVar.d(nVar8.b(), nVar8.c(), null);
        }
    }
}
