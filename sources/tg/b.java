package tg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* loaded from: classes3.dex */
public class b extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public rg.n f53621w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView.ScaleType f53622x;

    public b(@RecentlyNonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f53622x = scaleType;
    }

    public void setMediaContent(@RecentlyNonNull rg.n nVar) {
        this.f53621w = nVar;
    }
}
