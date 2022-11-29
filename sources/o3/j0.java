package o3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f43961a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f43962b = null;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f43963c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f43964d = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k0 f43965a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f43966b;

        public a(k0 k0Var, View view) {
            this.f43965a = k0Var;
            this.f43966b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f43965a.onAnimationCancel(this.f43966b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f43965a.onAnimationEnd(this.f43966b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f43965a.onAnimationStart(this.f43966b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m0 f43968a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f43969b;

        public b(m0 m0Var, View view) {
            this.f43968a = m0Var;
            this.f43969b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f43968a.a(this.f43969b);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements k0 {

        /* renamed from: a  reason: collision with root package name */
        public j0 f43971a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f43972b;

        public c(j0 j0Var) {
            this.f43971a = j0Var;
        }

        @Override // o3.k0
        public void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            k0 k0Var = tag instanceof k0 ? (k0) tag : null;
            if (k0Var != null) {
                k0Var.onAnimationCancel(view);
            }
        }

        @Override // o3.k0
        @SuppressLint({"WrongConstant"})
        public void onAnimationEnd(View view) {
            int i10 = this.f43971a.f43964d;
            if (i10 > -1) {
                view.setLayerType(i10, null);
                this.f43971a.f43964d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f43972b) {
                j0 j0Var = this.f43971a;
                Runnable runnable = j0Var.f43963c;
                if (runnable != null) {
                    j0Var.f43963c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                k0 k0Var = tag instanceof k0 ? (k0) tag : null;
                if (k0Var != null) {
                    k0Var.onAnimationEnd(view);
                }
                this.f43972b = true;
            }
        }

        @Override // o3.k0
        public void onAnimationStart(View view) {
            this.f43972b = false;
            if (this.f43971a.f43964d > -1) {
                view.setLayerType(2, null);
            }
            j0 j0Var = this.f43971a;
            Runnable runnable = j0Var.f43962b;
            if (runnable != null) {
                j0Var.f43962b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            k0 k0Var = tag instanceof k0 ? (k0) tag : null;
            if (k0Var != null) {
                k0Var.onAnimationStart(view);
            }
        }
    }

    public j0(View view) {
        this.f43961a = new WeakReference<>(view);
    }

    public j0 a(float f10) {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void b() {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f43961a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public j0 d(long j10) {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public j0 e(Interpolator interpolator) {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public j0 f(k0 k0Var) {
        View view = this.f43961a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, k0Var);
            } else {
                view.setTag(2113929216, k0Var);
                g(view, new c(this));
            }
        }
        return this;
    }

    public final void g(View view, k0 k0Var) {
        if (k0Var != null) {
            view.animate().setListener(new a(k0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public j0 h(long j10) {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public j0 i(m0 m0Var) {
        View view = this.f43961a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(m0Var != null ? new b(m0Var, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public j0 k(float f10) {
        View view = this.f43961a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
