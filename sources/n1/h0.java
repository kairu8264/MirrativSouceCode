package n1;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class h0 {
    public static final void a(long j10, io.l<? super MotionEvent, wn.v> lVar) {
        jo.p.h(lVar, "block");
        MotionEvent obtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        jo.p.g(obtain, "motionEvent");
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(m mVar, long j10, io.l<? super MotionEvent, wn.v> lVar) {
        jo.p.h(mVar, "$this$toCancelMotionEventScope");
        jo.p.h(lVar, "block");
        d(mVar, j10, lVar, true);
    }

    public static final void c(m mVar, long j10, io.l<? super MotionEvent, wn.v> lVar) {
        jo.p.h(mVar, "$this$toMotionEventScope");
        jo.p.h(lVar, "block");
        d(mVar, j10, lVar, false);
    }

    public static final void d(m mVar, long j10, io.l<? super MotionEvent, wn.v> lVar, boolean z10) {
        MotionEvent e10 = mVar.e();
        if (e10 != null) {
            int action = e10.getAction();
            if (z10) {
                e10.setAction(3);
            }
            e10.offsetLocation(-b1.f.m(j10), -b1.f.n(j10));
            lVar.invoke(e10);
            e10.offsetLocation(b1.f.m(j10), b1.f.n(j10));
            e10.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
