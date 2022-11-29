package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import o3.c0;
import tj.n;

/* loaded from: classes3.dex */
public class a {
    public static final TimeInterpolator F = xi.a.f60299c;
    public static final int[] G = {16842919, 16842910};
    public static final int[] H = {16843623, 16842908, 16842910};
    public static final int[] I = {16842908, 16842910};
    public static final int[] J = {16843623, 16842910};
    public static final int[] K = {16842910};
    public static final int[] L = new int[0];
    public ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a  reason: collision with root package name */
    public tj.k f27629a;

    /* renamed from: b  reason: collision with root package name */
    public tj.g f27630b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f27631c;

    /* renamed from: d  reason: collision with root package name */
    public mj.a f27632d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f27633e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27634f;

    /* renamed from: h  reason: collision with root package name */
    public float f27636h;

    /* renamed from: i  reason: collision with root package name */
    public float f27637i;

    /* renamed from: j  reason: collision with root package name */
    public float f27638j;

    /* renamed from: k  reason: collision with root package name */
    public int f27639k;

    /* renamed from: l  reason: collision with root package name */
    public final nj.f f27640l;

    /* renamed from: m  reason: collision with root package name */
    public xi.h f27641m;

    /* renamed from: n  reason: collision with root package name */
    public xi.h f27642n;

    /* renamed from: o  reason: collision with root package name */
    public Animator f27643o;

    /* renamed from: p  reason: collision with root package name */
    public xi.h f27644p;

    /* renamed from: q  reason: collision with root package name */
    public xi.h f27645q;

    /* renamed from: r  reason: collision with root package name */
    public float f27646r;

    /* renamed from: t  reason: collision with root package name */
    public int f27648t;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f27650v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f27651w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<i> f27652x;

    /* renamed from: y  reason: collision with root package name */
    public final FloatingActionButton f27653y;

    /* renamed from: z  reason: collision with root package name */
    public final sj.b f27654z;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27635g = true;

    /* renamed from: s  reason: collision with root package name */
    public float f27647s = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    public int f27649u = 0;
    public final Rect A = new Rect();
    public final RectF B = new RectF();
    public final RectF C = new RectF();
    public final Matrix D = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0245a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27655a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f27656b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f27657c;

