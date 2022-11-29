package rb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import hb.a2;
import hb.x1;
import hb.z1;
import jo.h;
import jo.p;
import nd.k0;

/* loaded from: classes2.dex */
public final class a extends RelativeLayout {

    /* renamed from: w  reason: collision with root package name */
    public Context f50682w;

    /* renamed from: x  reason: collision with root package name */
    public ViewGroup f50683x;

    /* renamed from: y  reason: collision with root package name */
    public float f50684y;

    /* renamed from: z  reason: collision with root package name */
    public static final C0774a f50681z = new C0774a(null);
    public static final int A = 8;

    /* renamed from: rb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0774a {
        public C0774a() {
        }

        public /* synthetic */ C0774a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout.LayoutParams f50685a;

        /* renamed from: b  reason: collision with root package name */
        public int f50686b;

        /* renamed from: c  reason: collision with root package name */
        public int f50687c;

        /* renamed from: d  reason: collision with root package name */
        public float f50688d;

        /* renamed from: e  reason: collision with root package name */
        public float f50689e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f50690f;

        /* renamed from: g  reason: collision with root package name */
        public float f50691g;

        /* renamed from: h  reason: collision with root package name */
        public float f50692h;

        /* renamed from: i  reason: collision with root package name */
        public float f50693i = 1.0f;

        public b() {
        }

        public final b a(int i10) {
            RelativeLayout.LayoutParams layoutParams = this.f50685a;
            p.e(layoutParams);
            layoutParams.addRule(i10);
            return this;
        }

        public final b b(float f10) {
            this.f50693i = f10;
            return this;
        }

        public final b c(int i10) {
            this.f50687c = i10;
            return this;
        }

        public final ImageView d() {
            ImageView imageView = new ImageView(a.this.f50682w);
            int i10 = this.f50686b;
            if (i10 != 0) {
                imageView.setImageResource(i10);
            }
            int i11 = this.f50687c;
            if (i11 != 0) {
                imageView.setBackgroundResource(i11);
            }
            ViewGroup viewGroup = a.this.f50683x;
            p.e(viewGroup);
            viewGroup.addView(imageView, this.f50685a);
            imageView.setTranslationX(this.f50688d);
            imageView.setTranslationY(this.f50689e);
            if (this.f50690f) {
                imageView.setScaleX(this.f50691g);
                imageView.setScaleY(this.f50692h);
            }
            imageView.setAlpha(this.f50693i);
            return imageView;
        }

        public final b e(int i10) {
            RelativeLayout.LayoutParams layoutParams = this.f50685a;
            p.e(layoutParams);
            layoutParams.leftMargin = i10;
            return this;
        }

        public final b f(int i10) {
            this.f50686b = i10;
            return this;
        }

        public final b g(int i10) {
            RelativeLayout.LayoutParams layoutParams = this.f50685a;
            p.e(layoutParams);
            layoutParams.rightMargin = i10;
            return this;
        }

        public final b h(float f10, float f11) {
            this.f50690f = true;
            this.f50691g = f10;
            this.f50692h = f11;
            return this;
        }

        public final b i(int i10, int i11) {
            this.f50685a = new RelativeLayout.LayoutParams(i10, i11);
            return this;
        }

        public final b j(int i10) {
            RelativeLayout.LayoutParams layoutParams = this.f50685a;
            p.e(layoutParams);
            layoutParams.topMargin = i10;
            return this;
        }

        public final b k(float f10) {
            this.f50688d = f10;
            return this;
        }

        public final b l(float f10) {
            this.f50689e = f10;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
            animator.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        p.h(context, "context");
        f(context);
    }

    private final void setInfinitLoopOfAnim(Animator animator) {
        animator.addListener(new c());
    }

