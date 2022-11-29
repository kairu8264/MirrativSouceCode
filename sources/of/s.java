package of;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f45426a = new s();

    public final List<String> a(String str) {
        jo.p.h(str, "input");
        Object[] array = new so.e("\\s+").d(str, 0).toArray(new String[0]);
        jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : array) {
            String str2 = (String) obj;
            if (!Patterns.WEB_URL.matcher(str2).find()) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public final boolean b(String str) {
        jo.p.h(str, "text");
        return d(str, "[ \u3000\\t\\r\\n]");
    }

    public final boolean c(String str) {
        jo.p.h(str, "text");
        return d(str, "[ \u3000\\t\\r\\n]+");
    }

    public final boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.isEmpty(new so.e(str2).b(str, ""));
    }
}
