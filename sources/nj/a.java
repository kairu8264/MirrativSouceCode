package nj;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import nj.g;
import o3.c0;
import qj.a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: j0  reason: collision with root package name */
    public static final boolean f43581j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final Paint f43582k0;
    public qj.a A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public boolean F;
    public Bitmap G;
    public Paint H;
    public float I;
    public float J;
    public int[] K;
    public boolean L;
    public final TextPaint M;
    public final TextPaint N;
    public TimeInterpolator O;
    public TimeInterpolator P;
    public float Q;
    public float R;
    public float S;
    public ColorStateList T;
    public float U;
    public float V;
    public float W;
    public ColorStateList X;
    public float Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f43583a;

    /* renamed from: a0  reason: collision with root package name */
    public StaticLayout f43584a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43585b;

    /* renamed from: b0  reason: collision with root package name */
    public float f43586b0;

    /* renamed from: c  reason: collision with root package name */
    public float f43587c;

    /* renamed from: c0  reason: collision with root package name */
    public float f43588c0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43589d;

    /* renamed from: d0  reason: collision with root package name */
    public float f43590d0;

    /* renamed from: e  reason: collision with root package name */
    public float f43591e;

    /* renamed from: e0  reason: collision with root package name */
    public CharSequence f43592e0;

    /* renamed from: f  reason: collision with root package name */
    public float f43593f;

    /* renamed from: g  reason: collision with root package name */
    public int f43595g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f43597h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f43599i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f43601j;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f43606o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f43607p;

    /* renamed from: q  reason: collision with root package name */
    public float f43608q;

    /* renamed from: r  reason: collision with root package name */
    public float f43609r;

    /* renamed from: s  reason: collision with root package name */
    public float f43610s;

    /* renamed from: t  reason: collision with root package name */
    public float f43611t;

    /* renamed from: u  reason: collision with root package name */
    public float f43612u;

    /* renamed from: v  reason: collision with root package name */
    public float f43613v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f43614w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f43615x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f43616y;

    /* renamed from: z  reason: collision with root package name */
    public qj.a f43617z;

    /* renamed from: k  reason: collision with root package name */
    public int f43602k = 16;

    /* renamed from: l  reason: collision with root package name */
    public int f43603l = 16;

    /* renamed from: m  reason: collision with root package name */
    public float f43604m = 15.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f43605n = 15.0f;
    public boolean E = true;

    /* renamed from: f0  reason: collision with root package name */
    public int f43594f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public float f43596g0 = 0.0f;

    /* renamed from: h0  reason: collision with root package name */
    public float f43598h0 = 1.0f;

    /* renamed from: i0  reason: collision with root package name */
    public int f43600i0 = g.f43637n;

    /* renamed from: nj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0637a implements a.InterfaceC0746a {
        public C0637a() {
        }

        @Override // qj.a.InterfaceC0746a
        public void a(Typeface typeface) {
            a.this.d0(typeface);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements a.InterfaceC0746a {
        public b() {
        }

        @Override // qj.a.InterfaceC0746a
        public void a(Typeface typeface) {
            a.this.n0(typeface);
        }
    }

    static {
        f43581j0 = Build.VERSION.SDK_INT < 18;
        f43582k0 = null;
    }

    public a(View view) {
        this.f43583a = view;
        TextPaint textPaint = new TextPaint((int) TsExtractor.TS_STREAM_TYPE_AC3);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.f43599i = new Rect();
        this.f43597h = new Rect();
        this.f43601j = new RectF();
        this.f43593f = f();
    }

    public static boolean O(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    public static float S(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return xi.a.a(f10, f11, f12);
    }

    public static boolean W(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public int A() {
        return this.f43602k;
    }

    public void A0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.B, charSequence)) {
            this.B = charSequence;
            this.C = null;
            k();
            U();
        }
    }

    public float B() {
        M(this.N);
        return -this.N.ascent();
    }

    public void B0(TimeInterpolator timeInterpolator) {
        this.P = timeInterpolator;
        U();
    }

    public Typeface C() {
        Typeface typeface = this.f43615x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void C0(Typeface typeface) {
        boolean e02 = e0(typeface);
        boolean o02 = o0(typeface);
        if (e02 || o02) {
            U();
        }
    }

    public float D() {
        return this.f43587c;
    }

    public final boolean D0() {
        return this.f43594f0 > 1 && (!this.D || this.f43589d) && !this.F;
    }

    public float E() {
        return this.f43593f;
    }

    public int F() {
        return this.f43600i0;
    }

    public int G() {
        StaticLayout staticLayout = this.f43584a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float H() {
        return this.f43584a0.getSpacingAdd();
    }

    public float I() {
        return this.f43584a0.getSpacingMultiplier();
    }

    public int J() {
        return this.f43594f0;
    }

    public CharSequence K() {
        return this.B;
    }

    public final void L(TextPaint textPaint) {
        textPaint.setTextSize(this.f43605n);
        textPaint.setTypeface(this.f43614w);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Y);
        }
    }

    public final void M(TextPaint textPaint) {
        textPaint.setTextSize(this.f43604m);
        textPaint.setTypeface(this.f43615x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Z);
        }
    }

    public final void N(float f10) {
        if (this.f43589d) {
            this.f43601j.set(f10 < this.f43593f ? this.f43597h : this.f43599i);
            return;
        }
        this.f43601j.left = S(this.f43597h.left, this.f43599i.left, f10, this.O);
        this.f43601j.top = S(this.f43608q, this.f43609r, f10, this.O);
        this.f43601j.right = S(this.f43597h.right, this.f43599i.right, f10, this.O);
        this.f43601j.bottom = S(this.f43597h.bottom, this.f43599i.bottom, f10, this.O);
    }

    public final boolean P() {
        return c0.E(this.f43583a) == 1;
    }

    public final boolean Q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f43607p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f43606o) != null && colorStateList.isStateful());
    }

    public final boolean R(CharSequence charSequence, boolean z10) {
        return (z10 ? m3.f.f40587d : m3.f.f40586c).a(charSequence, 0, charSequence.length());
    }

    public void T() {
        this.f43585b = this.f43599i.width() > 0 && this.f43599i.height() > 0 && this.f43597h.width() > 0 && this.f43597h.height() > 0;
    }

    public void U() {
        V(false);
    }

    public void V(boolean z10) {
        if ((this.f43583a.getHeight() <= 0 || this.f43583a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        d();
    }

    public void X(int i10, int i11, int i12, int i13) {
        if (W(this.f43599i, i10, i11, i12, i13)) {
            return;
        }
        this.f43599i.set(i10, i11, i12, i13);
        this.L = true;
        T();
    }

    public void Y(Rect rect) {
        X(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void Z(int i10) {
        qj.d dVar = new qj.d(this.f43583a.getContext(), i10);
        ColorStateList colorStateList = dVar.f49535a;
        if (colorStateList != null) {
            this.f43607p = colorStateList;
        }
        float f10 = dVar.f49548n;
        if (f10 != 0.0f) {
            this.f43605n = f10;
        }
        ColorStateList colorStateList2 = dVar.f49538d;
        if (colorStateList2 != null) {
            this.T = colorStateList2;
        }
        this.R = dVar.f49543i;
        this.S = dVar.f49544j;
        this.Q = dVar.f49545k;
        this.Y = dVar.f49547m;
        qj.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        this.A = new qj.a(new C0637a(), dVar.e());
        dVar.h(this.f43583a.getContext(), this.A);
        U();
    }

    public final void a0(float f10) {
        this.f43586b0 = f10;
        c0.i0(this.f43583a);
    }

    public final void b(boolean z10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        float f10 = this.J;
        j(this.f43605n, z10);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout2 = this.f43584a0) != null) {
            this.f43592e0 = TextUtils.ellipsize(charSequence, this.M, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f43592e0;
        float f11 = 0.0f;
        float measureText = charSequence2 != null ? this.M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b10 = o3.f.b(this.f43603l, this.D ? 1 : 0);
        int i10 = b10 & 112;
        if (i10 == 48) {
            this.f43609r = this.f43599i.top;
        } else if (i10 != 80) {
            this.f43609r = this.f43599i.centerY() - ((this.M.descent() - this.M.ascent()) / 2.0f);
        } else {
            this.f43609r = this.f43599i.bottom + this.M.ascent();
        }
        int i11 = b10 & 8388615;
        if (i11 == 1) {
            this.f43611t = this.f43599i.centerX() - (measureText / 2.0f);
        } else if (i11 != 5) {
            this.f43611t = this.f43599i.left;
        } else {
            this.f43611t = this.f43599i.right - measureText;
        }
        j(this.f43604m, z10);
        float height = this.f43584a0 != null ? staticLayout.getHeight() : 0.0f;
        CharSequence charSequence3 = this.C;
        float measureText2 = charSequence3 != null ? this.M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f43584a0;
        if (staticLayout3 != null && this.f43594f0 > 1) {
            measureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f43584a0;
        if (staticLayout4 != null) {
            f11 = this.f43594f0 > 1 ? staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
        }
        this.f43590d0 = f11;
        int b11 = o3.f.b(this.f43602k, this.D ? 1 : 0);
        int i12 = b11 & 112;
        if (i12 == 48) {
            this.f43608q = this.f43597h.top;
        } else if (i12 != 80) {
            this.f43608q = this.f43597h.centerY() - (height / 2.0f);
        } else {
            this.f43608q = (this.f43597h.bottom - height) + this.M.descent();
        }
        int i13 = b11 & 8388615;
        if (i13 == 1) {
            this.f43610s = this.f43597h.centerX() - (measureText2 / 2.0f);
        } else if (i13 != 5) {
            this.f43610s = this.f43597h.left;
        } else {
            this.f43610s = this.f43597h.right - measureText2;
        }
        k();
        t0(f10);
    }

    public void b0(ColorStateList colorStateList) {
        if (this.f43607p != colorStateList) {
            this.f43607p = colorStateList;
            U();
        }
    }

    public float c() {
        if (this.B == null) {
            return 0.0f;
        }
        L(this.N);
        TextPaint textPaint = this.N;
        CharSequence charSequence = this.B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(int i10) {
        if (this.f43603l != i10) {
            this.f43603l = i10;
            U();
        }
    }

    public final void d() {
        h(this.f43587c);
    }

    public void d0(Typeface typeface) {
        if (e0(typeface)) {
            U();
        }
    }

    public final float e(float f10) {
        float f11 = this.f43593f;
        if (f10 <= f11) {
            return xi.a.b(1.0f, 0.0f, this.f43591e, f11, f10);
        }
        return xi.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    public final boolean e0(Typeface typeface) {
        qj.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f43614w != typeface) {
            this.f43614w = typeface;
            return true;
        }
        return false;
    }

    public final float f() {
        float f10 = this.f43591e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    public void f0(int i10) {
        this.f43595g = i10;
    }

    public final boolean g(CharSequence charSequence) {
        boolean P = P();
        return this.E ? R(charSequence, P) : P;
    }

    public void g0(int i10, int i11, int i12, int i13) {
        if (W(this.f43597h, i10, i11, i12, i13)) {
            return;
        }
        this.f43597h.set(i10, i11, i12, i13);
        this.L = true;
        T();
    }

    public final void h(float f10) {
        float f11;
        N(f10);
        if (this.f43589d) {
            if (f10 < this.f43593f) {
                this.f43612u = this.f43610s;
                this.f43613v = this.f43608q;
                t0(this.f43604m);
                f11 = 0.0f;
            } else {
                this.f43612u = this.f43611t;
                this.f43613v = this.f43609r - Math.max(0, this.f43595g);
                t0(this.f43605n);
                f11 = 1.0f;
            }
        } else {
            this.f43612u = S(this.f43610s, this.f43611t, f10, this.O);
            this.f43613v = S(this.f43608q, this.f43609r, f10, this.O);
            t0(S(this.f43604m, this.f43605n, f10, this.P));
            f11 = f10;
        }
        TimeInterpolator timeInterpolator = xi.a.f60298b;
        a0(1.0f - S(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        j0(S(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f43607p != this.f43606o) {
            this.M.setColor(a(y(), w(), f11));
        } else {
            this.M.setColor(w());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f12 = this.Y;
            float f13 = this.Z;
            if (f12 != f13) {
                this.M.setLetterSpacing(S(f13, f12, f10, timeInterpolator));
            } else {
                this.M.setLetterSpacing(f12);
            }
        }
        this.M.setShadowLayer(S(this.U, this.Q, f10, null), S(this.V, this.R, f10, null), S(this.W, this.S, f10, null), a(x(this.X), x(this.T), f10));
        if (this.f43589d) {
            this.M.setAlpha((int) (e(f10) * 255.0f));
        }
        c0.i0(this.f43583a);
    }

    public void h0(Rect rect) {
        g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void i(float f10) {
        j(f10, false);
    }

    public void i0(int i10) {
        qj.d dVar = new qj.d(this.f43583a.getContext(), i10);
        ColorStateList colorStateList = dVar.f49535a;
        if (colorStateList != null) {
            this.f43606o = colorStateList;
        }
        float f10 = dVar.f49548n;
        if (f10 != 0.0f) {
            this.f43604m = f10;
        }
        ColorStateList colorStateList2 = dVar.f49538d;
        if (colorStateList2 != null) {
            this.X = colorStateList2;
        }
        this.V = dVar.f49543i;
        this.W = dVar.f49544j;
        this.U = dVar.f49545k;
        this.Z = dVar.f49547m;
        qj.a aVar = this.f43617z;
        if (aVar != null) {
            aVar.c();
        }
        this.f43617z = new qj.a(new b(), dVar.e());
        dVar.h(this.f43583a.getContext(), this.f43617z);
        U();
    }

    public final void j(float f10, boolean z10) {
        boolean z11;
        float f11;
        boolean z12;
        if (this.B == null) {
            return;
        }
        float width = this.f43599i.width();
        float width2 = this.f43597h.width();
        if (O(f10, this.f43605n)) {
            f11 = this.f43605n;
            this.I = 1.0f;
            Typeface typeface = this.f43616y;
            Typeface typeface2 = this.f43614w;
            if (typeface != typeface2) {
                this.f43616y = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f12 = this.f43604m;
            Typeface typeface3 = this.f43616y;
            Typeface typeface4 = this.f43615x;
            if (typeface3 != typeface4) {
                this.f43616y = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (O(f10, f12)) {
                this.I = 1.0f;
            } else {
                this.I = f10 / this.f43604m;
            }
            float f13 = this.f43605n / this.f43604m;
            width = (!z10 && width2 * f13 > width) ? Math.min(width / f13, width2) : width2;
            f11 = f12;
            z12 = z11;
        }
        if (width > 0.0f) {
            z12 = this.J != f11 || this.L || z12;
            this.J = f11;
            this.L = false;
        }
        if (this.C == null || z12) {
            this.M.setTextSize(this.J);
            this.M.setTypeface(this.f43616y);
            this.M.setLinearText(this.I != 1.0f);
            this.D = g(this.B);
            StaticLayout l10 = l(D0() ? this.f43594f0 : 1, width, this.D);
            this.f43584a0 = l10;
            this.C = l10.getText();
        }
    }

    public final void j0(float f10) {
        this.f43588c0 = f10;
        c0.i0(this.f43583a);
    }

    public final void k() {
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    public void k0(ColorStateList colorStateList) {
        if (this.f43606o != colorStateList) {
            this.f43606o = colorStateList;
            U();
        }
    }

    public final StaticLayout l(int i10, float f10, boolean z10) {
        StaticLayout staticLayout;
        try {
            staticLayout = g.c(this.B, this.M, (int) f10).e(TextUtils.TruncateAt.END).h(z10).d(Layout.Alignment.ALIGN_NORMAL).g(false).j(i10).i(this.f43596g0, this.f43598h0).f(this.f43600i0).a();
        } catch (g.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayout = null;
        }
        return (StaticLayout) n3.h.g(staticLayout);
    }

    public void l0(int i10) {
        if (this.f43602k != i10) {
            this.f43602k = i10;
            U();
        }
    }

    public void m(Canvas canvas) {
        int save = canvas.save();
        if (this.C == null || !this.f43585b) {
            return;
        }
        boolean z10 = true;
        float lineStart = (this.f43612u + (this.f43594f0 > 1 ? this.f43584a0.getLineStart(0) : this.f43584a0.getLineLeft(0))) - (this.f43590d0 * 2.0f);
        this.M.setTextSize(this.J);
        float f10 = this.f43612u;
        float f11 = this.f43613v;
        if (!this.F || this.G == null) {
            z10 = false;
        }
        float f12 = this.I;
        if (f12 != 1.0f && !this.f43589d) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.G, f10, f11, this.H);
            canvas.restoreToCount(save);
            return;
        }
        if (D0() && (!this.f43589d || this.f43587c > this.f43593f)) {
            n(canvas, lineStart, f11);
        } else {
            canvas.translate(f10, f11);
            this.f43584a0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void m0(float f10) {
        if (this.f43604m != f10) {
            this.f43604m = f10;
            U();
        }
    }

    public final void n(Canvas canvas, float f10, float f11) {
        int alpha = this.M.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.M.setAlpha((int) (this.f43588c0 * f12));
        this.f43584a0.draw(canvas);
        this.M.setAlpha((int) (this.f43586b0 * f12));
        int lineBaseline = this.f43584a0.getLineBaseline(0);
        CharSequence charSequence = this.f43592e0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.M);
        if (this.f43589d) {
            return;
        }
        String trim = this.f43592e0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.M.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f43584a0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.M);
    }

    public void n0(Typeface typeface) {
        if (o0(typeface)) {
            U();
        }
    }

    public final void o() {
        if (this.G != null || this.f43597h.isEmpty() || TextUtils.isEmpty(this.C)) {
            return;
        }
        h(0.0f);
        int width = this.f43584a0.getWidth();
        int height = this.f43584a0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f43584a0.draw(new Canvas(this.G));
        if (this.H == null) {
            this.H = new Paint(3);
        }
    }

    public final boolean o0(Typeface typeface) {
        qj.a aVar = this.f43617z;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f43615x != typeface) {
            this.f43615x = typeface;
            return true;
        }
        return false;
    }

    public void p(RectF rectF, int i10, int i11) {
        this.D = g(this.B);
        rectF.left = t(i10, i11);
        rectF.top = this.f43599i.top;
        rectF.right = u(rectF, i10, i11);
        rectF.bottom = this.f43599i.top + s();
    }

    public void p0(float f10) {
        float a10 = i3.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f43587c) {
            this.f43587c = a10;
            d();
        }
    }

    public ColorStateList q() {
        return this.f43607p;
    }

    public void q0(boolean z10) {
        this.f43589d = z10;
    }

    public int r() {
        return this.f43603l;
    }

    public void r0(float f10) {
        this.f43591e = f10;
        this.f43593f = f();
    }

    public float s() {
        L(this.N);
        return -this.N.ascent();
    }

    public void s0(int i10) {
        this.f43600i0 = i10;
    }

    public final float t(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (c() / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.D ? this.f43599i.left : this.f43599i.right - c() : this.D ? this.f43599i.right - c() : this.f43599i.left;
    }

    public final void t0(float f10) {
        i(f10);
        boolean z10 = f43581j0 && this.I != 1.0f;
        this.F = z10;
        if (z10) {
            o();
        }
        c0.i0(this.f43583a);
    }

    public final float u(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (c() / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.D ? rectF.left + c() : this.f43599i.right : this.D ? this.f43599i.right : rectF.left + c();
    }

    public void u0(float f10) {
        this.f43596g0 = f10;
    }

    public Typeface v() {
        Typeface typeface = this.f43614w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(float f10) {
        this.f43598h0 = f10;
    }

    public int w() {
        return x(this.f43607p);
    }

    public void w0(int i10) {
        if (i10 != this.f43594f0) {
            this.f43594f0 = i10;
            k();
            U();
        }
    }

    public final int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void x0(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        U();
    }

    public final int y() {
        return x(this.f43606o);
    }

    public void y0(boolean z10) {
        this.E = z10;
    }

    public float z() {
        M(this.N);
        return (-this.N.ascent()) + this.N.descent();
    }

    public final boolean z0(int[] iArr) {
        this.K = iArr;
        if (Q()) {
            U();
            return true;
        }
        return false;
    }
}
