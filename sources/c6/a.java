package c6;

import a6.f;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import k6.g;
import po.n;

/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {
    public static final C0138a I = new C0138a(null);
    public final List<h5.b> A = new ArrayList();
    public final int B;
    public final int C;
    public long D;
    public int E;
    public int F;
    public Drawable G;
    public final Drawable H;

    /* renamed from: w  reason: collision with root package name */
    public final g f18839w;

    /* renamed from: x  reason: collision with root package name */
    public final int f18840x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f18841y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f18842z;

    /* renamed from: c6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0138a {
        public C0138a() {
        }

        public /* synthetic */ C0138a(h hVar) {
            this();
        }
    }

    public a(Drawable drawable, Drawable drawable2, g gVar, int i10, boolean z10, boolean z11) {
        this.f18839w = gVar;
        this.f18840x = i10;
        this.f18841y = z10;
        this.f18842z = z11;
        this.B = a(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicWidth()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicWidth()));
        this.C = a(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicHeight()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.E = 255;
        this.G = drawable == null ? null : drawable.mutate();
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.H = mutate;
        if (i10 > 0) {
            Drawable drawable3 = this.G;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (mutate == null) {
                return;
            }
            mutate.setCallback(this);
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    public final int a(Integer num, Integer num2) {
        if (this.f18842z || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num == null ? -1 : num.intValue(), num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    public final void b() {
        this.F = 2;
        this.G = null;
        List<h5.b> list = this.A;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double c10 = f.c(intrinsicWidth, intrinsicHeight, width, height, this.f18839w);
            double d10 = 2;
            int b10 = lo.c.b((width - (intrinsicWidth * c10)) / d10);
            int b11 = lo.c.b((height - (c10 * intrinsicHeight)) / d10);
            drawable.setBounds(rect.left + b10, rect.top + b11, rect.right - b10, rect.bottom - b11);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save;
        Drawable drawable;
        int i10 = this.F;
        if (i10 == 0) {
            Drawable drawable2 = this.G;
            if (drawable2 == null) {
                return;
            }
            drawable2.setAlpha(this.E);
            save = canvas.save();
            try {
                drawable2.draw(canvas);
            } finally {
            }
        } else if (i10 == 2) {
            Drawable drawable3 = this.H;
            if (drawable3 == null) {
                return;
            }
            drawable3.setAlpha(this.E);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        } else {
            double uptimeMillis = (SystemClock.uptimeMillis() - this.D) / this.f18840x;
            double k10 = n.k(uptimeMillis, 0.0d, 1.0d);
            int i11 = this.E;
            int i12 = (int) (k10 * i11);
            if (this.f18841y) {
                i11 -= i12;
            }
            boolean z10 = uptimeMillis >= 1.0d;
            if (!z10 && (drawable = this.G) != null) {
                drawable.setAlpha(i11);
                save = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                }
            }
            Drawable drawable4 = this.H;
            if (drawable4 != null) {
                drawable4.setAlpha(i12);
                save = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                }
            }
            if (z10) {
                b();
            } else {
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable;
        int i10 = this.F;
        if (i10 == 0) {
            Drawable drawable2 = this.G;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        } else if (i10 != 1) {
            if (i10 == 2 && (drawable = this.H) != null) {
                return drawable.getColorFilter();
            }
            return null;
        } else {
            Drawable drawable3 = this.H;
            ColorFilter colorFilter = drawable3 == null ? null : drawable3.getColorFilter();
            if (colorFilter == null) {
                Drawable drawable4 = this.G;
                if (drawable4 == null) {
                    return null;
                }
                return drawable4.getColorFilter();
            }
            return colorFilter;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.G;
        Drawable drawable2 = this.H;
        int i10 = this.F;
        if (i10 == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        } else if (i10 == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        } else if (drawable == null || drawable2 == null) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.F == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.G;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            return;
        }
        c(drawable2, rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.G;
        boolean level = drawable == null ? false : drawable.setLevel(i10);
        Drawable drawable2 = this.H;
        return level || (drawable2 == null ? false : drawable2.setLevel(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.G;
        boolean state = drawable == null ? false : drawable.setState(iArr);
        Drawable drawable2 = this.H;
        return state || (drawable2 == null ? false : drawable2.setState(iArr));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 256) {
            z10 = true;
        }
        if (z10) {
            this.E = i10;
            return;
        }
        throw new IllegalArgumentException(p.o("Invalid alpha: ", Integer.valueOf(i10)).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.G;
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.H;
        Animatable animatable2 = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.F != 0) {
            return;
        }
        this.F = 1;
        this.D = SystemClock.uptimeMillis();
        List<h5.b> list = this.A;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.G;
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.H;
        Animatable animatable2 = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.F != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
