package of;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.ActivityChooserModel;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f45405a = new j();

    public static /* synthetic */ void e(j jVar, Context context, EditText editText, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        jVar.d(context, editText, i10);
    }

    public static final void f(Context context, EditText editText) {
        if (context != null) {
            Object systemService = context.getSystemService("input_method");
            jo.p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(editText, 2);
        }
    }

    public final void b(Activity activity) {
        jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c(activity, activity.getCurrentFocus());
    }

    public final void c(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        view.clearFocus();
    }

    public final void d(final Context context, final EditText editText, int i10) {
        new Handler().postDelayed(new Runnable() { // from class: of.i
            @Override // java.lang.Runnable
            public final void run() {
                j.f(context, editText);
            }
        }, i10);
    }
}
