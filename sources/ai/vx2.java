package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class vx2 {

    /* renamed from: a  reason: collision with root package name */
    public final yw2 f11402a;

    /* renamed from: b  reason: collision with root package name */
    public final ux2 f11403b;

    public vx2(ux2 ux2Var) {
        xw2 xw2Var = xw2.f12332b;
        this.f11403b = ux2Var;
        this.f11402a = xw2Var;
    }

    public static vx2 b(yw2 yw2Var) {
        return new vx2(new px2(yw2Var));
    }

    public static vx2 c(int i10) {
        return new vx2(new rx2(4000));
    }

    public final Iterable<String> d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new sx2(this, charSequence);
    }

    public final List<String> f(CharSequence charSequence) {
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.f11403b.a(this, charSequence);
    }
}
