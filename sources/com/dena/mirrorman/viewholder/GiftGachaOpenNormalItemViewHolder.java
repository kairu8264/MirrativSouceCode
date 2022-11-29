package com.dena.mirrorman.viewholder;

import ae.se;
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
import ud.j0;
import uo.b3;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import yd.g1;

/* loaded from: classes3.dex */
public final class GiftGachaOpenNormalItemViewHolder extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f26282c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f26283d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final se f26284a;

    /* renamed from: b  reason: collision with root package name */
    public d2 f26285b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final GiftGachaOpenNormalItemViewHolder a(u uVar, ViewGroup viewGroup) {
            p.h(uVar, "viewLifecycleOwner");
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_gift_gacha_open_normal_item, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new GiftGachaOpenNormalItemViewHolder(uVar, (se) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26288w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(1);
            this.f26288w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> aVar = this.f26288w;
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

    @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenNormalItemViewHolder$bind$2", f = "GiftGachaOpenNormalItemViewHolder.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<q0, d<? super v>, Object> {
        public final /* synthetic */ GiftGachaOpenNormalItemViewHolder A;
        public final /* synthetic */ j0 B;
        public final /* synthetic */ io.a<v> C;
        public final /* synthetic */ io.a<v> D;

        /* renamed from: w  reason: collision with root package name */
        public int f26289w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f26290x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f26291y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26292z;

        /* loaded from: classes3.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenNormalItemViewHolder f26293a;

            public a(GiftGachaOpenNormalItemViewHolder giftGachaOpenNormalItemViewHolder) {
                this.f26293a = giftGachaOpenNormalItemViewHolder;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f26293a.f26284a.F.setVisibility(4);
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

        @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenNormalItemViewHolder$bind$2$2", f = "GiftGachaOpenNormalItemViewHolder.kt", l = {145}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class b extends co.l implements io.p<q0, d<? super v>, Object> {
            public final /* synthetic */ j0 A;

            /* renamed from: w  reason: collision with root package name */
            public int f26294w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f26295x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f26296y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenNormalItemViewHolder f26297z;

            /* loaded from: classes3.dex */
            public static final class a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ GiftGachaOpenNormalItemViewHolder f26298a;

                public a(GiftGachaOpenNormalItemViewHolder giftGachaOpenNormalItemViewHolder) {
                    this.f26298a = giftGachaOpenNormalItemViewHolder;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    this.f26298a.f26284a.E.setVisibility(4);
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
            public b(long j10, io.a<v> aVar, GiftGachaOpenNormalItemViewHolder giftGachaOpenNormalItemViewHolder, j0 j0Var, d<? super b> dVar) {
                super(2, dVar);
                this.f26295x = j10;
                this.f26296y = aVar;
                this.f26297z = giftGachaOpenNormalItemViewHolder;
                this.A = j0Var;
            }

            @Override // co.a
            public final d<v> create(Object obj, d<?> dVar) {
                return new b(this.f26295x, this.f26296y, this.f26297z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f26294w;
                if (i10 == 0) {
                    m.b(obj);
                    long j10 = this.f26295x;
                    this.f26294w = 1;
                    if (uo.b1.a(j10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                io.a<v> aVar = this.f26296y;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f26297z.f26284a.E.setVisibility(0);
                this.f26297z.f26284a.E.setBorderedTextViewText(this.f26297z.f26284a.u().getResources().getString(f1.text_giftgacha_duplicated_point_2, String.valueOf(this.A.a())));
                BorderedTextView borderedTextView = this.f26297z.f26284a.E;
                AnimationSet a10 = o.f45415a.a(de.m.a(this.f26297z, 30));
                a10.setAnimationListener(new a(this.f26297z));
                borderedTextView.startAnimation(a10);
                return v.f59242a;
            }
        }

        /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenNormalItemViewHolder$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0232c implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f26299a;

            public C0232c(io.a<v> aVar) {
                this.f26299a = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                io.a<v> aVar = this.f26299a;
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
        public c(long j10, io.a<v> aVar, GiftGachaOpenNormalItemViewHolder giftGachaOpenNormalItemViewHolder, j0 j0Var, io.a<v> aVar2, io.a<v> aVar3, d<? super c> dVar) {
            super(2, dVar);
            this.f26291y = j10;
            this.f26292z = aVar;
            this.A = giftGachaOpenNormalItemViewHolder;
            this.B = j0Var;
            this.C = aVar2;
            this.D = aVar3;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            c cVar = new c(this.f26291y, this.f26292z, this.A, this.B, this.C, this.D, dVar);
            cVar.f26290x = obj;
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
            int i10 = this.f26289w;
            if (i10 == 0) {
                m.b(obj);
                q0 q0Var2 = (q0) this.f26290x;
                long j10 = this.f26291y;
                this.f26290x = q0Var2;
                this.f26289w = 1;
                if (uo.b1.a(j10, this) == c10) {
                    return c10;
                }
                q0Var = q0Var2;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
                q0Var = (q0) this.f26290x;
            }
            io.a<v> aVar = this.f26292z;
            if (aVar != null) {
                aVar.invoke();
            }
            AppCompatImageView appCompatImageView = this.A.f26284a.F;
            AnimationSet f10 = this.A.f();
            f10.setAnimationListener(new a(this.A));
            appCompatImageView.startAnimation(f10);
            this.A.f26284a.I.setVisibility(0);
            GiftGachaItemInfoView giftGachaItemInfoView = this.A.f26284a.I;
            o oVar = o.f45415a;
            giftGachaItemInfoView.startAnimation(oVar.c());
            this.A.f26284a.H.setVisibility(0);
            this.A.f26284a.D.setVisibility(0);
            AnimationSet b10 = oVar.b();
            b10.setAnimationListener(new C0232c(this.C));
            this.A.f26284a.D.startAnimation(b10);
            this.A.f26284a.H.startAnimation(b10);
            if (this.B.f()) {
                uo.l.d(q0Var, null, null, new b(250L, this.D, this.A, this.B, null), 3, null);
            }
            return v.f59242a;
        }
    }

    public GiftGachaOpenNormalItemViewHolder(u uVar, se seVar) {
        super(seVar.u());
        this.f26284a = seVar;
        this.f26285b = b3.b(null, 1, null);
        uVar.g().a(new r() { // from class: com.dena.mirrorman.viewholder.GiftGachaOpenNormalItemViewHolder.1

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenNormalItemViewHolder$1$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26287a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f26287a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                p.h(uVar2, "source");
                p.h(bVar, "event");
                if (a.f26287a[bVar.ordinal()] == 1) {
                    d2.a.a(GiftGachaOpenNormalItemViewHolder.this.f26285b, null, 1, null);
                }
            }
        });
    }

    public /* synthetic */ GiftGachaOpenNormalItemViewHolder(u uVar, se seVar, h hVar) {
        this(uVar, seVar);
    }

    public final void d(j0 j0Var, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3, io.a<v> aVar4) {
        d2 d10;
        p.h(j0Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f26284a.H;
        p.g(appCompatImageView, "binding.itemImageView");
        td.a.D(appCompatImageView, j0Var.c());
        AppCompatImageView appCompatImageView2 = this.f26284a.F;
        p.g(appCompatImageView2, "binding.gachaImageView");
        td.a.f(appCompatImageView2, j0Var.b());
        GiftGachaItemInfoView giftGachaItemInfoView = this.f26284a.I;
        int e10 = j0Var.e();
        giftGachaItemInfoView.b(j0Var.a(), j0Var.f(), j0Var.g(), e10);
        AppCompatImageView appCompatImageView3 = this.f26284a.H;
        p.g(appCompatImageView3, "binding.itemImageView");
        g1.a(appCompatImageView3, new b(aVar4));
        this.f26284a.F.clearAnimation();
        this.f26284a.H.clearAnimation();
        this.f26284a.D.clearAnimation();
        this.f26284a.E.clearAnimation();
        long d11 = j0Var.d() - System.currentTimeMillis();
        if (d11 <= 0) {
            this.f26284a.F.setVisibility(4);
            this.f26284a.E.setVisibility(4);
            this.f26284a.H.setVisibility(0);
            this.f26284a.I.setVisibility(0);
            return;
        }
        this.f26284a.F.setVisibility(0);
        this.f26284a.H.setVisibility(4);
        this.f26284a.I.setVisibility(4);
        this.f26284a.E.setVisibility(4);
        this.f26284a.D.setVisibility(4);
        d2.a.a(this.f26285b, null, 1, null);
        d10 = uo.l.d(r0.a(uo.g1.c()), null, null, new c(d11, aVar, this, j0Var, aVar3, aVar2, null), 3, null);
        this.f26285b = d10;
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
