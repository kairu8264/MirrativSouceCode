package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import k6.b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f44102a = new m();

    public final Bitmap a(Drawable drawable, Bitmap.Config config, k6.h hVar, k6.g gVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, hVar, gVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int p10 = k.p(mutate);
        if (p10 <= 0) {
            p10 = 512;
        }
        int i10 = k.i(mutate);
        int i11 = i10 > 0 ? i10 : 512;
        k6.b b10 = hVar.b();
        int i12 = b10 instanceof b.C0535b ? ((b.C0535b) b10).f38438a : p10;
        k6.b a10 = hVar.a();
        double c10 = a6.f.c(p10, i11, i12, a10 instanceof b.C0535b ? ((b.C0535b) a10).f38438a : i11, gVar);
        int b11 = lo.c.b(p10 * c10);
        int b12 = lo.c.b(c10 * i11);
        Bitmap createBitmap = Bitmap.createBitmap(b11, b12, a.e(config));
        jo.p.g(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        mutate.setBounds(0, 0, b11, b12);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i13, i14, i15, i16);
        return createBitmap;
    }

    public final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    public final boolean c(boolean z10, Bitmap bitmap, k6.h hVar, k6.g gVar) {
        if (z10) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        k6.b b10 = hVar.b();
        int width2 = b10 instanceof b.C0535b ? ((b.C0535b) b10).f38438a : bitmap.getWidth();
        k6.b a10 = hVar.a();
        return a6.f.c(width, height, width2, a10 instanceof b.C0535b ? ((b.C0535b) a10).f38438a : bitmap.getHeight(), gVar) == 1.0d;
    }
}
