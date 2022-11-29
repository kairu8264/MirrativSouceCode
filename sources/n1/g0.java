package n1;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class g0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<MotionEvent, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o2.a f41433w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2.a aVar) {
            super(1);
            this.f41433w = aVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean dispatchTouchEvent;
            jo.p.h(motionEvent, "motionEvent");
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    dispatchTouchEvent = this.f41433w.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    dispatchTouchEvent = this.f41433w.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(dispatchTouchEvent);
        }
    }

    public static final x0.f a(x0.f fVar, o2.a aVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(aVar, "view");
        f0 f0Var = new f0();
        f0Var.f(new a(aVar));
        m0 m0Var = new m0();
        f0Var.g(m0Var);
        aVar.setOnRequestDisallowInterceptTouchEvent$ui_release(m0Var);
        return fVar.L(f0Var);
    }
}
