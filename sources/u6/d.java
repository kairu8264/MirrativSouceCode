package u6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class d implements e, m, a.b, y6.f {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f54470a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f54471b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f54472c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f54473d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f54474e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54475f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f54476g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f54477h;

    /* renamed from: i  reason: collision with root package name */
    public final s6.f f54478i;

    /* renamed from: j  reason: collision with root package name */
    public List<m> f54479j;

    /* renamed from: k  reason: collision with root package name */
    public v6.p f54480k;

    public d(s6.f fVar, b7.b bVar, a7.o oVar) {
        this(fVar, bVar, oVar.c(), oVar.d(), f(fVar, bVar, oVar.b()), h(oVar.b()));
    }

    public static List<c> f(s6.f fVar, b7.b bVar, List<a7.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c a10 = list.get(i10).a(fVar, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static z6.l h(List<a7.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            a7.c cVar = list.get(i10);
            if (cVar instanceof z6.l) {
                return (z6.l) cVar;
            }
        }
        return null;
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        v6.p pVar = this.f54480k;
        if (pVar != null) {
            pVar.c(t10, cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        this.f54478i.invalidateSelf();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f54477h.size());
        arrayList.addAll(list);
        for (int size = this.f54477h.size() - 1; size >= 0; size--) {
            c cVar = this.f54477h.get(size);
            cVar.c(arrayList, this.f54477h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int e10 = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f54477h.size(); i11++) {
                    c cVar = this.f54477h.get(i11);
                    if (cVar instanceof y6.f) {
                        ((y6.f) cVar).d(eVar, e10, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f54472c.set(matrix);
        v6.p pVar = this.f54480k;
        if (pVar != null) {
            this.f54472c.preConcat(pVar.f());
        }
        this.f54474e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f54477h.size() - 1; size >= 0; size--) {
            c cVar = this.f54477h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(this.f54474e, this.f54472c, z10);
                rectF.union(this.f54474e);
            }
        }
    }

    @Override // u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f54476g) {
            return;
        }
        this.f54472c.set(matrix);
        v6.p pVar = this.f54480k;
        if (pVar != null) {
            this.f54472c.preConcat(pVar.f());
            i10 = (int) (((((this.f54480k.h() == null ? 100 : this.f54480k.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f54478i.K() && k() && i10 != 255;
        if (z10) {
            this.f54471b.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(this.f54471b, this.f54472c, true);
            this.f54470a.setAlpha(i10);
            f7.h.m(canvas, this.f54471b, this.f54470a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f54477h.size() - 1; size >= 0; size--) {
            c cVar = this.f54477h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).g(canvas, this.f54472c, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // u6.c
    public String getName() {
        return this.f54475f;
    }

    @Override // u6.m
    public Path getPath() {
        this.f54472c.reset();
        v6.p pVar = this.f54480k;
        if (pVar != null) {
            this.f54472c.set(pVar.f());
        }
        this.f54473d.reset();
        if (this.f54476g) {
            return this.f54473d;
        }
        for (int size = this.f54477h.size() - 1; size >= 0; size--) {
            c cVar = this.f54477h.get(size);
            if (cVar instanceof m) {
                this.f54473d.addPath(((m) cVar).getPath(), this.f54472c);
            }
        }
        return this.f54473d;
    }

    public List<m> i() {
        if (this.f54479j == null) {
            this.f54479j = new ArrayList();
            for (int i10 = 0; i10 < this.f54477h.size(); i10++) {
                c cVar = this.f54477h.get(i10);
                if (cVar instanceof m) {
                    this.f54479j.add((m) cVar);
                }
            }
        }
        return this.f54479j;
    }

    public Matrix j() {
        v6.p pVar = this.f54480k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f54472c.reset();
        return this.f54472c;
    }

    public final boolean k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f54477h.size(); i11++) {
            if ((this.f54477h.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public d(s6.f fVar, b7.b bVar, String str, boolean z10, List<c> list, z6.l lVar) {
        this.f54470a = new t6.a();
        this.f54471b = new RectF();
        this.f54472c = new Matrix();
        this.f54473d = new Path();
        this.f54474e = new RectF();
        this.f54475f = str;
        this.f54478i = fVar;
        this.f54476g = z10;
        this.f54477h = list;
        if (lVar != null) {
            v6.p b10 = lVar.b();
            this.f54480k = b10;
            b10.a(bVar);
            this.f54480k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
