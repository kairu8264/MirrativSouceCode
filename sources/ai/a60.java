package ai;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class a60 {
    public static void a(b60 b60Var, String str, JSONObject jSONObject) {
        b60Var.B(str, jSONObject.toString());
    }

    public static void b(b60 b60Var, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        b60Var.v(sb2.toString());
    }

    public static void c(b60 b60Var, String str, JSONObject jSONObject) {
        String str2;
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        String sb3 = sb2.toString();
        if (sb3.length() != 0) {
            str2 = "Dispatching AFMA event: ".concat(sb3);
        } else {
            str2 = new String("Dispatching AFMA event: ");
        }
        uj0.a(str2);
        b60Var.v(sb2.toString());
    }

    public static void d(b60 b60Var, String str, Map map) {
        try {
            b60Var.c(str, wg.t.d().Q(map));
        } catch (JSONException unused) {
            uj0.f("Could not convert parameters to JSON.");
        }
    }
}
