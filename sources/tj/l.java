package tj;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final m[] f53722a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f53723b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f53724c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f53725d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f53726e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f53727f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final m f53728g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f53729h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f53730i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f53731j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f53732k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f53733l = true;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f53734a = new l();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f53735a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f53736b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f53737c;

        /* renamed from: d  reason: collision with root package name */
        public final b f53738d;

        /* renamed from: e  reason: collision with root package name */
        public final float f53739e;

        public c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f53738d = bVar;
            this.f53735a = kVar;
            this.f53739e = f10;
            this.f53737c = rectF;
            this.f53736b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f53722a[i10] = new m();
            this.f53723b[i10] = new Matrix();
            this.f53724c[i10] = new Matrix();
        }
    }

    public static l k() {
        return a.f53734a;
    }

    public final float a(int i10) {
        return (i10 + 1) * 90;
    }

    public final void b(c cVar, int i10) {
        this.f53729h[0] = this.f53722a[i10].k();
        this.f53729h[1] = this.f53722a[i10].l();
        this.f53723b[i10].mapPoints(this.f53729h);
        if (i10 == 0) {
            Path path = cVar.f53736b;
            float[] fArr = this.f53729h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f53736b;
            float[] fArr2 = this.f53729h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f53722a[i10].d(this.f53723b[i10], cVar.f53736b);
        b bVar = cVar.f53738d;
        if (bVar != null) {
            bVar.b(this.f53722a[i10], this.f53723b[i10], i10);
        }
    }

    public final void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f53729h[0] = this.f53722a[i10].i();
        this.f53729h[1] = this.f53722a[i10].j();
        this.f53723b[i10].mapPoints(this.f53729h);
        this.f53730i[0] = this.f53722a[i11].k();
        this.f53730i[1] = this.f53722a[i11].l();
        this.f53723b[i11].mapPoints(this.f53730i);
        float[] fArr = this.f53729h;
        float f10 = fArr[0];
        float[] fArr2 = this.f53730i;
        float max = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i12 = i(cVar.f53737c, i10);
        this.f53728g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f53735a);
        j10.c(max, i12, cVar.f53739e, this.f53728g);
        this.f53731j.reset();
        this.f53728g.d(this.f53724c[i10], this.f53731j);
        if (this.f53733l && Build.VERSION.SDK_INT >= 19 && (j10.b() || l(this.f53731j, i10) || l(this.f53731j, i11))) {
            Path path = this.f53731j;
            path.op(path, this.f53727f, Path.Op.DIFFERENCE);
            this.f53729h[0] = this.f53728g.k();
            this.f53729h[1] = this.f53728g.l();
            this.f53724c[i10].mapPoints(this.f53729h);
            Path path2 = this.f53726e;
            float[] fArr3 = this.f53729h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f53728g.d(this.f53724c[i10], this.f53726e);
        } else {
            this.f53728g.d(this.f53724c[i10], cVar.f53736b);
        }
        b bVar = cVar.f53738d;
        if (bVar != null) {
            bVar.a(this.f53728g, this.f53724c[i10], i10);
        }
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f53726e.rewind();
        this.f53727f.rewind();
        this.f53727f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f53726e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f53726e.isEmpty()) {
            return;
        }
        path.op(this.f53726e, Path.Op.UNION);
    }

    public final void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final tj.c g(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.t();
                }
                return kVar.r();
            }
            return kVar.j();
        }
        return kVar.l();
    }

    public final d h(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.s();
                }
                return kVar.q();
            }
            return kVar.i();
        }
        return kVar.k();
    }

    public final float i(RectF rectF, int i10) {
        float[] fArr = this.f53729h;
        m[] mVarArr = this.f53722a;
        fArr[0] = mVarArr[i10].f53742c;
        fArr[1] = mVarArr[i10].f53743d;
        this.f53723b[i10].mapPoints(fArr);
        if (i10 != 1 && i10 != 3) {
            return Math.abs(rectF.centerY() - this.f53729h[1]);
        }
        return Math.abs(rectF.centerX() - this.f53729h[0]);
    }

    public final f j(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.o();
                }
                return kVar.p();
            }
            return kVar.n();
        }
        return kVar.h();
    }

    public final boolean l(Path path, int i10) {
        this.f53732k.reset();
        this.f53722a[i10].d(this.f53723b[i10], this.f53732k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f53732k.computeBounds(rectF, true);
        path.op(this.f53732k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i10) {
        h(i10, cVar.f53735a).b(this.f53722a[i10], 90.0f, cVar.f53739e, cVar.f53737c, g(i10, cVar.f53735a));
        float a10 = a(i10);
        this.f53723b[i10].reset();
        f(i10, cVar.f53737c, this.f53725d);
        Matrix matrix = this.f53723b[i10];
        PointF pointF = this.f53725d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f53723b[i10].preRotate(a10);
    }

    public final void n(int i10) {
        this.f53729h[0] = this.f53722a[i10].i();
        this.f53729h[1] = this.f53722a[i10].j();
        this.f53723b[i10].mapPoints(this.f53729h);
        float a10 = a(i10);
        this.f53724c[i10].reset();
        Matrix matrix = this.f53724c[i10];
        float[] fArr = this.f53729h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f53724c[i10].preRotate(a10);
    }
}
