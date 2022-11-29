package wg;

import ai.u;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class n implements View.OnTouchListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ s f58718w;

    public n(s sVar) {
        this.f58718w = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        u uVar;
        u uVar2;
        uVar = this.f58718w.D;
        if (uVar != null) {
            uVar2 = this.f58718w.D;
            uVar2.d(motionEvent);
            return false;
        }
        return false;
    }
}
