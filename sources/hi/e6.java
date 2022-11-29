package hi;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e6 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, String>> f35735a;

    public e6(Map<String, Map<String, String>> map) {
        this.f35735a = map;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            Map<String, String> map = this.f35735a.get(uri.toString());
            if (map == null) {
                return null;
            }
            String valueOf = String.valueOf(str3);
            return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new String(""));
        }
        return null;
    }
}
