package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zb0 {

    /* renamed from: a  reason: collision with root package name */
    public final rp0 f12926a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12927b;

    public zb0(rp0 rp0Var, String str) {
        this.f12926a = rp0Var;
        this.f12927b = str;
    }

    public final void b(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put(ActionLogBase.ACTION, this.f12927b);
            rp0 rp0Var = this.f12926a;
            if (rp0Var != null) {
                rp0Var.c("onError", put);
            }
        } catch (JSONException e10) {
            uj0.d("Error occurred while dispatching error event.", e10);
        }
    }

    public final void c(String str) {
        try {
            this.f12926a.c("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            uj0.d("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void d(int i10, int i11, int i12, int i13) {
        try {
            this.f12926a.c("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            uj0.d("Error occurred while dispatching size change.", e10);
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        try {
            this.f12926a.c("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            uj0.d("Error occurred while dispatching default position.", e10);
        }
    }

    public final void f(String str) {
        try {
            this.f12926a.c("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            uj0.d("Error occurred while dispatching state change.", e10);
        }
    }

    public final void g(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.f12926a.c("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            uj0.d("Error occurred while obtaining screen information.", e10);
        }
    }
}
