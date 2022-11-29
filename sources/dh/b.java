package dh;

import ai.xz;
import ai.zz;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import rg.n;

/* loaded from: classes3.dex */
public class b extends FrameLayout {
    public boolean A;
    public zz B;

    /* renamed from: w  reason: collision with root package name */
    public n f29632w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f29633x;

    /* renamed from: y  reason: collision with root package name */
    public xz f29634y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView.ScaleType f29635z;

    public final synchronized void a(xz xzVar) {
        this.f29634y = xzVar;
        if (this.f29633x) {
            xzVar.a(this.f29632w);
        }
    }

    public final synchronized void b(zz zzVar) {
        this.B = zzVar;
        if (this.A) {
            zzVar.a(this.f29635z);
        }
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.A = true;
        this.f29635z = scaleType;
        zz zzVar = this.B;
        if (zzVar != null) {
            zzVar.a(scaleType);
        }
    }

    public void setMediaContent(@RecentlyNonNull n nVar) {
        this.f29633x = true;
        this.f29632w = nVar;
        xz xzVar = this.f29634y;
        if (xzVar != null) {
            xzVar.a(nVar);
        }
    }
}
