package nb;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.j;
import jo.p;
import ud.a1;
import ud.b1;
import ud.y0;
import ud.z0;

/* loaded from: classes2.dex */
public final class a extends j.f<ud.a> {
    @Override // androidx.recyclerview.widget.j.f
    @SuppressLint({"DiffUtilEquals"})
    /* renamed from: d */
    public boolean a(ud.a aVar, ud.a aVar2) {
        p.h(aVar, "oldItem");
        p.h(aVar2, "newItem");
        if ((aVar instanceof b1) && (aVar2 instanceof b1)) {
            return p.c(aVar, aVar2);
        }
        if ((aVar instanceof y0) && (aVar2 instanceof y0)) {
            return p.c(aVar, aVar2);
        }
        if ((aVar instanceof z0) && (aVar2 instanceof z0)) {
            return p.c(aVar, aVar2);
        }
        if ((aVar instanceof a1) && (aVar2 instanceof a1)) {
            return p.c(aVar, aVar2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.j.f
    /* renamed from: e */
    public boolean b(ud.a aVar, ud.a aVar2) {
        p.h(aVar, "oldItem");
        p.h(aVar2, "newItem");
        if ((aVar instanceof b1) && (aVar2 instanceof b1)) {
            return p.c(((b1) aVar).a().h(), ((b1) aVar2).a().h());
        }
        if ((aVar instanceof y0) && (aVar2 instanceof y0)) {
            return p.c(((y0) aVar).e(), ((y0) aVar2).e());
        }
        if ((aVar instanceof z0) && (aVar2 instanceof z0)) {
            return ((z0) aVar).b() == ((z0) aVar2).b();
        } else if ((aVar instanceof a1) && (aVar2 instanceof a1)) {
            return p.c(((a1) aVar).a().h(), ((a1) aVar2).a().h());
        } else {
            return false;
        }
    }
}
