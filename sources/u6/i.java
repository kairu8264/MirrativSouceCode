package u6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class i extends a {
    public final v6.a<PointF, PointF> A;
    public v6.q B;

    /* renamed from: r  reason: collision with root package name */
    public final String f54523r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f54524s;

    /* renamed from: t  reason: collision with root package name */
    public final s.e<LinearGradient> f54525t;

    /* renamed from: u  reason: collision with root package name */
    public final s.e<RadialGradient> f54526u;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f54527v;

    /* renamed from: w  reason: collision with root package name */
    public final a7.g f54528w;

    /* renamed from: x  reason: collision with root package name */
    public final int f54529x;

    /* renamed from: y  reason: collision with root package name */
    public final v6.a<a7.d, a7.d> f54530y;

    /* renamed from: z  reason: collision with root package name */
    public final v6.a<PointF, PointF> f54531z;

    public i(s6.f fVar, b7.b bVar, a7.f fVar2) {
        super(fVar, bVar, fVar2.b().a(), fVar2.g().a(), fVar2.i(), fVar2.k(), fVar2.m(), fVar2.h(), fVar2.c());
        this.f54525t = new s.e<>();
        this.f54526u = new s.e<>();
        this.f54527v = new RectF();
        this.f54523r = fVar2.j();
        this.f54528w = fVar2.f();
        this.f54524s = fVar2.n();
        this.f54529x = (int) (fVar.r().d() / 32.0f);
        v6.a<a7.d, a7.d> a10 = fVar2.e().a();
        this.f54530y = a10;
        a10.a(this);
        bVar.h(a10);
        v6.a<PointF, PointF> a11 = fVar2.l().a();
        this.f54531z = a11;
        a11.a(this);
        bVar.h(a11);
        v6.a<PointF, PointF> a12 = fVar2.d().a();
        this.A = a12;
        a12.a(this);
        bVar.h(a12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u6.a, y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        super.a(t10, cVar);
        if (t10 == s6.k.L) {
            v6.q qVar = this.B;
            if (qVar != null) {
                this.f54455f.F(qVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            v6.q qVar2 = new v6.q(cVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f54455f.h(this.B);
        }
    }

    @Override // u6.a, u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        Shader l10;
        if (this.f54524s) {
            return;
        }
        e(this.f54527v, matrix, false);
        if (this.f54528w == a7.g.LINEAR) {
            l10 = k();
        } else {
            l10 = l();
        }
        l10.setLocalMatrix(matrix);
        this.f54458i.setShader(l10);
        super.g(canvas, matrix, i10);
    }

    @Override // u6.c
    public String getName() {
        return this.f54523r;
    }

    public final int[] i(int[] iArr) {
        v6.q qVar = this.B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    public final int j() {
        int round = Math.round(this.f54531z.f() * this.f54529x);
        int round2 = Math.round(this.A.f() * this.f54529x);
        int round3 = Math.round(this.f54530y.f() * this.f54529x);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    public final LinearGradient k() {
        long j10 = j();
        LinearGradient h10 = this.f54525t.h(j10);
        if (h10 != null) {
            return h10;
        }
        PointF h11 = this.f54531z.h();
        PointF h12 = this.A.h();
        a7.d h13 = this.f54530y.h();
        LinearGradient linearGradient = new LinearGradient(h11.x, h11.y, h12.x, h12.y, i(h13.a()), h13.b(), Shader.TileMode.CLAMP);
        this.f54525t.m(j10, linearGradient);
        return linearGradient;
    }

    public final RadialGradient l() {
        float f10;
        float f11;
        long j10 = j();
        RadialGradient h10 = this.f54526u.h(j10);
        if (h10 != null) {
            return h10;
        }
        PointF h11 = this.f54531z.h();
        PointF h12 = this.A.h();
        a7.d h13 = this.f54530y.h();
        int[] i10 = i(h13.a());
        float[] b10 = h13.b();
        RadialGradient radialGradient = new RadialGradient(h11.x, h11.y, (float) Math.hypot(h12.x - f10, h12.y - f11), i10, b10, Shader.TileMode.CLAMP);
        this.f54526u.m(j10, radialGradient);
        return radialGradient;
    }
}
