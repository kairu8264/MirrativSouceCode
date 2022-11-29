package xg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class i extends RelativeLayout {

    /* renamed from: w  reason: collision with root package name */
    public final yg.w f60269w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f60270x;

    public i(Context context, String str, String str2, String str3) {
        super(context);
        yg.w wVar = new yg.w(context, str);
        this.f60269w = wVar;
        wVar.d(str2);
        wVar.c(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f60270x) {
            return false;
        }
        this.f60269w.a(motionEvent);
        return false;
    }
}
