package o3;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class h0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends jo.m implements io.l<ViewParent, ViewParent> {
        public static final a F = new a();

        public a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // io.l
        /* renamed from: i */
        public final ViewParent invoke(ViewParent viewParent) {
            jo.p.h(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    public static final ro.g<ViewParent> a(View view) {
        jo.p.h(view, "<this>");
        return ro.l.e(view.getParent(), a.F);
    }
}
