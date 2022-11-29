package com.dena.mirrorman.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import com.dena.mirrativ.customview.StrokeDecorationTextView;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import de.g;
import de.n;
import ia.a;
import java.util.NoSuchElementException;
import jo.p;
import td.b;

/* loaded from: classes2.dex */
public final class GiftPointView extends StrokeDecorationTextView {

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            GiftPointView.this.setVisibility(8);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPointView(Context context) {
        super(context);
        p.h(context, "context");
    }

    public final void f(GiftItem giftItem) {
        p.h(giftItem, "giftItem");
        setGiftItem(giftItem);
        setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, n.b(this, 30), 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(1700L);
        translateAnimation.setStartOffset(200L);
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(120L);
        alphaAnimation.setStartOffset(1780L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new a());
        startAnimation(animationSet);
    }

    public final void setGiftItem(GiftItem giftItem) {
        p.h(giftItem, "giftItem");
        if (giftItem.getPoint() > 0 && p.c(giftItem.isLastSent(), Boolean.TRUE)) {
            he.a[] values = he.a.values();
            int length = values.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    he.a aVar = values[length];
                    if (!(giftItem.getUnitPoint() >= aVar.s())) {
                        if (i10 < 0) {
                            break;
                        }
                        length = i10;
                    } else {
                        int l10 = aVar.l();
                        int i11 = aVar.i();
                        float m10 = aVar.m();
                        Float e10 = aVar.e();
                        b.d(this, Integer.valueOf(giftItem.getPoint()), Boolean.FALSE);
                        b.j(this, "MPLUSRounded1c-Black.ttf");
                        setTextColor(c3.a.d(getContext(), l10));
                        setOutlineColor(Integer.valueOf(c3.a.d(getContext(), i11)));
                        setOutlineWidth(n.b(this, 2));
                        setTextAlignment(4);
                        if (e10 != null && g.a(giftItem.getPoint()).size() > g.a(giftItem.getCoins()).size()) {
                            m10 = e10.floatValue();
                        }
                        setTextSize(2, m10);
                        return;
                    }
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
    }
}
