package rj;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import tj.g;
import tj.k;
import tj.n;

/* loaded from: classes3.dex */
public class a extends Drawable implements n, g3.b {

    /* renamed from: w  reason: collision with root package name */
    public b f51546w;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public a mutate() {
        this.f51546w = new b(this.f51546w);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f51546w;
        if (bVar.f51548b) {
            bVar.f51547a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f51546w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f51546w.f51547a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f51546w.f51547a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f51546w.f51547a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e10 = rj.b.e(iArr);
        b bVar = this.f51546w;
        if (bVar.f51548b != e10) {
            bVar.f51548b = e10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f51546w.f51547a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f51546w.f51547a.setColorFilter(colorFilter);
    }

    @Override // tj.n
    public void setShapeAppearanceModel(k kVar) {
        this.f51546w.f51547a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTint(int i10) {
        this.f51546w.f51547a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f51546w.f51547a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f51546w.f51547a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f51547a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f51548b;

        public b(g gVar) {
            this.f51547a = gVar;
            this.f51548b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f51547a = (g) bVar.f51547a.getConstantState().newDrawable();
            this.f51548b = bVar.f51548b;
        }
    }

    public a(b bVar) {
        this.f51546w = bVar;
    }
}
