package ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class v44 extends h44 {
    public v44(u44 u44Var, SSLSocketFactory sSLSocketFactory) {
    }

    public static List<p34> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new p34(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}