        public C0245a(boolean z10, j jVar) {
            this.f27656b = z10;
            this.f27657c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27655a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f27649u = 0;
            a.this.f27643o = null;
            if (this.f27655a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f27653y;
            boolean z10 = this.f27656b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            j jVar = this.f27657c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f27653y.b(0, this.f27656b);
            a.this.f27649u = 1;
            a.this.f27643o = animator;
            this.f27655a = false;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27659a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f27660b;

        public b(boolean z10, j jVar) {
            this.f27659a = z10;
            this.f27660b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f27649u = 0;
            a.this.f27643o = null;
            j jVar = this.f27660b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f27653y.b(0, this.f27659a);
            a.this.f27649u = 2;
            a.this.f27643o = animator;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends xi.g {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f27647s = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        public FloatEvaluator f27663a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f27663a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.H();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends l {
        public f() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            return 0.0f;
        }
    }

    /* loaded from: classes3.dex */
    public class g extends l {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            a aVar = a.this;
            return aVar.f27636h + aVar.f27637i;
        }
    }

    /* loaded from: classes3.dex */
    public class h extends l {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            a aVar = a.this;
            return aVar.f27636h + aVar.f27638j;
        }
    }

    /* loaded from: classes3.dex */
    public interface i {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    public class k extends l {
        public k() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            return a.this.f27636h;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27670a;

        /* renamed from: b  reason: collision with root package name */
        public float f27671b;

        /* renamed from: c  reason: collision with root package name */
        public float f27672c;

        public l() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.g0((int) this.f27672c);
            this.f27670a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f27670a) {
                tj.g gVar = a.this.f27630b;
                this.f27671b = gVar == null ? 0.0f : gVar.w();
                this.f27672c = a();
                this.f27670a = true;
            }
            a aVar = a.this;
            float f10 = this.f27671b;
            aVar.g0((int) (f10 + ((this.f27672c - f10) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ l(a aVar, C0245a c0245a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, sj.b bVar) {
        this.f27653y = floatingActionButton;
        this.f27654z = bVar;
        nj.f fVar = new nj.f();
        this.f27640l = fVar;
        fVar.a(G, i(new h()));
        fVar.a(H, i(new g()));
        fVar.a(I, i(new g()));
        fVar.a(J, i(new g()));
        fVar.a(K, i(new k()));
        fVar.a(L, i(new f()));
        this.f27646r = floatingActionButton.getRotation();
    }

    public void A() {
        this.f27640l.c();
    }

    public void B() {
        tj.g gVar = this.f27630b;
        if (gVar != null) {
            tj.h.f(this.f27653y, gVar);
        }
        if (K()) {
            this.f27653y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void C() {
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.f27653y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    public void E(int[] iArr) {
        this.f27640l.d(iArr);
    }

    public void F(float f10, float f11, float f12) {
        f0();
        g0(f10);
    }

    public void G(Rect rect) {
        n3.h.h(this.f27633e, "Didn't initialize content background");
        if (Z()) {
            this.f27654z.setBackgroundDrawable(new InsetDrawable(this.f27633e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f27654z.setBackgroundDrawable(this.f27633e);
    }

    public void H() {
        float rotation = this.f27653y.getRotation();
        if (this.f27646r != rotation) {
            this.f27646r = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<i> arrayList = this.f27652x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void J() {
        ArrayList<i> arrayList = this.f27652x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public boolean K() {
        return true;
    }

    public void L(ColorStateList colorStateList) {
        tj.g gVar = this.f27630b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        mj.a aVar = this.f27632d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        tj.g gVar = this.f27630b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void N(float f10) {
        if (this.f27636h != f10) {
            this.f27636h = f10;
            F(f10, this.f27637i, this.f27638j);
        }
    }

    public void O(boolean z10) {
        this.f27634f = z10;
    }

    public final void P(xi.h hVar) {
        this.f27645q = hVar;
    }

    public final void Q(float f10) {
        if (this.f27637i != f10) {
            this.f27637i = f10;
            F(this.f27636h, f10, this.f27638j);
        }
    }

    public final void R(float f10) {
        this.f27647s = f10;
        Matrix matrix = this.D;
        g(f10, matrix);
        this.f27653y.setImageMatrix(matrix);
    }

    public final void S(int i10) {
        if (this.f27648t != i10) {
            this.f27648t = i10;
            e0();
        }
    }

    public void T(int i10) {
        this.f27639k = i10;
    }

    public final void U(float f10) {
        if (this.f27638j != f10) {
            this.f27638j = f10;
            F(this.f27636h, this.f27637i, f10);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f27631c;
        if (drawable != null) {
            g3.a.o(drawable, rj.b.d(colorStateList));
        }
    }

    public void W(boolean z10) {
        this.f27635g = z10;
        f0();
    }

    public final void X(tj.k kVar) {
        this.f27629a = kVar;
        tj.g gVar = this.f27630b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f27631c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        mj.a aVar = this.f27632d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    public final void Y(xi.h hVar) {
        this.f27644p = hVar;
    }

    public boolean Z() {
        return true;
    }

    public final boolean a0() {
        return c0.V(this.f27653y) && !this.f27653y.isInEditMode();
    }

    public final boolean b0() {
        return !this.f27634f || this.f27653y.getSizeDimension() >= this.f27639k;
    }

    public void c0(j jVar, boolean z10) {
        if (z()) {
            return;
        }
        Animator animator = this.f27643o;
        if (animator != null) {
            animator.cancel();
        }
        if (a0()) {
            if (this.f27653y.getVisibility() != 0) {
                this.f27653y.setAlpha(0.0f);
                this.f27653y.setScaleY(0.0f);
                this.f27653y.setScaleX(0.0f);
                R(0.0f);
            }
            xi.h hVar = this.f27644p;
            if (hVar == null) {
                hVar = m();
            }
            AnimatorSet h10 = h(hVar, 1.0f, 1.0f, 1.0f);
            h10.addListener(new b(z10, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f27650v;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h10.addListener(it.next());
                }
            }
            h10.start();
            return;
        }
        this.f27653y.b(0, z10);
        this.f27653y.setAlpha(1.0f);
        this.f27653y.setScaleY(1.0f);
        this.f27653y.setScaleX(1.0f);
        R(1.0f);
        if (jVar != null) {
            jVar.a();
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.f27651w == null) {
            this.f27651w = new ArrayList<>();
        }
        this.f27651w.add(animatorListener);
    }

    public void d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f27646r % 90.0f != 0.0f) {
                if (this.f27653y.getLayerType() != 1) {
                    this.f27653y.setLayerType(1, null);
                }
            } else if (this.f27653y.getLayerType() != 0) {
                this.f27653y.setLayerType(0, null);
            }
        }
        tj.g gVar = this.f27630b;
        if (gVar != null) {
            gVar.e0((int) this.f27646r);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f27650v == null) {
            this.f27650v = new ArrayList<>();
        }
        this.f27650v.add(animatorListener);
    }

    public final void e0() {
        R(this.f27647s);
    }

    public void f(i iVar) {
        if (this.f27652x == null) {
            this.f27652x = new ArrayList<>();
        }
        this.f27652x.add(iVar);
    }

    public final void f0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.f27654z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void g(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f27653y.getDrawable();
        if (drawable == null || this.f27648t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f27648t;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f27648t;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public void g0(float f10) {
        tj.g gVar = this.f27630b;
        if (gVar != null) {
            gVar.X(f10);
        }
    }

    public final AnimatorSet h(xi.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f27653y, View.ALPHA, f10);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f27653y, View.SCALE_X, f11);
        hVar.e("scale").a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f27653y, View.SCALE_Y, f11);
        hVar.e("scale").a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f12, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f27653y, new xi.f(), new c(), new Matrix(this.D));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        xi.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    public final ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public tj.g j() {
        return new tj.g((tj.k) n3.h.g(this.f27629a));
    }

    public final Drawable k() {
        return this.f27633e;
    }

    public final xi.h l() {
        if (this.f27642n == null) {
            this.f27642n = xi.h.c(this.f27653y.getContext(), wi.a.f58760a);
        }
        return (xi.h) n3.h.g(this.f27642n);
    }

    public final xi.h m() {
        if (this.f27641m == null) {
            this.f27641m = xi.h.c(this.f27653y.getContext(), wi.a.f58761b);
        }
        return (xi.h) n3.h.g(this.f27641m);
    }

    public float n() {
        return this.f27636h;
    }

    public boolean o() {
        return this.f27634f;
    }

    public final xi.h p() {
        return this.f27645q;
    }

    public float q() {
        return this.f27637i;
    }

    public final ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    public void s(Rect rect) {
        int sizeDimension = this.f27634f ? (this.f27639k - this.f27653y.getSizeDimension()) / 2 : 0;
        float n10 = this.f27635g ? n() + this.f27638j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(n10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(n10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float t() {
        return this.f27638j;
    }

    public final tj.k u() {
        return this.f27629a;
    }

    public final xi.h v() {
        return this.f27644p;
    }

    public void w(j jVar, boolean z10) {
        if (y()) {
            return;
        }
        Animator animator = this.f27643o;
        if (animator != null) {
            animator.cancel();
        }
        if (a0()) {
            xi.h hVar = this.f27645q;
            if (hVar == null) {
                hVar = l();
            }
            AnimatorSet h10 = h(hVar, 0.0f, 0.0f, 0.0f);
            h10.addListener(new C0245a(z10, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f27651w;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h10.addListener(it.next());
                }
            }
            h10.start();
            return;
        }
        this.f27653y.b(z10 ? 8 : 4, z10);
        if (jVar != null) {
            jVar.b();
        }
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        tj.g j10 = j();
        this.f27630b = j10;
        j10.setTintList(colorStateList);
        if (mode != null) {
            this.f27630b.setTintMode(mode);
        }
        this.f27630b.d0(-12303292);
        this.f27630b.N(this.f27653y.getContext());
        rj.a aVar = new rj.a(this.f27630b.D());
        aVar.setTintList(rj.b.d(colorStateList2));
        this.f27631c = aVar;
        this.f27633e = new LayerDrawable(new Drawable[]{(Drawable) n3.h.g(this.f27630b), aVar});
    }

    public boolean y() {
        return this.f27653y.getVisibility() == 0 ? this.f27649u == 1 : this.f27649u != 2;
    }

    public boolean z() {
        return this.f27653y.getVisibility() != 0 ? this.f27649u == 2 : this.f27649u != 1;
    }
}
