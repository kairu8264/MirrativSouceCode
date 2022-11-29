package tj;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import tj.k;
import tj.l;
import tj.m;

/* loaded from: classes3.dex */
public class g extends Drawable implements g3.b, n {
    public static final String S = g.class.getSimpleName();
    public static final Paint T = new Paint(1);
    public boolean A;
    public final Matrix B;
    public final Path C;
    public final Path D;
    public final RectF E;
    public final RectF F;
    public final Region G;
    public final Region H;
    public k I;
    public final Paint J;
    public final Paint K;
    public final sj.a L;
    public final l.b M;
    public final l N;
    public PorterDuffColorFilter O;
    public PorterDuffColorFilter P;
    public final RectF Q;
    public boolean R;

    /* renamed from: w  reason: collision with root package name */
    public c f53666w;

    /* renamed from: x  reason: collision with root package name */
    public final m.g[] f53667x;

    /* renamed from: y  reason: collision with root package name */
    public final m.g[] f53668y;

    /* renamed from: z  reason: collision with root package name */
    public final BitSet f53669z;

    /* loaded from: classes3.dex */
    public class a implements l.b {
        public a() {
        }

        @Override // tj.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f53669z.set(i10 + 4, mVar.e());
            g.this.f53668y[i10] = mVar.f(matrix);
        }

        @Override // tj.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f53669z.set(i10, mVar.e());
            g.this.f53667x[i10] = mVar.f(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f53671a;

        public b(float f10) {
            this.f53671a = f10;
        }

        @Override // tj.k.c
        public tj.c a(tj.c cVar) {
            return cVar instanceof i ? cVar : new tj.b(this.f53671a, cVar);
        }
    }

