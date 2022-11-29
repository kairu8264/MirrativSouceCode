package z7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import m7.l;
import z7.g;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public Paint E;
    public Rect F;
    public List<h5.b> G;

    /* renamed from: w  reason: collision with root package name */
    public final a f62607w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f62608x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f62609y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f62610z;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final g f62611a;

        public a(g gVar) {
            this.f62611a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, i7.a aVar, l<Bitmap> lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.d(context), aVar, i10, i11, lVar, bitmap)));
    }

    @Override // z7.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.B++;
        }
        int i10 = this.C;
        if (i10 == -1 || this.B < i10) {
            return;
        }
        j();
        stop();
    }

    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f62607w.f62611a.b();
    }

    public final Rect d() {
        if (this.F == null) {
            this.F = new Rect();
        }
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f62610z) {
            return;
        }
        if (this.D) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.D = false;
        }
        canvas.drawBitmap(this.f62607w.f62611a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f62607w.f62611a.e();
    }

    public int f() {
        return this.f62607w.f62611a.f();
    }

    public int g() {
        return this.f62607w.f62611a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f62607w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f62607w.f62611a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f62607w.f62611a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Paint h() {
        if (this.E == null) {
            this.E = new Paint(2);
        }
        return this.E;
    }

    public int i() {
        return this.f62607w.f62611a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f62608x;
    }

    public final void j() {
        List<h5.b> list = this.G;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.G.get(i10).a(this);
            }
        }
    }

    public void k() {
        this.f62610z = true;
        this.f62607w.f62611a.a();
    }

    public final void l() {
        this.B = 0;
    }

    public void m(l<Bitmap> lVar, Bitmap bitmap) {
        this.f62607w.f62611a.o(lVar, bitmap);
    }

    public final void n() {
        i8.j.a(!this.f62610z, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f62607w.f62611a.f() == 1) {
            invalidateSelf();
        } else if (this.f62608x) {
        } else {
            this.f62608x = true;
            this.f62607w.f62611a.r(this);
            invalidateSelf();
        }
    }

    public final void o() {
        this.f62608x = false;
        this.f62607w.f62611a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.D = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        i8.j.a(!this.f62610z, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.A = z10;
        if (!z10) {
            o();
        } else if (this.f62609y) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f62609y = true;
        l();
        if (this.A) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f62609y = false;
        o();
    }

    public c(a aVar) {
        this.A = true;
        this.C = -1;
        this.f62607w = (a) i8.j.d(aVar);
    }
}
