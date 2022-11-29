package yg;

import ai.ft;
import ai.ox;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;

@TargetApi(28)
/* loaded from: classes3.dex */
public final class d extends b {
    public static final /* synthetic */ WindowInsets u(Activity activity, View view, WindowInsets windowInsets) {
        if (wg.t.h().p().u() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                r1 p10 = wg.t.h().p();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                p10.s(str);
            } else {
                wg.t.h().p().s("");
            }
        }
        v(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    public static final void v(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = true != z10 ? 2 : 1;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    @Override // yg.e
    public final void q(final Activity activity) {
        if (((Boolean) ft.c().c(ox.N0)).booleanValue() && wg.t.h().p().u() == null && !activity.isInMultiWindowMode()) {
            v(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: yg.c

                /* renamed from: a  reason: collision with root package name */
                public final d f61858a;

                /* renamed from: b  reason: collision with root package name */
                public final Activity f61859b;

                {
                    this.f61858a = this;
                    this.f61859b = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return d.u(this.f61859b, view, windowInsets);
                }
            });
        }
    }
}
