package com.dena.mirrorman.viewholder;

import ae.qe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import ao.d;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;
import ia.a;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import nd.w0;
import of.o;
import ud.g0;
import uo.b3;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes3.dex */
public final class GiftGachaOpenEmomoQuestRareItemViewHolder extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f26263c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f26264d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final qe f26265a;

    /* renamed from: b  reason: collision with root package name */
    public d2 f26266b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final GiftGachaOpenEmomoQuestRareItemViewHolder a(u uVar, ViewGroup viewGroup) {
            p.h(uVar, "viewLifecycleOwner");
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_gift_gacha_open_emomo_quest_rare_item, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new GiftGachaOpenEmomoQuestRareItemViewHolder(uVar, (qe) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26269w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(1);
            this.f26269w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> aVar = this.f26269w;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder$bind$2", f = "GiftGachaOpenEmomoQuestRareItemViewHolder.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<q0, d<? super v>, Object> {
        public final /* synthetic */ g0 A;
        public final /* synthetic */ GiftGachaOpenEmomoQuestRareItemViewHolder B;
        public final /* synthetic */ io.a<v> C;

        /* renamed from: w  reason: collision with root package name */
        public int f26270w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f26271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f26272y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26273z;

        /* loaded from: classes3.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenEmomoQuestRareItemViewHolder f26274a;

            public a(GiftGachaOpenEmomoQuestRareItemViewHolder giftGachaOpenEmomoQuestRareItemViewHolder) {
                this.f26274a = giftGachaOpenEmomoQuestRareItemViewHolder;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f26274a.f26265a.F.setVisibility(4);
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

        @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder$bind$2$3", f = "GiftGachaOpenEmomoQuestRareItemViewHolder.kt", l = {157}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class b extends co.l implements io.p<q0, d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f26275w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenEmomoQuestRareItemViewHolder f26276x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GiftGachaOpenEmomoQuestRareItemViewHolder giftGachaOpenEmomoQuestRareItemViewHolder, d<? super b> dVar) {
                super(2, dVar);
                this.f26276x = giftGachaOpenEmomoQuestRareItemViewHolder;
            }

            @Override // co.a
            public final d<v> create(Object obj, d<?> dVar) {
                return new b(this.f26276x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f26275w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f26275w = 1;
                    if (uo.b1.a(1002L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f26276x.f26265a.J.r();
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder$bind$2$4", f = "GiftGachaOpenEmomoQuestRareItemViewHolder.kt", l = {163}, m = "invokeSuspend")
        /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0231c extends co.l implements io.p<q0, d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f26277w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenEmomoQuestRareItemViewHolder f26278x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ g0 f26279y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f26280z;

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder$c$c$a */
            /* loaded from: classes3.dex */
            public static final class a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f26281a;

                public a(io.a<v> aVar) {
                    this.f26281a = aVar;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    io.a<v> aVar = this.f26281a;
                    if (aVar != null) {
                        aVar.invoke();
                    }
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
            public C0231c(GiftGachaOpenEmomoQuestRareItemViewHolder giftGachaOpenEmomoQuestRareItemViewHolder, g0 g0Var, io.a<v> aVar, d<? super C0231c> dVar) {
                super(2, dVar);
                this.f26278x = giftGachaOpenEmomoQuestRareItemViewHolder;
                this.f26279y = g0Var;
                this.f26280z = aVar;
            }

            @Override // co.a
            public final d<v> create(Object obj, d<?> dVar) {
                return new C0231c(this.f26278x, this.f26279y, this.f26280z, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, d<? super v> dVar) {
                return ((C0231c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f26277w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f26277w = 1;
                    if (uo.b1.a(1000L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f26278x.f26265a.I.setVisibility(0);
                GiftGachaItemInfoView giftGachaItemInfoView = this.f26278x.f26265a.I;
                o oVar = o.f45415a;
                giftGachaItemInfoView.startAnimation(oVar.c());
                this.f26278x.f26265a.H.setVisibility(0);
                this.f26278x.f26265a.E.setVisibility(this.f26279y.h() ? 0 : 4);
                this.f26278x.f26265a.D.setVisibility(0);
                this.f26278x.f26265a.K.setVisibility(0);
                AnimationSet b10 = oVar.b();
                b10.setAnimationListener(new a(this.f26280z));
                this.f26278x.f26265a.H.startAnimation(b10);
                if (this.f26279y.h()) {
                    this.f26278x.f26265a.E.startAnimation(b10);
                }
                this.f26278x.f26265a.D.startAnimation(b10);
                this.f26278x.f26265a.K.startAnimation(b10);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, io.a<v> aVar, g0 g0Var, GiftGachaOpenEmomoQuestRareItemViewHolder giftGachaOpenEmomoQuestRareItemViewHolder, io.a<v> aVar2, d<? super c> dVar) {
            super(2, dVar);
            this.f26272y = j10;
            this.f26273z = aVar;
            this.A = g0Var;
            this.B = giftGachaOpenEmomoQuestRareItemViewHolder;
            this.C = aVar2;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            c cVar = new c(this.f26272y, this.f26273z, this.A, this.B, this.C, dVar);
            cVar.f26271x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object c10 = bo.c.c();
            int i10 = this.f26270w;
            if (i10 == 0) {
                m.b(obj);
                q0Var = (q0) this.f26271x;
                long j10 = this.f26272y;
                this.f26271x = q0Var;
                this.f26270w = 1;
                if (uo.b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
                q0Var = (q0) this.f26271x;
            }
            io.a<v> aVar = this.f26273z;
            if (aVar != null) {
                aVar.invoke();
            }
            if (this.A.e()) {
                this.B.f26265a.L.setVisibility(0);
                AppCompatImageView appCompatImageView = this.B.f26265a.L;
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(o.f45415a.d());
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                alphaAnimation.setDuration(300L);
                animationSet.addAnimation(alphaAnimation);
                appCompatImageView.startAnimation(animationSet);
                AppCompatImageView appCompatImageView2 = this.B.f26265a.F;
                AnimationSet f10 = this.B.f();
                f10.setAnimationListener(new a(this.B));
                appCompatImageView2.startAnimation(f10);
                uo.l.d(q0Var, null, null, new b(this.B, null), 3, null);
                uo.l.d(q0Var, null, null, new C0231c(this.B, this.A, this.C, null), 3, null);
            }
            return v.f59242a;
        }
    }

    public GiftGachaOpenEmomoQuestRareItemViewHolder(u uVar, qe qeVar) {
        super(qeVar.u());
        this.f26265a = qeVar;
        this.f26266b = b3.b(null, 1, null);
        uVar.g().a(new r() { // from class: com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder.1

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestRareItemViewHolder$1$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26268a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f26268a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                p.h(uVar2, "source");
                p.h(bVar, "event");
                if (a.f26268a[bVar.ordinal()] == 1) {
                    d2.a.a(GiftGachaOpenEmomoQuestRareItemViewHolder.this.f26266b, null, 1, null);
                }
            }
        });
    }

    public /* synthetic */ GiftGachaOpenEmomoQuestRareItemViewHolder(u uVar, qe qeVar, h hVar) {
        this(uVar, qeVar);
    }

    public final void d(g0 g0Var, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3) {
        String string;
        int i10;
        d2 d10;
        p.h(g0Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f26265a.H;
        p.g(appCompatImageView, "binding.itemImageView");
        td.a.D(appCompatImageView, g0Var.b());
        AppCompatImageView appCompatImageView2 = this.f26265a.F;
        p.g(appCompatImageView2, "binding.gachaImageView");
        td.a.f(appCompatImageView2, g0Var.a());
        GiftGachaItemInfoView giftGachaItemInfoView = this.f26265a.I;
        int d11 = g0Var.d();
        if (g0Var.g()) {
            string = this.f26265a.I.getContext().getString(f1.f42000z2);
        } else {
            string = g0Var.f() ? this.f26265a.I.getContext().getString(f1.M1) : this.f26265a.I.getContext().getString(f1.N1);
        }
        p.g(string, "when {\n                b…y_acquired)\n            }");
        if (g0Var.g()) {
            i10 = w0.S;
        } else {
            i10 = g0Var.f() ? w0.f42237m : w0.Y;
        }
        giftGachaItemInfoView.a(d11, string, i10);
        AppCompatImageView appCompatImageView3 = this.f26265a.H;
        p.g(appCompatImageView3, "binding.itemImageView");
        g1.a(appCompatImageView3, new b(aVar3));
        this.f26265a.F.clearAnimation();
        this.f26265a.H.clearAnimation();
        this.f26265a.E.clearAnimation();
        this.f26265a.D.clearAnimation();
        this.f26265a.L.clearAnimation();
        this.f26265a.K.clearAnimation();
        long c10 = g0Var.c() - System.currentTimeMillis();
        int i11 = (c10 > 0L ? 1 : (c10 == 0L ? 0 : -1));
        if (i11 > 0 && g0Var.e()) {
            this.f26265a.F.setVisibility(0);
            this.f26265a.H.setVisibility(4);
            this.f26265a.E.setVisibility(4);
            this.f26265a.I.setVisibility(4);
            this.f26265a.D.setVisibility(4);
            this.f26265a.L.setVisibility(4);
            this.f26265a.K.setVisibility(4);
        } else {
            this.f26265a.F.setVisibility(4);
            this.f26265a.H.setVisibility(0);
            this.f26265a.E.setVisibility(g0Var.h() ? 0 : 4);
            this.f26265a.I.setVisibility(0);
            this.f26265a.L.setVisibility(0);
            this.f26265a.K.setVisibility(0);
            this.f26265a.L.startAnimation(of.o.f45415a.d());
            if (i11 <= 0) {
                return;
            }
        }
        d2.a.a(this.f26266b, null, 1, null);
        d10 = uo.l.d(r0.a(uo.g1.c()), null, null, new c(c10, aVar, g0Var, this, aVar2, null), 3, null);
        this.f26266b = d10;
    }

    public final AnimationSet f() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(233L);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.75f, 1.0f, 1.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setStartOffset(1235L);
        scaleAnimation2.setDuration(66L);
        scaleAnimation2.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(scaleAnimation2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(1235L);
        alphaAnimation.setDuration(66L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(alphaAnimation);
        for (Number number : s.m(Float.valueOf(14.0f), Float.valueOf(43.0f))) {
            float floatValue = number.floatValue();
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -6.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setStartOffset(floatValue * 16.7f);
            rotateAnimation.setDuration(50L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(rotateAnimation);
            RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 12.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation2.setStartOffset((3.0f + floatValue) * 16.7f);
            rotateAnimation2.setDuration(50L);
            rotateAnimation2.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(rotateAnimation2);
            RotateAnimation rotateAnimation3 = new RotateAnimation(0.0f, -12.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation3.setStartOffset((6.0f + floatValue) * 16.7f);
            rotateAnimation3.setDuration(50L);
            rotateAnimation3.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(rotateAnimation3);
            RotateAnimation rotateAnimation4 = new RotateAnimation(0.0f, 12.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation4.setStartOffset((9.0f + floatValue) * 16.7f);
            rotateAnimation4.setDuration(50L);
            rotateAnimation4.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(rotateAnimation4);
            RotateAnimation rotateAnimation5 = new RotateAnimation(0.0f, -6.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation5.setStartOffset((floatValue + 12.0f) * 16.7f);
            rotateAnimation5.setDuration(50L);
            rotateAnimation5.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(rotateAnimation5);
        }
        return animationSet;
    }
}
