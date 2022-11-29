package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.x;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class y {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<Class<?>, String> f15823b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, x<? extends o>> f15824a = new HashMap<>();

    public static String c(Class<? extends x> cls) {
        HashMap<Class<?>, String> hashMap = f15823b;
        String str = hashMap.get(cls);
        if (str == null) {
            x.b bVar = (x.b) cls.getAnnotation(x.b.class);
            str = bVar != null ? bVar.value() : null;
            if (g(str)) {
                hashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
        }
        return str;
    }

    public static boolean g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final x<? extends o> a(x<? extends o> xVar) {
        return b(c(xVar.getClass()), xVar);
    }

    public x<? extends o> b(String str, x<? extends o> xVar) {
        if (g(str)) {
            return this.f15824a.put(str, xVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends x<?>> T d(Class<T> cls) {
        return (T) e(c(cls));
    }

    public <T extends x<?>> T e(String str) {
        if (g(str)) {
            x<? extends o> xVar = this.f15824a.get(str);
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public Map<String, x<? extends o>> f() {
        return this.f15824a;
    }
}
