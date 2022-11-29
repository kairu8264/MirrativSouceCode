package com.dena.mirrorman.feature.player.gifting;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ao.d;
import ao.g;
import bo.c;
import co.f;
import co.l;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.feature.player.gifting.GiftParticleView;
import da.j;
import de.i;
import de.k;
import io.p;
import java.util.Random;
import jo.h;
import nd.e1;
import nd.x0;
import o3.c0;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class GiftParticleView extends FrameLayout implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f25965w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f25962x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25963y = j.f29340x;

    /* renamed from: z  reason: collision with root package name */
    public static final Random f25964z = new Random();
    public static final LinearInterpolator A = new LinearInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator(1.5f);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @f(c = "com.dena.mirrorman.feature.player.gifting.GiftParticleView$addParticle$1", f = "GiftParticleView.kt", l = {108, 112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ PointF B;
        public final /* synthetic */ PointF C;

        /* renamed from: w  reason: collision with root package name */
        public int f25966w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ImageView f25968y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f25969z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageView imageView, LottieAnimationView lottieAnimationView, io.a<v> aVar, PointF pointF, PointF pointF2, d<? super b> dVar) {
            super(2, dVar);
            this.f25968y = imageView;
            this.f25969z = lottieAnimationView;
            this.A = aVar;
            this.B = pointF;
            this.C = pointF2;
        }

        public static final void g(ImageView imageView, GiftParticleView giftParticleView, PointF pointF, PointF pointF2, ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            imageView.setX(GiftParticleView.h(giftParticleView, pointF.x, pointF2.x, floatValue, null, 8, null));
            imageView.setY(giftParticleView.g(pointF.y, pointF2.y, floatValue, GiftParticleView.B));
            imageView.setScaleX(GiftParticleView.h(giftParticleView, 1.0f, 0.8f, floatValue, null, 8, null));
            imageView.setScaleY(GiftParticleView.h(giftParticleView, 1.0f, 0.8f, floatValue, null, 8, null));
            imageView.setRotation(GiftParticleView.h(giftParticleView, 0.0f, 60.0f, floatValue, null, 8, null));
            c0.i0(imageView);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(this.f25968y, this.f25969z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = c.c();
            int i10 = this.f25966w;
            if (i10 == 0) {
                m.b(obj);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final ImageView imageView = this.f25968y;
                final GiftParticleView giftParticleView = GiftParticleView.this;
                final PointF pointF = this.B;
                final PointF pointF2 = this.C;
                ofFloat.setDuration(1000L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ve.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GiftParticleView.b.g(imageView, giftParticleView, pointF, pointF2, valueAnimator);
                    }
                });
                jo.p.g(ofFloat, "ofFloat(0f, 1f).also { i…          }\n            }");
                this.f25966w = 1;
                if (de.b.a(ofFloat, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m.b(obj);
                GiftParticleView.this.removeView(this.f25969z);
                this.A.invoke();
                return v.f59242a;
            } else {
                m.b(obj);
            }
            GiftParticleView.this.removeView(this.f25968y);
            this.f25969z.setVisibility(0);
            LottieAnimationView lottieAnimationView = this.f25969z;
            this.f25966w = 2;
            if (i.a(lottieAnimationView, this) == c10) {
                return c10;
            }
            GiftParticleView.this.removeView(this.f25969z);
            this.A.invoke();
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftParticleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ GiftParticleView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void d(GiftParticleView giftParticleView, String str, PointF pointF, int i10, io.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = giftParticleView.getResources().getDimensionPixelSize(x0.gift_particle_size);
        }
        giftParticleView.c(str, pointF, i10, aVar);
    }

    public static /* synthetic */ float h(GiftParticleView giftParticleView, float f10, float f11, float f12, Interpolator interpolator, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interpolator = A;
        }
        return giftParticleView.g(f10, f11, f12, interpolator);
    }

    @SuppressLint({"Recycle"})
    public final void c(String str, PointF pointF, int i10, io.a<v> aVar) {
        jo.p.h(str, "imageUrl");
        jo.p.h(pointF, "sourcePoint");
        jo.p.h(aVar, "onAnimationEnd");
        int dimensionPixelSize = getResources().getDimensionPixelSize(x0.gift_particle_offset_y);
        PointF f10 = f(this);
        PointF c10 = de.j.c(new PointF(f10.x, f10.y - dimensionPixelSize), e());
        PointF b10 = de.j.b(pointF, de.j.a(k.a(new Point(i10, i10)), 2));
        PointF b11 = de.j.b(c10, de.j.a(k.a(new Point(i10, i10)), 2));
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        imageView.setX(b10.x);
        imageView.setY(b10.y);
        td.a.f(imageView, str);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(x0.gift_particle_effect_size);
        PointF b12 = de.j.b(c10, de.j.a(k.a(new Point(dimensionPixelSize2, dimensionPixelSize2)), 2));
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
        lottieAnimationView.setX(b12.x);
        lottieAnimationView.setY(b12.y);
        lottieAnimationView.setAnimation(e1.gift_particle);
        lottieAnimationView.setVisibility(4);
        addView(imageView);
        addView(lottieAnimationView);
        uo.l.d(this, null, null, new b(imageView, lottieAnimationView, aVar, b10, b11, null), 3, null);
    }

    public final PointF e() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(x0.gift_particle_scatter_range);
        Random random = f25964z;
        float f10 = dimensionPixelSize;
        float f11 = dimensionPixelSize / 2;
        return new PointF((random.nextFloat() * f10) - f11, (random.nextFloat() * f10) - f11);
    }

    public final PointF f(View view) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        return new PointF((iArr2[0] + (view.getWidth() / 2)) - iArr[0], (iArr2[1] + (view.getHeight() / 2)) - iArr[1]);
    }

    public final float g(float f10, float f11, float f12, Interpolator interpolator) {
        float interpolation = interpolator.getInterpolation(f12);
        return (f10 * (1.0f - interpolation)) + (f11 * interpolation);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f25965w.getCoroutineContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r0.d(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftParticleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        this.f25965w = new j();
    }
}
