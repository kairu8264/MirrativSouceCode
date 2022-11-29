package ai;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vs2 {

    /* renamed from: a  reason: collision with root package name */
    public static WindowManager f11286a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f11287b = {"x", "y", "width", "height"};

    /* renamed from: c  reason: collision with root package name */
    public static float f11288c = Resources.getSystem().getDisplayMetrics().density;

    public static void a(Context context) {
        if (context != null) {
            f11288c = context.getResources().getDisplayMetrics().density;
            f11286a = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject b(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f11288c);
            jSONObject.put("y", i11 / f11288c);
            jSONObject.put("width", i12 / f11288c);
            jSONObject.put("height", i13 / f11288c);
        } catch (JSONException e10) {
            ws2.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47);
            sb2.append("JSONException during JSONObject.put for name [");
            sb2.append(str);
            sb2.append("]");
            ws2.a(sb2.toString(), e10);
        }
    }

    public static void d(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            ws2.a("Error with setting ad session id", e10);
        }
    }

    public static void e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            ws2.a("Error with setting not visible reason", e10);
        }
    }

    public static void f(JSONObject jSONObject, zs2 zs2Var) {
        gs2 b10 = zs2Var.b();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> c10 = zs2Var.c();
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(c10.get(i10));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", b10.b());
            jSONObject.put("friendlyObstructionPurpose", b10.c());
            jSONObject.put("friendlyObstructionReason", b10.d());
        } catch (JSONException e10) {
            ws2.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void g(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            ug3.b(e10);
        }
    }

    public static void h(JSONObject jSONObject) {
        float f10;
        Point point;
        float f11 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f11286a != null) {
                f11286a.getDefaultDisplay().getRealSize(new Point(0, 0));
                float f12 = f11288c;
                f10 = point.y / f12;
                f11 = point.x / f12;
            }
            f10 = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                f10 = 0.0f;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f11 = Math.max(f11, (float) (optDouble + optDouble3));
                        f10 = Math.max(f10, (float) (optDouble2 + optDouble4));
                    }
                }
            }
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f11);
            jSONObject.put("height", f10);
        } catch (JSONException e10) {
            ug3.b(e10);
        }
    }

    public static boolean i(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f11287b;
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    String str = strArr[i10];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i10++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (j(optJSONArray, optJSONArray2)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                if (!optJSONArray.optString(i11, "").equals(optJSONArray2.optString(i11, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (j(optJSONArray3, optJSONArray4)) {
                            for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                                if (i(optJSONArray3.optJSONObject(i12), optJSONArray4.optJSONObject(i12))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
