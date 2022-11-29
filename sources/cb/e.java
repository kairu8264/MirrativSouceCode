package cb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import jo.h;
import jo.p;
import so.g;

/* loaded from: classes2.dex */
public final class e extends View {
    public static final b U = new b(null);
    public static final int V = 8;
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public final PointF P;
    public final float Q;
    public final float R;
    public final float S;
    public final float T;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f19031w;

    /* renamed from: x  reason: collision with root package name */
    public final Paint f19032x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f19033y;

    /* renamed from: z  reason: collision with root package name */
    public Bitmap f19034z;

    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            e.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            e.this.c();
            e.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        p.h(context, "context");
        Paint paint = new Paint();
        paint.setColor(-1);
        this.f19031w = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        paint2.setAlpha(127);
        paint2.setStyle(Paint.Style.FILL);
        this.f19032x = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(2.0f);
        this.f19033y = paint3;
        this.P = new PointF();
        this.Q = b(8.0f);
        this.R = b(4.0f);
        this.S = b(48.0f);
        this.T = b(120.0f);
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    private final float getDrawingHeight() {
        return this.M - this.L;
    }

    private final float getDrawingWidth() {
        return this.K - this.J;
    }

    private final float getMaxDrawingHeight() {
        return getHeight() - (this.Q * 2);
    }

    private final float getMaxDrawingWidth() {
        return getWidth() - (this.Q * 2);
    }

    private final boolean getTouching() {
        return this.E || this.F || this.G || this.H || this.I;
    }

    public final float b(float f10) {
        return getResources().getDisplayMetrics().density * f10;
    }

    public final void c() {
        Bitmap bitmap;
        if (this.f19034z == null) {
            return;
        }
        if (bitmap.getWidth() / bitmap.getHeight() > getMaxDrawingWidth() / getMaxDrawingHeight()) {
            float maxDrawingWidth = (getMaxDrawingWidth() * bitmap.getHeight()) / bitmap.getWidth();
            this.J = this.Q;
            this.K = getWidth() - this.Q;
            float f10 = maxDrawingWidth / 2;
            this.L = (getHeight() / 2) - f10;
            this.M = (getHeight() / 2) + f10;
        } else {
            float maxDrawingHeight = (getMaxDrawingHeight() * bitmap.getWidth()) / bitmap.getHeight();
            this.L = this.Q;
            this.M = getHeight() - this.Q;
            float f11 = maxDrawingHeight / 2;
            this.J = (getWidth() / 2) - f11;
            this.K = (getWidth() / 2) + f11;
        }
        if (e()) {
            float drawingWidth = (getDrawingWidth() * this.O) / this.N;
            if (drawingWidth > getDrawingHeight()) {
                this.A = this.L;
                this.D = this.M;
                float f12 = 2;
                float drawingHeight = ((getDrawingHeight() * this.N) / this.O) / f12;
                this.B = (getWidth() / f12) - drawingHeight;
                this.C = (getWidth() / f12) + drawingHeight;
                return;
            }
            this.B = this.J;
            this.C = this.K;
            float f13 = 2;
            float f14 = drawingWidth / f13;
            this.A = (getHeight() / f13) - f14;
            this.D = (getHeight() / f13) + f14;
            return;
        }
        this.B = this.J;
        this.C = this.K;
        this.A = this.L;
        this.D = this.M;
    }

    public final boolean d() {
        return getDrawingWidth() < this.T || getDrawingHeight() < this.T;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        p.h(canvas, "canvas");
        super.draw(canvas);
        Bitmap bitmap = this.f19034z;
        if (bitmap == null) {
            return;
        }
        float drawingWidth = getDrawingWidth() / bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(drawingWidth, drawingWidth);
        matrix.postTranslate(this.J, this.L);
        canvas.drawBitmap(bitmap, matrix, new Paint());
        canvas.drawRect(new RectF(0.0f, 0.0f, this.C, this.A), this.f19032x);
        canvas.drawRect(new RectF(this.C, 0.0f, getWidth(), this.D), this.f19032x);
        canvas.drawRect(new RectF(this.B, this.D, getWidth(), getHeight()), this.f19032x);
        canvas.drawRect(new RectF(0.0f, this.A, this.B, getHeight()), this.f19032x);
        canvas.drawCircle(this.B, this.A, this.R, this.f19031w);
        canvas.drawCircle(this.C, this.A, this.R, this.f19031w);
        canvas.drawCircle(this.B, this.D, this.R, this.f19031w);
        canvas.drawCircle(this.C, this.D, this.R, this.f19031w);
        if (getTouching()) {
            float f10 = this.C;
            float f11 = this.B;
            float f12 = 3;
            float f13 = (f10 - f11) / f12;
            float f14 = this.D;
            float f15 = this.A;
            float f16 = (f14 - f15) / f12;
            canvas.drawLine(f11 + f13, f15, f11 + f13, f14, this.f19033y);
            float f17 = this.B;
            float f18 = 2;
            float f19 = f13 * f18;
            canvas.drawLine(f17 + f19, this.A, f17 + f19, this.D, this.f19033y);
            float f20 = this.B;
            float f21 = this.A;
            canvas.drawLine(f20, f21 + f16, this.C, f21 + f16, this.f19033y);
            float f22 = this.B;
            float f23 = this.A;
            float f24 = f16 * f18;
            canvas.drawLine(f22, f23 + f24, this.C, f23 + f24, this.f19033y);
        }
    }

    public final boolean e() {
        return this.N > 0.0f && this.O > 0.0f;
    }

    public final void f(float f10, float f11) {
        this.N = f10;
        this.O = f11;
        c();
        invalidate();
    }

    public final Bitmap getCroppedBitmap() {
        Bitmap bitmap = this.f19034z;
        if (bitmap == null) {
            return null;
        }
        float drawingWidth = getDrawingWidth() / bitmap.getWidth();
        float f10 = this.B;
        float f11 = this.J;
        float f12 = f10 - f11;
        float f13 = this.A;
        float f14 = this.L;
        float f15 = f13 - f14;
        try {
            return Bitmap.createBitmap(bitmap, (int) (f12 / drawingWidth), (int) (f15 / drawingWidth), (int) (((this.C - f11) - f12) / drawingWidth), (int) (((this.D - f14) - f15) / drawingWidth));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                width = ");
            sb2.append(getWidth());
            sb2.append("\n                height = ");
            sb2.append(getHeight());
            sb2.append("\n                bitmap.height = ");
            sb2.append(bitmap.getHeight());
            sb2.append("\n                bitmap.width = ");
            sb2.append(bitmap.getWidth());
            sb2.append("\n                cropLeft = ");
            sb2.append(this.B);
            sb2.append("\n                cropTop = ");
            sb2.append(this.A);
            sb2.append("\n                cropRight =");
            sb2.append(this.C);
            sb2.append("\n                cropBottom = ");
            sb2.append(this.D);
            sb2.append("\n                drawingLeftEdgePosition =");
            sb2.append(this.J);
            sb2.append("\n                drawingTopEdgePosition = ");
            sb2.append(this.L);
            sb2.append("\n                drawingRightEdgePosition = ");
            sb2.append(this.K);
            sb2.append("\n                drawingBottomEdgePosition = ");
            sb2.append(this.M);
            sb2.append("\n                error = ");
            sb2.append(e10.getMessage());
            sb2.append("\n                ");
            throw new IllegalArgumentException(g.f(sb2.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setImageBitmap(Bitmap bitmap) {
        p.h(bitmap, "bitmap");
        this.f19034z = bitmap;
        c();
        invalidate();
    }
}
