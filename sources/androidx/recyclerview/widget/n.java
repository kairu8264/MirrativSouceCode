package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n extends RecyclerView.o implements RecyclerView.r {
    public g A;
    public Rect C;
    public long D;

    /* renamed from: d  reason: collision with root package name */
    public float f16262d;

    /* renamed from: e  reason: collision with root package name */
    public float f16263e;

    /* renamed from: f  reason: collision with root package name */
    public float f16264f;

    /* renamed from: g  reason: collision with root package name */
    public float f16265g;

    /* renamed from: h  reason: collision with root package name */
    public float f16266h;

    /* renamed from: i  reason: collision with root package name */
    public float f16267i;

    /* renamed from: j  reason: collision with root package name */
    public float f16268j;

    /* renamed from: k  reason: collision with root package name */
    public float f16269k;

    /* renamed from: m  reason: collision with root package name */
    public f f16271m;

    /* renamed from: o  reason: collision with root package name */
    public int f16273o;

    /* renamed from: q  reason: collision with root package name */
    public int f16275q;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f16276r;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f16278t;

    /* renamed from: u  reason: collision with root package name */
    public List<RecyclerView.e0> f16279u;

    /* renamed from: v  reason: collision with root package name */
    public List<Integer> f16280v;

    /* renamed from: z  reason: collision with root package name */
    public o3.e f16284z;

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f16259a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f16260b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.e0 f16261c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f16270l = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f16272n = 0;

    /* renamed from: p  reason: collision with root package name */
    public List<h> f16274p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f16277s = new a();

    /* renamed from: w  reason: collision with root package name */
    public RecyclerView.k f16281w = null;

    /* renamed from: x  reason: collision with root package name */
    public View f16282x = null;

    /* renamed from: y  reason: collision with root package name */
    public int f16283y = -1;
    public final RecyclerView.t B = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            if (nVar.f16261c == null || !nVar.E()) {
                return;
            }
            n nVar2 = n.this;
            RecyclerView.e0 e0Var = nVar2.f16261c;
            if (e0Var != null) {
                nVar2.z(e0Var);
            }
            n nVar3 = n.this;
            nVar3.f16276r.removeCallbacks(nVar3.f16277s);
            o3.c0.j0(n.this.f16276r, this);
        }
    }

    /* loaded from: classes.dex */
    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            n.this.f16284z.a(motionEvent);
            VelocityTracker velocityTracker = n.this.f16278t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (n.this.f16270l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(n.this.f16270l);
            if (findPointerIndex >= 0) {
                n.this.o(actionMasked, motionEvent, findPointerIndex);
            }
            n nVar = n.this;
            RecyclerView.e0 e0Var = nVar.f16261c;
            if (e0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        nVar.L(motionEvent, nVar.f16273o, findPointerIndex);
                        n.this.z(e0Var);
                        n nVar2 = n.this;
                        nVar2.f16276r.removeCallbacks(nVar2.f16277s);
                        n.this.f16277s.run();
                        n.this.f16276r.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    n nVar3 = n.this;
                    if (pointerId == nVar3.f16270l) {
                        nVar3.f16270l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        n nVar4 = n.this;
                        nVar4.L(motionEvent, nVar4.f16273o, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = nVar.f16278t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            n.this.F(null, 0);
            n.this.f16270l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            h s10;
            n.this.f16284z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                n.this.f16270l = motionEvent.getPointerId(0);
                n.this.f16262d = motionEvent.getX();
                n.this.f16263e = motionEvent.getY();
                n.this.A();
                n nVar = n.this;
                if (nVar.f16261c == null && (s10 = nVar.s(motionEvent)) != null) {
                    n nVar2 = n.this;
                    nVar2.f16262d -= s10.f16308j;
                    nVar2.f16263e -= s10.f16309k;
                    nVar2.r(s10.f16303e, true);
                    if (n.this.f16259a.remove(s10.f16303e.itemView)) {
                        n nVar3 = n.this;
                        nVar3.f16271m.c(nVar3.f16276r, s10.f16303e);
                    }
                    n.this.F(s10.f16303e, s10.f16304f);
                    n nVar4 = n.this;
                    nVar4.L(motionEvent, nVar4.f16273o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i10 = n.this.f16270l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    n.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                n nVar5 = n.this;
                nVar5.f16270l = -1;
                nVar5.F(null, 0);
            }
            VelocityTracker velocityTracker = n.this.f16278t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return n.this.f16261c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
            if (z10) {
                n.this.F(null, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends h {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f16287o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f16288p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.e0 e0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.e0 e0Var2) {
            super(e0Var, i10, i11, f10, f11, f12, f13);
            this.f16287o = i12;
            this.f16288p = e0Var2;
        }

        @Override // androidx.recyclerview.widget.n.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f16310l) {
                return;
            }
            if (this.f16287o <= 0) {
                n nVar = n.this;
                nVar.f16271m.c(nVar.f16276r, this.f16288p);
            } else {
                n.this.f16259a.add(this.f16288p.itemView);
                this.f16307i = true;
                int i10 = this.f16287o;
                if (i10 > 0) {
                    n.this.B(this, i10);
                }
            }
            n nVar2 = n.this;
            View view = nVar2.f16282x;
            View view2 = this.f16288p.itemView;
            if (view == view2) {
                nVar2.D(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f16290w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f16291x;

        public d(h hVar, int i10) {
            this.f16290w = hVar;
            this.f16291x = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = n.this.f16276r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f16290w;
            if (hVar.f16310l || hVar.f16303e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = n.this.f16276r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !n.this.x()) {
                n.this.f16271m.B(this.f16290w.f16303e, this.f16291x);
            } else {
                n.this.f16276r.post(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements RecyclerView.k {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i10, int i11) {
            n nVar = n.this;
            View view = nVar.f16282x;
            if (view == null) {
                return i11;
            }
            int i12 = nVar.f16283y;
            if (i12 == -1) {
                i12 = nVar.f16276r.indexOfChild(view);
                n.this.f16283y = i12;
            }
            return i11 == i10 + (-1) ? i12 : i11 < i12 ? i11 : i11 + 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Interpolator f16294b = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final Interpolator f16295c = new b();

        /* renamed from: a  reason: collision with root package name */
        public int f16296a = -1;

        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int e(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        public static int s(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int t(int i10, int i11) {
            int s10 = s(0, i11 | i10);
            return s(2, i10) | s(1, i11) | s10;
        }

        public void A(RecyclerView.e0 e0Var, int i10) {
            if (e0Var != null) {
                p.f16316a.b(e0Var.itemView);
            }
        }

        public abstract void B(RecyclerView.e0 e0Var, int i10);

        public boolean a(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            return true;
        }

        public RecyclerView.e0 b(RecyclerView.e0 e0Var, List<RecyclerView.e0> list, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i10 + e0Var.itemView.getWidth();
            int height = i11 + e0Var.itemView.getHeight();
            int left2 = i10 - e0Var.itemView.getLeft();
            int top2 = i11 - e0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.e0 e0Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.e0 e0Var3 = list.get(i13);
                if (left2 > 0 && (right = e0Var3.itemView.getRight() - width) < 0 && e0Var3.itemView.getRight() > e0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = e0Var3.itemView.getLeft() - i10) > 0 && e0Var3.itemView.getLeft() < e0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = e0Var3.itemView.getTop() - i11) > 0 && e0Var3.itemView.getTop() < e0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = e0Var3.itemView.getBottom() - height) < 0 && e0Var3.itemView.getBottom() > e0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = abs;
                }
            }
            return e0Var2;
        }

        public void c(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            p.f16316a.a(e0Var.itemView);
        }

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return d(k(recyclerView, e0Var), o3.c0.E(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 250L;
            } else if (i10 == 8) {
                return itemAnimator.n();
            } else {
                return itemAnimator.o();
            }
        }

        public int h() {
            return 0;
        }

        public final int i(RecyclerView recyclerView) {
            if (this.f16296a == -1) {
                this.f16296a = recyclerView.getResources().getDimensionPixelSize(u4.b.f54365d);
            }
            return this.f16296a;
        }

        public float j(RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.e0 e0Var);

        public float l(float f10) {
            return f10;
        }

        public float m(RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public float n(float f10) {
            return f10;
        }

        public boolean o(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (f(recyclerView, e0Var) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int signum = (int) (((int) (((int) Math.signum(i11)) * i(recyclerView) * f16295c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)))) * f16294b.getInterpolation(j10 <= SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS ? ((float) j10) / 2000.0f : 1.0f));
            return signum == 0 ? i11 > 0 ? 1 : -1 : signum;
        }

        public boolean q() {
            return true;
        }

        public boolean r() {
            return true;
        }

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f10, float f11, int i10, boolean z10) {
            p.f16316a.c(canvas, recyclerView, e0Var.itemView, f10, f11, i10, z10);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f10, float f11, int i10, boolean z10) {
            p.f16316a.d(canvas, recyclerView, e0Var.itemView, f10, f11, i10, z10);
        }

        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                hVar.e();
                int save = canvas.save();
                u(canvas, recyclerView, hVar.f16303e, hVar.f16308j, hVar.f16309k, hVar.f16304f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                u(canvas, recyclerView, e0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                int save = canvas.save();
                v(canvas, recyclerView, hVar.f16303e, hVar.f16308j, hVar.f16309k, hVar.f16304f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                v(canvas, recyclerView, e0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                h hVar2 = list.get(i12);
                boolean z11 = hVar2.f16311m;
                if (z11 && !hVar2.f16307i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2);

        public void z(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i10, RecyclerView.e0 e0Var2, int i11, int i12, int i13) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).c(e0Var.itemView, e0Var2.itemView, i12, i13);
                return;
            }
            if (layoutManager.v()) {
                if (layoutManager.b0(e0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.p1(i11);
                }
                if (layoutManager.e0(e0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.p1(i11);
                }
            }
            if (layoutManager.w()) {
                if (layoutManager.f0(e0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.p1(i11);
                }
                if (layoutManager.Z(e0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.p1(i11);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: w  reason: collision with root package name */
        public boolean f16297w = true;

        public g() {
        }

        public void a() {
            this.f16297w = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t10;
            RecyclerView.e0 h02;
            if (!this.f16297w || (t10 = n.this.t(motionEvent)) == null || (h02 = n.this.f16276r.h0(t10)) == null) {
                return;
            }
            n nVar = n.this;
            if (nVar.f16271m.o(nVar.f16276r, h02)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = n.this.f16270l;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    n nVar2 = n.this;
                    nVar2.f16262d = x10;
                    nVar2.f16263e = y10;
                    nVar2.f16267i = 0.0f;
                    nVar2.f16266h = 0.0f;
                    if (nVar2.f16271m.r()) {
                        n.this.F(h02, 2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f16299a;

        /* renamed from: b  reason: collision with root package name */
        public final float f16300b;

        /* renamed from: c  reason: collision with root package name */
        public final float f16301c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16302d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.e0 f16303e;

        /* renamed from: f  reason: collision with root package name */
        public final int f16304f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f16305g;

        /* renamed from: h  reason: collision with root package name */
        public final int f16306h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16307i;

        /* renamed from: j  reason: collision with root package name */
        public float f16308j;

        /* renamed from: k  reason: collision with root package name */
        public float f16309k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16310l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f16311m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f16312n;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.e0 e0Var, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f16304f = i11;
            this.f16306h = i10;
            this.f16303e = e0Var;
            this.f16299a = f10;
            this.f16300b = f11;
            this.f16301c = f12;
            this.f16302d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f16305g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(e0Var.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f16305g.cancel();
        }

        public void b(long j10) {
            this.f16305g.setDuration(j10);
        }

        public void c(float f10) {
            this.f16312n = f10;
        }

        public void d() {
            this.f16303e.setIsRecyclable(false);
            this.f16305g.start();
        }

        public void e() {
            float f10 = this.f16299a;
            float f11 = this.f16301c;
            if (f10 == f11) {
                this.f16308j = this.f16303e.itemView.getTranslationX();
            } else {
                this.f16308j = f10 + (this.f16312n * (f11 - f10));
            }
            float f12 = this.f16300b;
            float f13 = this.f16302d;
            if (f12 == f13) {
                this.f16309k = this.f16303e.itemView.getTranslationY();
            } else {
                this.f16309k = f12 + (this.f16312n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f16311m) {
                this.f16303e.setIsRecyclable(true);
            }
            this.f16311m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i extends f {

        /* renamed from: d  reason: collision with root package name */
        public int f16314d;

        /* renamed from: e  reason: collision with root package name */
        public int f16315e;

        public i(int i10, int i11) {
            this.f16314d = i11;
            this.f16315e = i10;
        }

        public int C(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return this.f16315e;
        }

        public int D(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return this.f16314d;
        }

        @Override // androidx.recyclerview.widget.n.f
        public int k(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return f.t(C(recyclerView, e0Var), D(recyclerView, e0Var));
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void c(View view, View view2, int i10, int i11);
    }

    public n(f fVar) {
        this.f16271m = fVar;
    }

    public static boolean y(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    public void A() {
        VelocityTracker velocityTracker = this.f16278t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f16278t = VelocityTracker.obtain();
    }

    public void B(h hVar, int i10) {
        this.f16276r.post(new d(hVar, i10));
    }

    public final void C() {
        VelocityTracker velocityTracker = this.f16278t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16278t = null;
        }
    }

    public void D(View view) {
        if (view == this.f16282x) {
            this.f16282x = null;
            if (this.f16281w != null) {
                this.f16276r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean E() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(androidx.recyclerview.widget.RecyclerView.e0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public final void G() {
        this.f16275q = ViewConfiguration.get(this.f16276r.getContext()).getScaledTouchSlop();
        this.f16276r.g(this);
        this.f16276r.j(this.B);
        this.f16276r.i(this);
        I();
    }

    public void H(RecyclerView.e0 e0Var) {
        if (!this.f16271m.o(this.f16276r, e0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (e0Var.itemView.getParent() != this.f16276r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            A();
            this.f16267i = 0.0f;
            this.f16266h = 0.0f;
            F(e0Var, 2);
        }
    }

    public final void I() {
        this.A = new g();
        this.f16284z = new o3.e(this.f16276r.getContext(), this.A);
    }

    public final void J() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f16284z != null) {
            this.f16284z = null;
        }
    }

    public final int K(RecyclerView.e0 e0Var) {
        if (this.f16272n == 2) {
            return 0;
        }
        int k10 = this.f16271m.k(this.f16276r, e0Var);
        int d10 = (this.f16271m.d(k10, o3.c0.E(this.f16276r)) & 65280) >> 8;
        if (d10 == 0) {
            return 0;
        }
        int i10 = (k10 & 65280) >> 8;
        if (Math.abs(this.f16266h) > Math.abs(this.f16267i)) {
            int n10 = n(e0Var, d10);
            if (n10 > 0) {
                return (i10 & n10) == 0 ? f.e(n10, o3.c0.E(this.f16276r)) : n10;
            }
            int p10 = p(e0Var, d10);
            if (p10 > 0) {
                return p10;
            }
        } else {
            int p11 = p(e0Var, d10);
            if (p11 > 0) {
                return p11;
            }
            int n11 = n(e0Var, d10);
            if (n11 > 0) {
                return (i10 & n11) == 0 ? f.e(n11, o3.c0.E(this.f16276r)) : n11;
            }
        }
        return 0;
    }

    public void L(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f16262d;
        this.f16266h = f10;
        this.f16267i = y10 - this.f16263e;
        if ((i10 & 4) == 0) {
            this.f16266h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f16266h = Math.min(0.0f, this.f16266h);
        }
        if ((i10 & 1) == 0) {
            this.f16267i = Math.max(0.0f, this.f16267i);
        }
        if ((i10 & 2) == 0) {
            this.f16267i = Math.min(0.0f, this.f16267i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        D(view);
        RecyclerView.e0 h02 = this.f16276r.h0(view);
        if (h02 == null) {
            return;
        }
        RecyclerView.e0 e0Var = this.f16261c;
        if (e0Var != null && h02 == e0Var) {
            F(null, 0);
            return;
        }
        r(h02, false);
        if (this.f16259a.remove(h02.itemView)) {
            this.f16271m.c(this.f16276r, h02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f10;
        float f11;
        this.f16283y = -1;
        if (this.f16261c != null) {
            w(this.f16260b);
            float[] fArr = this.f16260b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f16271m.w(canvas, recyclerView, this.f16261c, this.f16274p, this.f16272n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f10;
        float f11;
        if (this.f16261c != null) {
            w(this.f16260b);
            float[] fArr = this.f16260b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f16271m.x(canvas, recyclerView, this.f16261c, this.f16274p, this.f16272n, f10, f11);
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.f16281w == null) {
            this.f16281w = new e();
        }
        this.f16276r.setChildDrawingOrderCallback(this.f16281w);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f16276r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.f16276r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f16264f = resources.getDimension(u4.b.f54367f);
            this.f16265g = resources.getDimension(u4.b.f54366e);
            G();
        }
    }

    public final int n(RecyclerView.e0 e0Var, int i10) {
        if ((i10 & 12) != 0) {
            int i11 = this.f16266h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f16278t;
            if (velocityTracker != null && this.f16270l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f16271m.n(this.f16265g));
                float xVelocity = this.f16278t.getXVelocity(this.f16270l);
                float yVelocity = this.f16278t.getYVelocity(this.f16270l);
                int i12 = xVelocity <= 0.0f ? 4 : 8;
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= this.f16271m.l(this.f16264f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float width = this.f16276r.getWidth() * this.f16271m.m(e0Var);
            if ((i10 & i11) == 0 || Math.abs(this.f16266h) <= width) {
                return 0;
            }
            return i11;
        }
        return 0;
    }

    public void o(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.e0 v10;
        int f10;
        if (this.f16261c != null || i10 != 2 || this.f16272n == 2 || !this.f16271m.q() || this.f16276r.getScrollState() == 1 || (v10 = v(motionEvent)) == null || (f10 = (this.f16271m.f(this.f16276r, v10) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f11 = x10 - this.f16262d;
        float f12 = y10 - this.f16263e;
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        int i12 = this.f16275q;
        if (abs >= i12 || abs2 >= i12) {
            if (abs > abs2) {
                if (f11 < 0.0f && (f10 & 4) == 0) {
                    return;
                }
                if (f11 > 0.0f && (f10 & 8) == 0) {
                    return;
                }
            } else if (f12 < 0.0f && (f10 & 1) == 0) {
                return;
            } else {
                if (f12 > 0.0f && (f10 & 2) == 0) {
                    return;
                }
            }
            this.f16267i = 0.0f;
            this.f16266h = 0.0f;
            this.f16270l = motionEvent.getPointerId(0);
            F(v10, 1);
        }
    }

    public final int p(RecyclerView.e0 e0Var, int i10) {
        if ((i10 & 3) != 0) {
            int i11 = this.f16267i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f16278t;
            if (velocityTracker != null && this.f16270l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f16271m.n(this.f16265g));
                float xVelocity = this.f16278t.getXVelocity(this.f16270l);
                float yVelocity = this.f16278t.getYVelocity(this.f16270l);
                int i12 = yVelocity <= 0.0f ? 1 : 2;
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= this.f16271m.l(this.f16264f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float height = this.f16276r.getHeight() * this.f16271m.m(e0Var);
            if ((i10 & i11) == 0 || Math.abs(this.f16267i) <= height) {
                return 0;
            }
            return i11;
        }
        return 0;
    }

    public final void q() {
        this.f16276r.c1(this);
        this.f16276r.f1(this.B);
        this.f16276r.e1(this);
        for (int size = this.f16274p.size() - 1; size >= 0; size--) {
            h hVar = this.f16274p.get(0);
            hVar.a();
            this.f16271m.c(this.f16276r, hVar.f16303e);
        }
        this.f16274p.clear();
        this.f16282x = null;
        this.f16283y = -1;
        C();
        J();
    }

    public void r(RecyclerView.e0 e0Var, boolean z10) {
        for (int size = this.f16274p.size() - 1; size >= 0; size--) {
            h hVar = this.f16274p.get(size);
            if (hVar.f16303e == e0Var) {
                hVar.f16310l |= z10;
                if (!hVar.f16311m) {
                    hVar.a();
                }
                this.f16274p.remove(size);
                return;
            }
        }
    }

    public h s(MotionEvent motionEvent) {
        if (this.f16274p.isEmpty()) {
            return null;
        }
        View t10 = t(motionEvent);
        for (int size = this.f16274p.size() - 1; size >= 0; size--) {
            h hVar = this.f16274p.get(size);
            if (hVar.f16303e.itemView == t10) {
                return hVar;
            }
        }
        return null;
    }

    public View t(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.e0 e0Var = this.f16261c;
        if (e0Var != null) {
            View view = e0Var.itemView;
            if (y(view, x10, y10, this.f16268j + this.f16266h, this.f16269k + this.f16267i)) {
                return view;
            }
        }
        for (int size = this.f16274p.size() - 1; size >= 0; size--) {
            h hVar = this.f16274p.get(size);
            View view2 = hVar.f16303e.itemView;
            if (y(view2, x10, y10, hVar.f16308j, hVar.f16309k)) {
                return view2;
            }
        }
        return this.f16276r.S(x10, y10);
    }

    public final List<RecyclerView.e0> u(RecyclerView.e0 e0Var) {
        RecyclerView.e0 e0Var2 = e0Var;
        List<RecyclerView.e0> list = this.f16279u;
        if (list == null) {
            this.f16279u = new ArrayList();
            this.f16280v = new ArrayList();
        } else {
            list.clear();
            this.f16280v.clear();
        }
        int h10 = this.f16271m.h();
        int round = Math.round(this.f16268j + this.f16266h) - h10;
        int round2 = Math.round(this.f16269k + this.f16267i) - h10;
        int i10 = h10 * 2;
        int width = e0Var2.itemView.getWidth() + round + i10;
        int height = e0Var2.itemView.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.f16276r.getLayoutManager();
        int U = layoutManager.U();
        int i13 = 0;
        while (i13 < U) {
            View T = layoutManager.T(i13);
            if (T != e0Var2.itemView && T.getBottom() >= round2 && T.getTop() <= height && T.getRight() >= round && T.getLeft() <= width) {
                RecyclerView.e0 h02 = this.f16276r.h0(T);
                if (this.f16271m.a(this.f16276r, this.f16261c, h02)) {
                    int abs = Math.abs(i11 - ((T.getLeft() + T.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((T.getTop() + T.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f16279u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.f16280v.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.f16279u.add(i15, h02);
                    this.f16280v.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            e0Var2 = e0Var;
        }
        return this.f16279u;
    }

    public final RecyclerView.e0 v(MotionEvent motionEvent) {
        View t10;
        RecyclerView.p layoutManager = this.f16276r.getLayoutManager();
        int i10 = this.f16270l;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f16262d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f16263e);
        int i11 = this.f16275q;
        if (abs >= i11 || abs2 >= i11) {
            if (abs <= abs2 || !layoutManager.v()) {
                if ((abs2 <= abs || !layoutManager.w()) && (t10 = t(motionEvent)) != null) {
                    return this.f16276r.h0(t10);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void w(float[] fArr) {
        if ((this.f16273o & 12) != 0) {
            fArr[0] = (this.f16268j + this.f16266h) - this.f16261c.itemView.getLeft();
        } else {
            fArr[0] = this.f16261c.itemView.getTranslationX();
        }
        if ((this.f16273o & 3) != 0) {
            fArr[1] = (this.f16269k + this.f16267i) - this.f16261c.itemView.getTop();
        } else {
            fArr[1] = this.f16261c.itemView.getTranslationY();
        }
    }

    public boolean x() {
        int size = this.f16274p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f16274p.get(i10).f16311m) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView.e0 e0Var) {
        if (!this.f16276r.isLayoutRequested() && this.f16272n == 2) {
            float j10 = this.f16271m.j(e0Var);
            int i10 = (int) (this.f16268j + this.f16266h);
            int i11 = (int) (this.f16269k + this.f16267i);
            if (Math.abs(i11 - e0Var.itemView.getTop()) >= e0Var.itemView.getHeight() * j10 || Math.abs(i10 - e0Var.itemView.getLeft()) >= e0Var.itemView.getWidth() * j10) {
                List<RecyclerView.e0> u10 = u(e0Var);
                if (u10.size() == 0) {
                    return;
                }
                RecyclerView.e0 b10 = this.f16271m.b(e0Var, u10, i10, i11);
                if (b10 == null) {
                    this.f16279u.clear();
                    this.f16280v.clear();
                    return;
                }
                int absoluteAdapterPosition = b10.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = e0Var.getAbsoluteAdapterPosition();
                if (this.f16271m.y(this.f16276r, e0Var, b10)) {
                    this.f16271m.z(this.f16276r, e0Var, absoluteAdapterPosition2, b10, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }
}
