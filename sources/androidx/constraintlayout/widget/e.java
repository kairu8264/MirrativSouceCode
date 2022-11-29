package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import t2.e;

/* loaded from: classes.dex */
public class e extends View {

    /* renamed from: w  reason: collision with root package name */
    public int f14922w;

    /* renamed from: x  reason: collision with root package name */
    public View f14923x;

    /* renamed from: y  reason: collision with root package name */
    public int f14924y;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f14923x == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f14923x.getLayoutParams();
        bVar2.f14782u0.a1(0);
        e.b y10 = bVar.f14782u0.y();
        e.b bVar3 = e.b.FIXED;
        if (y10 != bVar3) {
            bVar.f14782u0.b1(bVar2.f14782u0.R());
        }
        if (bVar.f14782u0.O() != bVar3) {
            bVar.f14782u0.C0(bVar2.f14782u0.v());
        }
        bVar2.f14782u0.a1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f14922w == -1 && !isInEditMode()) {
            setVisibility(this.f14924y);
        }
        View findViewById = constraintLayout.findViewById(this.f14922w);
        this.f14923x = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f14758i0 = true;
            this.f14923x.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f14923x;
    }

    public int getEmptyVisibility() {
        return this.f14924y;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f14922w == i10) {
            return;
        }
        View view = this.f14923x;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f14923x.getLayoutParams()).f14758i0 = false;
            this.f14923x = null;
        }
        this.f14922w = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f14924y = i10;
    }
}
