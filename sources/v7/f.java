package v7;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class f implements m7.l<Bitmap> {
    @Override // m7.l
    public final o7.u<Bitmap> b(Context context, o7.u<Bitmap> uVar, int i10, int i11) {
        if (i8.k.u(i10, i11)) {
            p7.e g10 = com.bumptech.glide.c.d(context).g();
            Bitmap bitmap = uVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(g10, bitmap, i10, i11);
            return bitmap.equals(c10) ? uVar : e.f(c10, g10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11);
}
