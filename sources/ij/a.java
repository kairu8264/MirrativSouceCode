package ij;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public class a implements View.OnTouchListener {

    /* renamed from: w  reason: collision with root package name */
    public final Dialog f36833w;

    /* renamed from: x  reason: collision with root package name */
    public final int f36834x;

    /* renamed from: y  reason: collision with root package name */
    public final int f36835y;

    /* renamed from: z  reason: collision with root package name */
    public final int f36836z;

    public a(Dialog dialog, Rect rect) {
        this.f36833w = dialog;
        this.f36834x = rect.left;
        this.f36835y = rect.top;
        this.f36836z = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f36834x + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f36835y + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f36836z;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f36833w.onTouchEvent(obtain);
    }
}
