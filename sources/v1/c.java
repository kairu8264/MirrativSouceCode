package v1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c1.k0;
import java.util.Objects;
import jo.p;

/* loaded from: classes.dex */
public final class c {
    public static final k0 a(k0.a aVar, Resources resources, int i10) {
        p.h(aVar, "<this>");
        p.h(resources, "res");
        Drawable drawable = resources.getDrawable(i10, null);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        p.g(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return c1.f.c(bitmap);
    }
}
