package y4;

import android.view.View;
import android.view.ViewParent;
import io.l;
import jo.p;
import jo.q;
import ro.n;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends q implements l<View, View> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f61242w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final View invoke(View view) {
            p.h(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<View, e> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f61243w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final e invoke(View view) {
            p.h(view, "view");
            Object tag = view.getTag(y4.a.f61229a);
            if (tag instanceof e) {
                return (e) tag;
            }
            return null;
        }
    }

    public static final e a(View view) {
        p.h(view, "<this>");
        return (e) n.m(n.s(ro.l.e(view, a.f61242w), b.f61243w));
    }

    public static final void b(View view, e eVar) {
        p.h(view, "<this>");
        view.setTag(y4.a.f61229a, eVar);
    }
}
