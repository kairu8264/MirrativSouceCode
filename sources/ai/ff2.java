package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class ff2 implements wc2 {

    /* renamed from: a  reason: collision with root package name */
    public static final wc2 f4007a = new ff2();

    @Override // ai.wc2
    public final void d(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", nh.g.f43544a);
        } catch (JSONException unused) {
        }
    }
}
