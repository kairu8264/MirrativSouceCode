package xj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import tj.g;
import tj.k;

/* loaded from: classes3.dex */
public class b extends g {
    public final Paint U;
    public final RectF V;
    public int W;

    public b() {
        this(null);
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        o0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.V, this.U);
        n0(canvas);
    }

    public boolean m0() {
        return !this.V.isEmpty();
    }

    public final void n0(Canvas canvas) {
        if (u0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.W);
    }

    public final void o0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (u0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        q0(canvas);
    }

    public void p0() {
        r0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void q0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.W = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.W = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    public void r0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.V;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void s0(RectF rectF) {
        r0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void t0() {
        this.U.setStyle(Paint.Style.FILL_AND_STROKE);
        this.U.setColor(-1);
        this.U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean u0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public b(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.U = new Paint(1);
        t0();
        this.V = new RectF();
    }
}
