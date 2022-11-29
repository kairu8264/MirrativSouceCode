package com.dena.mirrorman.viewholder;

import ae.oe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
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
import ud.f0;
import uo.b3;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import yd.g1;

/* loaded from: classes3.dex */
public final class GiftGachaOpenEmomoQuestNormalItemViewHolder extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f26250c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f26251d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final oe f26252a;

    /* renamed from: b  reason: collision with root package name */
    public d2 f26253b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final GiftGachaOpenEmomoQuestNormalItemViewHolder a(u uVar, ViewGroup viewGroup) {
            p.h(uVar, "viewLifecycleOwner");
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_gift_gacha_open_emomo_quest_normal_item, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new GiftGachaOpenEmomoQuestNormalItemViewHolder(uVar, (oe) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26256w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(1);
            this.f26256w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> aVar = this.f26256w;
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

    @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestNormalItemViewHolder$bind$2", f = "GiftGachaOpenEmomoQuestNormalItemViewHolder.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<q0, d<? super v>, Object> {
        public final /* synthetic */ f0 A;
        public final /* synthetic */ io.a<v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f26257w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f26258x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26259y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ GiftGachaOpenEmomoQuestNormalItemViewHolder f26260z;

        /* loaded from: classes3.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenEmomoQuestNormalItemViewHolder f26261a;

            public a(GiftGachaOpenEmomoQuestNormalItemViewHolder giftGachaOpenEmomoQuestNormalItemViewHolder) {
                this.f26261a = giftGachaOpenEmomoQuestNormalItemViewHolder;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f26261a.f26252a.F.setVisibility(4);
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

        /* loaded from: classes3.dex */
        public static final class b implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f26262a;

            public b(io.a<v> aVar) {
                this.f26262a = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                io.a<v> aVar = this.f26262a;
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
        public c(long j10, io.a<v> aVar, GiftGachaOpenEmomoQuestNormalItemViewHolder giftGachaOpenEmomoQuestNormalItemViewHolder, f0 f0Var, io.a<v> aVar2, d<? super c> dVar) {
            super(2, dVar);
            this.f26258x = j10;
            this.f26259y = aVar;
            this.f26260z = giftGachaOpenEmomoQuestNormalItemViewHolder;
            this.A = f0Var;
            this.B = aVar2;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new c(this.f26258x, this.f26259y, this.f26260z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f26257w;
            if (i10 == 0) {
                m.b(obj);
                long j10 = this.f26258x;
                this.f26257w = 1;
                if (uo.b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            io.a<v> aVar = this.f26259y;
            if (aVar != null) {
                aVar.invoke();
            }
            AppCompatImageView appCompatImageView = this.f26260z.f26252a.F;
            AnimationSet f10 = this.f26260z.f();
            f10.setAnimationListener(new a(this.f26260z));
            appCompatImageView.startAnimation(f10);
            this.f26260z.f26252a.I.setVisibility(0);
            GiftGachaItemInfoView giftGachaItemInfoView = this.f26260z.f26252a.I;
            o oVar = o.f45415a;
            giftGachaItemInfoView.startAnimation(oVar.c());
            this.f26260z.f26252a.H.setVisibility(0);
            this.f26260z.f26252a.E.setVisibility(this.A.g() ? 0 : 4);
            this.f26260z.f26252a.D.setVisibility(0);
            AnimationSet b10 = oVar.b();
            b10.setAnimationListener(new b(this.B));
            this.f26260z.f26252a.D.startAnimation(b10);
            this.f26260z.f26252a.H.startAnimation(b10);
            return v.f59242a;
        }
    }

    public GiftGachaOpenEmomoQuestNormalItemViewHolder(u uVar, oe oeVar) {
        super(oeVar.u());
        this.f26252a = oeVar;
        this.f26253b = b3.b(null, 1, null);
        uVar.g().a(new r() { // from class: com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestNormalItemViewHolder.1

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenEmomoQuestNormalItemViewHolder$1$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26255a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f26255a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                p.h(uVar2, "source");
                p.h(bVar, "event");
                if (a.f26255a[bVar.ordinal()] == 1) {
                    d2.a.a(GiftGachaOpenEmomoQuestNormalItemViewHolder.this.f26253b, null, 1, null);
                }
            }
        });
    }

    public /* synthetic */ GiftGachaOpenEmomoQuestNormalItemViewHolder(u uVar, oe oeVar, h hVar) {
        this(uVar, oeVar);
    }

    public final void d(f0 f0Var, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3) {
        String string;
        int i10;
        d2 d10;
        p.h(f0Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f26252a.H;
        p.g(appCompatImageView, "binding.itemImageView");
        td.a.D(appCompatImageView, f0Var.b());
        AppCompatImageView appCompatImageView2 = this.f26252a.F;
        p.g(appCompatImageView2, "binding.gachaImageView");
        td.a.f(appCompatImageView2, f0Var.a());
        GiftGachaItemInfoView giftGachaItemInfoView = this.f26252a.I;
        int d11 = f0Var.d();
        if (f0Var.f()) {
            string = this.f26252a.I.getContext().getString(f1.f42000z2);
        } else {
            string = f0Var.e() ? this.f26252a.I.getContext().getString(f1.M1) : this.f26252a.I.getContext().getString(f1.N1);
        }
        p.g(string, "when {\n                b…y_acquired)\n            }");
        if (f0Var.f()) {
            i10 = w0.S;
        } else {
            i10 = f0Var.e() ? w0.f42237m : w0.Y;
        }
        giftGachaItemInfoView.a(d11, string, i10);
        AppCompatImageView appCompatImageView3 = this.f26252a.H;
        p.g(appCompatImageView3, "binding.itemImageView");
        g1.a(appCompatImageView3, new b(aVar3));
        this.f26252a.F.clearAnimation();
        this.f26252a.H.clearAnimation();
        this.f26252a.E.clearAnimation();
        this.f26252a.D.clearAnimation();
        long c10 = f0Var.c() - System.currentTimeMillis();
        if (c10 <= 0) {
            this.f26252a.F.setVisibility(4);
            this.f26252a.H.setVisibility(0);
            this.f26252a.E.setVisibility(f0Var.g() ? 0 : 4);
            this.f26252a.I.setVisibility(0);
            return;
        }
        this.f26252a.F.setVisibility(0);
        this.f26252a.H.setVisibility(4);
        this.f26252a.E.setVisibility(4);
        this.f26252a.I.setVisibility(4);
        this.f26252a.D.setVisibility(4);
        d2.a.a(this.f26253b, null, 1, null);
        d10 = uo.l.d(r0.a(uo.g1.c()), null, null, new c(c10, aVar, this, f0Var, aVar2, null), 3, null);
        this.f26253b = d10;
    }

    public final AnimationSet f() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(233L);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.75f, 1.0f, 1.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setStartOffset(233L);
        scaleAnimation2.setDuration(83L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(233L);
        alphaAnimation.setDuration(66L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }
}
