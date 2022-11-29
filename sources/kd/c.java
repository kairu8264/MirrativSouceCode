package kd;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.List;
import jo.f0;
import jo.p;
import kd.a;
import od.s0;
import pc.e1;
import pc.m3;
import pc.o3;
import s6.g;
import uo.q0;
import uo.r0;
import uo.y0;
import wn.q;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes2.dex */
public final class c extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public final wn.f N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(SeasonRatingStatusResponse seasonRatingStatusResponse) {
            p.h(seasonRatingStatusResponse, "response");
            c cVar = new c();
            cVar.V2(k3.b.a(q.a("EXTRA_RESPONSE", seasonRatingStatusResponse)));
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e1 f38652x;

        @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$onViewCreated$1$1$1", f = "SeasonRatingResultDialogFragment.kt", l = {67, 68}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38653w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c f38654x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e1 f38655y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, e1 e1Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f38654x = cVar;
                this.f38655y = e1Var;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f38654x, this.f38655y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38653w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    c cVar = this.f38654x;
                    m3 m3Var = this.f38655y.B;
                    p.g(m3Var, "binding.resultContainer");
                    this.f38653w = 1;
                    if (cVar.K3(m3Var, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wn.m.b(obj);
                    return v.f59242a;
                } else {
                    wn.m.b(obj);
                }
                c cVar2 = this.f38654x;
                o3 o3Var = this.f38655y.C;
                p.g(o3Var, "binding.startContainer");
                this.f38653w = 2;
                if (cVar2.T3(o3Var, this) == c10) {
                    return c10;
                }
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e1 e1Var) {
            super(1);
            this.f38652x = e1Var;
        }

