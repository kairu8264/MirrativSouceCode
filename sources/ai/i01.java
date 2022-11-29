package ai;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i01 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: w  reason: collision with root package name */
    public final Context f5061w;

    /* renamed from: x  reason: collision with root package name */
    public View f5062x;

    public i01(Context context) {
        super(context);
        this.f5061w = context;
    }

    public static i01 a(Context context, View view, fl2 fl2Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        i01 i01Var = new i01(context);
        if (!fl2Var.f4110u.isEmpty() && (resources = i01Var.f5061w.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            il2 il2Var = fl2Var.f4110u.get(0);
            float f10 = displayMetrics.density;
            i01Var.setLayoutParams(new FrameLayout.LayoutParams((int) (il2Var.f5280a * f10), (int) (il2Var.f5281b * f10)));
        }
        i01Var.f5062x = view;
        i01Var.addView(view);
        wg.t.A();
        uk0.b(i01Var, i01Var);
        wg.t.A();
        uk0.a(i01Var, i01Var);
        JSONObject jSONObject = fl2Var.f4089e0;
        RelativeLayout relativeLayout = new RelativeLayout(i01Var.f5061w);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            i01Var.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            i01Var.b(optJSONObject2, relativeLayout, 12);
        }
        i01Var.addView(relativeLayout);
        return i01Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.f5061w);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int c10 = c(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, c10, 0, c10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, c(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    public final int c(double d10) {
        dt.a();
        return nj0.q(this.f5061w, (int) d10);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f5062x.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f5062x.setY(-iArr[1]);
    }
}
