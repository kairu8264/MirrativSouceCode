package of;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import sf.i;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f45395a = new g();

    /* loaded from: classes3.dex */
    public static final class a implements sf.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f45396a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f45397b;

        public a(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
            this.f45396a = lottieAnimationView;
            this.f45397b = lottieAnimationView2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f45396a.setVisibility(8);
            this.f45397b.setVisibility(0);
            this.f45397b.r();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements sf.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f45398a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f45399b;

        public b(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
            this.f45398a = lottieAnimationView;
            this.f45399b = lottieAnimationView2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f45398a.setVisibility(8);
            this.f45399b.setVisibility(0);
            this.f45399b.r();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    public final void a(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        jo.p.h(lottieAnimationView, "firstLottieAnimationView");
        jo.p.h(lottieAnimationView2, "loopLottieAnimationView");
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setAnimation("invited_collab_call/invited_collab_call.json");
        lottieAnimationView.setImageAssetsFolder("invited_collab_call/images");
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.setAnimation("invited_collab_call_loop/invited_collab_call_loop.json");
        lottieAnimationView2.setImageAssetsFolder("invited_collab_call_loop/images");
        lottieAnimationView.e(new a(lottieAnimationView, lottieAnimationView2));
        lottieAnimationView.r();
    }

    public final void b(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        jo.p.h(lottieAnimationView, "firstLottieAnimationView");
        jo.p.h(lottieAnimationView2, "loopLottieAnimationView");
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setAnimation("invited_collab_live/invited_collab_live.json");
        lottieAnimationView.setImageAssetsFolder("invited_collab_live/images");
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.setAnimation("invited_collab_live_loop/invited_collab_live_loop.json");
        lottieAnimationView2.setImageAssetsFolder("invited_collab_live_loop/images");
        lottieAnimationView.e(new b(lottieAnimationView, lottieAnimationView2));
        lottieAnimationView.r();
    }
}
