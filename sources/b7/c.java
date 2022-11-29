package b7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import b7.e;
import java.util.ArrayList;
import java.util.List;
import s6.k;
import v6.q;

/* loaded from: classes.dex */
public class c extends b {
    public v6.a<Float, Float> B;
    public final List<b> C;
    public final RectF D;
    public final RectF E;
    public final Paint F;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17045a;

        static {
            int[] iArr = new int[e.b.values().length];
            f17045a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17045a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(s6.f fVar, e eVar, List<e> list, s6.d dVar) {
        super(fVar, eVar);
        int i10;
        b bVar;
        this.C = new ArrayList();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Paint();
        z6.b u10 = eVar.u();
        if (u10 != null) {
            v6.a<Float, Float> a10 = u10.a();
            this.B = a10;
            h(a10);
            this.B.a(this);
        } else {
            this.B = null;
        }
        s.e eVar2 = new s.e(dVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar3 = list.get(size);
            b t10 = b.t(this, eVar3, fVar, dVar);
            if (t10 != null) {
                eVar2.m(t10.x().d(), t10);
                if (bVar2 != null) {
                    bVar2.H(t10);
                    bVar2 = null;
                } else {
                    this.C.add(0, t10);
                    int i11 = a.f17045a[eVar3.h().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = t10;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < eVar2.q(); i10++) {
            b bVar3 = (b) eVar2.h(eVar2.l(i10));
            if (bVar3 != null && (bVar = (b) eVar2.h(bVar3.x().j())) != null) {
                bVar3.J(bVar);
            }
        }
    }

    @Override // b7.b
    public void G(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            this.C.get(i11).d(eVar, i10, list, eVar2);
        }
    }

    @Override // b7.b
    public void I(boolean z10) {
        super.I(z10);
        for (b bVar : this.C) {
            bVar.I(z10);
        }
    }

    @Override // b7.b
    public void K(float f10) {
        super.K(f10);
        if (this.B != null) {
            f10 = ((this.B.h().floatValue() * this.f17031o.b().i()) - this.f17031o.b().p()) / (this.f17030n.r().e() + 0.01f);
        }
        if (this.B == null) {
            f10 -= this.f17031o.r();
        }
        if (this.f17031o.v() != 0.0f && !"__container".equals(this.f17031o.i())) {
            f10 /= this.f17031o.v();
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.C.get(size).K(f10);
        }
    }

    @Override // b7.b, y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        super.a(t10, cVar);
        if (t10 == k.E) {
            if (cVar == null) {
                v6.a<Float, Float> aVar = this.B;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.B = qVar;
            qVar.a(this);
            h(this.B);
        }
    }

    @Override // b7.b, u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.D.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.C.get(size).e(this.D, this.f17029m, true);
            rectF.union(this.D);
        }
    }

    @Override // b7.b
    public void s(Canvas canvas, Matrix matrix, int i10) {
        s6.c.a("CompositionLayer#draw");
        this.E.set(0.0f, 0.0f, this.f17031o.l(), this.f17031o.k());
        matrix.mapRect(this.E);
        boolean z10 = this.f17030n.K() && this.C.size() > 1 && i10 != 255;
        if (z10) {
            this.F.setAlpha(i10);
            f7.h.m(canvas, this.E, this.F);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            if (!this.E.isEmpty() ? canvas.clipRect(this.E) : true) {
                this.C.get(size).g(canvas, matrix, i10);
            }
        }
        canvas.restore();
        s6.c.b("CompositionLayer#draw");
    }
}
