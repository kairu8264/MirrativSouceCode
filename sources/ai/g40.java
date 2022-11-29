package ai;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g40 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4327a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, f40> f4328b = new HashMap();

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get(TtmlNode.ATTR_ID);
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f4327a) {
            f40 remove = this.f4328b.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                uj0.f(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.t(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str5 == null) {
                remove.u(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (yg.p1.m()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        yg.p1.k(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.u(jSONObject);
                } catch (JSONException e10) {
                    remove.t(e10.getMessage());
                }
            }
        }
    }

    public final void b(String str, f40 f40Var) {
        synchronized (this.f4327a) {
            this.f4328b.put(str, f40Var);
        }
    }

    public final <EngineT extends n60> s43<JSONObject> c(EngineT enginet, String str, JSONObject jSONObject) {
        mk0 mk0Var = new mk0();
        wg.t.d();
        String uuid = UUID.randomUUID().toString();
        b(uuid, new e40(this, mk0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TtmlNode.ATTR_ID, uuid);
            jSONObject2.put("args", jSONObject);
            enginet.l0(str, jSONObject2);
        } catch (Exception e10) {
            mk0Var.e(e10);
        }
        return mk0Var;
    }
}
