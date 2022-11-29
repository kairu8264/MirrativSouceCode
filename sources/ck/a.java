package ck;

import android.os.Bundle;
import dk.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f19665a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f19666b = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, Map<String, Integer>> f19667c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final f f19668d = new f("PlayCoreVersion");

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> b10 = b(str);
        bundle.putInt("playcore_version_code", b10.get("java").intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", b10.get("native").intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", b10.get("unity").intValue());
        }
        return bundle;
    }

    public static synchronized Map<String, Integer> b(String str) {
        Map<String, Integer> map;
        synchronized (a.class) {
            Map<String, Map<String, Integer>> map2 = f19667c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11002);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }
}
