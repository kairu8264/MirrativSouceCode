package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.unity.UnityReceiverKt;

/* loaded from: classes.dex */
public class l extends RecyclerView.o implements RecyclerView.t {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.u C;

    /* renamed from: a  reason: collision with root package name */
    public final int f16215a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16216b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f16217c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f16218d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16219e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16220f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f16221g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f16222h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16223i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16224j;

    /* renamed from: k  reason: collision with root package name */
    public int f16225k;

    /* renamed from: l  reason: collision with root package name */
    public int f16226l;

    /* renamed from: m  reason: collision with root package name */
    public float f16227m;

    /* renamed from: n  reason: collision with root package name */
    public int f16228n;

    /* renamed from: o  reason: collision with root package name */
    public int f16229o;

    /* renamed from: p  reason: collision with root package name */
    public float f16230p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f16233s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f16240z;

    /* renamed from: q  reason: collision with root package name */
    public int f16231q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f16232r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16234t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16235u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f16236v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f16237w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f16238x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f16239y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.s(500);
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            l.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16243a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16243a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f16243a) {
                this.f16243a = false;
            } else if (((Float) l.this.f16240z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.A(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.x();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f16217c.setAlpha(floatValue);
            l.this.f16218d.setAlpha(floatValue);
            l.this.x();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f16240z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f16217c = stateListDrawable;
        this.f16218d = drawable;
        this.f16221g = stateListDrawable2;
        this.f16222h = drawable2;
        this.f16219e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f16220f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f16223i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f16224j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f16215a = i11;
        this.f16216b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    public void A(int i10) {
        if (i10 == 2 && this.f16236v != 2) {
            this.f16217c.setState(D);
            m();
        }
        if (i10 == 0) {
            x();
        } else {
            C();
        }
        if (this.f16236v == 2 && i10 != 2) {
            this.f16217c.setState(E);
            y(UnityReceiverKt.EMOMO_PHOTO_SIZE);
        } else if (i10 == 1) {
            y(1500);
        }
        this.f16236v = i10;
    }

    public final void B() {
        this.f16233s.g(this);
        this.f16233s.j(this);
        this.f16233s.k(this.C);
    }

    public void C() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            this.f16240z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f16240z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f16240z.setDuration(500L);
        this.f16240z.setStartDelay(0L);
        this.f16240z.start();
    }

    public void D(int i10, int i11) {
        int computeVerticalScrollRange = this.f16233s.computeVerticalScrollRange();
        int i12 = this.f16232r;
        this.f16234t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f16215a;
        int computeHorizontalScrollRange = this.f16233s.computeHorizontalScrollRange();
        int i13 = this.f16231q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f16215a;
        this.f16235u = z10;
        boolean z11 = this.f16234t;
        if (!z11 && !z10) {
            if (this.f16236v != 0) {
                A(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f16226l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f16225k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f16235u) {
            float f11 = i13;
            this.f16229o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f16228n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f16236v;
        if (i14 == 0 || i14 == 1) {
            A(1);
        }
    }

    public final void E(float f10) {
        int[] r10 = r();
        float max = Math.max(r10[0], Math.min(r10[1], f10));
        if (Math.abs(this.f16226l - max) < 2.0f) {
            return;
        }
        int z10 = z(this.f16227m, max, r10, this.f16233s.computeVerticalScrollRange(), this.f16233s.computeVerticalScrollOffset(), this.f16232r);
        if (z10 != 0) {
            this.f16233s.scrollBy(0, z10);
        }
        this.f16227m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f16236v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean w10 = w(motionEvent.getX(), motionEvent.getY());
            boolean v10 = v(motionEvent.getX(), motionEvent.getY());
            if (w10 || v10) {
                if (v10) {
                    this.f16237w = 1;
                    this.f16230p = (int) motionEvent.getX();
                } else if (w10) {
                    this.f16237w = 2;
                    this.f16227m = (int) motionEvent.getY();
                }
                A(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f16236v == 2) {
            this.f16227m = 0.0f;
            this.f16230p = 0.0f;
            A(1);
            this.f16237w = 0;
        } else if (motionEvent.getAction() == 2 && this.f16236v == 2) {
            C();
            if (this.f16237w == 1) {
                t(motionEvent.getX());
            }
            if (this.f16237w == 2) {
                E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f16236v;
        if (i10 == 1) {
            boolean w10 = w(motionEvent.getX(), motionEvent.getY());
            boolean v10 = v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!w10 && !v10) {
                return false;
            }
            if (v10) {
                this.f16237w = 1;
                this.f16230p = (int) motionEvent.getX();
            } else if (w10) {
                this.f16237w = 2;
                this.f16227m = (int) motionEvent.getY();
            }
            A(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f16231q == this.f16233s.getWidth() && this.f16232r == this.f16233s.getHeight()) {
            if (this.A != 0) {
                if (this.f16234t) {
                    p(canvas);
                }
                if (this.f16235u) {
                    o(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f16231q = this.f16233s.getWidth();
        this.f16232r = this.f16233s.getHeight();
        A(0);
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f16233s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.f16233s = recyclerView;
        if (recyclerView != null) {
            B();
        }
    }

    public final void m() {
        this.f16233s.removeCallbacks(this.B);
    }

    public final void n() {
        this.f16233s.c1(this);
        this.f16233s.f1(this);
        this.f16233s.g1(this.C);
        m();
    }

    public final void o(Canvas canvas) {
        int i10 = this.f16232r;
        int i11 = this.f16223i;
        int i12 = i10 - i11;
        int i13 = this.f16229o;
        int i14 = this.f16228n;
        int i15 = i13 - (i14 / 2);
        this.f16221g.setBounds(0, 0, i14, i11);
        this.f16222h.setBounds(0, 0, this.f16231q, this.f16224j);
        canvas.translate(0.0f, i12);
        this.f16222h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f16221g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    public final void p(Canvas canvas) {
        int i10 = this.f16231q;
        int i11 = this.f16219e;
        int i12 = i10 - i11;
        int i13 = this.f16226l;
        int i14 = this.f16225k;
        int i15 = i13 - (i14 / 2);
        this.f16217c.setBounds(0, 0, i11, i14);
        this.f16218d.setBounds(0, 0, this.f16220f, this.f16232r);
        if (u()) {
            this.f16218d.draw(canvas);
            canvas.translate(this.f16219e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f16217c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f16219e, -i15);
            return;
        }
        canvas.translate(i12, 0.0f);
        this.f16218d.draw(canvas);
        canvas.translate(0.0f, i15);
        this.f16217c.draw(canvas);
        canvas.translate(-i12, -i15);
    }

    public final int[] q() {
        int[] iArr = this.f16239y;
        int i10 = this.f16216b;
        iArr[0] = i10;
        iArr[1] = this.f16231q - i10;
        return iArr;
    }

    public final int[] r() {
        int[] iArr = this.f16238x;
        int i10 = this.f16216b;
        iArr[0] = i10;
        iArr[1] = this.f16232r - i10;
        return iArr;
    }

    public void s(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f16240z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f16240z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f16240z.setDuration(i10);
        this.f16240z.start();
    }

    public final void t(float f10) {
        int[] q10 = q();
        float max = Math.max(q10[0], Math.min(q10[1], f10));
        if (Math.abs(this.f16229o - max) < 2.0f) {
            return;
        }
        int z10 = z(this.f16230p, max, q10, this.f16233s.computeHorizontalScrollRange(), this.f16233s.computeHorizontalScrollOffset(), this.f16231q);
        if (z10 != 0) {
            this.f16233s.scrollBy(z10, 0);
        }
        this.f16230p = max;
    }

    public final boolean u() {
        return o3.c0.E(this.f16233s) == 1;
    }

    public boolean v(float f10, float f11) {
        if (f11 >= this.f16232r - this.f16223i) {
            int i10 = this.f16229o;
            int i11 = this.f16228n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean w(float f10, float f11) {
        if (!u() ? f10 >= this.f16231q - this.f16219e : f10 <= this.f16219e) {
            int i10 = this.f16226l;
            int i11 = this.f16225k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    public void x() {
        this.f16233s.invalidate();
    }

    public final void y(int i10) {
        m();
        this.f16233s.postDelayed(this.B, i10);
    }

    public final int z(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }
}
