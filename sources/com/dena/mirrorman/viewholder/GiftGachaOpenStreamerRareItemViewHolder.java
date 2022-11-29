package com.dena.mirrorman.viewholder;

import ae.ye;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
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
import ud.p0;
import uo.b3;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import yd.g1;

/* loaded from: classes3.dex */
public final class GiftGachaOpenStreamerRareItemViewHolder extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f26323c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f26324d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ye f26325a;

    /* renamed from: b  reason: collision with root package name */
    public d2 f26326b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final GiftGachaOpenStreamerRareItemViewHolder a(u uVar, ViewGroup viewGroup) {
            p.h(uVar, "viewLifecycleOwner");
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_gift_gacha_open_streamer_rare_item, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new GiftGachaOpenStreamerRareItemViewHolder(uVar, (ye) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26329w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(1);
            this.f26329w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> aVar = this.f26329w;
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

    @co.f(c = "com.dena.mirrorman.viewholder.GiftGachaOpenStreamerRareItemViewHolder$bind$2", f = "GiftGachaOpenStreamerRareItemViewHolder.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<q0, d<? super v>, Object> {
        public final /* synthetic */ p0 A;

        /* renamed from: w  reason: collision with root package name */
        public int f26330w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f26331x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f26332y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ GiftGachaOpenStreamerRareItemViewHolder f26333z;

        /* loaded from: classes3.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenStreamerRareItemViewHolder f26334a;

            public a(GiftGachaOpenStreamerRareItemViewHolder giftGachaOpenStreamerRareItemViewHolder) {
                this.f26334a = giftGachaOpenStreamerRareItemViewHolder;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f26334a.f26325a.F.setVisibility(4);
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
        public c(long j10, io.a<v> aVar, GiftGachaOpenStreamerRareItemViewHolder giftGachaOpenStreamerRareItemViewHolder, p0 p0Var, d<? super c> dVar) {
            super(2, dVar);
            this.f26331x = j10;
            this.f26332y = aVar;
            this.f26333z = giftGachaOpenStreamerRareItemViewHolder;
            this.A = p0Var;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new c(this.f26331x, this.f26332y, this.f26333z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f26330w;
            if (i10 == 0) {
                m.b(obj);
                this.f26330w = 1;
                if (uo.b1.a(this.f26331x + 250, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            io.a<v> aVar = this.f26332y;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f26333z.f26325a.F.setVisibility(0);
            this.f26333z.f26325a.F.setBorderedTextViewText(this.f26333z.f26325a.F.getResources().getString(f1.text_giftgacha_duplicated_point_2, String.valueOf(this.A.a())));
            BorderedTextView borderedTextView = this.f26333z.f26325a.F;
            AnimationSet a10 = o.f45415a.a(de.m.a(this.f26333z, 30));
            a10.setAnimationListener(new a(this.f26333z));
            borderedTextView.startAnimation(a10);
            return v.f59242a;
        }
    }

    public GiftGachaOpenStreamerRareItemViewHolder(u uVar, ye yeVar) {
        super(yeVar.u());
        this.f26325a = yeVar;
        this.f26326b = b3.b(null, 1, null);
        uVar.g().a(new r() { // from class: com.dena.mirrorman.viewholder.GiftGachaOpenStreamerRareItemViewHolder.1

            /* renamed from: com.dena.mirrorman.viewholder.GiftGachaOpenStreamerRareItemViewHolder$1$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26328a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f26328a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                p.h(uVar2, "source");
                p.h(bVar, "event");
                if (a.f26328a[bVar.ordinal()] == 1) {
                    d2.a.a(GiftGachaOpenStreamerRareItemViewHolder.this.f26326b, null, 1, null);
                }
            }
        });
    }

    public /* synthetic */ GiftGachaOpenStreamerRareItemViewHolder(u uVar, ye yeVar, h hVar) {
        this(uVar, yeVar);
    }

    public final void c(p0 p0Var, io.a<v> aVar, io.a<v> aVar2) {
        d2 d10;
        p.h(p0Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f26325a.G;
        p.g(appCompatImageView, "binding.itemImageView");
        td.a.D(appCompatImageView, p0Var.c());
        GiftGachaItemInfoView giftGachaItemInfoView = this.f26325a.H;
        int d11 = p0Var.d();
        giftGachaItemInfoView.b(p0Var.a(), p0Var.e(), p0Var.f(), d11);
        AppCompatImageView appCompatImageView2 = this.f26325a.G;
        p.g(appCompatImageView2, "binding.itemImageView");
        g1.a(appCompatImageView2, new b(aVar2));
        this.f26325a.J.clearAnimation();
        this.f26325a.J.startAnimation(of.o.f45415a.d());
        this.f26325a.F.setVisibility(4);
        long b10 = p0Var.b() - System.currentTimeMillis();
        if (!p0Var.e() || b10 <= 0) {
            return;
        }
        d2.a.a(this.f26326b, null, 1, null);
        d10 = uo.l.d(r0.a(uo.g1.c()), null, null, new c(b10, aVar, this, p0Var, null), 3, null);
        this.f26326b = d10;
    }
}
