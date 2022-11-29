package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class xn0 implements Iterable<wn0> {

    /* renamed from: w  reason: collision with root package name */
    public final List<wn0> f12036w = new ArrayList();

    public final boolean d(em0 em0Var) {
        ArrayList<wn0> arrayList = new ArrayList();
        Iterator<wn0> it = iterator();
        while (it.hasNext()) {
            wn0 next = it.next();
            if (next.f11692c == em0Var) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (wn0 wn0Var : arrayList) {
            wn0Var.f11693d.m();
        }
        return true;
    }

    public final wn0 f(em0 em0Var) {
        Iterator<wn0> it = iterator();
        while (it.hasNext()) {
            wn0 next = it.next();
            if (next.f11692c == em0Var) {
                return next;
            }
        }
        return null;
    }

    public final void g(wn0 wn0Var) {
        this.f12036w.add(wn0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator<wn0> iterator() {
        return this.f12036w.iterator();
    }

    public final void j(wn0 wn0Var) {
        this.f12036w.remove(wn0Var);
    }
}
