package ad;

import ad.f0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import bd.b;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import com.dena.mirrativ.user.mypage.setting.SettingRootActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.util.FragmentRunner;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import sf.i;

/* loaded from: classes2.dex */
public final class f0 extends androidx.fragment.app.e implements q0 {
    public static final a V0 = new a(null);
    public static final int W0 = 8;
    public vb.a N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final FragmentRunner T0;
    public bd.f U0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f0 a(SeasonRatingLiveResult seasonRatingLiveResult, String str) {
            jo.p.h(seasonRatingLiveResult, "result");
            jo.p.h(str, "liveId");
            f0 f0Var = new f0();
            f0Var.V2(k3.b.a(wn.q.a("EXTRA_RESULT", seasonRatingLiveResult), wn.q.a("EXTRA_LIVE_ID", str)));
            return f0Var;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment", f = "BroadcastResultExpDialogFragment.kt", l = {391, 392}, m = "startBadgeLottieAnimation")
    /* loaded from: classes2.dex */
    public static final class a0 extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f1024w;

        /* renamed from: x  reason: collision with root package name */
        public Object f1025x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f1026y;

        public a0(ao.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f1026y = obj;
            this.A |= Integer.MIN_VALUE;
            return f0.this.r4(null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1028a;

        static {
            int[] iArr = new int[df.d.values().length];
            iArr[df.d.HEXAGON.ordinal()] = 1;
            iArr[df.d.ROUND.ordinal()] = 2;
            f1028a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 implements sf.i {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ bd.f f1030b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ pc.i0 f1031c;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$startBadgeLottieAnimation$2$onAnimationStart$1", f = "BroadcastResultExpDialogFragment.kt", l = {368, 372}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1032w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ bd.f f1033x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ pc.i0 f1034y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ f0 f1035z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(bd.f fVar, pc.i0 i0Var, f0 f0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f1033x = fVar;
                this.f1034y = i0Var;
                this.f1035z = f0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f1033x, this.f1034y, this.f1035z, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f1032w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (this.f1033x.j()) {
                        return wn.v.f59242a;
                    }
                    this.f1032w = 1;
                    if (uo.b1.a(1500L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wn.m.b(obj);
                    this.f1034y.f46472y0.B.setVisibility(0);
                    return wn.v.f59242a;
                } else {
                    wn.m.b(obj);
                }
                AppCompatImageView appCompatImageView = this.f1034y.f46472y0.B;
                Context N2 = this.f1035z.N2();
                df.c m10 = this.f1033x.f().m();
                if (m10 != null) {
                    appCompatImageView.setImageDrawable(c3.a.f(N2, m10.h()));
                    AppCompatImageView appCompatImageView2 = this.f1034y.f46472y0.B;
                    jo.p.g(appCompatImageView2, "binding.rankUpView.badgeImageView");
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    animationSet.setDuration(300L);
                    animationSet.setFillAfter(true);
                    this.f1032w = 2;
                    if (de.n.d(appCompatImageView2, animationSet, this) == c10) {
                        return c10;
                    }
                    this.f1034y.f46472y0.B.setVisibility(0);
                    return wn.v.f59242a;
                }
                return wn.v.f59242a;
            }
        }

        public b0(bd.f fVar, pc.i0 i0Var) {
            this.f1030b = fVar;
            this.f1031c = i0Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1031c.f46472y0.C.t(this);
            i.a.b(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            uo.l.d(androidx.lifecycle.v.a(f0.this), null, null, new a(this.f1030b, this.f1031c, f0.this, null), 3, null);
            i.a.d(this, animator);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<bd.b> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final bd.b invoke() {
            Parcelable parcelable = f0.this.M2().getParcelable("EXTRA_RESULT");
            if (parcelable != null) {
                jo.p.g(parcelable, "requireNotNull(requireAr…iveResult>(EXTRA_RESULT))");
                b.a aVar = bd.b.f17539q;
                Resources O0 = f0.this.O0();
                jo.p.g(O0, "resources");
                Context N2 = f0.this.N2();
                jo.p.g(N2, "requireContext()");
                return aVar.a((SeasonRatingLiveResult) parcelable, O0, N2);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment", f = "BroadcastResultExpDialogFragment.kt", l = {279, 281, 283}, m = "startNextStep")
    /* loaded from: classes2.dex */
    public static final class c0 extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f1037w;

        /* renamed from: x  reason: collision with root package name */
        public Object f1038x;

        /* renamed from: y  reason: collision with root package name */
        public Object f1039y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f1040z;

        public c0(ao.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f1040z = obj;
            this.B |= Integer.MIN_VALUE;
            return f0.this.s4(null, null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment", f = "BroadcastResultExpDialogFragment.kt", l = {579, 602, 624, 646}, m = "countUpAnimation")
    /* loaded from: classes2.dex */
    public static final class d extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f1041w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f1042x;

        /* renamed from: z  reason: collision with root package name */
        public int f1044z;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f1042x = obj;
            this.f1044z |= Integer.MIN_VALUE;
            return f0.this.Z3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment", f = "BroadcastResultExpDialogFragment.kt", l = {566}, m = "step2Animation")
    /* loaded from: classes2.dex */
    public static final class d0 extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f1045w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f1046x;

        /* renamed from: z  reason: collision with root package name */
        public int f1048z;

        public d0(ao.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f1046x = obj;
            this.f1048z |= Integer.MIN_VALUE;
            return f0.this.u4(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$countUpProgressAnimation$2", f = "BroadcastResultExpDialogFragment.kt", l = {688}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super List<? extends wn.v>>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1049w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f1050x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ bd.f f1051y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ pc.i0 f1052z;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$countUpProgressAnimation$2$expAnimation$1", f = "BroadcastResultExpDialogFragment.kt", l = {686}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1053w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ bd.f f1054x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ pc.i0 f1055y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(bd.f fVar, pc.i0 i0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f1054x = fVar;
                this.f1055y = i0Var;
            }

            public static final void g(pc.i0 i0Var, ValueAnimator valueAnimator) {
                AppCompatTextView appCompatTextView = i0Var.F0;
                String format = String.format("%,d", Arrays.copyOf(new Object[]{valueAnimator.getAnimatedValue()}, 1));
                jo.p.g(format, "format(this, *args)");
                appCompatTextView.setText(format);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f1054x, this.f1055y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f1053w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    ValueAnimator ofInt = ValueAnimator.ofInt(this.f1054x.g(), this.f1054x.b());
                    final pc.i0 i0Var = this.f1055y;
                    ofInt.setDuration(1000L);
                    ofInt.setInterpolator(new AccelerateInterpolator());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ad.g0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            f0.e.a.g(pc.i0.this, valueAnimator);
                        }
                    });
                    jo.p.g(ofInt, "ofInt(liveResultClassBin…alue) }\n                }");
                    this.f1053w = 1;
                    if (de.b.a(ofInt, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$countUpProgressAnimation$2$progressAnimation$1", f = "BroadcastResultExpDialogFragment.kt", l = {679}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1056w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ bd.f f1057x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ pc.i0 f1058y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(bd.f fVar, pc.i0 i0Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f1057x = fVar;
                this.f1058y = i0Var;
            }

            public static final void g(pc.i0 i0Var, ValueAnimator valueAnimator) {
                ProgressBar progressBar = i0Var.f46471x0;
                Object animatedValue = valueAnimator.getAnimatedValue();
                jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                progressBar.setProgress(((Integer) animatedValue).intValue());
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f1057x, this.f1058y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f1056w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    ValueAnimator ofInt = ValueAnimator.ofInt(this.f1057x.h(), this.f1057x.c());
                    final pc.i0 i0Var = this.f1058y;
                    ofInt.setDuration(1000L);
                    ofInt.setInterpolator(new AccelerateInterpolator());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ad.h0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            f0.e.b.g(pc.i0.this, valueAnimator);
                        }
                    });
                    jo.p.g(ofInt, "ofInt(liveResultClassBin…s Int }\n                }");
                    this.f1056w = 1;
                    if (de.b.a(ofInt, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(bd.f fVar, pc.i0 i0Var, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f1051y = fVar;
            this.f1052z = i0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f1051y, this.f1052z, dVar);
            eVar.f1050x = obj;
            return eVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(uo.q0 q0Var, ao.d<? super List<? extends wn.v>> dVar) {
            return invoke2(q0Var, (ao.d<? super List<wn.v>>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(uo.q0 q0Var, ao.d<? super List<wn.v>> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            uo.y0 b10;
            uo.y0 b11;
            Object c10 = bo.c.c();
            int i10 = this.f1049w;
            if (i10 == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f1050x;
                b10 = uo.l.b(q0Var, null, null, new b(this.f1051y, this.f1052z, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new a(this.f1051y, this.f1052z, null), 3, null);
                List m10 = xn.s.m(b10, b11);
                this.f1049w = 1;
                obj = uo.f.a(m10, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<String> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = f0.this.M2().getString("EXTRA_LIVE_ID");
            if (string != null) {
                jo.p.g(string, "requireNotNull(requireAr…getString(EXTRA_LIVE_ID))");
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment", f = "BroadcastResultExpDialogFragment.kt", l = {705, 709}, m = "maxProgressAnimation")
    /* loaded from: classes2.dex */
    public static final class g extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f1060w;

        /* renamed from: x  reason: collision with root package name */
        public Object f1061x;

        /* renamed from: y  reason: collision with root package name */
        public Object f1062y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f1063z;

        public g(ao.d<? super g> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f1063z = obj;
            this.B |= Integer.MIN_VALUE;
            return f0.this.i4(null, null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$observeStoreValues$1", f = "BroadcastResultExpDialogFragment.kt", l = {166}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1064w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ pc.i0 f1066y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f0 f1067w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ pc.i0 f1068x;

            /* renamed from: ad.f0$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0024a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ f0 f1069w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f1070x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ pc.i0 f1071y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0024a(f0 f0Var, String str, pc.i0 i0Var) {
                    super(0);
                    this.f1069w = f0Var;
                    this.f1070x = str;
                    this.f1071y = i0Var;
                }

                public static final void d(DialogInterface dialogInterface, int i10) {
                }

                public static final void e(f0 f0Var, pc.i0 i0Var, DialogInterface dialogInterface) {
                    jo.p.h(f0Var, "this$0");
                    jo.p.h(i0Var, "$binding");
                    f0Var.o4(i0Var);
                }

                public final void c() {
                    AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f1069w.N2()).setPositiveButton(nc.i.E4, i0.f1131w);
                    final f0 f0Var = this.f1069w;
                    final pc.i0 i0Var = this.f1071y;
                    positiveButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ad.j0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            f0.h.a.C0024a.e(f0.this, i0Var, dialogInterface);
                        }
                    }).setMessage(this.f1070x).create().show();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    c();
                    return wn.v.f59242a;
                }
            }

            public a(f0 f0Var, pc.i0 i0Var) {
                this.f1067w = f0Var;
                this.f1068x = i0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f1067w.T0.c(new C0024a(this.f1067w, str, this.f1068x));
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(pc.i0 i0Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f1066y = i0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f1066y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1064w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> j10 = f0.this.g4().j();
                a aVar = new a(f0.this, this.f1066y);
                this.f1064w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$observeStoreValues$2", f = "BroadcastResultExpDialogFragment.kt", l = {178}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1072w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<ContractLiveResultResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f0 f1074w;

            /* renamed from: ad.f0$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0025a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ f0 f1075w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ ContractLiveResultResponse f1076x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0025a(f0 f0Var, ContractLiveResultResponse contractLiveResultResponse) {
                    super(0);
                    this.f1075w = f0Var;
                    this.f1076x = contractLiveResultResponse;
                }

                public final void a() {
                    if (this.f1075w.p0().e0("BroadCastResultCashBonusDialogFragment") != null) {
                        return;
                    }
                    ad.u.O0.a(this.f1076x).z3(this.f1075w.p0(), "BroadCastResultCashBonusDialogFragment");
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(f0 f0Var) {
                this.f1074w = f0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ContractLiveResultResponse contractLiveResultResponse, ao.d<? super wn.v> dVar) {
                this.f1074w.T0.c(new C0025a(this.f1074w, contractLiveResultResponse));
                return wn.v.f59242a;
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1072w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<ContractLiveResultResponse> i11 = f0.this.g4().i();
                a aVar = new a(f0.this);
                this.f1072w = 1;
                if (i11.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$onClickRankUpViewCloseButton$1", f = "BroadcastResultExpDialogFragment.kt", l = {230}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1077w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ pc.i0 f1079y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(pc.i0 i0Var, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f1079y = i0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f1079y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1077w;
            if (i10 == 0) {
                wn.m.b(obj);
                f0 f0Var = f0.this;
                f0Var.U0 = (bd.f) xn.a0.a0(f0Var.d4().a(), xn.a0.c0(f0.this.d4().a(), f0.this.U0) + 1);
                bd.f fVar = f0.this.U0;
                if (fVar != null) {
                    f0 f0Var2 = f0.this;
                    pc.i0 i0Var = this.f1079y;
                    this.f1077w = 1;
                    if (f0Var2.s4(i0Var, fVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m2 f1080w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(m2 m2Var) {
            super(2);
            this.f1080w = m2Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                l0.a(this.f1080w, iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public l() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                l0.a(f0.this.d4().j(), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f0.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f0 f0Var = f0.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = f0Var.N2();
            jo.p.g(N2, "requireContext()");
            String f10 = f0.this.e4().q().f();
            if (f10 == null) {
                f10 = "";
            }
            f0Var.f3(WebViewActivity.a.b(aVar, N2, f10, false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$onViewCreated$5", f = "BroadcastResultExpDialogFragment.kt", l = {146, 147, 149, 150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ pc.i0 B;

        /* renamed from: w  reason: collision with root package name */
        public Object f1084w;

        /* renamed from: x  reason: collision with root package name */
        public Object f1085x;

        /* renamed from: y  reason: collision with root package name */
        public Object f1086y;

        /* renamed from: z  reason: collision with root package name */
        public int f1087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(pc.i0 i0Var, ao.d<? super o> dVar) {
            super(2, dVar);
            this.B = i0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f1087z
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                java.lang.String r6 = "binding"
                if (r1 == 0) goto L54
                if (r1 == r5) goto L44
                if (r1 == r4) goto L34
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                wn.m.b(r9)
                goto Lce
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f1086y
                bd.f r1 = (bd.f) r1
                java.lang.Object r3 = r8.f1085x
                pc.i0 r3 = (pc.i0) r3
                java.lang.Object r4 = r8.f1084w
                ad.f0 r4 = (ad.f0) r4
                wn.m.b(r9)
                goto Lbb
            L34:
                java.lang.Object r1 = r8.f1086y
                bd.f r1 = (bd.f) r1
                java.lang.Object r4 = r8.f1085x
                pc.i0 r4 = (pc.i0) r4
                java.lang.Object r5 = r8.f1084w
                ad.f0 r5 = (ad.f0) r5
                wn.m.b(r9)
                goto L9d
            L44:
                java.lang.Object r1 = r8.f1086y
                bd.f r1 = (bd.f) r1
                java.lang.Object r5 = r8.f1085x
                pc.i0 r5 = (pc.i0) r5
                java.lang.Object r7 = r8.f1084w
                ad.f0 r7 = (ad.f0) r7
                wn.m.b(r9)
                goto L89
            L54:
                wn.m.b(r9)
                ad.f0 r9 = ad.f0.this
                bd.b r1 = ad.f0.K3(r9)
                java.util.List r1 = r1.a()
                java.lang.Object r1 = xn.a0.X(r1)
                bd.f r1 = (bd.f) r1
                ad.f0.T3(r9, r1)
                ad.f0 r9 = ad.f0.this
                bd.f r1 = ad.f0.L3(r9)
                if (r1 == 0) goto Lce
                ad.f0 r7 = ad.f0.this
                pc.i0 r9 = r8.B
                jo.p.g(r9, r6)
                r8.f1084w = r7
                r8.f1085x = r9
                r8.f1086y = r1
                r8.f1087z = r5
                java.lang.Object r5 = ad.f0.X3(r7, r9, r8)
                if (r5 != r0) goto L88
                return r0
            L88:
                r5 = r9
            L89:
                jo.p.g(r5, r6)
                r8.f1084w = r7
                r8.f1085x = r5
                r8.f1086y = r1
                r8.f1087z = r4
                java.lang.Object r9 = ad.f0.Y3(r7, r5, r8)
                if (r9 != r0) goto L9b
                return r0
            L9b:
                r4 = r5
                r5 = r7
            L9d:
                bd.b r9 = ad.f0.K3(r5)
                boolean r9 = r9.n()
                if (r9 == 0) goto Lce
                jo.p.g(r4, r6)
                r8.f1084w = r5
                r8.f1085x = r4
                r8.f1086y = r1
                r8.f1087z = r3
                java.lang.Object r9 = ad.f0.I3(r5, r4, r8)
                if (r9 != r0) goto Lb9
                return r0
            Lb9:
                r3 = r4
                r4 = r5
            Lbb:
                jo.p.g(r3, r6)
                r9 = 0
                r8.f1084w = r9
                r8.f1085x = r9
                r8.f1086y = r9
                r8.f1087z = r2
                java.lang.Object r9 = ad.f0.W3(r4, r3, r1, r8)
                if (r9 != r0) goto Lce
                return r0
            Lce:
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ad.f0.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ pc.i0 f1089x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(pc.i0 i0Var) {
            super(1);
            this.f1089x = i0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f0 f0Var = f0.this;
            pc.i0 i0Var = this.f1089x;
            jo.p.g(i0Var, "binding");
            f0Var.l4(i0Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment", f = "BroadcastResultExpDialogFragment.kt", l = {404, 452}, m = "rankUpViewSetUpAnimation")
    /* loaded from: classes2.dex */
    public static final class q extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f1090w;

        /* renamed from: x  reason: collision with root package name */
        public Object f1091x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f1092y;

        public q(ao.d<? super q> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f1092y = obj;
            this.A |= Integer.MIN_VALUE;
            return f0.this.n4(null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {
        public r() {
            super(1);
        }

        public static final void c(DialogInterface dialogInterface, int i10) {
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            new AlertDialog.Builder(f0.this.N2()).setPositiveButton(nc.i.E4, k0.f1152w).setMessage(nc.i.text_earned_cash_confirm_lock_alert_message).create().show();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            b(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.l<View, wn.v> {
        public s() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (f0.this.p0().e0("ConfirmCashBonusHistoryDialogFragment") != null) {
                return;
            }
            p0.O0.a().z3(f0.this.p0(), "ConfirmCashBonusHistoryDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadcastResultExpDialogFragment$setUpConfirmCashBonusButton$3", f = "BroadcastResultExpDialogFragment.kt", l = {216}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1096w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ pc.i0 f1097x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0 f1098y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<View, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f0 f1099w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0 f0Var) {
                super(1);
                this.f1099w = f0Var;
            }

            public final void a(View view) {
                jo.p.h(view, "it");
                this.f1099w.c4().c("", this.f1099w.f4());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                a(view);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(pc.i0 i0Var, f0 f0Var, ao.d<? super t> dVar) {
            super(2, dVar);
            this.f1097x = i0Var;
            this.f1098y = f0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(this.f1097x, this.f1098y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1096w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f1097x.U.setEnabled(false);
                ImageView imageView = this.f1097x.U;
                jo.p.g(imageView, "binding.confirmCashBonusImageView");
                td.a.x(imageView, co.b.d(nc.d.btn_getmoney_loading));
                this.f1096w = 1;
                if (uo.b1.a(10000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f1097x.U.setEnabled(true);
            ImageView imageView2 = this.f1097x.U;
            jo.p.g(imageView2, "binding.confirmCashBonusImageView");
            td.a.x(imageView2, co.b.d(nc.d.btn_getmoney_active));
            ImageView imageView3 = this.f1097x.U;
            jo.p.g(imageView3, "binding.confirmCashBonusImageView");
            yd.g1.a(imageView3, new a(this.f1098y));
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<ad.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f1100w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1101x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f1100w = componentCallbacks;
            this.f1101x = aVar;
            this.f1102y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ad.w, java.lang.Object] */
        @Override // io.a
        public final ad.w invoke() {
            ComponentCallbacks componentCallbacks = this.f1100w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ad.w.class), this.f1101x, this.f1102y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f1103w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1104x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1105y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f1103w = componentCallbacks;
            this.f1104x = aVar;
            this.f1105y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f1103w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f1104x, this.f1105y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f1106w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Fragment fragment) {
            super(0);
            this.f1106w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f1106w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1107w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar) {
            super(0);
            this.f1107w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f1107w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1108w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1109x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1110y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1111z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f1108w = aVar;
            this.f1109x = aVar2;
            this.f1110y = aVar3;
            this.f1111z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f1108w;
            vq.a aVar2 = this.f1109x;
            io.a aVar3 = this.f1110y;
            xq.a aVar4 = this.f1111z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(m0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1112w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(io.a aVar) {
            super(0);
            this.f1112w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1112w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public f0() {
        super(nc.f.dialog_fragment_broadcast_result_exp);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new u(this, null, null));
        w wVar = new w(this);
        xq.a a10 = gq.a.a(this);
        x xVar = new x(wVar);
        this.P0 = androidx.fragment.app.e0.a(this, jo.f0.b(m0.class), new z(xVar), new y(wVar, null, null, a10));
        this.Q0 = wn.g.b(iVar, new v(this, null, null));
        this.R0 = wn.g.a(new f());
        this.S0 = wn.g.a(new c());
        this.T0 = new FragmentRunner(this);
    }

    public static final Bitmap A4(bd.f fVar, f0 f0Var, s6.g gVar) {
        String e10;
        jo.p.h(fVar, "$liveResultClassBindModel");
        jo.p.h(f0Var, "this$0");
        String str = fVar.f().o().c() + '/' + gVar.b() + gVar.c();
        int i10 = b.f1028a[fVar.f().o().ordinal()];
        if (i10 != 1) {
            if (i10 == 2 && (e10 = gVar.e()) != null) {
                switch (e10.hashCode()) {
                    case 1911933516:
                        if (!e10.equals("image_0")) {
                            return null;
                        }
                        break;
                    case 1911933517:
                        if (!e10.equals("image_1")) {
                            return null;
                        }
                        break;
                    case 1911933518:
                        if (!e10.equals("image_2")) {
                            return null;
                        }
                        break;
                    default:
                        return null;
                }
                return BitmapFactory.decodeStream(f0Var.N2().getAssets().open(str));
            }
            return null;
        }
        String e11 = gVar.e();
        if (e11 != null) {
            switch (e11.hashCode()) {
                case 1911933516:
                    if (!e11.equals("image_0")) {
                        return null;
                    }
                    break;
                case 1911933517:
                    if (!e11.equals("image_1")) {
                        return null;
                    }
                    break;
                case 1911933518:
                    if (!e11.equals("image_2")) {
                        return null;
                    }
                    break;
                case 1911933519:
                    if (!e11.equals("image_3")) {
                        return null;
                    }
                    break;
                case 1911933520:
                    if (!e11.equals("image_4")) {
                        return null;
                    }
                    break;
                case 1911933521:
                    if (!e11.equals("image_5")) {
                        return null;
                    }
                    break;
                default:
                    return null;
            }
            return BitmapFactory.decodeStream(f0Var.N2().getAssets().open(str));
        }
        return null;
    }

    public static final void a4(pc.i0 i0Var, ValueAnimator valueAnimator) {
        jo.p.h(i0Var, "$binding");
        AppCompatTextView appCompatTextView = i0Var.f46452e0;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{valueAnimator.getAnimatedValue()}, 1));
        jo.p.g(format, "format(this, *args)");
        appCompatTextView.setText(format);
    }

    public static final void k4(pc.i0 i0Var, StatusView.b bVar) {
        jo.p.h(i0Var, "$binding");
        StatusView statusView = i0Var.C0;
        jo.p.g(bVar, "it");
        statusView.b(bVar);
    }

    public static final boolean m4(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void q4(pc.i0 i0Var) {
        jo.p.h(i0Var, "$binding");
        float width = (i0Var.C.getWidth() / 12.0f) / 2.0f;
        float width2 = i0Var.f46456i0.getWidth() / 2.0f;
        ConstraintLayout constraintLayout = i0Var.B;
        jo.p.g(constraintLayout, "binding.allRankImageContainer");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int b10 = (int) ((width2 - width) - (layoutParams instanceof ViewGroup.MarginLayoutParams ? o3.i.b((ViewGroup.MarginLayoutParams) layoutParams) : 0));
        i0Var.f46456i0.setPadding(b10, 0, b10, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r3.equals("image_4") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r3.equals("image_3") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r3.equals("image_2") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r3.equals("image_1") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r3.equals("image_0") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return android.graphics.BitmapFactory.decodeStream(r2.N2().getAssets().open(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r3.equals("image_5") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap w4(bd.f r1, ad.f0 r2, s6.g r3) {
        /*
            java.lang.String r0 = "$liveResultClassBindModel"
            jo.p.h(r1, r0)
            java.lang.String r0 = "this$0"
            jo.p.h(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            df.c r1 = r1.f()
            df.b r1 = r1.c()
            java.lang.String r1 = r1.c()
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            java.lang.String r1 = r3.b()
            r0.append(r1)
            java.lang.String r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r3 = r3.e()
            if (r3 == 0) goto L8a
            int r0 = r3.hashCode()
            switch(r0) {
                case 1911933516: goto L70;
                case 1911933517: goto L67;
                case 1911933518: goto L5e;
                case 1911933519: goto L55;
                case 1911933520: goto L4c;
                case 1911933521: goto L43;
                default: goto L42;
            }
        L42:
            goto L8a
        L43:
            java.lang.String r0 = "image_5"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L79
            goto L8a
        L4c:
            java.lang.String r0 = "image_4"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L79
            goto L8a
        L55:
            java.lang.String r0 = "image_3"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L79
            goto L8a
        L5e:
            java.lang.String r0 = "image_2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8a
            goto L79
        L67:
            java.lang.String r0 = "image_1"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L79
            goto L8a
        L70:
            java.lang.String r0 = "image_0"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L79
            goto L8a
        L79:
            android.content.Context r2 = r2.N2()
            android.content.res.AssetManager r2 = r2.getAssets()
            java.io.InputStream r1 = r2.open(r1)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)
            goto L8b
        L8a:
            r1 = 0
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.w4(bd.f, ad.f0, s6.g):android.graphics.Bitmap");
    }

    public static final void y4(pc.i0 i0Var, bd.f fVar) {
        jo.p.h(i0Var, "$binding");
        jo.p.h(fVar, "$liveResultClassBindModel");
        float width = i0Var.C.getWidth() / 12;
        float f10 = width / 2.0f;
        float indexOf = width * xn.y.I(xn.o.d0(df.c.values())).indexOf(fVar.f());
        ConstraintLayout constraintLayout = i0Var.B;
        jo.p.g(constraintLayout, "binding.allRankImageContainer");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int b10 = layoutParams instanceof ViewGroup.MarginLayoutParams ? o3.i.b((ViewGroup.MarginLayoutParams) layoutParams) : 0;
        i0Var.f46456i0.scrollTo((int) indexOf, 0);
        ViewGroup.LayoutParams layoutParams2 = i0Var.W.getLayoutParams();
        jo.p.f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        bVar.setMarginStart((int) ((indexOf + b10) - ((i0Var.W.getWidth() / 2.0f) - f10)));
        i0Var.W.setLayoutParams(bVar);
    }

    public final Object B4(pc.i0 i0Var, bd.f fVar, ao.d<? super wn.v> dVar) {
        Integer q10;
        i0Var.f46472y0.F.setText(fVar.a());
        i0Var.f46472y0.f46474a0.setText(fVar.d());
        Group group = i0Var.f46472y0.Z;
        df.c m10 = fVar.f().m();
        boolean z10 = true;
        group.setVisibility(m10 != null && !m10.l() ? 0 : 8);
        Group group2 = i0Var.f46472y0.G;
        df.c m11 = fVar.f().m();
        if (m11 == null || !m11.e()) {
            z10 = false;
        }
        group2.setVisibility(z10 ? 0 : 8);
        i0Var.f46472y0.V.setVisibility(fVar.k() == null ? 4 : 0);
        Integer l10 = fVar.l();
        if (l10 != null) {
            i0Var.f46472y0.P.setImageDrawable(c3.a.f(N2(), l10.intValue()));
        }
        Integer k10 = fVar.k();
        if (k10 != null) {
            i0Var.f46472y0.Q.setImageDrawable(c3.a.f(N2(), k10.intValue()));
        }
        df.c m12 = fVar.f().m();
        if (m12 != null && (q10 = m12.q()) != null) {
            i0Var.f46472y0.S.setText(U0(q10.intValue()));
        }
        Object z42 = z4(i0Var, fVar, dVar);
        return z42 == bo.c.c() ? z42 : wn.v.f59242a;
    }

    public final void C4(pc.i0 i0Var, bd.f fVar) {
        i0Var.f46471x0.setProgressDrawable(c3.a.f(N2(), fVar.f().n()));
        i0Var.M.setImageDrawable(c3.a.f(N2(), fVar.f().h()));
        int d10 = c3.a.d(N2(), fVar.f().p());
        i0Var.f46454g0.setTextColor(d10);
        i0Var.f46452e0.setTextColor(d10);
        i0Var.f46453f0.setTextColor(d10);
        i0Var.F0.setTextColor(d10);
        AppCompatTextView appCompatTextView = i0Var.f46460m0;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.e())}, 1));
        jo.p.g(format, "format(this, *args)");
        appCompatTextView.setText(format);
        x4(i0Var, fVar);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        vb.a aVar = this.N0;
        if (aVar != null) {
            aVar.P0(((bd.f) xn.a0.i0(d4().a())).f().i());
        }
        this.N0 = null;
    }

    @Override // ad.q0
    public void M() {
        SettingRootActivity.a aVar = SettingRootActivity.f24843a0;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(aVar.a(N2));
    }

    @Override // ad.q0
    public void Z() {
        WebViewActivity.a aVar = WebViewActivity.X;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        String f10 = e4().q().f();
        if (f10 == null) {
            f10 = "";
        }
        f3(WebViewActivity.a.b(aVar, N2, f10, false, false, 12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0168 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z3(pc.i0 r23, ao.d<? super wn.v> r24) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.Z3(pc.i0, ao.d):java.lang.Object");
    }

    public final Object b4(pc.i0 i0Var, bd.f fVar, ao.d<? super wn.v> dVar) {
        Object e10 = uo.r0.e(new e(fVar, i0Var, null), dVar);
        return e10 == bo.c.c() ? e10 : wn.v.f59242a;
    }

    public final ad.w c4() {
        return (ad.w) this.O0.getValue();
    }

    public final bd.b d4() {
        return (bd.b) this.S0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.i0 T = pc.i0.T(view);
        T.N.setVisibility(0);
        T.f46454g0.setText("+");
        AppCompatTextView appCompatTextView = T.f46452e0;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(d4().d())}, 1));
        jo.p.g(format, "format(this, *args)");
        appCompatTextView.setText(format);
        T.X.setText("/");
        s3.j.q(T.f46461n0.C, nc.j.Caption3_Bold);
        ViewGroup.LayoutParams layoutParams = T.f46461n0.C.getLayoutParams();
        jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        AppCompatTextView appCompatTextView2 = T.f46461n0.C;
        jo.p.g(appCompatTextView2, "binding.liveTimeContainer.countTextView");
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView2.getLayoutParams();
        int b10 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? o3.i.b((ViewGroup.MarginLayoutParams) layoutParams2) : 0;
        int b11 = de.e.b(this, 6);
        AppCompatTextView appCompatTextView3 = T.f46461n0.C;
        jo.p.g(appCompatTextView3, "binding.liveTimeContainer.countTextView");
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView3.getLayoutParams();
        int a10 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? o3.i.a((ViewGroup.MarginLayoutParams) layoutParams3) : 0;
        AppCompatTextView appCompatTextView4 = T.f46461n0.C;
        jo.p.g(appCompatTextView4, "binding.liveTimeContainer.countTextView");
        ViewGroup.LayoutParams layoutParams4 = appCompatTextView4.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        bVar.setMargins(b10, b11, a10, marginLayoutParams == null ? 0 : marginLayoutParams.bottomMargin);
        T.f46461n0.C.setTextColor(c3.a.d(N2(), nc.b.F));
        T.f46461n0.T(d4().i());
        T.G0.T(d4().k());
        T.T.T(d4().f());
        T.f46449b0.T(d4().g());
        T.f46455h0.T(d4().h());
        m2 e10 = d4().e();
        if (e10 != null) {
            T.Q.setContent(s0.c.c(-2114623278, true, new k(e10)));
        }
        T.Q.setVisibility(d4().p() ? 0 : 8);
        T.R.setVisibility(d4().p() ? 0 : 8);
        T.f46462o0.setContent(s0.c.c(-1746051248, true, new l()));
        T.f46448a0.setText(d4().l());
        AppCompatImageView appCompatImageView = T.S;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new m());
        AppCompatImageView appCompatImageView2 = T.f46473z0;
        jo.p.g(appCompatImageView2, "binding.rewardHelpIconImageView");
        yd.g1.a(appCompatImageView2, new n());
        jo.p.g(T, "binding");
        p4(T);
        C4(T, (bd.f) xn.a0.X(d4().a()));
        T.f46471x0.setMax(100);
        T.f46471x0.setProgress(((bd.f) xn.a0.X(d4().a())).h());
        AppCompatTextView appCompatTextView5 = T.F0;
        String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(((bd.f) xn.a0.X(d4().a())).g())}, 1));
        jo.p.g(format2, "format(this, *args)");
        appCompatTextView5.setText(format2);
        AppCompatTextView appCompatTextView6 = T.V;
        int i10 = nc.i.f41895w5;
        String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(((bd.f) xn.a0.i0(d4().a())).i())}, 1));
        jo.p.g(format3, "format(this, *args)");
        appCompatTextView6.setText(V0(i10, format3));
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new o(T, null), 3, null);
        o4(T);
        j4(T);
        T.f46472y0.u().setOnTouchListener(ad.z.f1424w);
        AppCompatImageView appCompatImageView3 = T.f46472y0.D;
        jo.p.g(appCompatImageView3, "binding.rankUpView.closeImageView");
        yd.g1.a(appCompatImageView3, new p(T));
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    public final nf.k e4() {
        return (nf.k) this.Q0.getValue();
    }

    public final String f4() {
        return (String) this.R0.getValue();
    }

    public final m0 g4() {
        return (m0) this.P0.getValue();
    }

    public final void h4(pc.i0 i0Var) {
        i0Var.f46472y0.U.clearAnimation();
        i0Var.f46472y0.K.clearAnimation();
        i0Var.f46472y0.K.setVisibility(4);
        i0Var.f46472y0.F.clearAnimation();
        i0Var.f46472y0.F.setVisibility(4);
        i0Var.f46472y0.L.clearAnimation();
        i0Var.f46472y0.L.setVisibility(4);
        i0Var.f46472y0.M.clearAnimation();
        i0Var.f46472y0.M.setVisibility(4);
        i0Var.f46472y0.E.clearAnimation();
        i0Var.f46472y0.E.setVisibility(8);
        i0Var.f46472y0.B.clearAnimation();
        i0Var.f46472y0.B.setVisibility(4);
        i0Var.f46472y0.D.clearAnimation();
        i0Var.f46472y0.D.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i4(pc.i0 r12, bd.f r13, ao.d<? super wn.v> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ad.f0.g
            if (r0 == 0) goto L13
            r0 = r14
            ad.f0$g r0 = (ad.f0.g) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            ad.f0$g r0 = new ad.f0$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f1063z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.B
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            wn.m.b(r14)
            goto La3
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.Object r12 = r0.f1062y
            r13 = r12
            bd.f r13 = (bd.f) r13
            java.lang.Object r12 = r0.f1061x
            pc.i0 r12 = (pc.i0) r12
            java.lang.Object r2 = r0.f1060w
            ad.f0 r2 = (ad.f0) r2
            wn.m.b(r14)
            goto L83
        L46:
            wn.m.b(r14)
            android.widget.ProgressBar r14 = r12.f46450c0
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r5)
            r6 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r6)
            android.view.animation.DecelerateInterpolator r8 = new android.view.animation.DecelerateInterpolator
            r8.<init>()
            r2.setInterpolator(r8)
            r2.setFillAfter(r5)
            android.view.animation.AlphaAnimation r8 = new android.view.animation.AlphaAnimation
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r10)
            r2.addAnimation(r8)
            r14.startAnimation(r2)
            android.widget.ProgressBar r14 = r12.f46450c0
            r14.setVisibility(r3)
            r0.f1060w = r11
            r0.f1061x = r12
            r0.f1062y = r13
            r0.B = r5
            java.lang.Object r14 = uo.b1.a(r6, r0)
            if (r14 != r1) goto L82
            return r1
        L82:
            r2 = r11
        L83:
            android.widget.ProgressBar r14 = r12.f46450c0
            r14.clearAnimation()
            android.widget.ProgressBar r14 = r12.f46450c0
            r5 = 4
            r14.setVisibility(r5)
            android.widget.ProgressBar r14 = r12.f46471x0
            r14.setProgress(r3)
            r14 = 0
            r0.f1060w = r14
            r0.f1061x = r14
            r0.f1062y = r14
            r0.B = r4
            java.lang.Object r12 = r2.B4(r12, r13, r0)
            if (r12 != r1) goto La3
            return r1
        La3:
            wn.v r12 = wn.v.f59242a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.i4(pc.i0, bd.f, ao.d):java.lang.Object");
    }

    public final void j4(final pc.i0 i0Var) {
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new h(i0Var, null), 3, null);
        androidx.lifecycle.u a13 = a1();
        jo.p.g(a13, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a13), null, null, new i(null), 3, null);
        g4().k().i(a1(), new androidx.lifecycle.f0() { // from class: ad.a0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f0.k4(pc.i0.this, (StatusView.b) obj);
            }
        });
    }

    public final void l4(pc.i0 i0Var) {
        h4(i0Var);
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new j(i0Var, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1 A[LOOP:0: B:21:0x00a9->B:23:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n4(pc.i0 r24, ao.d<? super wn.v> r25) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.n4(pc.i0, ao.d):java.lang.Object");
    }

    public final void o4(pc.i0 i0Var) {
        if (!d4().b().l()) {
            ImageView imageView = i0Var.U;
            jo.p.g(imageView, "binding.confirmCashBonusImageView");
            td.a.x(imageView, Integer.valueOf(nc.d.btn_getmoney_disable));
            ImageView imageView2 = i0Var.U;
            jo.p.g(imageView2, "binding.confirmCashBonusImageView");
            yd.g1.a(imageView2, new r());
        } else if (!d4().m()) {
            ImageView imageView3 = i0Var.U;
            jo.p.g(imageView3, "binding.confirmCashBonusImageView");
            td.a.x(imageView3, Integer.valueOf(nc.d.btn_getmoney_active));
            ImageView imageView4 = i0Var.U;
            jo.p.g(imageView4, "binding.confirmCashBonusImageView");
            yd.g1.a(imageView4, new s());
        } else {
            androidx.lifecycle.u a12 = a1();
            jo.p.g(a12, "viewLifecycleOwner");
            uo.l.d(androidx.lifecycle.v.a(a12), null, null, new t(i0Var, this, null), 3, null);
        }
    }

    public final void p4(final pc.i0 i0Var) {
        i0Var.f46456i0.post(new Runnable() { // from class: ad.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.q4(pc.i0.this);
            }
        });
        for (AppCompatImageView appCompatImageView : xn.s.m(i0Var.f46463p0, i0Var.f46464q0, i0Var.f46465r0, i0Var.f46466s0, i0Var.f46467t0, i0Var.f46468u0, i0Var.f46469v0, i0Var.f46470w0)) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setFillAfter(true);
            animationSet.setInterpolator(new LinearInterpolator());
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(12000L);
            rotateAnimation.setRepeatCount(-1);
            animationSet.addAnimation(rotateAnimation);
            appCompatImageView.startAnimation(animationSet);
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nc.j.f41900a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r4(pc.i0 r6, bd.f r7, ao.d<? super wn.v> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ad.f0.a0
            if (r0 == 0) goto L13
            r0 = r8
            ad.f0$a0 r0 = (ad.f0.a0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ad.f0$a0 r0 = new ad.f0$a0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1026y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wn.m.b(r8)
            goto L74
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f1025x
            pc.i0 r6 = (pc.i0) r6
            java.lang.Object r7 = r0.f1024w
            ad.f0 r7 = (ad.f0) r7
            wn.m.b(r8)
            goto L66
        L40:
            wn.m.b(r8)
            pc.k2 r8 = r6.f46472y0
            com.airbnb.lottie.LottieAnimationView r8 = r8.C
            ad.f0$b0 r2 = new ad.f0$b0
            r2.<init>(r7, r6)
            r8.e(r2)
            pc.k2 r7 = r6.f46472y0
            com.airbnb.lottie.LottieAnimationView r7 = r7.C
            r7.r()
            r7 = 3000(0xbb8, double:1.482E-320)
            r0.f1024w = r5
            r0.f1025x = r6
            r0.A = r4
            java.lang.Object r7 = uo.b1.a(r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r7 = r5
        L66:
            r8 = 0
            r0.f1024w = r8
            r0.f1025x = r8
            r0.A = r3
            java.lang.Object r6 = r7.n4(r6, r0)
            if (r6 != r1) goto L74
            return r1
        L74:
            wn.v r6 = wn.v.f59242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.r4(pc.i0, bd.f, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s4(pc.i0 r7, bd.f r8, ao.d<? super wn.v> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ad.f0.c0
            if (r0 == 0) goto L13
            r0 = r9
            ad.f0$c0 r0 = (ad.f0.c0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            ad.f0$c0 r0 = new ad.f0$c0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1040z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.B
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            wn.m.b(r9)
            goto L94
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            wn.m.b(r9)
            goto L82
        L3b:
            java.lang.Object r7 = r0.f1039y
            r8 = r7
            bd.f r8 = (bd.f) r8
            java.lang.Object r7 = r0.f1038x
            pc.i0 r7 = (pc.i0) r7
            java.lang.Object r2 = r0.f1037w
            ad.f0 r2 = (ad.f0) r2
            wn.m.b(r9)
            goto L62
        L4c:
            wn.m.b(r9)
            r6.C4(r7, r8)
            r0.f1037w = r6
            r0.f1038x = r7
            r0.f1039y = r8
            r0.B = r5
            java.lang.Object r9 = r6.b4(r7, r8, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            boolean r9 = r8.j()
            r5 = 0
            if (r9 != 0) goto L85
            bd.b r9 = r2.d4()
            boolean r9 = r9.o()
            if (r9 == 0) goto L85
            r0.f1037w = r5
            r0.f1038x = r5
            r0.f1039y = r5
            r0.B = r4
            java.lang.Object r7 = r2.i4(r7, r8, r0)
            if (r7 != r1) goto L82
            return r1
        L82:
            wn.v r7 = wn.v.f59242a
            return r7
        L85:
            r0.f1037w = r5
            r0.f1038x = r5
            r0.f1039y = r5
            r0.B = r3
            java.lang.Object r7 = r2.v4(r7, r8, r0)
            if (r7 != r1) goto L94
            return r1
        L94:
            wn.v r7 = wn.v.f59242a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.s4(pc.i0, bd.f, ao.d):java.lang.Object");
    }

    public final Object t4(pc.i0 i0Var, ao.d<? super wn.v> dVar) {
        float a10;
        ConstraintLayout constraintLayout = i0Var.f46451d0;
        jo.p.g(constraintLayout, "binding.getLiveResultExpContainer");
        ProgressBar progressBar = i0Var.f46471x0;
        jo.p.g(progressBar, "binding.progressbar");
        LinearLayoutCompat linearLayoutCompat = i0Var.E0;
        jo.p.g(linearLayoutCompat, "binding.totalExpContainer");
        AppCompatTextView appCompatTextView = i0Var.V;
        jo.p.g(appCompatTextView, "binding.currentExpTextView");
        HorizontalScrollView horizontalScrollView = i0Var.f46456i0;
        jo.p.g(horizontalScrollView, "binding.horizontalAllRankScrollView");
        AppCompatTextView appCompatTextView2 = i0Var.Z;
        jo.p.g(appCompatTextView2, "binding.expListTitleText");
        LinearLayoutCompat linearLayoutCompat2 = i0Var.Y;
        jo.p.g(linearLayoutCompat2, "binding.expInfoContainer");
        LinearLayoutCompat linearLayoutCompat3 = i0Var.O;
        jo.p.g(linearLayoutCompat3, "binding.bottomMessageContainer");
        LinearLayoutCompat linearLayoutCompat4 = i0Var.B0;
        jo.p.g(linearLayoutCompat4, "binding.seasonResetMessageContainer");
        ImageView imageView = i0Var.U;
        jo.p.g(imageView, "binding.confirmCashBonusImageView");
        for (View view : xn.s.m(constraintLayout, progressBar, linearLayoutCompat, appCompatTextView, horizontalScrollView, appCompatTextView2, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, imageView)) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            int id2 = view.getId();
            if ((id2 == i0Var.f46451d0.getId() || id2 == i0Var.f46471x0.getId()) || id2 == i0Var.E0.getId()) {
                a10 = de.e.a(this, 20.0f);
            } else {
                a10 = de.e.a(this, 30.0f);
            }
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, a10, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            view.startAnimation(animationSet);
            view.setVisibility(0);
        }
        Object a11 = uo.b1.a(300L, dVar);
        return a11 == bo.c.c() ? a11 : wn.v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u4(pc.i0 r21, ao.d<? super wn.v> r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof ad.f0.d0
            if (r2 == 0) goto L19
            r2 = r1
            ad.f0$d0 r2 = (ad.f0.d0) r2
            int r3 = r2.f1048z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f1048z = r3
            r3 = r20
            goto L20
        L19:
            ad.f0$d0 r2 = new ad.f0$d0
            r3 = r20
            r2.<init>(r1)
        L20:
            java.lang.Object r1 = r2.f1046x
            java.lang.Object r4 = bo.c.c()
            int r5 = r2.f1048z
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3e
            if (r5 != r7) goto L36
            java.lang.Object r0 = r2.f1045w
            pc.i0 r0 = (pc.i0) r0
            wn.m.b(r1)
            goto L9a
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            wn.m.b(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.M
            android.view.animation.AnimationSet r5 = new android.view.animation.AnimationSet
            r5.<init>(r7)
            android.view.animation.AccelerateDecelerateInterpolator r8 = new android.view.animation.AccelerateDecelerateInterpolator
            r8.<init>()
            r5.setInterpolator(r8)
            r8 = 300(0x12c, double:1.48E-321)
            r5.setDuration(r8)
            r5.setFillAfter(r7)
            android.view.animation.ScaleAnimation r15 = new android.view.animation.ScaleAnimation
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1056964608(0x3f000000, float:0.5)
            r14 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 1
            r19 = 1056964608(0x3f000000, float:0.5)
            r10 = r15
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r5.addAnimation(r8)
            android.view.animation.AlphaAnimation r8 = new android.view.animation.AlphaAnimation
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r10)
            r5.addAnimation(r8)
            r1.startAnimation(r5)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.M
            r1.setVisibility(r6)
            r2.f1045w = r0
            r2.f1048z = r7
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r1 = uo.b1.a(r7, r2)
            if (r1 != r4) goto L9a
            return r4
        L9a:
            androidx.appcompat.widget.AppCompatImageView r0 = r0.S
            r0.setVisibility(r6)
            wn.v r0 = wn.v.f59242a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f0.u4(pc.i0, ao.d):java.lang.Object");
    }

    public final Object v4(pc.i0 i0Var, final bd.f fVar, ao.d<? super wn.v> dVar) {
        i0Var.N.setImageAssetDelegate(new s6.b() { // from class: ad.d0
            @Override // s6.b
            public final Bitmap a(s6.g gVar) {
                Bitmap w42;
                w42 = f0.w4(bd.f.this, this, gVar);
                return w42;
            }
        });
        LottieAnimationView lottieAnimationView = i0Var.N;
        lottieAnimationView.setImageAssetsFolder(fVar.f().c().c() + "/images");
        LottieAnimationView lottieAnimationView2 = i0Var.N;
        lottieAnimationView2.setAnimation(fVar.f().c().c() + "/data.json");
        i0Var.N.r();
        return wn.v.f59242a;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof vb.a ? (vb.a) context : null;
    }

    public final void x4(final pc.i0 i0Var, final bd.f fVar) {
        i0Var.f46456i0.post(new Runnable() { // from class: ad.c0
            @Override // java.lang.Runnable
            public final void run() {
                f0.y4(pc.i0.this, fVar);
            }
        });
    }

    public final Object z4(pc.i0 i0Var, final bd.f fVar, ao.d<? super wn.v> dVar) {
        ConstraintLayout constraintLayout = i0Var.f46472y0.E;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, de.e.a(this, 20.0f), 0.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        constraintLayout.startAnimation(animationSet);
        i0Var.f46472y0.E.setVisibility(0);
        i0Var.f46472y0.C.setImageAssetDelegate(new s6.b() { // from class: ad.e0
            @Override // s6.b
            public final Bitmap a(s6.g gVar) {
                Bitmap A4;
                A4 = f0.A4(bd.f.this, this, gVar);
                return A4;
            }
        });
        i0Var.f46472y0.C.setImageAssetsFolder(fVar.f().o().c() + "/images");
        i0Var.f46472y0.C.setAnimation(fVar.f().o().c() + "/data.json");
        Object r42 = r4(i0Var, fVar, dVar);
        return r42 == bo.c.c() ? r42 : wn.v.f59242a;
    }
}
