package yd;

import android.view.ViewTreeObserver;
import com.dena.mirrorman.customview.LiveRequestClapView;

/* loaded from: classes2.dex */
public final class n0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ LiveRequestClapView f61767w;

    public n0(LiveRequestClapView liveRequestClapView) {
        this.f61767w = liveRequestClapView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f61767w.A.D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.f61767w.A.D);
        int width = (int) ((this.f61767w.A.D.getWidth() / 200.0f) * 124.0f);
        cVar.l(this.f61767w.A.C.getId(), width);
        cVar.m(this.f61767w.A.C.getId(), width);
        cVar.c(this.f61767w.A.D);
    }
}
