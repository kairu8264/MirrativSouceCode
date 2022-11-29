package ai;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xq2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12078a = xy.f12355b.e();

    public final String a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f12078a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
