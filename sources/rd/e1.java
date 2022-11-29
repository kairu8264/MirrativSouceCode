package rd;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.j;
import ud.b5;
import ud.f2;
import ud.g2;
import ud.o2;

/* loaded from: classes2.dex */
public final class e1 extends j.f<ud.a> {
    @Override // androidx.recyclerview.widget.j.f
    @SuppressLint({"DiffUtilEquals"})
    /* renamed from: d */
    public boolean a(ud.a aVar, ud.a aVar2) {
        jo.p.h(aVar, "oldItem");
        jo.p.h(aVar2, "newItem");
        if ((aVar instanceof b5) && (aVar2 instanceof b5)) {
            return jo.p.c(aVar, aVar2);
        }
        if ((aVar instanceof f2) && (aVar2 instanceof f2)) {
            return true;
        }
        if ((aVar instanceof o2) && (aVar2 instanceof o2)) {
            return true;
        }
        return (aVar instanceof g2) && (aVar2 instanceof g2);
    }

    @Override // androidx.recyclerview.widget.j.f
    /* renamed from: e */
    public boolean b(ud.a aVar, ud.a aVar2) {
        jo.p.h(aVar, "oldItem");
        jo.p.h(aVar2, "newItem");
        if ((aVar instanceof b5) && (aVar2 instanceof b5)) {
            return jo.p.c(((b5) aVar).j(), ((b5) aVar2).j());
        }
        if ((aVar instanceof f2) && (aVar2 instanceof f2)) {
            return true;
        }
        if ((aVar instanceof o2) && (aVar2 instanceof o2)) {
            return true;
        }
        return (aVar instanceof g2) && (aVar2 instanceof g2);
    }
}
