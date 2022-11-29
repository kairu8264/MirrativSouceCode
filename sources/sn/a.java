package sn;

import android.content.Context;
import android.graphics.Bitmap;
import i8.k;
import m7.l;
import o7.u;
import p7.e;

/* loaded from: classes4.dex */
public abstract class a implements l<Bitmap> {
    @Override // m7.l
    public final u<Bitmap> b(Context context, u<Bitmap> uVar, int i10, int i11) {
        if (k.u(i10, i11)) {
            e g10 = com.bumptech.glide.c.d(context).g();
            Bitmap bitmap = uVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            int i12 = i10;
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap d10 = d(context.getApplicationContext(), g10, bitmap, i12, i11);
            return bitmap.equals(d10) ? uVar : v7.e.f(d10, g10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public void c(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    public abstract Bitmap d(Context context, e eVar, Bitmap bitmap, int i10, int i11);
}
