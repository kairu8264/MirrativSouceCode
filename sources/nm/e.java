package nm;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tm.i;

/* loaded from: classes4.dex */
public abstract class e {
    public static List<e> a(i iVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (iVar.m()) {
            arrayList.add(new d(iVar.n()));
        }
        if (iVar.f()) {
            arrayList.add(new c(iVar.g(), context));
        }
        if (iVar.V()) {
            arrayList.add(new a(iVar.U()));
        }
        if (iVar.b()) {
            arrayList.add(new b(iVar.o()));
        }
        return arrayList;
    }

    public static boolean b(i iVar, Context context) {
        List<e> a10 = a(iVar, context);
        if (a10.isEmpty()) {
            lm.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        for (e eVar : a10) {
            if (!eVar.c()) {
                return false;
            }
        }
        return true;
    }

    public static String d(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "Attribute key must not be null";
        }
        if (value == null) {
            return "Attribute value must not be null";
        }
        if (key.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", 40);
        }
        if (value.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", 100);
        }
        if (key.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return null;
        }
        return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (str.startsWith("_")) {
            for (sm.b bVar : sm.b.values()) {
                if (bVar.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (str.startsWith("_")) {
            for (sm.c cVar : sm.c.values()) {
                if (cVar.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith("_st_")) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
        return null;
    }

    public abstract boolean c();
}
