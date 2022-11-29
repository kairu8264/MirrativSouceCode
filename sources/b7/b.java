package b7;

import a7.h;
import a7.m;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import b7.e;
import d7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v6.a;
import v6.p;

/* loaded from: classes.dex */
public abstract class b implements u6.e, a.b, y6.f {
    public BlurMaskFilter A;

    /* renamed from: a  reason: collision with root package name */
    public final Path f17017a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f17018b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Paint f17019c = new t6.a(1);

    /* renamed from: d  reason: collision with root package name */
    public final Paint f17020d = new t6.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e  reason: collision with root package name */
    public final Paint f17021e = new t6.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f  reason: collision with root package name */
    public final Paint f17022f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f17023g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f17024h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f17025i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f17026j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f17027k;

    /* renamed from: l  reason: collision with root package name */
    public final String f17028l;

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f17029m;

    /* renamed from: n  reason: collision with root package name */
    public final s6.f f17030n;

    /* renamed from: o  reason: collision with root package name */
    public final e f17031o;

    /* renamed from: p  reason: collision with root package name */
    public v6.h f17032p;

    /* renamed from: q  reason: collision with root package name */
    public v6.d f17033q;

    /* renamed from: r  reason: collision with root package name */
    public b f17034r;

    /* renamed from: s  reason: collision with root package name */
    public b f17035s;

    /* renamed from: t  reason: collision with root package name */
    public List<b> f17036t;

    /* renamed from: u  reason: collision with root package name */
    public final List<v6.a<?, ?>> f17037u;

    /* renamed from: v  reason: collision with root package name */
    public final p f17038v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f17039w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f17040x;

    /* renamed from: y  reason: collision with root package name */
    public Paint f17041y;

    /* renamed from: z  reason: collision with root package name */
    public float f17042z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17043a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f17044b;