    public final ObjectAnimator c(View view, double d10) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f).setDuration(100L);
        p.g(duration, "ofFloat(view, \"alpha\", 1.0f).setDuration(100)");
        duration.setStartDelay((long) d10);
        duration.start();
        return duration;
    }

    @SuppressLint({"Recycle"})
    public final AnimatorSet d(View view, float f10, float f11, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        long j10 = i10;
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, "translationY", f10).setDuration(j10), ObjectAnimator.ofFloat(view, "translationY", f11).setDuration(j10));
        setInfinitLoopOfAnim(animatorSet);
        return animatorSet;
    }

    public final int e(int i10) {
        return (int) ((i10 * this.f50684y) + 0.5d);
    }

    public final void f(Context context) {
        this.f50682w = context;
        View inflate = LayoutInflater.from(context).inflate(x1.view_quiz_congrats_container, this);
        p.f(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f50683x = (ViewGroup) inflate;
        Context context2 = this.f50682w;
        p.e(context2);
        this.f50684y = context2.getResources().getDisplayMetrics().density;
    }

    @SuppressLint({"Recycle"})
    public final void g(int i10, int i11) {
        View d10 = new b().i(-2, -2).a(12).a(14).l(e(190)).c(z1.img_q_perfect).b(0.0f).d();
        View d11 = new b().i(-2, -2).a(10).a(14).c(z1.img_q_confetti).b(0.0f).d();
        b i12 = new b().i(e(100), e(100));
        int i13 = z1.img_q_balloon;
        View d12 = i12.f(i13).a(10).a(9).j(e(170)).e(e(60)).b(0.0f).d();
        View d13 = new b().i(e(100), e(100)).f(i13).a(10).a(11).j(e(160)).g(e(45)).b(0.0f).d();
        View d14 = new b().i(e(60), e(60)).f(i13).a(10).a(9).j(e(90)).e(e(20)).b(0.0f).d();
        View d15 = new b().i(e(60), e(60)).f(i13).a(10).a(11).j(e(95)).g(e(90)).b(0.0f).d();
        View d16 = new b().i(e(60), e(60)).f(i13).a(10).a(9).j(e(60)).e(e(120)).b(0.0f).d();
        View d17 = new b().i(e(30), e(30)).f(i13).a(10).a(9).j(e(30)).e(e(120)).b(0.0f).d();
        View d18 = new b().i(e(30), e(30)).f(i13).a(10).a(11).j(e(20)).g(e(80)).b(0.0f).d();
        ImageView d19 = new b().i(e(i10), e(i10)).a(10).a(9).f(i13).h(3.0f, 3.0f).k(i10 * 1.5f).l(i11 * 1.5f).d();
        ObjectAnimator c10 = c(d11, 750.0d);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ObjectAnimator.ofFloat(d11, "alpha", 0.2f).setDuration(800L), ObjectAnimator.ofFloat(d11, "alpha", 1.0f).setDuration(800L));
        setInfinitLoopOfAnim(animatorSet);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(c10, animatorSet);
        animatorSet2.start();
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(d19, "translationX", (-i10) * 1.5f).setDuration(1500L), ObjectAnimator.ofFloat(d19, "translationY", (-i11) * 1.5f).setDuration(1500L));
        animatorSet3.start();
        c(d10, 600.0d);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d10, "translationY", e(0));
        ofFloat.setDuration(800L);
        ofFloat.start();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setStartDelay(1200L);
        animatorSet5.playSequentially(ObjectAnimator.ofFloat(d10, "translationY", -e(5)).setDuration(100L), ObjectAnimator.ofFloat(d10, "translationY", -e(0)).setDuration(100L), ObjectAnimator.ofFloat(d10, "translationY", -e(5)).setDuration(100L), ObjectAnimator.ofFloat(d10, "translationY", -e(0)).setDuration(100L));
        setInfinitLoopOfAnim(animatorSet5);
        animatorSet4.playSequentially(ofFloat, animatorSet5);
        animatorSet4.start();
        c(d12, 750.0d);
        c(d13, 600.0d);
        c(d14, 750.0d);
        c(d15, 600.0d);
        c(d16, 750.0d);
        c(d17, 750.0d);
        c(d18, 600.0d);
        d(d12, e(20), e(0), 2070).start();
        d(d13, e(18), e(0), 1590).start();
        d(d14, e(7), e(0), 1890).start();
        d(d15, e(8), e(0), 1790).start();
        d(d16, e(9), e(0), 1510).start();
        d(d17, e(4), e(0), 1950).start();
        d(d18, e(4), e(0), 1810).start();
        dq.c.c().l(new k0(a2.quiz_congrats_show, false));
    }
}
