package b7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import s6.k;
import v6.q;

/* loaded from: classes.dex */
public class d extends b {
    public final Paint B;
    public final Rect C;
    public final Rect D;
    public v6.a<ColorFilter, ColorFilter> E;
    public v6.a<Bitmap, Bitmap> F;

    public d(s6.f fVar, e eVar) {
        super(fVar, eVar);
        this.B = new t6.a(3);
        this.C = new Rect();
        this.D = new Rect();
    }

    public final Bitmap N() {
        Bitmap h10;
        v6.a<Bitmap, Bitmap> aVar = this.F;
        return (aVar == null || (h10 = aVar.h()) == null) ? this.f17030n.v(this.f17031o.m()) : h10;
    }

    @Override // b7.b, y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        super.a(t10, cVar);
        if (t10 == k.K) {
            if (cVar == null) {
                this.E = null;
            } else {
                this.E = new q(cVar);
            }
        } else if (t10 == k.N) {
            if (cVar == null) {
                this.F = null;
            } else {
                this.F = new q(cVar);
            }
        }
    }

    @Override // b7.b, u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        Bitmap N = N();
        if (N != null) {
            rectF.set(0.0f, 0.0f, N.getWidth() * f7.h.e(), N.getHeight() * f7.h.e());
            this.f17029m.mapRect(rectF);
        }
    }

    @Override // b7.b
    public void s(Canvas canvas, Matrix matrix, int i10) {
        Bitmap N = N();
        if (N == null || N.isRecycled()) {
            return;
        }
        float e10 = f7.h.e();
        this.B.setAlpha(i10);
        v6.a<ColorFilter, ColorFilter> aVar = this.E;
        if (aVar != null) {
            this.B.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.C.set(0, 0, N.getWidth(), N.getHeight());
        this.D.set(0, 0, (int) (N.getWidth() * e10), (int) (N.getHeight() * e10));
        canvas.drawBitmap(N, this.C, this.D, this.B);
        canvas.restore();
    }
}
