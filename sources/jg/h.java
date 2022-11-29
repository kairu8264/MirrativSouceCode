package jg;

import android.content.Context;
import android.os.Build;
import kg.y;

/* loaded from: classes3.dex */
public abstract class h {
    public static y a(Context context, lg.d dVar, kg.g gVar, ng.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new kg.e(context, dVar, gVar);
        }
        return new kg.a(context, dVar, aVar, gVar);
    }
}
