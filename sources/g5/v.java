package g5;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
public class v implements w {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f32784a;

    public v(ViewGroup viewGroup) {
        this.f32784a = viewGroup.getOverlay();
    }

    @Override // g5.b0
    public void a(Drawable drawable) {
        this.f32784a.add(drawable);
    }

    @Override // g5.b0
    public void b(Drawable drawable) {
        this.f32784a.remove(drawable);
    }

    @Override // g5.w
    public void c(View view) {
        this.f32784a.add(view);
    }

    @Override // g5.w
    public void d(View view) {
        this.f32784a.remove(view);
    }
}
