package p7;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class f implements e {
    @Override // p7.e
    public void a(int i10) {
    }

    @Override // p7.e
    public void b() {
    }

    @Override // p7.e
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p7.e
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p7.e
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
