package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    public boolean B;
    public boolean D;
    public Runnable E;
    public long F;
    public long G;
    public c H;

    /* renamed from: w  reason: collision with root package name */
    public d f32139w;

    /* renamed from: x  reason: collision with root package name */
    public Rect f32140x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f32141y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f32142z;
    public int A = 255;
    public int C = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: g.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0359b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: w  reason: collision with root package name */
        public Drawable.Callback f32144w;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f32144w;
            this.f32144w = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f32144w = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f32144w;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f32144w;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f32145a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f32146b;

        /* renamed from: c  reason: collision with root package name */
        public int f32147c;

        /* renamed from: d  reason: collision with root package name */
        public int f32148d;

        /* renamed from: e  reason: collision with root package name */
        public int f32149e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f32150f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f32151g;

        /* renamed from: h  reason: collision with root package name */
        public int f32152h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f32153i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f32154j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f32155k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f32156l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f32157m;

        /* renamed from: n  reason: collision with root package name */
        public int f32158n;

        /* renamed from: o  reason: collision with root package name */
        public int f32159o;

        /* renamed from: p  reason: collision with root package name */
        public int f32160p;

        /* renamed from: q  reason: collision with root package name */
        public int f32161q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f32162r;

        /* renamed from: s  reason: collision with root package name */
        public int f32163s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f32164t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f32165u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f32166v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f32167w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f32168x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f32169y;

        /* renamed from: z  reason: collision with root package name */
        public int f32170z;

        public d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            this.f32153i = false;
            this.f32156l = false;
            this.f32168x = true;
            this.A = 0;
            this.B = 0;
            this.f32145a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f32146b : null;
            }
            this.f32146b = resources2;
            int f10 = b.f(resources, dVar != null ? dVar.f32147c : 0);
            this.f32147c = f10;
            if (dVar != null) {
                this.f32148d = dVar.f32148d;
                this.f32149e = dVar.f32149e;
                this.f32166v = true;
                this.f32167w = true;
                this.f32153i = dVar.f32153i;
                this.f32156l = dVar.f32156l;
                this.f32168x = dVar.f32168x;
                this.f32169y = dVar.f32169y;
                this.f32170z = dVar.f32170z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f32147c == f10) {
                    if (dVar.f32154j) {
                        this.f32155k = dVar.f32155k != null ? new Rect(dVar.f32155k) : null;
                        this.f32154j = true;
                    }
                    if (dVar.f32157m) {
                        this.f32158n = dVar.f32158n;
                        this.f32159o = dVar.f32159o;
                        this.f32160p = dVar.f32160p;
                        this.f32161q = dVar.f32161q;
                        this.f32157m = true;
                    }
                }
                if (dVar.f32162r) {
                    this.f32163s = dVar.f32163s;
                    this.f32162r = true;
                }
                if (dVar.f32164t) {
                    this.f32165u = dVar.f32165u;
                    this.f32164t = true;
                }
                Drawable[] drawableArr = dVar.f32151g;
                this.f32151g = new Drawable[drawableArr.length];
                this.f32152h = dVar.f32152h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f32150f;
                if (sparseArray != null) {
                    this.f32150f = sparseArray.clone();
                } else {
                    this.f32150f = new SparseArray<>(this.f32152h);
                }
                int i10 = this.f32152h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f32150f.put(i11, constantState);
                        } else {
                            this.f32151g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f32151g = new Drawable[10];
            this.f32152h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f32152h;
            if (i10 >= this.f32151g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f32145a);
            this.f32151g[i10] = drawable;
            this.f32152h++;
            this.f32149e = drawable.getChangingConfigurations() | this.f32149e;
            p();
            this.f32155k = null;
            this.f32154j = false;
            this.f32157m = false;
            this.f32166v = false;
            return i10;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f32152h;
                Drawable[] drawableArr = this.f32151g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && g3.a.b(drawableArr[i11])) {
                        g3.a.a(drawableArr[i11], theme);
                        this.f32149e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0359b.c(theme));
            }
        }

        public boolean c() {
            if (this.f32166v) {
                return this.f32167w;
            }
            e();
            this.f32166v = true;
            int i10 = this.f32152h;
            Drawable[] drawableArr = this.f32151g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f32167w = false;
                    return false;
                }
            }
            this.f32167w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f32152h;
            Drawable[] drawableArr = this.f32151g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (g3.a.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f32150f.get(i11);
                    if (constantState != null && C0359b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void d() {
            this.f32157m = true;
            e();
            int i10 = this.f32152h;
            Drawable[] drawableArr = this.f32151g;
            this.f32159o = -1;
            this.f32158n = -1;
            this.f32161q = 0;
            this.f32160p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f32158n) {
                    this.f32158n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f32159o) {
                    this.f32159o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f32160p) {
                    this.f32160p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f32161q) {
                    this.f32161q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f32150f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f32151g[this.f32150f.keyAt(i10)] = s(this.f32150f.valueAt(i10).newDrawable(this.f32146b));
                }
                this.f32150f = null;
            }
        }

        public final int f() {
            return this.f32151g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f32151g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f32150f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f32150f.valueAt(indexOfKey).newDrawable(this.f32146b));
            this.f32151g[i10] = s10;
            this.f32150f.removeAt(indexOfKey);
            if (this.f32150f.size() == 0) {
                this.f32150f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32148d | this.f32149e;
        }

        public final int h() {
            return this.f32152h;
        }

        public final int i() {
            if (!this.f32157m) {
                d();
            }
            return this.f32159o;
        }

        public final int j() {
            if (!this.f32157m) {
                d();
            }
            return this.f32161q;
        }

        public final int k() {
            if (!this.f32157m) {
                d();
            }
            return this.f32160p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f32153i) {
                return null;
            }
            Rect rect2 = this.f32155k;
            if (rect2 != null || this.f32154j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f32152h;
            Drawable[] drawableArr = this.f32151g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f32154j = true;
            this.f32155k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f32157m) {
                d();
            }
            return this.f32158n;
        }

        public final int n() {
            if (this.f32162r) {
                return this.f32163s;
            }
            e();
            int i10 = this.f32152h;
            Drawable[] drawableArr = this.f32151g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f32163s = opacity;
            this.f32162r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f32151g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f32151g = drawableArr;
        }

        public void p() {
            this.f32162r = false;
            this.f32164t = false;
        }

        public final boolean q() {
            return this.f32156l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                g3.a.m(drawable, this.f32170z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f32145a);
            return mutate;
        }

        public final void t(boolean z10) {
            this.f32156l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        public final boolean w(int i10, int i11) {
            int i12 = this.f32152h;
            Drawable[] drawableArr = this.f32151g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m10 = Build.VERSION.SDK_INT >= 23 ? g3.a.m(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z10 = m10;
                    }
                }
            }
            this.f32170z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f32153i = z10;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.f32146b = resources;
                int f10 = b.f(resources, this.f32147c);
                int i10 = this.f32147c;
                this.f32147c = f10;
                if (i10 != f10) {
                    this.f32157m = false;
                    this.f32154j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.B = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f32141y
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.F
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.A
            r3.setAlpha(r9)
            r13.F = r7
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            g.b$d r10 = r13.f32139w
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.A
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.F = r7
        L38:
            r3 = r6
        L39:
            android.graphics.drawable.Drawable r9 = r13.f32142z
            if (r9 == 0) goto L61
            long r10 = r13.G
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f32142z = r0
            r13.G = r7
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$d r4 = r13.f32139w
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.A
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.G = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.E
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f32139w.b(theme);
    }

    public d b() {
        throw null;
    }

    public int c() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f32139w.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.H == null) {
            this.H = new c();
        }
        drawable.setCallback(this.H.b(drawable.getCallback()));
        try {
            if (this.f32139w.A <= 0 && this.B) {
                drawable.setAlpha(this.A);
            }
            d dVar = this.f32139w;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    g3.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f32139w;
                if (dVar2.I) {
                    g3.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f32139w.f32168x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                g3.a.m(drawable, g3.a.f(this));
            }
            if (i10 >= 19) {
                g3.a.j(drawable, this.f32139w.C);
            }
            Rect rect = this.f32140x;
            if (i10 >= 21 && rect != null) {
                g3.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.H.a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f32142z;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && g3.a.f(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.C
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$d r0 = r9.f32139w
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f32142z
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f32141y
            if (r0 == 0) goto L29
            r9.f32142z = r0
            g.b$d r0 = r9.f32139w
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.G = r0
            goto L35
        L29:
            r9.f32142z = r4
            r9.G = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f32141y
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b$d r0 = r9.f32139w
            int r1 = r0.f32152h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f32141y = r0
            r9.C = r10
            if (r0 == 0) goto L5a
            g.b$d r10 = r9.f32139w
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.F = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f32141y = r4
            r10 = -1
            r9.C = r10
        L5a:
            long r0 = r9.F
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.G
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.E
            if (r10 != 0) goto L73
            g.b$a r10 = new g.b$a
            r10.<init>()
            r9.E = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f32139w.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f32139w.c()) {
            this.f32139w.f32148d = getChangingConfigurations();
            return this.f32139w;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f32141y;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f32140x;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f32139w.q()) {
            return this.f32139w.i();
        }
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f32139w.q()) {
            return this.f32139w.m();
        }
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f32139w.q()) {
            return this.f32139w.j();
        }
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f32139w.q()) {
            return this.f32139w.k();
        }
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f32141y;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f32139w.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            C0359b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f32139w.l();
        if (l10 != null) {
            rect.set(l10);
            padding = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f32141y;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    public void h(d dVar) {
        this.f32139w = dVar;
        int i10 = this.C;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f32141y = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f32142z = null;
    }

    public final void i(Resources resources) {
        this.f32139w.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f32139w;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f32141y || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f32139w.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f32142z;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f32142z = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f32141y;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.B) {
                this.f32141y.setAlpha(this.A);
            }
        }
        if (this.G != 0) {
            this.G = 0L;
            z10 = true;
        }
        if (this.F != 0) {
            this.F = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.D && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.D = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32142z;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f32141y;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f32139w.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f32142z;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f32141y;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f32142z;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f32141y;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f32141y || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.B && this.A == i10) {
            return;
        }
        this.B = true;
        this.A = i10;
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            if (this.F == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f32139w;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f32141y;
            if (drawable != null) {
                g3.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f32139w;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f32141y;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f32139w;
        if (dVar.f32168x != z10) {
            dVar.f32168x = z10;
            Drawable drawable = this.f32141y;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            g3.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f32140x;
        if (rect == null) {
            this.f32140x = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f32141y;
        if (drawable != null) {
            g3.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f32139w;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            g3.a.o(this.f32141y, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f32139w;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            g3.a.p(this.f32141y, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f32142z;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f32141y;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f32141y || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
