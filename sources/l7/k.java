package l7;

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
import l7.p;

/* loaded from: classes.dex */
public class k extends Drawable implements p.b, Animatable {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public Paint E;
    public Rect F;
    public List<h5.b> G;

    /* renamed from: w  reason: collision with root package name */
    public final a f39643w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f39644x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39645y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f39646z;

    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final p7.e f39647a;

        /* renamed from: b  reason: collision with root package name */
        public final p f39648b;

        public a(p7.e eVar, p pVar) {
            this.f39647a = eVar;
            this.f39648b = pVar;
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
            return new k(this);
        }
    }

    public k(Context context, i iVar, p7.e eVar, m7.l<Bitmap> lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(eVar, new p(com.bumptech.glide.c.d(context), iVar, i10, i11, lVar, bitmap)));
    }

    @Override // l7.p.b
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
        stop();
        k();
    }

    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f39643w.f39648b.b();
    }

    public final Rect d() {
        if (this.F == null) {
            this.F = new Rect();
        }
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (j()) {
            return;
        }
        if (this.D) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.D = false;
        }
        canvas.drawBitmap(this.f39643w.f39648b.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f39643w.f39648b.e();
    }

    public int f() {
        return this.f39643w.f39648b.f();
    }

    public int g() {
        return this.f39643w.f39648b.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f39643w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f39643w.f39648b.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f39643w.f39648b.k();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
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
        return this.f39643w.f39648b.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f39644x;
    }

    public boolean j() {
        return this.f39646z;
    }

    public final void k() {
        List<h5.b> list = this.G;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.G.get(i10).a(this);
            }
        }
    }

    public void l() {
        this.f39646z = true;
        this.f39643w.f39648b.a();
    }

    public final void m() {
        this.B = 0;
    }

    public void n(m7.l<Bitmap> lVar, Bitmap bitmap) {
        this.f39643w.f39648b.o(lVar, bitmap);
    }

    public final void o() {
        i8.j.a(!this.f39646z, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f39643w.f39648b.f() == 1) {
            invalidateSelf();
        } else if (this.f39644x) {
        } else {
            this.f39644x = true;
            this.f39643w.f39648b.r(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.D = true;
    }

    public final void p() {
        this.f39644x = false;
        this.f39643w.f39648b.s(this);
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
        i8.j.a(!this.f39646z, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.A = z10;
        if (!z10) {
            p();
        } else if (this.f39645y) {
            o();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f39645y = true;
        m();
        if (this.A) {
            o();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f39645y = false;
        p();
    }

    public k(a aVar) {
        this.A = true;
        this.C = -1;
        this.A = true;
        this.C = -1;
        this.f39643w = (a) i8.j.d(aVar);
    }
}
