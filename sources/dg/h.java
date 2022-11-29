package dg;

import android.content.Context;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class h {
    public static h a(Context context, ng.a aVar, ng.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract ng.a d();

    public abstract ng.a e();
}
