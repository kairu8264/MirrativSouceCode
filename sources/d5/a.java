package d5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import o3.c0;

/* loaded from: classes.dex */
public class a extends ImageView {

    /* renamed from: w  reason: collision with root package name */
    public Animation.AnimationListener f29159w;

    /* renamed from: x  reason: collision with root package name */
    public int f29160x;

    /* renamed from: y  reason: collision with root package name */
    public int f29161y;

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0271a extends OvalShape {

        /* renamed from: w  reason: collision with root package name */
        public Paint f29162w = new Paint();

        /* renamed from: x  reason: collision with root package name */
        public int f29163x;

        /* renamed from: y  reason: collision with root package name */
        public a f29164y;

        public C0271a(a aVar, int i10) {
            this.f29164y = aVar;
            this.f29163x = i10;
            b((int) rect().width());
        }

        public final void b(int i10) {
            float f10 = i10 / 2;
            this.f29162w.setShader(new RadialGradient(f10, f10, this.f29163x, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.f29164y.getWidth() / 2;
            float height = this.f29164y.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f29162w);
            canvas.drawCircle(width2, height, width - this.f29163x, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            b((int) f10);
        }
    }

    public a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f29160x = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(c5.a.f18837f);
        this.f29161y = obtainStyledAttributes.getColor(c5.a.f18838g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            c0.z0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0271a(this, this.f29160x));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f29160x, i11, i10, 503316480);
            int i12 = this.f29160x;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f29161y);
        c0.v0(this, shapeDrawable);
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f29159w = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f29159w;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f29159w;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f29160x * 2), getMeasuredHeight() + (this.f29160x * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f29161y = i10;
        }
    }
}
