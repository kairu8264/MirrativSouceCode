package u3;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import jo.p;
import o3.h0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f54358a = d.pooling_container_listener_holder_tag;

    /* renamed from: b  reason: collision with root package name */
    public static final int f54359b = d.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, b bVar) {
        p.h(view, "<this>");
        p.h(bVar, "listener");
        b(view).a(bVar);
    }

    public static final c b(View view) {
        int i10 = f54358a;
        c cVar = (c) view.getTag(i10);
        if (cVar == null) {
            c cVar2 = new c();
            view.setTag(i10, cVar2);
            return cVar2;
        }
        return cVar;
    }

    public static final boolean c(View view) {
        p.h(view, "<this>");
        Object tag = view.getTag(f54359b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        p.h(view, "<this>");
        for (ViewParent viewParent : h0.a(view)) {
            if ((viewParent instanceof View) && c((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void e(View view, b bVar) {
        p.h(view, "<this>");
        p.h(bVar, "listener");
        b(view).b(bVar);
    }
}
