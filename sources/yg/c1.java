package yg;

import ai.dt;
import ai.fl2;
import ai.ft;
import ai.ox;
import ai.uj0;
import ai.vx2;
import ai.yw2;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c1 {
    public static boolean a(int i10) {
        if (((Boolean) ft.c().c(ox.Y1)).booleanValue()) {
            return ((Boolean) ft.c().c(ox.Z1)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(9:45|46|21|22|23|(3:25|(1:29)|39)(3:40|(1:42)|39)|30|(2:32|(1:34)(1:37))(1:38)|35)|20|21|22|23|(0)(0)|30|(0)(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
        ai.uj0.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f A[Catch: JSONException -> 0x0174, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0174, blocks: (B:30:0x013b, B:47:0x0166, B:48:0x016a, B:49:0x016f), top: B:56:0x013b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0175 -> B:55:0x017a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject b(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.c1.b(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject c(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) ft.c().c(ox.F5)).booleanValue()) {
                wg.t.d();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    r2 = true;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } else {
                wg.t.d();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject d(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            wg.t.d();
            jSONObject.put("can_show_on_lock_screen", d2.a0(view));
            wg.t.d();
            jSONObject.put("is_keyguard_locked", d2.g(context));
        } catch (JSONException unused) {
            uj0.f("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject e(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry<String, WeakReference<View>> entry;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] g10 = g(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] g11 = g(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", dt.a().a(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", dt.a().a(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", dt.a().a(context, g11[0] - g10[0]));
                        jSONObject5.put("y", dt.a().a(context, g11[1] - g10[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = k(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", dt.a().a(context, g11[0] - g10[0]));
                            jSONObject2.put("y", dt.a().a(context, g11[1] - g10[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = next;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = next;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put(entry.getKey(), jSONObject4);
                        } catch (JSONException unused) {
                            uj0.f("Unable to get asset views information");
                            jSONObject3 = jSONObject;
                            it = it2;
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject f(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", dt.a().a(context, point2.x));
                    jSONObject3.put("y", dt.a().a(context, point2.y));
                    jSONObject3.put("start_x", dt.a().a(context, point.x));
                    jSONObject3.put("start_y", dt.a().a(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e10) {
                    uj0.d("Error occurred while putting signals into JSON object.", e10);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e11) {
                e = e11;
                jSONObject = jSONObject2;
                uj0.d("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static int[] g(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point h(MotionEvent motionEvent, View view) {
        int[] g10 = g(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - g10[0], ((int) motionEvent.getRawY()) - g10[1]);
    }

    public static boolean i(Context context, fl2 fl2Var) {
        if (fl2Var.J) {
            if (((Boolean) ft.c().c(ox.G5)).booleanValue()) {
                return ((Boolean) ft.c().c(ox.J5)).booleanValue();
            }
            String str = (String) ft.c().c(ox.H5);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : vx2.b(yw2.b(';')).d(str)) {
                    if (str2.equals(packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static WindowManager.LayoutParams j() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) ft.c().c(ox.I5)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject k(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", dt.a().a(context, rect.right - rect.left));
        jSONObject.put("height", dt.a().a(context, rect.bottom - rect.top));
        jSONObject.put("x", dt.a().a(context, rect.left));
        jSONObject.put("y", dt.a().a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
