package ak;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class e {
    public static e c(Bundle bundle, t1 t1Var, i3 i3Var) {
        return f(bundle, t1Var, i3Var, new ArrayList(), m0.f13530a);
    }

    public static e d(Bundle bundle, t1 t1Var, i3 i3Var, l0 l0Var) {
        return f(bundle, t1Var, i3Var, new ArrayList(), l0Var);
    }

    public static e e(Bundle bundle, t1 t1Var, i3 i3Var, List<String> list) {
        return f(bundle, t1Var, i3Var, list, m0.f13530a);
    }

    public static e f(Bundle bundle, t1 t1Var, i3 i3Var, List<String> list, l0 l0Var) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            hashMap.put(str, AssetPackState.i(bundle, str, t1Var, i3Var, l0Var));
        }
        for (String str2 : list) {
            hashMap.put(str2, AssetPackState.h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
        }
        return new u0(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, AssetPackState> a();

    public abstract long b();
}
