package k6;

import android.content.Context;
import android.util.DisplayMetrics;
import jo.p;
import k6.b;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: w  reason: collision with root package name */
    public final Context f38439w;

    public c(Context context) {
        this.f38439w = context;
    }

    @Override // k6.i
    public Object b(ao.d<? super h> dVar) {
        DisplayMetrics displayMetrics = this.f38439w.getResources().getDisplayMetrics();
        b.C0535b c0535b = new b.C0535b(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(c0535b, c0535b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p.c(this.f38439w, ((c) obj).f38439w);
    }

    public int hashCode() {
        return this.f38439w.hashCode();
    }
}
