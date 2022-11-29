package sj;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f52717i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f52718j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f52719k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f52720l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f52721a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f52722b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f52723c;

    /* renamed from: d  reason: collision with root package name */
    public int f52724d;

    /* renamed from: e  reason: collision with root package name */
    public int f52725e;

    /* renamed from: f  reason: collision with root package name */
    public int f52726f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f52727g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f52728h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f52727g;
        if (z10) {
            int[] iArr = f52719k;
            iArr[0] = 0;
            iArr[1] = this.f52726f;
            iArr[2] = this.f52725e;
            iArr[3] = this.f52724d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f52719k;
            iArr2[0] = 0;
            iArr2[1] = this.f52724d;
            iArr2[2] = this.f52725e;
            iArr2[3] = this.f52726f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f52720l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f52722b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f52719k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f52728h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f52722b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f52717i;
        iArr[0] = this.f52726f;
        iArr[1] = this.f52725e;
        iArr[2] = this.f52724d;
        Paint paint = this.f52723c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f52718j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f52723c);
        canvas.restore();
    }

    public Paint c() {
        return this.f52721a;
    }

    public void d(int i10) {
        this.f52724d = f3.a.k(i10, 68);
        this.f52725e = f3.a.k(i10, 20);
        this.f52726f = f3.a.k(i10, 0);
        this.f52721a.setColor(this.f52724d);
    }

    public a(int i10) {
        this.f52727g = new Path();
        this.f52728h = new Paint();
        this.f52721a = new Paint();
        d(i10);
        this.f52728h.setColor(0);
        Paint paint = new Paint(4);
        this.f52722b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f52723c = new Paint(paint);
    }
}
