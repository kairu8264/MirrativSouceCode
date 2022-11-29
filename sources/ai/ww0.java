package ai;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ww0 implements q70<zw0> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11781a;

    /* renamed from: b  reason: collision with root package name */
    public final qk f11782b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager f11783c;

    public ww0(Context context, qk qkVar) {
        this.f11781a = context;
        this.f11782b = qkVar;
        this.f11783c = (PowerManager) context.getSystemService("power");
    }

    @Override // ai.q70
    /* renamed from: a */
    public final JSONObject b(zw0 zw0Var) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        uk ukVar = zw0Var.f13229f;
        if (ukVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f11782b.c() != null) {
            boolean z10 = ukVar.f10727a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f11782b.b()).put("activeViewJSON", this.f11782b.c()).put("timestamp", zw0Var.f13227d).put("adFormat", this.f11782b.a()).put("hashCode", this.f11782b.d()).put("isMraid", false).put("isStopped", false).put("isPaused", zw0Var.f13225b).put("isNative", this.f11782b.e());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.f11783c.isInteractive();
            } else {
                isScreenOn = this.f11783c.isScreenOn();
            }
            put.put("isScreenOn", isScreenOn).put("appMuted", wg.t.i().d()).put("appVolume", wg.t.i().b()).put("deviceVolume", yg.f.e(this.f11781a.getApplicationContext()));
            if (((Boolean) ft.c().c(ox.Y3)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f11781a.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f11781a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", ukVar.f10728b).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", ukVar.f10729c.top).put("bottom", ukVar.f10729c.bottom).put(TtmlNode.LEFT, ukVar.f10729c.left).put(TtmlNode.RIGHT, ukVar.f10729c.right)).put("adBox", new JSONObject().put("top", ukVar.f10730d.top).put("bottom", ukVar.f10730d.bottom).put(TtmlNode.LEFT, ukVar.f10730d.left).put(TtmlNode.RIGHT, ukVar.f10730d.right)).put("globalVisibleBox", new JSONObject().put("top", ukVar.f10731e.top).put("bottom", ukVar.f10731e.bottom).put(TtmlNode.LEFT, ukVar.f10731e.left).put(TtmlNode.RIGHT, ukVar.f10731e.right)).put("globalVisibleBoxVisible", ukVar.f10732f).put("localVisibleBox", new JSONObject().put("top", ukVar.f10733g.top).put("bottom", ukVar.f10733g.bottom).put(TtmlNode.LEFT, ukVar.f10733g.left).put(TtmlNode.RIGHT, ukVar.f10733g.right)).put("localVisibleBoxVisible", ukVar.f10734h).put("hitBox", new JSONObject().put("top", ukVar.f10735i.top).put("bottom", ukVar.f10735i.bottom).put(TtmlNode.LEFT, ukVar.f10735i.left).put(TtmlNode.RIGHT, ukVar.f10735i.right)).put("screenDensity", this.f11781a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zw0Var.f13224a);
            if (((Boolean) ft.c().c(ox.U0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = ukVar.f10737k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zw0Var.f13228e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
