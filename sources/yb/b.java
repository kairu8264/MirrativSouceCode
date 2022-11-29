package yb;

import ac.s;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import ao.g;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import da.j;
import j6.i;
import java.io.Serializable;
import jo.h;
import jo.p;
import jo.q;
import o3.c0;
import uo.b1;
import uo.l;
import uo.q0;
import uo.r0;
import wn.l;
import wn.m;
import wn.v;
import xb.n;
import yd.g1;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e implements q0 {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final /* synthetic */ j N0;
    public io.a<v> O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(GiftItem giftItem) {
            p.h(giftItem, "giftItem");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_KEY_GIFT_ITEM", giftItem);
            bVar.V2(bundle);
            return bVar;
        }
    }

    /* renamed from: yb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class View$OnLayoutChangeListenerC1050b implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f61606x;

        public View$OnLayoutChangeListenerC1050b(s sVar) {
            this.f61606x = sVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            b bVar = b.this;
            l.d(bVar, null, null, new e(this.f61606x, bVar, null), 3, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<View, v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            yb.c.P0.a().z3(b.this.p0(), "BecameCheerleaderTutorialDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<View, v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            b.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.cheerleader.BecameCheerleaderDialogFragment$onViewCreated$3$1", f = "BecameCheerleaderDialogFragment.kt", l = {90, 95}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61609w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f61610x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b f61611y;

        /* loaded from: classes2.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s f61612a;

            public a(s sVar) {
                this.f61612a = sVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = this.f61612a.E.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                p.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                this.f61612a.E.requestLayout();
            }
        }

        /* renamed from: yb.b$e$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1051b implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s f61613a;

            public C1051b(s sVar) {
                this.f61613a = sVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                p.h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                p.h(animator, "animator");
                this.f61613a.G.r();
                AppCompatImageView appCompatImageView = this.f61613a.H;
                p.g(appCompatImageView, "binding.particleImageView");
                x5.a.a(appCompatImageView.getContext()).c(new i.a(appCompatImageView.getContext()).b(Integer.valueOf(n.became_cheerleader_particle)).l(appCompatImageView).a());
                this.f61613a.H.setVisibility(0);
                this.f61613a.E.setAlpha(1.0f);
                ConstraintLayout constraintLayout = this.f61613a.E;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                constraintLayout.startAnimation(alphaAnimation);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                p.h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                p.h(animator, "animator");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s sVar, b bVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f61610x = sVar;
            this.f61611y = bVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f61610x, this.f61611y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61609w;
            if (i10 == 0) {
                m.b(obj);
                this.f61609w = 1;
                if (b1.a(400L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m.b(obj);
                this.f61610x.E.setAlpha(0.0f);
                this.f61610x.E.setVisibility(0);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, de.e.b(this.f61611y, 420));
                s sVar = this.f61610x;
                ofInt.setDuration(500L);
                ofInt.setInterpolator(new DecelerateInterpolator());
                ofInt.addUpdateListener(new a(sVar));
                p.g(ofInt, "");
                ofInt.addListener(new C1051b(sVar));
                ofInt.start();
                return v.f59242a;
            } else {
                m.b(obj);
            }
            this.f61610x.N.setVisibility(0);
            this.f61610x.N.r();
            this.f61609w = 2;
            if (b1.a(2500L, this) == c10) {
                return c10;
            }
            this.f61610x.E.setAlpha(0.0f);
            this.f61610x.E.setVisibility(0);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, de.e.b(this.f61611y, 420));
            s sVar2 = this.f61610x;
            ofInt2.setDuration(500L);
            ofInt2.setInterpolator(new DecelerateInterpolator());
            ofInt2.addUpdateListener(new a(sVar2));
            p.g(ofInt2, "");
            ofInt2.addListener(new C1051b(sVar2));
            ofInt2.start();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ao.d<v> f61614w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ao.d<? super v> dVar) {
            super(0);
            this.f61614w = dVar;
        }

        public final void a() {
            ao.d<v> dVar = this.f61614w;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(v.f59242a));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public b() {
        super(xb.p.dialog_fragment_became_cheerleader);
        this.N0 = new j();
    }

    public final Object B3(FragmentManager fragmentManager, ao.d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        this.O0 = new f(iVar);
        z3(fragmentManager, "BecameCheerleaderDialogFragment");
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null && (window = p33.getWindow()) != null) {
            window.setWindowAnimations(xb.s.f60095b);
        }
        Serializable serializable = M2().getSerializable("EXTRA_KEY_GIFT_ITEM");
        p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.bcsvr.response.GiftItem");
        GiftItem giftItem = (GiftItem) serializable;
        s T = s.T(view);
        T.V(yb.a.f61602y.a(giftItem.getUserName(), giftItem.getProfileImageUrl()));
        LinearLayout linearLayout = T.M;
        p.g(linearLayout, "binding.showTutorialContainer");
        g1.a(linearLayout, new c());
        RoundedButtonView roundedButtonView = T.C;
        p.g(roundedButtonView, "binding.closeButtonView");
        g1.a(roundedButtonView, new d());
        View u10 = T.u();
        p.g(u10, "binding.root");
        if (c0.V(u10) && !u10.isLayoutRequested()) {
            uo.l.d(this, null, null, new e(T, this, null), 3, null);
        } else {
            u10.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1050b(T));
        }
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        io.a<v> aVar = this.O0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), xb.s.f60094a);
    }
}
