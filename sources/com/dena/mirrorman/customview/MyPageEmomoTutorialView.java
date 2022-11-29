package com.dena.mirrorman.customview;

import ae.kl;
import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dena.mirrorman.feature.live.LiveTutorialSpotlightView;
import de.n;
import ia.a;
import io.l;
import jo.p;
import jo.q;
import nd.f1;
import nd.v0;
import nd.w0;
import so.o;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class MyPageEmomoTutorialView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public io.a<v> f25542w;

    /* renamed from: x  reason: collision with root package name */
    public io.a<v> f25543x;

    /* renamed from: y  reason: collision with root package name */
    public final kl f25544y;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> onClickSpotlightListener = MyPageEmomoTutorialView.this.getOnClickSpotlightListener();
            if (onClickSpotlightListener != null) {
                onClickSpotlightListener.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> onClickAfterListener = MyPageEmomoTutorialView.this.getOnClickAfterListener();
            if (onClickAfterListener != null) {
                onClickAfterListener.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f25547a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MyPageEmomoTutorialView f25548b;

        public c(View view, MyPageEmomoTutorialView myPageEmomoTutorialView) {
            this.f25547a = view;
            this.f25548b = myPageEmomoTutorialView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f25547a.setVisibility(0);
            this.f25547a.startAnimation(AnimationUtils.loadAnimation(this.f25548b.getContext(), v0.live_prepare_tutorial_animation));
            AppCompatTextView appCompatTextView = this.f25548b.f25544y.B;
            appCompatTextView.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setStartOffset(200L);
            appCompatTextView.startAnimation(alphaAnimation);
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
    public MyPageEmomoTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        kl T = kl.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f25544y = T;
        AppCompatTextView appCompatTextView = T.B;
        SpannableString spannableString = new SpannableString(getContext().getText(f1.text_later));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        appCompatTextView.setText(spannableString);
    }

    private final SpannableStringBuilder getTitleSpannableStringBuilder() {
        String string = getResources().getString(f1.text_emomo_tutorial_info);
        p.g(string, "resources.getString(R.st…text_emomo_tutorial_info)");
        String string2 = getResources().getString(f1.text_emomo_tutorial_info_highlight);
        p.g(string2, "resources.getString(R.st…_tutorial_info_highlight)");
        int d10 = c3.a.d(getContext(), w0.f42242u0);
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new ForegroundColorSpan(d10), 0, string2.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int U = o.U(string, string2, 0, false, 6, null);
        spannableStringBuilder.replace(U, string2.length() + U, (CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public final void b(RectF rectF) {
        p.h(rectF, "spotlightRect");
        LiveTutorialSpotlightView liveTutorialSpotlightView = this.f25544y.H;
        liveTutorialSpotlightView.setSpotlightRect(rectF);
        liveTutorialSpotlightView.setCornerRadius(n.b(this, 24));
        View view = this.f25544y.G;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) rectF.top;
        bVar.setMarginStart((int) rectF.left);
        ((ViewGroup.MarginLayoutParams) bVar).width = (int) rectF.width();
        ((ViewGroup.MarginLayoutParams) bVar).height = (int) rectF.height();
        view.setLayoutParams(bVar);
        this.f25544y.F.setText(getTitleSpannableStringBuilder());
        View view2 = this.f25544y.G;
        p.g(view2, "binding.spotlightClickableView");
        g1.a(view2, new a());
        AppCompatTextView appCompatTextView = this.f25544y.B;
        p.g(appCompatTextView, "binding.afterTextView");
        g1.a(appCompatTextView, new b());
        ConstraintLayout constraintLayout = this.f25544y.I;
        p.g(constraintLayout, "binding.titleView");
        c(constraintLayout);
    }

    public final void c(View view) {
        View u10 = this.f25544y.u();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new c(view, this));
        u10.startAnimation(alphaAnimation);
    }

    public final io.a<v> getOnClickAfterListener() {
        return this.f25543x;
    }

    public final io.a<v> getOnClickSpotlightListener() {
        return this.f25542w;
    }

    public final void setOnClickAfterListener(io.a<v> aVar) {
        this.f25543x = aVar;
    }

    public final void setOnClickSpotlightListener(io.a<v> aVar) {
        this.f25542w = aVar;
    }
}
