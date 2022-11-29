package yd;

import ae.ma;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import com.dena.mirrorman.customview.GiftGachaDuplicatedPointGaugeView;
import ia.a;

/* loaded from: classes2.dex */
public final class o extends jo.q implements io.a<wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GiftGachaDuplicatedPointGaugeView f61769w;

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GiftGachaDuplicatedPointGaugeView f61770a;

        public a(GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView) {
            this.f61770a = giftGachaDuplicatedPointGaugeView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ma maVar;
            a.C0469a.a(this, animation);
            maVar = this.f61770a.f25365x;
            maVar.F.setAlpha(0.0f);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    @co.f(c = "com.dena.mirrorman.customview.GiftGachaDuplicatedPointGaugeView$1$2", f = "GiftGachaDuplicatedPointGaugeView.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61771w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftGachaDuplicatedPointGaugeView f61772x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f61772x = giftGachaDuplicatedPointGaugeView;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f61772x, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            ma maVar;
            ma maVar2;
            Object c10 = bo.c.c();
            int i10 = this.f61771w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f61771w = 1;
                if (uo.b1.a(2100L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            int[] iArr = new int[2];
            maVar = this.f61772x.f25365x;
            maVar.E.getLocationInWindow(iArr);
            Context context = this.f61772x.getContext();
            jo.p.g(context, "context");
            float d10 = iArr[1] - of.e.d(context);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.setFillAfter(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -iArr[0], 0.0f, 0.0f);
            translateAnimation.setInterpolator(new LinearInterpolator());
            translateAnimation.setDuration(400L);
            animationSet.addAnimation(translateAnimation);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -d10);
            translateAnimation2.setInterpolator(new DecelerateInterpolator());
            translateAnimation2.setDuration(400L);
            animationSet.addAnimation(translateAnimation2);
            maVar2 = this.f61772x.f25365x;
            maVar2.E.startAnimation(animationSet);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView) {
        super(0);
        this.f61769w = giftGachaDuplicatedPointGaugeView;
    }

    public final void a() {
        ma maVar;
        ma maVar2;
        ma maVar3;
        ma maVar4;
        ma maVar5;
        maVar = this.f61769w.f25365x;
        maVar.F.setAlpha(1.0f);
        maVar2 = this.f61769w.f25365x;
        View view = maVar2.F;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView = this.f61769w;
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setStartOffset(233L);
        alphaAnimation.setDuration(501L);
        alphaAnimation.setAnimationListener(new a(giftGachaDuplicatedPointGaugeView));
        view.startAnimation(alphaAnimation);
        maVar3 = this.f61769w.f25365x;
        maVar3.C.setVisibility(4);
        maVar4 = this.f61769w.f25365x;
        maVar4.E.setVisibility(0);
        GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView2 = this.f61769w;
        uo.l.d(giftGachaDuplicatedPointGaugeView2, null, null, new b(giftGachaDuplicatedPointGaugeView2, null), 3, null);
        maVar5 = this.f61769w.f25365x;
        maVar5.E.r();
    }

    @Override // io.a
    public /* bridge */ /* synthetic */ wn.v invoke() {
        a();
        return wn.v.f59242a;
    }
}
