package g5;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
public class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f32636a;

    public a0(View view) {
        this.f32636a = view.getOverlay();
    }

    @Override // g5.b0
    public void a(Drawable drawable) {
        this.f32636a.add(drawable);
    }

    @Override // g5.b0
    public void b(Drawable drawable) {
        this.f32636a.remove(drawable);
    }
}
