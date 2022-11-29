package yd;

import ae.ma;
import android.animation.Animator;
import com.dena.mirrorman.customview.GiftGachaDuplicatedPointGaugeView;
import sf.i;

/* loaded from: classes2.dex */
public final class p implements sf.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GiftGachaDuplicatedPointGaugeView f61777a;

    public p(GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView) {
        this.f61777a = giftGachaDuplicatedPointGaugeView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        i.a.a(this, animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ma maVar;
        ma maVar2;
        maVar = this.f61777a.f25365x;
        maVar.C.setVisibility(0);
        maVar2 = this.f61777a.f25365x;
        maVar2.E.setVisibility(8);
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
