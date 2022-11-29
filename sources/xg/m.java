package xg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import yg.d2;

/* loaded from: classes3.dex */
public final class m extends yg.b0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f60277c;

    public /* synthetic */ m(n nVar, k kVar) {
        this.f60277c = nVar;
    }

    @Override // yg.b0
    public final void a() {
        Bitmap a10 = wg.t.w().a(Integer.valueOf(this.f60277c.f60279x.K.B));
        if (a10 != null) {
            yg.e f10 = wg.t.f();
            n nVar = this.f60277c;
            Activity activity = nVar.f60278w;
            wg.j jVar = nVar.f60279x.K;
            final Drawable d10 = f10.d(activity, a10, jVar.f58716z, jVar.A);
            d2.f61866i.post(new Runnable(this, d10) { // from class: xg.l

                /* renamed from: w  reason: collision with root package name */
                public final m f60275w;

                /* renamed from: x  reason: collision with root package name */
                public final Drawable f60276x;

                {
                    this.f60275w = this;
                    this.f60276x = d10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = this.f60275w;
                    mVar.f60277c.f60278w.getWindow().setBackgroundDrawable(this.f60276x);
                }
            });
        }
    }
}
