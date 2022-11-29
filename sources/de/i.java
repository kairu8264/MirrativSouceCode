package de;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import sf.i;
import wn.l;
import wn.v;

/* loaded from: classes2.dex */
public final class i {

    /* loaded from: classes2.dex */
    public static final class a implements sf.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ao.d<v> f29602a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ao.d<? super v> dVar) {
            this.f29602a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.a.b(this, animator);
            ao.d<v> dVar = this.f29602a;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(v.f59242a));
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

    public static final Object a(LottieAnimationView lottieAnimationView, ao.d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        lottieAnimationView.e(new a(iVar));
        lottieAnimationView.r();
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }
}
