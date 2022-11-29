package of;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import sf.i;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f45400a = new h();

    /* loaded from: classes3.dex */
    public static final class a implements sf.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f45401a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f45402b;

        public a(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
            this.f45401a = lottieAnimationView;
            this.f45402b = lottieAnimationView2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f45401a.setVisibility(8);
            this.f45402b.setVisibility(0);
            this.f45402b.r();
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
        lottieAnimationView.setAnimation("ebd_invitation_op/ebd_invitation_op.json");
        lottieAnimationView.setImageAssetsFolder("ebd_invitation_op/images");
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.setAnimation("ebd_invitation_loop/ebd_invitation_loop.json");
        lottieAnimationView2.setImageAssetsFolder("ebd_invitation_loop/images");
        lottieAnimationView.e(new a(lottieAnimationView, lottieAnimationView2));
        lottieAnimationView.r();
    }
}
