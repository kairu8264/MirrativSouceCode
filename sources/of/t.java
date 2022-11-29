package of;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f45427a = new t();

    public static final void a(TextView textView) {
        jo.p.h(textView, "view");
        textView.setCompoundDrawables(null, null, null, null);
    }

    public static final int b(Context context, int i10) {
        jo.p.h(context, "context");
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final void c(TextView textView, Resources resources, int i10, int i11) {
        jo.p.h(textView, "view");
        jo.p.h(resources, "res");
        Drawable drawableForDensity = resources.getDrawableForDensity(i11, resources.getDisplayMetrics().densityDpi);
        if (drawableForDensity == null) {
            return;
        }
        drawableForDensity.setBounds(0, 0, drawableForDensity.getIntrinsicWidth(), drawableForDensity.getIntrinsicHeight());
        if (i10 == 48) {
            textView.setCompoundDrawables(null, drawableForDensity, null, null);
        } else if (i10 == 80) {
            textView.setCompoundDrawables(null, null, null, drawableForDensity);
        } else if (i10 == 8388611) {
            textView.setCompoundDrawables(drawableForDensity, null, null, null);
        } else if (i10 == 8388613) {
            textView.setCompoundDrawables(null, null, drawableForDensity, null);
        } else {
            throw new IllegalArgumentException("Unsupported: " + i10);
        }
    }

    public static final void e(View view, int i10, int i11) {
        jo.p.h(view, "view");
        if (i10 == 48) {
            view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), view.getPaddingBottom());
        } else if (i10 == 80) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
        } else if (i10 == 8388611) {
            view.setPadding(i11, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (i10 == 8388613) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i11, view.getPaddingBottom());
        } else {
            throw new IllegalArgumentException("Unsupported: " + i10);
        }
    }

    public static final void f(Collection<? extends View> collection, int i10) {
        jo.p.h(collection, "views");
        for (View view : collection) {
            view.setVisibility(i10);
        }
    }

    public final void d(TextView textView, int i10) {
        jo.p.h(textView, "textView");
        textView.setHorizontallyScrolling(false);
        textView.setMaxLines(i10);
    }
}
