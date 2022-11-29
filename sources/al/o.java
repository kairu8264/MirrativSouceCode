package al;

import com.google.auto.value.AutoValue;
import java.io.File;

@AutoValue
/* loaded from: classes2.dex */
public abstract class o {
    public static o a(cl.a0 a0Var, String str, File file) {
        return new b(a0Var, str, file);
    }

    public abstract cl.a0 b();

    public abstract File c();

    public abstract String d();
}
