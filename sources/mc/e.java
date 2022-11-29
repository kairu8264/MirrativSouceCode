package mc;

import android.view.MotionEvent;
import android.view.View;
import com.dena.mirrativ.streaming.result.BroadcastResultActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnTouchListener {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ e f40763w = new e();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean t42;
        t42 = BroadcastResultActivity.t4(view, motionEvent);
        return t42;
    }
}
