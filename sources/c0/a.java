package c0;

import android.graphics.Rect;
import android.view.View;
import jo.p;
import q1.q;
import q1.r;
import wn.v;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: w  reason: collision with root package name */
    public final View f18594w;

    public a(View view) {
        p.h(view, "view");
        this.f18594w = view;
    }

    @Override // c0.d
    public Object a(b1.h hVar, q qVar, ao.d<? super v> dVar) {
        Rect c10;
        b1.h r10 = hVar.r(r.e(qVar));
        View view = this.f18594w;
        c10 = l.c(r10);
        view.requestRectangleOnScreen(c10, false);
        return v.f59242a;
    }
}
