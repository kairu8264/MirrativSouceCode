package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import jo.p;

/* loaded from: classes.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f20028x;

    public ImageViewTarget(ImageView imageView) {
        this.f20028x = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && p.c(a(), ((ImageViewTarget) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // coil.target.GenericViewTarget, n6.d
    public Drawable l() {
        return a().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void m(Drawable drawable) {
        a().setImageDrawable(drawable);
    }

    @Override // l6.b
    /* renamed from: p */
    public ImageView a() {
        return this.f20028x;
    }
}
