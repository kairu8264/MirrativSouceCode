package com.dena.mirrativ.streaming.result;

import ac.j4;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.net.api.response.BroadcastResultEventType;
import jo.p;
import sf.i;

/* loaded from: classes2.dex */
public final class BroadcastResultBadgeView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public a f24059w;

    /* renamed from: x  reason: collision with root package name */
    public final j4 f24060x;

    /* loaded from: classes2.dex */
    public interface a {
        void d();
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24061a;

        static {
            int[] iArr = new int[BroadcastResultEventType.values().length];
            iArr[BroadcastResultEventType.MAINICHI.ordinal()] = 1;
            iArr[BroadcastResultEventType.MEI_MAINICHI.ordinal()] = 2;
            iArr[BroadcastResultEventType.CHO_MAINICHI.ordinal()] = 3;
            iArr[BroadcastResultEventType.KIWAMI_MAINICHI.ordinal()] = 4;
            iArr[BroadcastResultEventType.DENDO_MAINICHI.ordinal()] = 5;
            f24061a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements i {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.a.b(this, animator);
            BroadcastResultBadgeView.this.setVisibility(8);
            a listener = BroadcastResultBadgeView.this.getListener();
            if (listener != null) {
                listener.d();
            }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastResultBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        ViewDataBinding e10 = f.e(LayoutInflater.from(getContext()), xb.p.view_broadcast_result_badge, this, true);
        p.g(e10, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f24060x = (j4) e10;
    }

    public final void a(BroadcastResultEventType broadcastResultEventType) {
        p.h(broadcastResultEventType, "eventType");
        this.f24060x.B.e(new c());
        int i10 = b.f24061a[broadcastResultEventType.ordinal()];
        if (i10 == 1) {
            LottieAnimationView lottieAnimationView = this.f24060x.B;
            p.g(lottieAnimationView, "binding.badgeAnimationView");
            b(lottieAnimationView, "daily_streamer_7days_op_lottie");
            this.f24060x.B.r();
        } else if (i10 == 2) {
            LottieAnimationView lottieAnimationView2 = this.f24060x.B;
            p.g(lottieAnimationView2, "binding.badgeAnimationView");
            b(lottieAnimationView2, "daily_streamer_30days_op_lottie");
            this.f24060x.B.r();
        } else if (i10 == 3) {
            LottieAnimationView lottieAnimationView3 = this.f24060x.B;
            p.g(lottieAnimationView3, "binding.badgeAnimationView");
            b(lottieAnimationView3, "daily_streamer_100days_op_lottie");
            this.f24060x.B.r();
        } else if (i10 == 4) {
            LottieAnimationView lottieAnimationView4 = this.f24060x.B;
            p.g(lottieAnimationView4, "binding.badgeAnimationView");
            b(lottieAnimationView4, "daily_streamer_365days_op_lottie");
            this.f24060x.B.r();
        } else if (i10 != 5) {
            setVisibility(8);
        } else {
            LottieAnimationView lottieAnimationView5 = this.f24060x.B;
            p.g(lottieAnimationView5, "binding.badgeAnimationView");
            b(lottieAnimationView5, "daily_streamer_1000days_op_lottie");
            this.f24060x.B.r();
        }
    }

    public final void b(LottieAnimationView lottieAnimationView, String str) {
        lottieAnimationView.setAnimation(str + "/data.json");
        lottieAnimationView.setImageAssetsFolder(str + "/images");
    }

    public final a getListener() {
        return this.f24059w;
    }

    public final void setListener(a aVar) {
        this.f24059w = aVar;
    }
}