    public /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public static int S(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    public static g m(Context context, float f10) {
        int b10 = hj.a.b(context, wi.b.f58778o, g.class.getSimpleName());
        g gVar = new g();
        gVar.N(context);
        gVar.Y(ColorStateList.valueOf(b10));
        gVar.X(f10);
        return gVar;
    }

    public int A() {
        c cVar = this.f53666w;
        return (int) (cVar.f53691s * Math.sin(Math.toRadians(cVar.f53692t)));
    }

    public int B() {
        c cVar = this.f53666w;
        return (int) (cVar.f53691s * Math.cos(Math.toRadians(cVar.f53692t)));
    }

    public int C() {
        return this.f53666w.f53690r;
    }

    public k D() {
        return this.f53666w.f53673a;
    }

    public final float E() {
        if (M()) {
            return this.K.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public ColorStateList F() {
        return this.f53666w.f53679g;
    }

    public float G() {
        return this.f53666w.f53673a.r().a(u());
    }

    public float H() {
        return this.f53666w.f53673a.t().a(u());
    }

    public float I() {
        return this.f53666w.f53688p;
    }

    public float J() {
        return w() + I();
    }

    public final boolean K() {
        c cVar = this.f53666w;
        int i10 = cVar.f53689q;
        return i10 != 1 && cVar.f53690r > 0 && (i10 == 2 || U());
    }

    public final boolean L() {
        Paint.Style style = this.f53666w.f53694v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean M() {
        Paint.Style style = this.f53666w.f53694v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.K.getStrokeWidth() > 0.0f;
    }

    public void N(Context context) {
        this.f53666w.f53674b = new kj.a(context);
        l0();
    }

    public final void O() {
        super.invalidateSelf();
    }

    public boolean P() {
        kj.a aVar = this.f53666w.f53674b;
        return aVar != null && aVar.e();
    }

    public boolean Q() {
        return this.f53666w.f53673a.u(u());
    }

    public final void R(Canvas canvas) {
        if (K()) {
            canvas.save();
            T(canvas);
            if (!this.R) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.Q.width() - getBounds().width());
            int height = (int) (this.Q.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.Q.width()) + (this.f53666w.f53690r * 2) + width, ((int) this.Q.height()) + (this.f53666w.f53690r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f10 = (getBounds().left - this.f53666w.f53690r) - width;
                float f11 = (getBounds().top - this.f53666w.f53690r) - height;
                canvas2.translate(-f10, -f11);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    public final void T(Canvas canvas) {
        int A = A();
        int B = B();
        if (Build.VERSION.SDK_INT < 21 && this.R) {
            Rect clipBounds = canvas.getClipBounds();
            int i10 = this.f53666w.f53690r;
            clipBounds.inset(-i10, -i10);
            clipBounds.offset(A, B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(A, B);
    }

    public boolean U() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 21 || !(Q() || this.C.isConvex() || i10 >= 29);
    }

    public void V(float f10) {
        setShapeAppearanceModel(this.f53666w.f53673a.w(f10));
    }

    public void W(tj.c cVar) {
        setShapeAppearanceModel(this.f53666w.f53673a.x(cVar));
    }

    public void X(float f10) {
        c cVar = this.f53666w;
        if (cVar.f53687o != f10) {
            cVar.f53687o = f10;
            l0();
        }
    }

    public void Y(ColorStateList colorStateList) {
        c cVar = this.f53666w;
        if (cVar.f53676d != colorStateList) {
            cVar.f53676d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Z(float f10) {
        c cVar = this.f53666w;
        if (cVar.f53683k != f10) {
            cVar.f53683k = f10;
            this.A = true;
            invalidateSelf();
        }
    }

    public void a0(int i10, int i11, int i12, int i13) {
        c cVar = this.f53666w;
        if (cVar.f53681i == null) {
            cVar.f53681i = new Rect();
        }
        this.f53666w.f53681i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void b0(float f10) {
        c cVar = this.f53666w;
        if (cVar.f53686n != f10) {
            cVar.f53686n = f10;
            l0();
        }
    }

    public void c0(boolean z10) {
        this.R = z10;
    }

    public void d0(int i10) {
        this.L.d(i10);
        this.f53666w.f53693u = false;
        O();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.J.setColorFilter(this.O);
        int alpha = this.J.getAlpha();
        this.J.setAlpha(S(alpha, this.f53666w.f53685m));
        this.K.setColorFilter(this.P);
        this.K.setStrokeWidth(this.f53666w.f53684l);
        int alpha2 = this.K.getAlpha();
        this.K.setAlpha(S(alpha2, this.f53666w.f53685m));
        if (this.A) {
            i();
            g(u(), this.C);
            this.A = false;
        }
        R(canvas);
        if (L()) {
            o(canvas);
        }
        if (M()) {
            r(canvas);
        }
        this.J.setAlpha(alpha);
        this.K.setAlpha(alpha2);
    }

    public void e0(int i10) {
        c cVar = this.f53666w;
        if (cVar.f53692t != i10) {
            cVar.f53692t = i10;
            O();
        }
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z10) {
        int color;
        int l10;
        if (!z10 || (l10 = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
    }

    public void f0(float f10, int i10) {
        i0(f10);
        h0(ColorStateList.valueOf(i10));
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f53666w.f53682j != 1.0f) {
            this.B.reset();
            Matrix matrix = this.B;
            float f10 = this.f53666w.f53682j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.B);
        }
        path.computeBounds(this.Q, true);
    }

    public void g0(float f10, ColorStateList colorStateList) {
        i0(f10);
        h0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f53666w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f53666w.f53689q == 2) {
            return;
        }
        if (Q()) {
            outline.setRoundRect(getBounds(), G() * this.f53666w.f53683k);
            return;
        }
        g(u(), this.C);
        if (this.C.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.C);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f53666w.f53681i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.G.set(getBounds());
        g(u(), this.C);
        this.H.setPath(this.C, this.G);
        this.G.op(this.H, Region.Op.DIFFERENCE);
        return this.G;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.N;
        c cVar = this.f53666w;
        lVar.e(cVar.f53673a, cVar.f53683k, rectF, this.M, path);
    }

    public void h0(ColorStateList colorStateList) {
        c cVar = this.f53666w;
        if (cVar.f53677e != colorStateList) {
            cVar.f53677e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void i() {
        k y10 = D().y(new b(-E()));
        this.I = y10;
        this.N.d(y10, this.f53666w.f53683k, v(), this.D);
    }

    public void i0(float f10) {
        this.f53666w.f53684l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.A = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f53666w.f53679g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f53666w.f53678f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f53666w.f53677e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f53666w.f53676d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final boolean j0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f53666w.f53676d == null || color2 == (colorForState2 = this.f53666w.f53676d.getColorForState(iArr, (color2 = this.J.getColor())))) {
            z10 = false;
        } else {
            this.J.setColor(colorForState2);
            z10 = true;
        }
        if (this.f53666w.f53677e == null || color == (colorForState = this.f53666w.f53677e.getColorForState(iArr, (color = this.K.getColor())))) {
            return z10;
        }
        this.K.setColor(colorForState);
        return true;
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z10);
        }
        return f(paint, z10);
    }

    public final boolean k0() {
        PorterDuffColorFilter porterDuffColorFilter = this.O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.P;
        c cVar = this.f53666w;
        this.O = k(cVar.f53679g, cVar.f53680h, this.J, true);
        c cVar2 = this.f53666w;
        this.P = k(cVar2.f53678f, cVar2.f53680h, this.K, false);
        c cVar3 = this.f53666w;
        if (cVar3.f53693u) {
            this.L.d(cVar3.f53679g.getColorForState(getState(), 0));
        }
        return (n3.c.a(porterDuffColorFilter, this.O) && n3.c.a(porterDuffColorFilter2, this.P)) ? false : true;
    }

    public int l(int i10) {
        float J = J() + z();
        kj.a aVar = this.f53666w.f53674b;
        return aVar != null ? aVar.c(i10, J) : i10;
    }

    public final void l0() {
        float J = J();
        this.f53666w.f53690r = (int) Math.ceil(0.75f * J);
        this.f53666w.f53691s = (int) Math.ceil(J * 0.25f);
        k0();
        O();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f53666w = new c(this.f53666w);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.f53669z.cardinality() > 0) {
            Log.w(S, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f53666w.f53691s != 0) {
            canvas.drawPath(this.C, this.L.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f53667x[i10].b(this.L, this.f53666w.f53690r, canvas);
            this.f53668y[i10].b(this.L, this.f53666w.f53690r, canvas);
        }
        if (this.R) {
            int A = A();
            int B = B();
            canvas.translate(-A, -B);
            canvas.drawPath(this.C, T);
            canvas.translate(A, B);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.J, this.C, this.f53666w.f53673a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.A = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, nj.h.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = j0(iArr) || k0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f53666w.f53673a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF) * this.f53666w.f53683k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void r(Canvas canvas) {
        q(canvas, this.K, this.D, this.I, v());
    }

    public float s() {
        return this.f53666w.f53673a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f53666w;
        if (cVar.f53685m != i10) {
            cVar.f53685m = i10;
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53666w.f53675c = colorFilter;
        O();
    }

    @Override // tj.n
    public void setShapeAppearanceModel(k kVar) {
        this.f53666w.f53673a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f53666w.f53679g = colorStateList;
        k0();
        O();
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f53666w;
        if (cVar.f53680h != mode) {
            cVar.f53680h = mode;
            k0();
            O();
        }
    }

    public float t() {
        return this.f53666w.f53673a.l().a(u());
    }

    public RectF u() {
        this.E.set(getBounds());
        return this.E;
    }

    public final RectF v() {
        this.F.set(u());
        float E = E();
        this.F.inset(E, E);
        return this.F;
    }

    public float w() {
        return this.f53666w.f53687o;
    }

    public ColorStateList x() {
        return this.f53666w.f53676d;
    }

    public float y() {
        return this.f53666w.f53683k;
    }

    public float z() {
        return this.f53666w.f53686n;
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    public g(c cVar) {
        this.f53667x = new m.g[4];
        this.f53668y = new m.g[4];
        this.f53669z = new BitSet(8);
        this.B = new Matrix();
        this.C = new Path();
        this.D = new Path();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Region();
        this.H = new Region();
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        this.L = new sj.a();
        this.N = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.Q = new RectF();
        this.R = true;
        this.f53666w = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = T;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        k0();
        j0(getState());
        this.M = new a();
    }

    /* loaded from: classes3.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f53673a;

        /* renamed from: b  reason: collision with root package name */
        public kj.a f53674b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f53675c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f53676d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f53677e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f53678f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f53679g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f53680h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f53681i;

        /* renamed from: j  reason: collision with root package name */
        public float f53682j;

        /* renamed from: k  reason: collision with root package name */
        public float f53683k;

        /* renamed from: l  reason: collision with root package name */
        public float f53684l;

        /* renamed from: m  reason: collision with root package name */
        public int f53685m;

        /* renamed from: n  reason: collision with root package name */
        public float f53686n;

        /* renamed from: o  reason: collision with root package name */
        public float f53687o;

        /* renamed from: p  reason: collision with root package name */
        public float f53688p;

        /* renamed from: q  reason: collision with root package name */
        public int f53689q;

        /* renamed from: r  reason: collision with root package name */
        public int f53690r;

        /* renamed from: s  reason: collision with root package name */
        public int f53691s;

        /* renamed from: t  reason: collision with root package name */
        public int f53692t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f53693u;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f53694v;

        public c(k kVar, kj.a aVar) {
            this.f53676d = null;
            this.f53677e = null;
            this.f53678f = null;
            this.f53679g = null;
            this.f53680h = PorterDuff.Mode.SRC_IN;
            this.f53681i = null;
            this.f53682j = 1.0f;
            this.f53683k = 1.0f;
            this.f53685m = 255;
            this.f53686n = 0.0f;
            this.f53687o = 0.0f;
            this.f53688p = 0.0f;
            this.f53689q = 0;
            this.f53690r = 0;
            this.f53691s = 0;
            this.f53692t = 0;
            this.f53693u = false;
            this.f53694v = Paint.Style.FILL_AND_STROKE;
            this.f53673a = kVar;
            this.f53674b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.A = true;
            return gVar;
        }

        public c(c cVar) {
            this.f53676d = null;
            this.f53677e = null;
            this.f53678f = null;
            this.f53679g = null;
            this.f53680h = PorterDuff.Mode.SRC_IN;
            this.f53681i = null;
            this.f53682j = 1.0f;
            this.f53683k = 1.0f;
            this.f53685m = 255;
            this.f53686n = 0.0f;
            this.f53687o = 0.0f;
            this.f53688p = 0.0f;
            this.f53689q = 0;
            this.f53690r = 0;
            this.f53691s = 0;
            this.f53692t = 0;
            this.f53693u = false;
            this.f53694v = Paint.Style.FILL_AND_STROKE;
            this.f53673a = cVar.f53673a;
            this.f53674b = cVar.f53674b;
            this.f53684l = cVar.f53684l;
            this.f53675c = cVar.f53675c;
            this.f53676d = cVar.f53676d;
            this.f53677e = cVar.f53677e;
            this.f53680h = cVar.f53680h;
            this.f53679g = cVar.f53679g;
            this.f53685m = cVar.f53685m;
            this.f53682j = cVar.f53682j;
            this.f53691s = cVar.f53691s;
            this.f53689q = cVar.f53689q;
            this.f53693u = cVar.f53693u;
            this.f53683k = cVar.f53683k;
            this.f53686n = cVar.f53686n;
            this.f53687o = cVar.f53687o;
            this.f53688p = cVar.f53688p;
            this.f53690r = cVar.f53690r;
            this.f53692t = cVar.f53692t;
            this.f53678f = cVar.f53678f;
            this.f53694v = cVar.f53694v;
            if (cVar.f53681i != null) {
                this.f53681i = new Rect(cVar.f53681i);
            }
        }
    }
}