        public final void a(View view) {
            p.h(view, "it");
            uo.l.d(androidx.lifecycle.v.a(c.this), null, null, new a(c.this, this.f38652x, null), 3, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* renamed from: kd.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0543c extends jo.q implements io.l<View, v> {
        public C0543c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            c.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$onViewCreated$3", f = "SeasonRatingResultDialogFragment.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38657w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e1 f38659y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e1 e1Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f38659y = e1Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f38659y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f38657w;
            if (i10 == 0) {
                wn.m.b(obj);
                c cVar = c.this;
                m3 m3Var = this.f38659y.B;
                p.g(m3Var, "binding.resultContainer");
                this.f38657w = 1;
                if (cVar.S3(m3Var, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {114}, m = "resetResultViews")
    /* loaded from: classes2.dex */
    public static final class e extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f38660w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38661x;

        /* renamed from: z  reason: collision with root package name */
        public int f38663z;

        public e(ao.d<? super e> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38661x = obj;
            this.f38663z |= Integer.MIN_VALUE;
            return c.this.K3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$resultFadeIn$2", f = "SeasonRatingResultDialogFragment.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super List<? extends v>>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38664w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38665x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m3 f38666y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c f38667z;

        @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$resultFadeIn$2$1", f = "SeasonRatingResultDialogFragment.kt", l = {151}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38668w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ m3 f38669x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c f38670y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m3 m3Var, c cVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f38669x = m3Var;
                this.f38670y = cVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f38669x, this.f38670y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38668w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f38669x.M.setVisibility(0);
                    AppCompatImageView appCompatImageView = this.f38669x.M;
                    p.g(appCompatImageView, "binding.seasonResultTitleImageView");
                    AnimationSet animationSet = new AnimationSet(true);
                    c cVar = this.f38670y;
                    animationSet.setDuration(300L);
                    animationSet.setInterpolator(new DecelerateInterpolator());
                    animationSet.setFillAfter(true);
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, de.e.a(cVar, 20.0f), 0.0f));
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    this.f38668w = 1;
                    if (de.n.d(appCompatImageView, animationSet, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$resultFadeIn$2$2", f = "SeasonRatingResultDialogFragment.kt", l = {163}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38671w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ m3 f38672x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c f38673y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m3 m3Var, c cVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f38672x = m3Var;
                this.f38673y = cVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f38672x, this.f38673y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38671w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f38672x.L.setVisibility(0);
                    LinearLayoutCompat linearLayoutCompat = this.f38672x.L;
                    p.g(linearLayoutCompat, "binding.seasonRatingInfoContainer");
                    AnimationSet animationSet = new AnimationSet(true);
                    c cVar = this.f38673y;
                    animationSet.setDuration(300L);
                    animationSet.setInterpolator(new DecelerateInterpolator());
                    animationSet.setFillAfter(true);
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, de.e.a(cVar, 30.0f), 0.0f));
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    this.f38671w = 1;
                    if (de.n.d(linearLayoutCompat, animationSet, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m3 m3Var, c cVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f38666y = m3Var;
            this.f38667z = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            f fVar = new f(this.f38666y, this.f38667z, dVar);
            fVar.f38665x = obj;
            return fVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, ao.d<? super List<? extends v>> dVar) {
            return invoke2(q0Var, (ao.d<? super List<v>>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(q0 q0Var, ao.d<? super List<v>> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            Object c10 = bo.c.c();
            int i10 = this.f38664w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f38665x;
                b10 = uo.l.b(q0Var, null, null, new a(this.f38666y, this.f38667z, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f38666y, this.f38667z, null), 3, null);
                List m10 = s.m(b10, b11);
                this.f38664w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {291}, m = "resultOtherViewsFadeIn")
    /* loaded from: classes2.dex */
    public static final class g extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f38674w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38675x;

        /* renamed from: z  reason: collision with root package name */
        public int f38677z;

        public g(ao.d<? super g> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38675x = obj;
            this.f38677z |= Integer.MIN_VALUE;
            return c.this.N3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {225}, m = "resultRankImageFadeIn")
    /* loaded from: classes2.dex */
    public static final class h extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f38678w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38679x;

        /* renamed from: z  reason: collision with root package name */
        public int f38681z;

        public h(ao.d<? super h> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38679x = obj;
            this.f38681z |= Integer.MIN_VALUE;
            return c.this.O3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {126, 127, 128, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 132, 133}, m = "showSeasonResult")
    /* loaded from: classes2.dex */
    public static final class i extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f38682w;

        /* renamed from: x  reason: collision with root package name */
        public Object f38683x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f38684y;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38684y = obj;
            this.A |= Integer.MIN_VALUE;
            return c.this.S3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 139, 141}, m = "showSeasonStart")
    /* loaded from: classes2.dex */
    public static final class j extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f38686w;

        /* renamed from: x  reason: collision with root package name */
        public Object f38687x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f38688y;

        public j(ao.d<? super j> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38688y = obj;
            this.A |= Integer.MIN_VALUE;
            return c.this.T3(null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<s0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f38690w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38691x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38692y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f38690w = componentCallbacks;
            this.f38691x = aVar;
            this.f38692y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.s0] */
        @Override // io.a
        public final s0 invoke() {
            ComponentCallbacks componentCallbacks = this.f38690w;
            return gq.a.a(componentCallbacks).c(f0.b(s0.class), this.f38691x, this.f38692y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$startFadeIn$2", f = "SeasonRatingResultDialogFragment.kt", l = {218}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super List<? extends v>>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f38693w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38694x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o3 f38695y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c f38696z;

        @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$startFadeIn$2$1", f = "SeasonRatingResultDialogFragment.kt", l = {184}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38697w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ o3 f38698x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c f38699y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o3 o3Var, c cVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f38698x = o3Var;
                this.f38699y = cVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f38698x, this.f38699y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38697w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f38698x.W.setVisibility(0);
                    AppCompatImageView appCompatImageView = this.f38698x.W;
                    p.g(appCompatImageView, "binding.seasonResultTitleImageView");
                    AnimationSet animationSet = new AnimationSet(true);
                    c cVar = this.f38699y;
                    animationSet.setDuration(300L);
                    animationSet.setInterpolator(new DecelerateInterpolator());
                    animationSet.setFillAfter(true);
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, de.e.a(cVar, 20.0f), 0.0f));
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    this.f38697w = 1;
                    if (de.n.d(appCompatImageView, animationSet, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$startFadeIn$2$2", f = "SeasonRatingResultDialogFragment.kt", l = {196}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38700w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ o3 f38701x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c f38702y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o3 o3Var, c cVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f38701x = o3Var;
                this.f38702y = cVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f38701x, this.f38702y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38700w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f38701x.V.setVisibility(0);
                    LinearLayoutCompat linearLayoutCompat = this.f38701x.V;
                    p.g(linearLayoutCompat, "binding.seasonRatingInfoContainer");
                    AnimationSet animationSet = new AnimationSet(true);
                    c cVar = this.f38702y;
                    animationSet.setDuration(300L);
                    animationSet.setInterpolator(new DecelerateInterpolator());
                    animationSet.setFillAfter(true);
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, de.e.a(cVar, 30.0f), 0.0f));
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    this.f38700w = 1;
                    if (de.n.d(linearLayoutCompat, animationSet, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment$startFadeIn$2$3", f = "SeasonRatingResultDialogFragment.kt", l = {208}, m = "invokeSuspend")
        /* renamed from: kd.c$l$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0544c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f38703w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ o3 f38704x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c f38705y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0544c(o3 o3Var, c cVar, ao.d<? super C0544c> dVar) {
                super(2, dVar);
                this.f38704x = o3Var;
                this.f38705y = cVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0544c(this.f38704x, this.f38705y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C0544c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f38703w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f38704x.U.setVisibility(0);
                    ConstraintLayout constraintLayout = this.f38704x.U;
                    p.g(constraintLayout, "binding.rateInfoContainer");
                    AnimationSet animationSet = new AnimationSet(true);
                    c cVar = this.f38705y;
                    animationSet.setDuration(300L);
                    animationSet.setInterpolator(new DecelerateInterpolator());
                    animationSet.setFillAfter(true);
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, de.e.a(cVar, 40.0f), 0.0f));
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    this.f38703w = 1;
                    if (de.n.d(constraintLayout, animationSet, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(o3 o3Var, c cVar, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f38695y = o3Var;
            this.f38696z = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            l lVar = new l(this.f38695y, this.f38696z, dVar);
            lVar.f38694x = obj;
            return lVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, ao.d<? super List<? extends v>> dVar) {
            return invoke2(q0Var, (ao.d<? super List<v>>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(q0 q0Var, ao.d<? super List<v>> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            y0 b12;
            Object c10 = bo.c.c();
            int i10 = this.f38693w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f38694x;
                b10 = uo.l.b(q0Var, null, null, new a(this.f38695y, this.f38696z, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f38695y, this.f38696z, null), 3, null);
                b12 = uo.l.b(q0Var, null, null, new C0544c(this.f38695y, this.f38696z, null), 3, null);
                List m10 = s.m(b10, b11, b12);
                this.f38693w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {306}, m = "startOtherViewsFadeIn")
    /* loaded from: classes2.dex */
    public static final class m extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f38706w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38707x;

        /* renamed from: z  reason: collision with root package name */
        public int f38709z;

        public m(ao.d<? super m> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38707x = obj;
            this.f38709z |= Integer.MIN_VALUE;
            return c.this.V3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.season_rating.SeasonRatingResultDialogFragment", f = "SeasonRatingResultDialogFragment.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "startRankImageFadeIn")
    /* loaded from: classes2.dex */
    public static final class n extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f38710w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38711x;

        /* renamed from: z  reason: collision with root package name */
        public int f38713z;

        public n(ao.d<? super n> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f38711x = obj;
            this.f38713z |= Integer.MIN_VALUE;
            return c.this.W3(null, this);
        }
    }

    public c() {
        super(nc.f.dialog_fragment_sesason_rating_result);
        this.N0 = wn.g.b(wn.i.SYNCHRONIZED, new k(this, null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0.equals("image_4") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("image_3") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.equals("image_2") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r0.equals("image_1") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r0.equals("image_0") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        r2 = r2.N2().getAssets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return android.graphics.BitmapFactory.decodeStream(r2.open(r3.c().c() + '/' + r4.b() + r4.c()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.equals("image_5") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap R3(kd.c r2, df.c r3, s6.g r4) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r2, r0)
            java.lang.String r0 = "$rank"
            jo.p.h(r3, r0)
            java.lang.String r0 = r4.e()
            if (r0 == 0) goto L87
            int r1 = r0.hashCode()
            switch(r1) {
                case 1911933516: goto L46;
                case 1911933517: goto L3d;
                case 1911933518: goto L34;
                case 1911933519: goto L2b;
                case 1911933520: goto L22;
                case 1911933521: goto L19;
                default: goto L17;
            }
        L17:
            goto L87
        L19:
            java.lang.String r1 = "image_5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L87
        L22:
            java.lang.String r1 = "image_4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L87
        L2b:
            java.lang.String r1 = "image_3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L87
        L34:
            java.lang.String r1 = "image_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L87
            goto L4f
        L3d:
            java.lang.String r1 = "image_1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L87
        L46:
            java.lang.String r1 = "image_0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L87
        L4f:
            android.content.Context r2 = r2.N2()
            android.content.res.AssetManager r2 = r2.getAssets()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            df.b r3 = r3.c()
            java.lang.String r3 = r3.c()
            r0.append(r3)
            r3 = 47
            r0.append(r3)
            java.lang.String r3 = r4.b()
            r0.append(r3)
            java.lang.String r3 = r4.c()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.io.InputStream r2 = r2.open(r3)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)
            goto L88
        L87:
            r2 = 0
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.R3(kd.c, df.c, s6.g):android.graphics.Bitmap");
    }

    public final s0 J3() {
        return (s0) this.N0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K3(pc.m3 r8, ao.d<? super wn.v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kd.c.e
            if (r0 == 0) goto L13
            r0 = r9
            kd.c$e r0 = (kd.c.e) r0
            int r1 = r0.f38663z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38663z = r1
            goto L18
        L13:
            kd.c$e r0 = new kd.c$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f38661x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f38663z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f38660w
            pc.m3 r8 = (pc.m3) r8
            wn.m.b(r9)
            goto L6a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            wn.m.b(r9)
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.C
            java.lang.String r2 = "binding.container"
            jo.p.g(r9, r2)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r3)
            r4 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r4)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r2.setInterpolator(r4)
            r2.setFillAfter(r3)
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r4.<init>(r5, r6)
            r2.addAnimation(r4)
            r0.f38660w = r8
            r0.f38663z = r3
            java.lang.Object r9 = de.n.d(r9, r2, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            androidx.constraintlayout.widget.ConstraintLayout r8 = r8.C
            r9 = 8
            r8.setVisibility(r9)
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.K3(pc.m3, ao.d):java.lang.Object");
    }

    public final Object L3(m3 m3Var, ao.d<? super v> dVar) {
        Object e10 = r0.e(new f(m3Var, this, null), dVar);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    public final void M3(m3 m3Var) {
        for (AppCompatImageView appCompatImageView : s.m(m3Var.E, m3Var.F)) {
            appCompatImageView.setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setInterpolator(new LinearInterpolator());
            animationSet.setFillAfter(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(appCompatImageView.getId() == m3Var.E.getId() ? 12000L : 24000L);
            rotateAnimation.setRepeatCount(-1);
            animationSet.addAnimation(rotateAnimation);
            appCompatImageView.startAnimation(animationSet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N3(pc.m3 r8, ao.d<? super wn.v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kd.c.g
            if (r0 == 0) goto L13
            r0 = r9
            kd.c$g r0 = (kd.c.g) r0
            int r1 = r0.f38677z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38677z = r1
            goto L18
        L13:
            kd.c$g r0 = new kd.c$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f38675x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f38677z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f38674w
            pc.m3 r8 = (pc.m3) r8
            wn.m.b(r9)
            goto L77
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            wn.m.b(r9)
            androidx.appcompat.widget.AppCompatButton r9 = r8.G
            r2 = 0
            r9.setVisibility(r2)
            androidx.appcompat.widget.AppCompatButton r9 = r8.G
            java.lang.String r2 = "binding.nextButton"
            jo.p.g(r9, r2)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r3)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r2.setInterpolator(r4)
            r4 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r4)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r5 = 1106247680(0x41f00000, float:30.0)
            r6 = 0
            r4.<init>(r6, r6, r5, r6)
            r2.addAnimation(r4)
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r5)
            r2.addAnimation(r4)
            r0.f38674w = r8
            r0.f38677z = r3
            java.lang.Object r9 = de.n.d(r9, r2, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            androidx.appcompat.widget.AppCompatButton r8 = r8.G
            r8.setEnabled(r3)
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.N3(pc.m3, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O3(pc.m3 r18, ao.d<? super wn.v> r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof kd.c.h
            if (r2 == 0) goto L19
            r2 = r1
            kd.c$h r2 = (kd.c.h) r2
            int r3 = r2.f38681z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f38681z = r3
            r3 = r17
            goto L20
        L19:
            kd.c$h r2 = new kd.c$h
            r3 = r17
            r2.<init>(r1)
        L20:
            java.lang.Object r1 = r2.f38679x
            java.lang.Object r4 = bo.c.c()
            int r5 = r2.f38681z
            r6 = 1
            if (r5 == 0) goto L3d
            if (r5 != r6) goto L35
            java.lang.Object r0 = r2.f38678w
            pc.m3 r0 = (pc.m3) r0
            wn.m.b(r1)
            goto L89
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            wn.m.b(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.I
            java.lang.String r5 = "binding.rankImageView"
            jo.p.g(r1, r5)
            android.view.animation.AnimationSet r5 = new android.view.animation.AnimationSet
            r5.<init>(r6)
            r7 = 300(0x12c, double:1.48E-321)
            r5.setDuration(r7)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r5.setInterpolator(r7)
            r5.setFillAfter(r6)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            r14 = 1056964608(0x3f000000, float:0.5)
            r15 = 1
            r16 = 1056964608(0x3f000000, float:0.5)
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.addAnimation(r7)
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r9)
            r5.addAnimation(r7)
            r2.f38678w = r0
            r2.f38681z = r6
            java.lang.Object r1 = de.n.d(r1, r5, r2)
            if (r1 != r4) goto L89
            return r4
        L89:
            androidx.appcompat.widget.AppCompatImageView r0 = r0.I
            r1 = 0
            r0.setVisibility(r1)
            wn.v r0 = wn.v.f59242a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.O3(pc.m3, ao.d):java.lang.Object");
    }

    public final void P3(m3 m3Var) {
        m3Var.B.setVisibility(0);
        m3Var.B.r();
    }

    public final void Q3(LottieAnimationView lottieAnimationView, final df.c cVar) {
        lottieAnimationView.setImageAssetDelegate(new s6.b() { // from class: kd.b
            @Override // s6.b
            public final Bitmap a(g gVar) {
                Bitmap R3;
                R3 = c.R3(c.this, cVar, gVar);
                return R3;
            }
        });
        lottieAnimationView.setImageAssetsFolder(cVar.c().c() + "/images");
        lottieAnimationView.setAnimation(cVar.c().c() + "/data.json");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S3(pc.m3 r8, ao.d<? super wn.v> r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.S3(pc.m3, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T3(pc.o3 r7, ao.d<? super wn.v> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kd.c.j
            if (r0 == 0) goto L13
            r0 = r8
            kd.c$j r0 = (kd.c.j) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            kd.c$j r0 = new kd.c$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38688y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            wn.m.b(r8)
            goto L84
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f38687x
            pc.o3 r7 = (pc.o3) r7
            java.lang.Object r2 = r0.f38686w
            kd.c r2 = (kd.c) r2
            wn.m.b(r8)
            goto L73
        L43:
            java.lang.Object r7 = r0.f38687x
            pc.o3 r7 = (pc.o3) r7
            java.lang.Object r2 = r0.f38686w
            kd.c r2 = (kd.c) r2
            wn.m.b(r8)
            goto L66
        L4f:
            wn.m.b(r8)
            androidx.constraintlayout.widget.ConstraintLayout r8 = r7.D
            r2 = 0
            r8.setVisibility(r2)
            r0.f38686w = r6
            r0.f38687x = r7
            r0.A = r5
            java.lang.Object r8 = r6.U3(r7, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r2 = r6
        L66:
            r0.f38686w = r2
            r0.f38687x = r7
            r0.A = r4
            java.lang.Object r8 = r2.W3(r7, r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            r2.X3(r7)
            r8 = 0
            r0.f38686w = r8
            r0.f38687x = r8
            r0.A = r3
            java.lang.Object r7 = r2.V3(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            wn.v r7 = wn.v.f59242a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.T3(pc.o3, ao.d):java.lang.Object");
    }

    public final Object U3(o3 o3Var, ao.d<? super v> dVar) {
        Object e10 = r0.e(new l(o3Var, this, null), dVar);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V3(pc.o3 r8, ao.d<? super wn.v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kd.c.m
            if (r0 == 0) goto L13
            r0 = r9
            kd.c$m r0 = (kd.c.m) r0
            int r1 = r0.f38709z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38709z = r1
            goto L18
        L13:
            kd.c$m r0 = new kd.c$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f38707x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f38709z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f38706w
            pc.o3 r8 = (pc.o3) r8
            wn.m.b(r9)
            goto L7b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            wn.m.b(r9)
            androidx.appcompat.widget.AppCompatButton r9 = r8.C
            r2 = 0
            r9.setVisibility(r2)
            androidx.appcompat.widget.AppCompatButton r9 = r8.C
            java.lang.String r2 = "binding.closeButton"
            jo.p.g(r9, r2)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r3)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r2.setInterpolator(r4)
            r4 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r4)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r5 = 1106247680(0x41f00000, float:30.0)
            float r5 = de.e.a(r7, r5)
            r6 = 0
            r4.<init>(r6, r6, r5, r6)
            r2.addAnimation(r4)
            android.view.animation.AlphaAnimation r4 = new android.view.animation.AlphaAnimation
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r5)
            r2.addAnimation(r4)
            r0.f38706w = r8
            r0.f38709z = r3
            java.lang.Object r9 = de.n.d(r9, r2, r0)
            if (r9 != r1) goto L7b
            return r1
        L7b:
            androidx.appcompat.widget.AppCompatButton r8 = r8.C
            r8.setEnabled(r3)
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.V3(pc.o3, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W3(pc.o3 r18, ao.d<? super wn.v> r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof kd.c.n
            if (r2 == 0) goto L19
            r2 = r1
            kd.c$n r2 = (kd.c.n) r2
            int r3 = r2.f38713z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f38713z = r3
            r3 = r17
            goto L20
        L19:
            kd.c$n r2 = new kd.c$n
            r3 = r17
            r2.<init>(r1)
        L20:
            java.lang.Object r1 = r2.f38711x
            java.lang.Object r4 = bo.c.c()
            int r5 = r2.f38713z
            r6 = 1
            if (r5 == 0) goto L3d
            if (r5 != r6) goto L35
            java.lang.Object r0 = r2.f38710w
            pc.o3 r0 = (pc.o3) r0
            wn.m.b(r1)
            goto L89
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            wn.m.b(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.R
            java.lang.String r5 = "binding.rankImageView"
            jo.p.g(r1, r5)
            android.view.animation.AnimationSet r5 = new android.view.animation.AnimationSet
            r5.<init>(r6)
            r7 = 300(0x12c, double:1.48E-321)
            r5.setDuration(r7)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r5.setInterpolator(r7)
            r5.setFillAfter(r6)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            r14 = 1056964608(0x3f000000, float:0.5)
            r15 = 1
            r16 = 1056964608(0x3f000000, float:0.5)
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.addAnimation(r7)
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r9)
            r5.addAnimation(r7)
            r2.f38710w = r0
            r2.f38713z = r6
            java.lang.Object r1 = de.n.d(r1, r5, r2)
            if (r1 != r4) goto L89
            return r4
        L89:
            androidx.appcompat.widget.AppCompatImageView r0 = r0.R
            r1 = 0
            r0.setVisibility(r1)
            wn.v r0 = wn.v.f59242a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.W3(pc.o3, ao.d):java.lang.Object");
    }

    public final void X3(o3 o3Var) {
        o3Var.B.setVisibility(0);
        o3Var.B.r();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        p.h(view, "view");
        super.e2(view, bundle);
        e1 T = e1.T(view);
        a.C0542a c0542a = kd.a.G;
        Parcelable parcelable = M2().getParcelable("EXTRA_RESPONSE");
        if (parcelable != null) {
            Context N2 = N2();
            p.g(N2, "requireContext()");
            kd.a a10 = c0542a.a((SeasonRatingStatusResponse) parcelable, N2);
            m3 m3Var = T.B;
            LottieAnimationView lottieAnimationView = m3Var.B;
            p.g(lottieAnimationView, "badgeLottieAnimationView");
            Q3(lottieAnimationView, a10.d());
            m3Var.I.setImageDrawable(c3.a.f(N2(), a10.d().h()));
            m3Var.J.setTextColor(c3.a.d(N2(), a10.d().p()));
            m3Var.J.setText(a10.b());
            AppCompatButton appCompatButton = m3Var.G;
            p.g(appCompatButton, "nextButton");
            g1.a(appCompatButton, new b(T));
            o3 o3Var = T.C;
            LottieAnimationView lottieAnimationView2 = o3Var.B;
            p.g(lottieAnimationView2, "badgeLottieAnimationView");
            Q3(lottieAnimationView2, a10.i());
            o3Var.R.setImageDrawable(c3.a.f(N2(), a10.i().h()));
            o3Var.S.setTextColor(c3.a.d(N2(), a10.i().p()));
            o3Var.S.setText(a10.j());
            o3Var.F.setTextColor(c3.a.d(N2(), a10.i().p()));
            o3Var.F.setText(a10.f());
            o3Var.G.setText(a10.a());
            o3Var.I.setText("/");
            o3Var.M.setText(a10.g());
            o3Var.P.setProgress(a10.h());
            o3Var.P.setProgressDrawable(c3.a.f(N2(), a10.i().n()));
            o3Var.N.setText(a10.c());
            AppCompatButton appCompatButton2 = o3Var.C;
            p.g(appCompatButton2, "closeButton");
            g1.a(appCompatButton2, new C0543c());
            uo.l.d(androidx.lifecycle.v.a(this), null, null, new d(T, null), 3, null);
            Dialog p32 = p3();
            if (p32 != null && (window2 = p32.getWindow()) != null) {
                window2.setLayout(-1, -1);
            }
            Dialog p33 = p3();
            if (p33 != null && (window = p33.getWindow()) != null) {
                window.setWindowAnimations(nc.j.f41901b);
            }
            Dialog p34 = p3();
            if (p34 != null) {
                p34.setCancelable(false);
            }
            J3().c(a10.e());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nc.j.f41900a);
    }
}
