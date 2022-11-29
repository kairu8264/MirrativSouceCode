package com.dena.mirrorman.customview;

import ae.ql;
import android.content.Context;
import android.text.Spannable;
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
public final class OneLineCommentView extends ConstraintLayout implements q0 {
    public final g U;
    public d2 V;
    public final ql W;

    /* renamed from: a0  reason: collision with root package name */
    public final Animation f25550a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Animation f25551b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Animation f25552c0;

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f25554b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Spannable f25555c;

        @f(c = "com.dena.mirrorman.customview.OneLineCommentView$bind$1$onAnimationEnd$1", f = "OneLineCommentView.kt", l = {80}, m = "invokeSuspend")
        /* renamed from: com.dena.mirrorman.customview.OneLineCommentView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0223a extends l implements p<q0, d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f25556w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ OneLineCommentView f25557x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0223a(OneLineCommentView oneLineCommentView, d<? super C0223a> dVar) {
                super(2, dVar);
                this.f25557x = oneLineCommentView;
            }

            @Override // co.a
            public final d<v> create(Object obj, d<?> dVar) {
                return new C0223a(this.f25557x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, d<? super v> dVar) {
                return ((C0223a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f25556w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f25556w = 1;
                    if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f25557x.W.B.startAnimation(this.f25557x.f25551b0);
                this.f25557x.V = null;
                return v.f59242a;
            }
        }

        public a(String str, Spannable spannable) {
            this.f25554b = str;
            this.f25555c = spannable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d2 d10;
            OneLineCommentView oneLineCommentView = OneLineCommentView.this;
            d10 = uo.l.d(oneLineCommentView, null, null, new C0223a(oneLineCommentView, null), 3, null);
            oneLineCommentView.V = d10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            OneLineCommentView.this.W.B.setVisibility(0);
            OneLineCommentView.this.W.D.setText(this.f25554b);
            OneLineCommentView.this.W.C.setText(this.f25555c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ia.a {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            OneLineCommentView.this.W.B.setVisibility(8);
            OneLineCommentView.this.W.B.startAnimation(OneLineCommentView.this.f25550a0);
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
            OneLineCommentView.this.W.B.setVisibility(8);
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
    public OneLineCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ OneLineCommentView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void A(String str, Spannable spannable) {
        jo.p.h(str, "userName");
        jo.p.h(spannable, "message");
        if (str.length() == 0) {
            return;
        }
        if (spannable.length() == 0) {
            return;
        }
        this.f25550a0.setAnimationListener(new a(str, spannable));
        d2 d2Var = this.V;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
            this.V = null;
            this.W.B.startAnimation(this.f25552c0);
            return;
        }
        this.W.B.startAnimation(this.f25550a0);
    }

    public final void B() {
        d2 d2Var = this.V;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.V = null;
        this.W.B.setAnimation(null);
        this.W.B.setVisibility(8);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r0.d(this, null, 1, null);
        d2 d2Var = this.V;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLineCommentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b10;
        jo.p.h(context, "context");
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.U = c10.plus(b10);
        this.W = (ql) androidx.databinding.f.e(LayoutInflater.from(context), nd.b1.view_one_line_comment, this, true);
        this.f25550a0 = AnimationUtils.loadAnimation(context, v0.f42222i);
        int i11 = v0.slide_out_up;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i11);
        loadAnimation.setAnimationListener(new c());
        this.f25551b0 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i11);
        loadAnimation2.setAnimationListener(new b());
        this.f25552c0 = loadAnimation2;
    }
}
