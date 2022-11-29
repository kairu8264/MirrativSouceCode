package com.dena.mirrativ.player.gifting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c3.a;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.player.gifting.GiftComboView;
import g7.b;
import g7.d;
import hb.a2;
import hb.v1;
import java.util.List;
import jo.h;
import jo.p;
import lb.e;
import s6.g;
import s6.k;
import xn.s;

/* loaded from: classes2.dex */
public final class GiftComboView extends FrameLayout {
    public ImageView A;

    /* renamed from: w  reason: collision with root package name */
    public final List<Drawable> f22663w;

    /* renamed from: x  reason: collision with root package name */
    public final LottieAnimationView f22664x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f22665y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f22666z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ GiftComboView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final Bitmap f(g gVar) {
        return null;
    }

    public static final d g(GiftComboView giftComboView, b bVar) {
        p.h(giftComboView, "this$0");
        Object c10 = bVar.c();
        p.g(c10, "it.startValue");
        Object a10 = bVar.a();
        p.g(a10, "it.endValue");
        d e10 = giftComboView.e((d) c10, (d) a10, bVar.b());
        ImageView imageView = giftComboView.f22665y;
        ImageView imageView2 = null;
        if (imageView == null) {
            p.v("signView");
            imageView = null;
        }
        imageView.setScaleX(e10.b());
        ImageView imageView3 = giftComboView.f22665y;
        if (imageView3 == null) {
            p.v("signView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setScaleY(e10.c());
        return e10;
    }

    public static final d h(GiftComboView giftComboView, b bVar) {
        p.h(giftComboView, "this$0");
        Object c10 = bVar.c();
        p.g(c10, "it.startValue");
        Object a10 = bVar.a();
        p.g(a10, "it.endValue");
        d e10 = giftComboView.e((d) c10, (d) a10, bVar.b());
        ImageView imageView = giftComboView.f22666z;
        ImageView imageView2 = null;
        if (imageView == null) {
            p.v("number10View");
            imageView = null;
        }
        imageView.setScaleX(e10.b());
        ImageView imageView3 = giftComboView.f22666z;
        if (imageView3 == null) {
            p.v("number10View");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setScaleY(e10.c());
        return e10;
    }

    public static final d i(GiftComboView giftComboView, b bVar) {
        p.h(giftComboView, "this$0");
        Object c10 = bVar.c();
        p.g(c10, "it.startValue");
        Object a10 = bVar.a();
        p.g(a10, "it.endValue");
        d e10 = giftComboView.e((d) c10, (d) a10, bVar.b());
        ImageView imageView = giftComboView.A;
        ImageView imageView2 = null;
        if (imageView == null) {
            p.v("number1View");
            imageView = null;
        }
        imageView.setScaleX(e10.b());
        ImageView imageView3 = giftComboView.A;
        if (imageView3 == null) {
            p.v("number1View");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setScaleY(e10.c());
        return e10;
    }

    public final d e(d dVar, d dVar2, float f10) {
        return new d(dVar.b() + ((dVar2.b() - dVar.b()) * f10), dVar.c() + ((dVar2.c() - dVar.c()) * f10));
    }

    public final void setCount(int i10) {
        if (i10 < 0) {
            return;
        }
        int min = Math.min(99, i10);
        this.f22664x.q();
        int i11 = min % 10;
        int i12 = min / 10;
        ImageView imageView = this.A;
        ImageView imageView2 = null;
        if (imageView == null) {
            p.v("number1View");
            imageView = null;
        }
        imageView.setImageDrawable(this.f22663w.get(i11));
        ImageView imageView3 = this.f22666z;
        if (imageView3 == null) {
            p.v("number10View");
            imageView3 = null;
        }
        imageView3.setImageDrawable(this.f22663w.get(i12));
        if (i12 == 0) {
            ImageView imageView4 = this.f22666z;
            if (imageView4 == null) {
                p.v("number10View");
            } else {
                imageView2 = imageView4;
            }
            imageView2.setVisibility(8);
        } else {
            ImageView imageView5 = this.f22666z;
            if (imageView5 == null) {
                p.v("number10View");
            } else {
                imageView2 = imageView5;
            }
            imageView2.setVisibility(0);
        }
        this.f22664x.r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f22663w = s.m(a.f(context, v1.combo_number_0), a.f(context, v1.combo_number_1), a.f(context, v1.combo_number_2), a.f(context, v1.combo_number_3), a.f(context, v1.combo_number_4), a.f(context, v1.combo_number_5), a.f(context, v1.combo_number_6), a.f(context, v1.combo_number_7), a.f(context, v1.combo_number_8), a.f(context, v1.combo_number_9));
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lottieAnimationView.setAnimation(a2.combo_number);
        lottieAnimationView.setImageAssetDelegate(e.f39782a);
        y6.e eVar = new y6.e("\rcombo_number_x");
        d dVar = k.f52152o;
        lottieAnimationView.g(eVar, dVar, new g7.e() { // from class: lb.b
            @Override // g7.e
            public final Object a(g7.b bVar) {
                g7.d g10;
                g10 = GiftComboView.g(GiftComboView.this, bVar);
                return g10;
            }
        });
        lottieAnimationView.g(new y6.e("\r\rcombo_number_11"), dVar, new g7.e() { // from class: lb.d
            @Override // g7.e
            public final Object a(g7.b bVar) {
                g7.d h10;
                h10 = GiftComboView.h(GiftComboView.this, bVar);
                return h10;
            }
        });
        lottieAnimationView.g(new y6.e("\r\rcombo_number_1"), dVar, new g7.e() { // from class: lb.c
            @Override // g7.e
            public final Object a(g7.b bVar) {
                g7.d i11;
                i11 = GiftComboView.i(GiftComboView.this, bVar);
                return i11;
            }
        });
        this.f22664x = lottieAnimationView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setClipChildren(false);
        this.f22665y = new ImageView(context);
        this.f22666z = new ImageView(context);
        this.A = new ImageView(context);
        ImageView[] imageViewArr = new ImageView[3];
        ImageView imageView = this.f22665y;
        ImageView imageView2 = null;
        if (imageView == null) {
            p.v("signView");
            imageView = null;
        }
        imageViewArr[0] = imageView;
        ImageView imageView3 = this.f22666z;
        if (imageView3 == null) {
            p.v("number10View");
            imageView3 = null;
        }
        imageViewArr[1] = imageView3;
        ImageView imageView4 = this.A;
        if (imageView4 == null) {
            p.v("number1View");
            imageView4 = null;
        }
        imageViewArr[2] = imageView4;
        for (ImageView imageView5 : s.m(imageViewArr)) {
            imageView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            imageView5.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView5.setAdjustViewBounds(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.weight = 1.0f;
            linearLayout.addView(imageView5, layoutParams2);
        }
        ImageView imageView6 = this.f22665y;
        if (imageView6 == null) {
            p.v("signView");
        } else {
            imageView2 = imageView6;
        }
        imageView2.setImageDrawable(a.f(context, v1.combo_number_x));
        addView(this.f22664x);
        addView(linearLayout);
        setClipChildren(false);
    }
}
