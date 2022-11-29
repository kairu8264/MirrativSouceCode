package com.dena.mirrorman.viewholder;

import ae.ue;
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
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;
import ia.a;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import of.o;
import ud.l0;
import uo.b3;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes3.dex */
public final class GiftGachaOpenRareItemViewHolder extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f26300c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f26301d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ue f26302a;

    /* renamed from: b  reason: collision with root package name */
    public d2 f26303b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final GiftGachaOpenRareItemViewHolder a(u uVar, ViewGroup viewGroup) {
            p.h(uVar, "viewLifecycleOwner");
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_gift_gacha_open_rare_item, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new GiftGachaOpenRareItemViewHolder(uVar, (ue) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26306w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(1);
            this.f26306w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> aVar = this.f26306w;
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

    @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$bind$2", f = "GiftGachaOpenRareItemViewHolder.kt", l = {121}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ l0 A;
        public final /* synthetic */ GiftGachaOpenRareItemViewHolder B;
        public final /* synthetic */ io.a<v> C;
        public final /* synthetic */ io.a<v> D;

        /* renamed from: w  reason: collision with root package name */
        public int f26307w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f26308x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f26309y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26310z;

        /* loaded from: classes3.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenRareItemViewHolder f26311a;

            public a(GiftGachaOpenRareItemViewHolder giftGachaOpenRareItemViewHolder) {
                this.f26311a = giftGachaOpenRareItemViewHolder;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f26311a.f26302a.F.setVisibility(4);
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

        @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$bind$2$3", f = "GiftGachaOpenRareItemViewHolder.kt", l = {152}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f26312w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenRareItemViewHolder f26313x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GiftGachaOpenRareItemViewHolder giftGachaOpenRareItemViewHolder, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f26313x = giftGachaOpenRareItemViewHolder;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f26313x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f26312w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f26312w = 1;
                    if (uo.b1.a(1002L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f26313x.f26302a.K.r();
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$bind$2$4", f = "GiftGachaOpenRareItemViewHolder.kt", l = {158}, m = "invokeSuspend")
        /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0233c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f26314w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenRareItemViewHolder f26315x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f26316y;

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$c$c$a */
            /* loaded from: classes3.dex */
            public static final class a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f26317a;

                public a(io.a<v> aVar) {
                    this.f26317a = aVar;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    io.a<v> aVar = this.f26317a;
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
            public C0233c(GiftGachaOpenRareItemViewHolder giftGachaOpenRareItemViewHolder, io.a<v> aVar, ao.d<? super C0233c> dVar) {
                super(2, dVar);
                this.f26315x = giftGachaOpenRareItemViewHolder;
                this.f26316y = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C0233c(this.f26315x, this.f26316y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C0233c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f26314w;
                if (i10 == 0) {
                    m.b(obj);
                    this.f26314w = 1;
                    if (uo.b1.a(1000L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f26315x.f26302a.I.setVisibility(0);
                GiftGachaItemInfoView giftGachaItemInfoView = this.f26315x.f26302a.I;
                o oVar = o.f45415a;
                giftGachaItemInfoView.startAnimation(oVar.c());
                this.f26315x.f26302a.H.setVisibility(0);
                this.f26315x.f26302a.D.setVisibility(0);
                this.f26315x.f26302a.L.setVisibility(0);
                AnimationSet b10 = oVar.b();
                b10.setAnimationListener(new a(this.f26316y));
                this.f26315x.f26302a.H.startAnimation(b10);
                this.f26315x.f26302a.D.startAnimation(b10);
                this.f26315x.f26302a.L.startAnimation(b10);
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$bind$2$5", f = "GiftGachaOpenRareItemViewHolder.kt", l = {184}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {
            public final /* synthetic */ l0 A;

            /* renamed from: w  reason: collision with root package name */
            public int f26318w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f26319x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f26320y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenRareItemViewHolder f26321z;

            /* loaded from: classes3.dex */
            public static final class a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ GiftGachaOpenRareItemViewHolder f26322a;

                public a(GiftGachaOpenRareItemViewHolder giftGachaOpenRareItemViewHolder) {
                    this.f26322a = giftGachaOpenRareItemViewHolder;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    this.f26322a.f26302a.E.setVisibility(4);
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
            public d(long j10, io.a<v> aVar, GiftGachaOpenRareItemViewHolder giftGachaOpenRareItemViewHolder, l0 l0Var, ao.d<? super d> dVar) {
                super(2, dVar);
                this.f26319x = j10;
                this.f26320y = aVar;
                this.f26321z = giftGachaOpenRareItemViewHolder;
                this.A = l0Var;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new d(this.f26319x, this.f26320y, this.f26321z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f26318w;
                if (i10 == 0) {
                    m.b(obj);
                    long j10 = this.f26319x;
                    this.f26318w = 1;
                    if (uo.b1.a(j10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                io.a<v> aVar = this.f26320y;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f26321z.f26302a.E.setVisibility(0);
                this.f26321z.f26302a.E.setBorderedTextViewText(this.f26321z.f26302a.u().getResources().getString(f1.text_giftgacha_duplicated_point_2, String.valueOf(this.A.a())));
                BorderedTextView borderedTextView = this.f26321z.f26302a.E;
                AnimationSet a10 = o.f45415a.a(de.m.a(this.f26321z, 30));
                a10.setAnimationListener(new a(this.f26321z));
                borderedTextView.startAnimation(a10);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, io.a<v> aVar, l0 l0Var, GiftGachaOpenRareItemViewHolder giftGachaOpenRareItemViewHolder, io.a<v> aVar2, io.a<v> aVar3, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f26309y = j10;
            this.f26310z = aVar;
            this.A = l0Var;
            this.B = giftGachaOpenRareItemViewHolder;
            this.C = aVar2;
            this.D = aVar3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f26309y, this.f26310z, this.A, this.B, this.C, this.D, dVar);
            cVar.f26308x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object c10 = bo.c.c();
            int i10 = this.f26307w;
            if (i10 == 0) {
                m.b(obj);
                q0Var = (q0) this.f26308x;
                long j10 = this.f26309y;
                this.f26308x = q0Var;
                this.f26307w = 1;
                if (uo.b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
                q0Var = (q0) this.f26308x;
            }
            io.a<v> aVar = this.f26310z;
            if (aVar != null) {
                aVar.invoke();
            }
            if (this.A.g()) {
                this.B.f26302a.M.setVisibility(0);
                AppCompatImageView appCompatImageView = this.B.f26302a.M;
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(o.f45415a.d());
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                alphaAnimation.setDuration(300L);
                animationSet.addAnimation(alphaAnimation);
                appCompatImageView.startAnimation(animationSet);
                AppCompatImageView appCompatImageView2 = this.B.f26302a.F;
                AnimationSet f10 = this.B.f();
                f10.setAnimationListener(new a(this.B));
                appCompatImageView2.startAnimation(f10);
                uo.l.d(q0Var, null, null, new b(this.B, null), 3, null);
                uo.l.d(q0Var, null, null, new C0233c(this.B, this.C, null), 3, null);
            }
            if (this.A.f()) {
                uo.l.d(q0Var, null, null, new d(1250L, this.D, this.B, this.A, null), 3, null);
            }
            return v.f59242a;
        }
    }

    public GiftGachaOpenRareItemViewHolder(u uVar, ue ueVar) {
        super(ueVar.u());
        this.f26302a = ueVar;
        this.f26303b = b3.b(null, 1, null);
        uVar.g().a(new r() { // from class: com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder.1

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenRareItemViewHolder$1$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26305a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f26305a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                p.h(uVar2, "source");
                p.h(bVar, "event");
                if (a.f26305a[bVar.ordinal()] == 1) {
                    d2.a.a(GiftGachaOpenRareItemViewHolder.this.f26303b, null, 1, null);
                }
            }
        });
    }

    public /* synthetic */ GiftGachaOpenRareItemViewHolder(u uVar, ue ueVar, h hVar) {
        this(uVar, ueVar);
    }

    public final void d(l0 l0Var, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3, io.a<v> aVar4) {
        d2 d10;
        p.h(l0Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f26302a.H;
        p.g(appCompatImageView, "binding.itemImageView");
        td.a.D(appCompatImageView, l0Var.c());
        AppCompatImageView appCompatImageView2 = this.f26302a.F;
        p.g(appCompatImageView2, "binding.gachaImageView");
        td.a.f(appCompatImageView2, l0Var.b());
        GiftGachaItemInfoView giftGachaItemInfoView = this.f26302a.I;
        int e10 = l0Var.e();
        giftGachaItemInfoView.b(l0Var.a(), l0Var.f(), l0Var.h(), e10);
        AppCompatImageView appCompatImageView3 = this.f26302a.H;
        p.g(appCompatImageView3, "binding.itemImageView");
        g1.a(appCompatImageView3, new b(aVar4));
        this.f26302a.F.clearAnimation();
        this.f26302a.H.clearAnimation();
        this.f26302a.D.clearAnimation();
        this.f26302a.E.clearAnimation();
        this.f26302a.M.clearAnimation();
        this.f26302a.L.clearAnimation();
        long d11 = l0Var.d() - System.currentTimeMillis();
        int i10 = (d11 > 0L ? 1 : (d11 == 0L ? 0 : -1));
        if (i10 > 0 && l0Var.g()) {
            this.f26302a.F.setVisibility(0);
            this.f26302a.H.setVisibility(4);
            this.f26302a.I.setVisibility(4);
            this.f26302a.E.setVisibility(4);
            this.f26302a.D.setVisibility(4);
            this.f26302a.M.setVisibility(4);
            this.f26302a.L.setVisibility(4);
        } else {
            this.f26302a.F.setVisibility(4);
            this.f26302a.E.setVisibility(4);
            this.f26302a.H.setVisibility(0);
            this.f26302a.I.setVisibility(0);
            this.f26302a.M.setVisibility(0);
            this.f26302a.L.setVisibility(0);
            this.f26302a.M.startAnimation(of.o.f45415a.d());
            if (i10 <= 0) {
                return;
            }
        }
        d2.a.a(this.f26303b, null, 1, null);
        d10 = uo.l.d(r0.a(uo.g1.c()), null, null, new c(d11, aVar, l0Var, this, aVar3, aVar2, null), 3, null);
        this.f26303b = d10;
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
