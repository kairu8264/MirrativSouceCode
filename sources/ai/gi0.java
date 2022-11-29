package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class gi0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ei0> f4461a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final List<fi0> f4462b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Context f4463c;

    /* renamed from: d  reason: collision with root package name */
    public final ch0 f4464d;

    public gi0(Context context, ch0 ch0Var) {
        this.f4463c = context;
        this.f4464d = ch0Var;
    }

    public final synchronized void b(fi0 fi0Var) {
        this.f4462b.add(fi0Var);
    }

    public final synchronized void c(String str) {
        SharedPreferences sharedPreferences;
        if (this.f4461a.containsKey(str)) {
            return;
        }
        if ("__default__".equals(str)) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f4463c);
        } else {
            sharedPreferences = this.f4463c.getSharedPreferences(str, 0);
        }
        ei0 ei0Var = new ei0(this, str);
        this.f4461a.put(str, ei0Var);
        sharedPreferences.registerOnSharedPreferenceChangeListener(ei0Var);
    }

    public final /* synthetic */ void d(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f4464d.b();
        }
    }
}
