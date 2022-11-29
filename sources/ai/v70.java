package ai;

import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v70 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f10993a = Charset.forName(C.UTF8_NAME);

    /* renamed from: b  reason: collision with root package name */
    public static final s70<JSONObject> f10994b = new u70();

    /* renamed from: c  reason: collision with root package name */
    public static final p70<InputStream> f10995c = t70.f10168a;

    public static final /* synthetic */ InputStream a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f10993a));
    }
}