        static {
            int[] iArr = new int[h.a.values().length];
            f17044b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17044b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17044b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17044b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f17043a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17043a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17043a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17043a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17043a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17043a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17043a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(s6.f fVar, e eVar) {
        t6.a aVar = new t6.a(1);
        this.f17022f = aVar;
        this.f17023g = new t6.a(PorterDuff.Mode.CLEAR);
        this.f17024h = new RectF();
        this.f17025i = new RectF();
        this.f17026j = new RectF();
        this.f17027k = new RectF();
        this.f17029m = new Matrix();
        this.f17037u = new ArrayList();
        this.f17039w = true;
        this.f17042z = 0.0f;
        this.f17030n = fVar;
        this.f17031o = eVar;
        this.f17028l = eVar.i() + "#draw";
        if (eVar.h() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        p b10 = eVar.w().b();
        this.f17038v = b10;
        b10.b(this);
        if (eVar.g() != null && !eVar.g().isEmpty()) {
            v6.h hVar = new v6.h(eVar.g());
            this.f17032p = hVar;
            for (v6.a<m, Path> aVar2 : hVar.a()) {
                aVar2.a(this);
            }
            for (v6.a<Integer, Integer> aVar3 : this.f17032p.c()) {
                h(aVar3);
                aVar3.a(this);
            }
        }
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        L(this.f17033q.p() == 1.0f);
    }

    public static b t(c cVar, e eVar, s6.f fVar, s6.d dVar) {
        switch (a.f17043a[eVar.f().ordinal()]) {
            case 1:
                return new g(fVar, eVar, cVar);
            case 2:
                return new c(fVar, eVar, dVar.o(eVar.m()), dVar);
            case 3:
                return new h(fVar, eVar);
            case 4:
                return new d(fVar, eVar);
            case 5:
                return new f(fVar, eVar);
            case 6:
                return new i(fVar, eVar);
            default:
                f7.d.c("Unknown layer type " + eVar.f());
                return null;
        }
    }

    public final void A(RectF rectF, Matrix matrix) {
        this.f17025i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (y()) {
            int size = this.f17032p.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                a7.h hVar = this.f17032p.b().get(i10);
                Path h10 = this.f17032p.a().get(i10).h();
                if (h10 != null) {
                    this.f17017a.set(h10);
                    this.f17017a.transform(matrix);
                    int i11 = a.f17044b[hVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && hVar.d()) {
                        return;
                    }
                    this.f17017a.computeBounds(this.f17027k, false);
                    if (i10 == 0) {
                        this.f17025i.set(this.f17027k);
                    } else {
                        RectF rectF2 = this.f17025i;
                        rectF2.set(Math.min(rectF2.left, this.f17027k.left), Math.min(this.f17025i.top, this.f17027k.top), Math.max(this.f17025i.right, this.f17027k.right), Math.max(this.f17025i.bottom, this.f17027k.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f17025i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void B(RectF rectF, Matrix matrix) {
        if (z() && this.f17031o.h() != e.b.INVERT) {
            this.f17026j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f17034r.e(this.f17026j, matrix, true);
            if (rectF.intersect(this.f17026j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void C() {
        this.f17030n.invalidateSelf();
    }

    public final void E(float f10) {
        this.f17030n.r().n().a(this.f17031o.i(), f10);
    }

    public void F(v6.a<?, ?> aVar) {
        this.f17037u.remove(aVar);
    }

    public void G(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
    }

    public void H(b bVar) {
        this.f17034r = bVar;
    }

    public void I(boolean z10) {
        if (z10 && this.f17041y == null) {
            this.f17041y = new t6.a();
        }
        this.f17040x = z10;
    }

    public void J(b bVar) {
        this.f17035s = bVar;
    }

    public void K(float f10) {
        this.f17038v.j(f10);
        if (this.f17032p != null) {
            for (int i10 = 0; i10 < this.f17032p.a().size(); i10++) {
                this.f17032p.a().get(i10).m(f10);
            }
        }
        v6.d dVar = this.f17033q;
        if (dVar != null) {
            dVar.m(f10);
        }
        b bVar = this.f17034r;
        if (bVar != null) {
            bVar.K(f10);
        }
        for (int i11 = 0; i11 < this.f17037u.size(); i11++) {
            this.f17037u.get(i11).m(f10);
        }
    }

    public final void L(boolean z10) {
        if (z10 != this.f17039w) {
            this.f17039w = z10;
            C();
        }
    }

    public final void M() {
        if (!this.f17031o.e().isEmpty()) {
            v6.d dVar = new v6.d(this.f17031o.e());
            this.f17033q = dVar;
            dVar.l();
            this.f17033q.a(new a.b() { // from class: b7.a
                @Override // v6.a.b
                public final void b() {
                    b.this.D();
                }
            });
            L(this.f17033q.h().floatValue() == 1.0f);
            h(this.f17033q);
            return;
        }
        L(true);
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        this.f17038v.c(t10, cVar);
    }

    @Override // v6.a.b
    public void b() {
        C();
    }

    @Override // u6.c
    public void c(List<u6.c> list, List<u6.c> list2) {
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        b bVar = this.f17034r;
        if (bVar != null) {
            y6.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f17034r.getName(), i10)) {
                list.add(a10.i(this.f17034r));
            }
            if (eVar.h(getName(), i10)) {
                this.f17034r.G(eVar, eVar.e(this.f17034r.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                G(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f17024h.set(0.0f, 0.0f, 0.0f, 0.0f);
        q();
        this.f17029m.set(matrix);
        if (z10) {
            List<b> list = this.f17036t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f17029m.preConcat(this.f17036t.get(size).f17038v.f());
                }
            } else {
                b bVar = this.f17035s;
                if (bVar != null) {
                    this.f17029m.preConcat(bVar.f17038v.f());
                }
            }
        }
        this.f17029m.preConcat(this.f17038v.f());
    }

    @Override // u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        s6.c.a(this.f17028l);
        if (this.f17039w && !this.f17031o.x()) {
            q();
            s6.c.a("Layer#parentMatrix");
            this.f17018b.reset();
            this.f17018b.set(matrix);
            for (int size = this.f17036t.size() - 1; size >= 0; size--) {
                this.f17018b.preConcat(this.f17036t.get(size).f17038v.f());
            }
            s6.c.b("Layer#parentMatrix");
            int intValue = (int) ((((i10 / 255.0f) * (this.f17038v.h() == null ? 100 : this.f17038v.h().h().intValue())) / 100.0f) * 255.0f);
            if (!z() && !y()) {
                this.f17018b.preConcat(this.f17038v.f());
                s6.c.a("Layer#drawLayer");
                s(canvas, this.f17018b, intValue);
                s6.c.b("Layer#drawLayer");
                E(s6.c.b(this.f17028l));
                return;
            }
            s6.c.a("Layer#computeBounds");
            e(this.f17024h, this.f17018b, false);
            B(this.f17024h, matrix);
            this.f17018b.preConcat(this.f17038v.f());
            A(this.f17024h, this.f17018b);
            if (!this.f17024h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
                this.f17024h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            s6.c.b("Layer#computeBounds");
            if (this.f17024h.width() >= 1.0f && this.f17024h.height() >= 1.0f) {
                s6.c.a("Layer#saveLayer");
                this.f17019c.setAlpha(255);
                f7.h.m(canvas, this.f17024h, this.f17019c);
                s6.c.b("Layer#saveLayer");
                r(canvas);
                s6.c.a("Layer#drawLayer");
                s(canvas, this.f17018b, intValue);
                s6.c.b("Layer#drawLayer");
                if (y()) {
                    n(canvas, this.f17018b);
                }
                if (z()) {
                    s6.c.a("Layer#drawMatte");
                    s6.c.a("Layer#saveLayer");
                    f7.h.n(canvas, this.f17024h, this.f17022f, 19);
                    s6.c.b("Layer#saveLayer");
                    r(canvas);
                    this.f17034r.g(canvas, matrix, intValue);
                    s6.c.a("Layer#restoreLayer");
                    canvas.restore();
                    s6.c.b("Layer#restoreLayer");
                    s6.c.b("Layer#drawMatte");
                }
                s6.c.a("Layer#restoreLayer");
                canvas.restore();
                s6.c.b("Layer#restoreLayer");
            }
            if (this.f17040x && (paint = this.f17041y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f17041y.setColor(-251901);
                this.f17041y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f17024h, this.f17041y);
                this.f17041y.setStyle(Paint.Style.FILL);
                this.f17041y.setColor(1357638635);
                canvas.drawRect(this.f17024h, this.f17041y);
            }
            E(s6.c.b(this.f17028l));
            return;
        }
        s6.c.b(this.f17028l);
    }

    @Override // u6.c
    public String getName() {
        return this.f17031o.i();
    }

    public void h(v6.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f17037u.add(aVar);
    }

    public final void i(Canvas canvas, Matrix matrix, v6.a<m, Path> aVar, v6.a<Integer, Integer> aVar2) {
        this.f17017a.set(aVar.h());
        this.f17017a.transform(matrix);
        this.f17019c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f17017a, this.f17019c);
    }

    public final void j(Canvas canvas, Matrix matrix, v6.a<m, Path> aVar, v6.a<Integer, Integer> aVar2) {
        f7.h.m(canvas, this.f17024h, this.f17020d);
        this.f17017a.set(aVar.h());
        this.f17017a.transform(matrix);
        this.f17019c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f17017a, this.f17019c);
        canvas.restore();
    }

    public final void k(Canvas canvas, Matrix matrix, v6.a<m, Path> aVar, v6.a<Integer, Integer> aVar2) {
        f7.h.m(canvas, this.f17024h, this.f17019c);
        canvas.drawRect(this.f17024h, this.f17019c);
        this.f17017a.set(aVar.h());
        this.f17017a.transform(matrix);
        this.f17019c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f17017a, this.f17021e);
        canvas.restore();
    }

    public final void l(Canvas canvas, Matrix matrix, v6.a<m, Path> aVar, v6.a<Integer, Integer> aVar2) {
        f7.h.m(canvas, this.f17024h, this.f17020d);
        canvas.drawRect(this.f17024h, this.f17019c);
        this.f17021e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f17017a.set(aVar.h());
        this.f17017a.transform(matrix);
        canvas.drawPath(this.f17017a, this.f17021e);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, v6.a<m, Path> aVar, v6.a<Integer, Integer> aVar2) {
        f7.h.m(canvas, this.f17024h, this.f17021e);
        canvas.drawRect(this.f17024h, this.f17019c);
        this.f17021e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f17017a.set(aVar.h());
        this.f17017a.transform(matrix);
        canvas.drawPath(this.f17017a, this.f17021e);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix) {
        s6.c.a("Layer#saveLayer");
        f7.h.n(canvas, this.f17024h, this.f17020d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            r(canvas);
        }
        s6.c.b("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f17032p.b().size(); i10++) {
            a7.h hVar = this.f17032p.b().get(i10);
            v6.a<m, Path> aVar = this.f17032p.a().get(i10);
            v6.a<Integer, Integer> aVar2 = this.f17032p.c().get(i10);
            int i11 = a.f17044b[hVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f17019c.setColor(-16777216);
                        this.f17019c.setAlpha(255);
                        canvas.drawRect(this.f17024h, this.f17019c);
                    }
                    if (hVar.d()) {
                        m(canvas, matrix, aVar, aVar2);
                    } else {
                        o(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (hVar.d()) {
                            k(canvas, matrix, aVar, aVar2);
                        } else {
                            i(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.d()) {
                    l(canvas, matrix, aVar, aVar2);
                } else {
                    j(canvas, matrix, aVar, aVar2);
                }
            } else if (p()) {
                this.f17019c.setAlpha(255);
                canvas.drawRect(this.f17024h, this.f17019c);
            }
        }
        s6.c.a("Layer#restoreLayer");
        canvas.restore();
        s6.c.b("Layer#restoreLayer");
    }

    public final void o(Canvas canvas, Matrix matrix, v6.a<m, Path> aVar) {
        this.f17017a.set(aVar.h());
        this.f17017a.transform(matrix);
        canvas.drawPath(this.f17017a, this.f17021e);
    }

    public final boolean p() {
        if (this.f17032p.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f17032p.b().size(); i10++) {
            if (this.f17032p.b().get(i10).a() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        if (this.f17036t != null) {
            return;
        }
        if (this.f17035s == null) {
            this.f17036t = Collections.emptyList();
            return;
        }
        this.f17036t = new ArrayList();
        for (b bVar = this.f17035s; bVar != null; bVar = bVar.f17035s) {
            this.f17036t.add(bVar);
        }
    }

    public final void r(Canvas canvas) {
        s6.c.a("Layer#clearLayer");
        RectF rectF = this.f17024h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f17023g);
        s6.c.b("Layer#clearLayer");
    }

    public abstract void s(Canvas canvas, Matrix matrix, int i10);

    public a7.a u() {
        return this.f17031o.a();
    }

    public BlurMaskFilter v(float f10) {
        if (this.f17042z == f10) {
            return this.A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.A = blurMaskFilter;
        this.f17042z = f10;
        return blurMaskFilter;
    }

    public j w() {
        return this.f17031o.c();
    }

    public e x() {
        return this.f17031o;
    }

    public boolean y() {
        v6.h hVar = this.f17032p;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean z() {
        return this.f17034r != null;
    }
}
