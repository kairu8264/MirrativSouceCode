package nd;

import android.content.Context;
import ep.z;

/* loaded from: classes2.dex */
public interface q0 {

    /* loaded from: classes2.dex */
    public static final class a {
        public static z.a a(q0 q0Var, z.a aVar, Context context) {
            jo.p.h(aVar, "builder");
            jo.p.h(context, "context");
            return aVar;
        }

        public static void b(q0 q0Var, String str) {
            jo.p.h(str, "url");
        }

        public static void c(q0 q0Var, Context context) {
            jo.p.h(context, "context");
        }
    }

    void a(String str);

    void b(Context context);

    z.a c(z.a aVar, Context context);
}
