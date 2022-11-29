package g3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f32616a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f32617b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f32618c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f32619d;

    public f(f fVar) {
        this.f32618c = null;
        this.f32619d = d.C;
        if (fVar != null) {
            this.f32616a = fVar.f32616a;
            this.f32617b = fVar.f32617b;
            this.f32618c = fVar.f32618c;
            this.f32619d = fVar.f32619d;
        }
    }

    public boolean a() {
        return this.f32617b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f32616a;
        Drawable.ConstantState constantState = this.f32617b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
