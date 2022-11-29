package ic;

import ac.c1;
import android.animation.Animator;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.l;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.MutualGiftReward;
import com.dena.mirrorman.net.api.response.MutualGiftUser;
import ia.a;
import jo.h;
import jo.p;
import jo.q;
import o3.c0;
import sf.i;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.g;
import wn.m;
import wn.v;
import xb.n;
import xb.r;

/* loaded from: classes2.dex */
public final class a extends androidx.fragment.app.e implements q0 {
    public static final C0480a R0 = new C0480a(null);
    public static final int S0 = 8;
    public final /* synthetic */ q0 N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;

    /* renamed from: ic.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0480a {
        public C0480a() {
        }

        public /* synthetic */ C0480a(h hVar) {
            this();
        }

        public final a a(MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, MutualGiftReward mutualGiftReward) {
            p.h(mutualGiftUser, "streamer");
            p.h(mutualGiftUser2, MRLog.TARGET_TYPE_VIEWER);
            p.h(mutualGiftReward, "receivedReward");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_KEY_STREAMER", mutualGiftUser);
            bundle.putParcelable("EXTRA_KEY_VIEWER", mutualGiftUser2);
            bundle.putParcelable("EXTRA_KEY_RECEIVED_REWARD", mutualGiftReward);
            aVar.V2(bundle);
            return aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c1 f36722w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a f36723x;

        public b(c1 c1Var, a aVar) {
            this.f36722w = c1Var;
            this.f36723x = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            ConstraintLayout constraintLayout = this.f36722w.M;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new c(this.f36722w, this.f36723x));
            constraintLayout.startAnimation(alphaAnimation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c1 f36724a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f36725b;

        /* renamed from: ic.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0481a implements i {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c1 f36726a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f36727b;

            @co.f(c = "com.dena.mirrativ.streaming.live.MutualGiftBoxResultDialogFragment$onViewCreated$4$1$1$onAnimationEnd$1$onAnimationEnd$2", f = "MutualGiftBoxResultDialogFragment.kt", l = {119, 122, 127}, m = "invokeSuspend")
            /* renamed from: ic.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0482a extends l implements io.p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f36728w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ c1 f36729x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ a f36730y;

                /* renamed from: ic.a$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class View$OnClickListenerC0483a implements View.OnClickListener {

                    /* renamed from: w  reason: collision with root package name */
                    public final /* synthetic */ a f36731w;

                    public View$OnClickListenerC0483a(a aVar) {
                        this.f36731w = aVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f36731w.n3();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0482a(c1 c1Var, a aVar, ao.d<? super C0482a> dVar) {
                    super(2, dVar);
                    this.f36729x = c1Var;
                    this.f36730y = aVar;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    return new C0482a(this.f36729x, this.f36730y, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((C0482a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r12.f36728w
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        r5 = 1065353216(0x3f800000, float:1.0)
                        r6 = 0
                        r7 = 0
                        r8 = 500(0x1f4, double:2.47E-321)
                        if (r1 == 0) goto L2b
                        if (r1 == r4) goto L27
                        if (r1 == r3) goto L23
                        if (r1 != r2) goto L1b
                        wn.m.b(r13)
                        goto L8d
                    L1b:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L23:
                        wn.m.b(r13)
                        goto L58
                    L27:
                        wn.m.b(r13)
                        goto L39
                    L2b:
                        wn.m.b(r13)
                        r10 = 800(0x320, double:3.953E-321)
                        r12.f36728w = r4
                        java.lang.Object r13 = uo.b1.a(r10, r12)
                        if (r13 != r0) goto L39
                        return r0
                    L39:
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.D
                        r13.setVisibility(r7)
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.D
                        android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
                        r1.<init>(r6, r5)
                        r1.setDuration(r8)
                        r13.startAnimation(r1)
                        r12.f36728w = r3
                        java.lang.Object r13 = uo.b1.a(r8, r12)
                        if (r13 != r0) goto L58
                        return r0
                    L58:
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.L
                        r13.setVisibility(r7)
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.L
                        android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
                        r1.<init>(r6, r5)
                        r1.setDuration(r8)
                        r13.startAnimation(r1)
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.E
                        r13.setVisibility(r7)
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.E
                        android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
                        r1.<init>(r6, r5)
                        r1.setDuration(r8)
                        r13.startAnimation(r1)
                        r12.f36728w = r2
                        java.lang.Object r13 = uo.b1.a(r8, r12)
                        if (r13 != r0) goto L8d
                        return r0
                    L8d:
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.K
                        r13.setVisibility(r7)
                        ac.c1 r13 = r12.f36729x
                        androidx.appcompat.widget.AppCompatTextView r13 = r13.K
                        android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
                        r0.<init>(r6, r5)
                        r0.setDuration(r8)
                        r13.startAnimation(r0)
                        ic.a r13 = r12.f36730y
                        r13.w3(r4)
                        ac.c1 r13 = r12.f36729x
                        androidx.constraintlayout.widget.ConstraintLayout r13 = r13.M
                        ic.a$c$a$a$a r0 = new ic.a$c$a$a$a
                        ic.a r1 = r12.f36730y
                        r0.<init>(r1)
                        r13.setOnClickListener(r0)
                        wn.v r13 = wn.v.f59242a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ic.a.c.C0481a.C0482a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public C0481a(c1 c1Var, a aVar) {
                this.f36726a = c1Var;
                this.f36727b = aVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                i.a.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.f36726a.I.setVisibility(8);
                this.f36726a.J.setVisibility(0);
                this.f36726a.J.r();
                this.f36726a.P.setVisibility(0);
                ConstraintLayout constraintLayout = this.f36726a.P;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                constraintLayout.startAnimation(alphaAnimation);
                a aVar = this.f36727b;
                uo.l.d(aVar, null, null, new C0482a(this.f36726a, aVar, null), 3, null);
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

        @co.f(c = "com.dena.mirrativ.streaming.live.MutualGiftBoxResultDialogFragment$onViewCreated$4$1$1$onAnimationEnd$2", f = "MutualGiftBoxResultDialogFragment.kt", l = {139, 142}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f36732w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c1 f36733x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c1 c1Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f36733x = c1Var;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f36733x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f36732w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f36732w = 1;
                    if (b1.a(2500L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m.b(obj);
                    this.f36733x.B.setVisibility(0);
                    this.f36733x.C.setVisibility(0);
                    AppCompatImageView appCompatImageView = this.f36733x.B;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(500L);
                    appCompatImageView.startAnimation(alphaAnimation);
                    AppCompatImageView appCompatImageView2 = this.f36733x.C;
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation2.setDuration(500L);
                    appCompatImageView2.startAnimation(alphaAnimation2);
                    return v.f59242a;
                } else {
                    m.b(obj);
                }
                this.f36733x.F.setVisibility(0);
                this.f36733x.G.setVisibility(0);
                this.f36732w = 2;
                if (b1.a(500L, this) == c10) {
                    return c10;
                }
                this.f36733x.B.setVisibility(0);
                this.f36733x.C.setVisibility(0);
                AppCompatImageView appCompatImageView3 = this.f36733x.B;
                AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation3.setDuration(500L);
                appCompatImageView3.startAnimation(alphaAnimation3);
                AppCompatImageView appCompatImageView22 = this.f36733x.C;
                AlphaAnimation alphaAnimation22 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation22.setDuration(500L);
                appCompatImageView22.startAnimation(alphaAnimation22);
                return v.f59242a;
            }
        }

        public c(c1 c1Var, a aVar) {
            this.f36724a = c1Var;
            this.f36725b = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f36724a.I.setVisibility(0);
            c1 c1Var = this.f36724a;
            c1Var.I.e(new C0481a(c1Var, this.f36725b));
            this.f36724a.I.r();
            uo.l.d(this.f36725b, null, null, new b(this.f36724a, null), 3, null);
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
    public static final class d extends q implements io.a<MutualGiftReward> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final MutualGiftReward invoke() {
            Parcelable parcelable = a.this.M2().getParcelable("EXTRA_KEY_RECEIVED_REWARD");
            p.e(parcelable);
            return (MutualGiftReward) parcelable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<MutualGiftUser> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final MutualGiftUser invoke() {
            Parcelable parcelable = a.this.M2().getParcelable("EXTRA_KEY_STREAMER");
            p.e(parcelable);
            return (MutualGiftUser) parcelable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<MutualGiftUser> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final MutualGiftUser invoke() {
            Parcelable parcelable = a.this.M2().getParcelable("EXTRA_KEY_VIEWER");
            p.e(parcelable);
            return (MutualGiftUser) parcelable;
        }
    }

    public a() {
        super(xb.p.dialog_fragment_mutual_gift_box_result);
        this.N0 = r0.b();
        this.O0 = g.a(new e());
        this.P0 = g.a(new f());
        this.Q0 = g.a(new d());
    }

    public final MutualGiftReward B3() {
        return (MutualGiftReward) this.Q0.getValue();
    }

    public final MutualGiftUser C3() {
        return (MutualGiftUser) this.O0.getValue();
    }

    public final MutualGiftUser D3() {
        return (MutualGiftUser) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        c1 T = c1.T(view);
        AppCompatTextView appCompatTextView = T.D;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D3().getName() + O0().getString(r.text_app_mutual_gift_result_who_received_gift));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(N2(), xb.l.f59942l)), 0, D3().getName().length(), 33);
        appCompatTextView.setText(spannableStringBuilder);
        T.L.setText(B3().getTitle());
        AppCompatImageView appCompatImageView = T.N;
        p.g(appCompatImageView, "binding.streamerBackgroundImageView");
        int i10 = n.result_user_circle;
        td.a.x(appCompatImageView, Integer.valueOf(i10));
        AppCompatImageView appCompatImageView2 = T.Q;
        p.g(appCompatImageView2, "binding.viewerBackgroundImageView");
        td.a.x(appCompatImageView2, Integer.valueOf(i10));
        AppCompatImageView appCompatImageView3 = T.O;
        p.g(appCompatImageView3, "binding.streamerImageView");
        td.a.i(appCompatImageView3, C3().getProfileImageUrl());
        AppCompatImageView appCompatImageView4 = T.R;
        p.g(appCompatImageView4, "binding.viewerImageView");
        td.a.i(appCompatImageView4, D3().getProfileImageUrl());
        AppCompatImageView appCompatImageView5 = T.C;
        p.g(appCompatImageView5, "binding.bonusItemImageView");
        td.a.f(appCompatImageView5, B3().getImageUrl());
        AppCompatImageView appCompatImageView6 = T.F;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(12000L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        appCompatImageView6.startAnimation(rotateAnimation);
        AppCompatImageView appCompatImageView7 = T.G;
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(24000L);
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        rotateAnimation2.setRepeatCount(-1);
        appCompatImageView7.startAnimation(rotateAnimation2);
        View u10 = T.u();
        p.g(u10, "binding.root");
        if (c0.V(u10) && !u10.isLayoutRequested()) {
            ConstraintLayout constraintLayout = T.M;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new c(T, this));
            constraintLayout.startAnimation(alphaAnimation);
            return;
        }
        u10.addOnLayoutChangeListener(new b(T, this));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        return dialog;
    }
}
