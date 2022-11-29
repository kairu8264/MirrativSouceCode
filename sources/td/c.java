package td;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import de.n;
import jo.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f53597a = new c();

    public static final void a(View view, Integer num) {
        if (num != null) {
            num.intValue();
            if (view != null) {
                view.setBackgroundResource(num.intValue());
            }
        }
    }

    public static final void b(View view, Integer num, Integer num2) {
        p.h(view, "view");
        if (num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                PaintDrawable paintDrawable = new PaintDrawable(num2.intValue());
                paintDrawable.setShape(new RectShape());
                paintDrawable.setCornerRadius(n.b(view, num.intValue()));
                view.setBackground(paintDrawable);
            }
        }
    }

    public static final void c(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        p.h(view, "view");
        if (num != null) {
            num.intValue();
            if (num3 != null) {
                num3.intValue();
                int intValue = num2 != null ? num2.intValue() : 1;
                int intValue2 = num4 != null ? num4.intValue() : 0;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(intValue2);
                gradientDrawable.setCornerRadius(n.b(view, num.intValue()));
                gradientDrawable.setStroke(n.b(view, intValue), num3.intValue());
                view.setBackground(gradientDrawable);
            }
        }
    }

    public static final void d(View view, Integer num, Integer num2) {
        p.h(view, "view");
        if (num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                PaintDrawable paintDrawable = new PaintDrawable(num2.intValue());
                paintDrawable.setShape(new RectShape());
                float b10 = n.b(view, num.intValue());
                paintDrawable.setCornerRadii(new float[]{b10, b10, b10, b10, 0.0f, 0.0f, 0.0f, 0.0f});
                view.setBackground(paintDrawable);
            }
        }
    }

    public static final void e(View view, Boolean bool) {
        p.h(view, "view");
        if (bool != null) {
            bool.booleanValue();
            view.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }
}
