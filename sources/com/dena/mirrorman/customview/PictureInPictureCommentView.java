package com.dena.mirrorman.customview;

import ae.ul;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao.d;
import ao.g;
import co.f;
import co.l;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import ia.a;
import io.p;
import jo.h;
import nd.v0;
import uo.b0;
import uo.b1;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class PictureInPictureCommentView extends ConstraintLayout implements q0 {
    public final g U;
    public d2 V;
    public final ul W;

    /* renamed from: a0  reason: collision with root package name */
    public final Animation f25563a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Animation f25564b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Animation f25565c0;

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f25567b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ SpannableStringBuilder f25568c;

        @f(c = "com.dena.mirrorman.customview.PictureInPictureCommentView$bind$1$onAnimationEnd$1", f = "PictureInPictureCommentView.kt", l = {80}, m = "invokeSuspend")
        /* renamed from: com.dena.mirrorman.customview.PictureInPictureCommentView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0224a extends l implements p<q0, d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f25569w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ PictureInPictureCommentView f25570x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0224a(PictureInPictureCommentView pictureInPictureCommentView, d<? super C0224a> dVar) {
                super(2, dVar);
                this.f25570x = pictureInPictureCommentView;
            }

            @Override // co.a
            public final d<v> create(Object obj, d<?> dVar) {
                return new C0224a(this.f25570x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, d<? super v> dVar) {
                return ((C0224a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f25569w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f25569w = 1;
                    if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f25570x.W.B.startAnimation(this.f25570x.f25564b0);
                this.f25570x.V = null;
                return v.f59242a;
            }
        }

        public a(String str, SpannableStringBuilder spannableStringBuilder) {
            this.f25567b = str;
            this.f25568c = spannableStringBuilder;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d2 d10;
            PictureInPictureCommentView pictureInPictureCommentView = PictureInPictureCommentView.this;
            d10 = uo.l.d(pictureInPictureCommentView, null, null, new C0224a(pictureInPictureCommentView, null), 3, null);
            pictureInPictureCommentView.V = d10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            PictureInPictureCommentView.this.W.B.setVisibility(0);
            PictureInPictureCommentView.this.W.D.setText(this.f25567b);
            PictureInPictureCommentView.this.W.C.setText(this.f25568c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ia.a {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation animation2 = PictureInPictureCommentView.this.f25563a0;
            PictureInPictureCommentView pictureInPictureCommentView = PictureInPictureCommentView.this;
            pictureInPictureCommentView.W.C.startAnimation(animation2);
            pictureInPictureCommentView.W.D.startAnimation(animation2);
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

    /* loaded from: classes2.dex */
    public static final class c implements ia.a {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            PictureInPictureCommentView.this.W.B.setVisibility(8);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PictureInPictureCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ PictureInPictureCommentView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void A(String str, SpannableStringBuilder spannableStringBuilder) {
        jo.p.h(str, "userName");
        jo.p.h(spannableStringBuilder, "message");
        if (str.length() == 0) {
            return;
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        this.f25563a0.setAnimationListener(new a(str, spannableStringBuilder));
        d2 d2Var = this.V;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
            this.V = null;
            Animation animation = this.f25565c0;
            this.W.C.startAnimation(animation);
            this.W.D.startAnimation(animation);
            return;
        }
        this.W.B.startAnimation(this.f25563a0);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r0.d(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PictureInPictureCommentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b10;
        jo.p.h(context, "context");
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.U = c10.plus(b10);
        this.W = (ul) androidx.databinding.f.e(LayoutInflater.from(context), nd.b1.view_picture_in_picture_comment, this, true);
        this.f25563a0 = AnimationUtils.loadAnimation(context, v0.f42222i);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, v0.f42223j);
        loadAnimation.setAnimationListener(new c());
        this.f25564b0 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, v0.slide_out_up);
        loadAnimation2.setAnimationListener(new b());
        this.f25565c0 = loadAnimation2;
    }
}
