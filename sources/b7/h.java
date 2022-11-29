package b7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import s6.k;
import v6.q;

/* loaded from: classes.dex */
public class h extends b {
    public final RectF B;
    public final Paint C;
    public final float[] D;
    public final Path E;
    public final e F;
    public v6.a<ColorFilter, ColorFilter> G;

    public h(s6.f fVar, e eVar) {
        super(fVar, eVar);
        this.B = new RectF();
        t6.a aVar = new t6.a();
        this.C = aVar;
        this.D = new float[8];
        this.E = new Path();
        this.F = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.o());
    }

    @Override // b7.b, y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        super.a(t10, cVar);
        if (t10 == k.K) {
            if (cVar == null) {
                this.G = null;
            } else {
                this.G = new q(cVar);
            }
        }
    }

    @Override // b7.b, u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.B.set(0.0f, 0.0f, this.F.q(), this.F.p());
        this.f17029m.mapRect(this.B);
        rectF.set(this.B);
    }

    @Override // b7.b
    public void s(Canvas canvas, Matrix matrix, int i10) {
        int alpha = Color.alpha(this.F.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i10 / 255.0f) * (((alpha / 255.0f) * (this.f17038v.h() == null ? 100 : this.f17038v.h().h().intValue())) / 100.0f) * 255.0f);
        this.C.setAlpha(intValue);
        v6.a<ColorFilter, ColorFilter> aVar = this.G;
        if (aVar != null) {
            this.C.setColorFilter(aVar.h());
        }
        if (intValue > 0) {
            float[] fArr = this.D;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.F.q();
            float[] fArr2 = this.D;
            fArr2[3] = 0.0f;
            fArr2[4] = this.F.q();
            this.D[5] = this.F.p();
            float[] fArr3 = this.D;
            fArr3[6] = 0.0f;
            fArr3[7] = this.F.p();
            matrix.mapPoints(this.D);
            this.E.reset();
            Path path = this.E;
            float[] fArr4 = this.D;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.E;
            float[] fArr5 = this.D;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.E;
            float[] fArr6 = this.D;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.E;
            float[] fArr7 = this.D;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.E;
            float[] fArr8 = this.D;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.E.close();
            canvas.drawPath(this.E, this.C);
        }
    }
}
