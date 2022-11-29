package u1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b1.h;
import jo.p;
import wn.v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final io.a<v> f54270a;

    /* renamed from: b  reason: collision with root package name */
    public h f54271b;

    /* renamed from: c  reason: collision with root package name */
    public io.a<v> f54272c;

    /* renamed from: d  reason: collision with root package name */
    public io.a<v> f54273d;

    /* renamed from: e  reason: collision with root package name */
    public io.a<v> f54274e;

    /* renamed from: f  reason: collision with root package name */
    public io.a<v> f54275f;

    public d(io.a<v> aVar, h hVar, io.a<v> aVar2, io.a<v> aVar3, io.a<v> aVar4, io.a<v> aVar5) {
        p.h(hVar, "rect");
        this.f54270a = aVar;
        this.f54271b = hVar;
        this.f54272c = aVar2;
        this.f54273d = aVar3;
        this.f54274e = aVar4;
        this.f54275f = aVar5;
    }

    public final void a(Menu menu, b bVar) {
        p.h(menu, "menu");
        p.h(bVar, "item");
        menu.add(0, bVar.c(), bVar.e(), bVar.h()).setShowAsAction(1);
    }

    public final void b(Menu menu, b bVar, io.a<v> aVar) {
        if (aVar != null && menu.findItem(bVar.c()) == null) {
            a(menu, bVar);
        } else if (aVar != null || menu.findItem(bVar.c()) == null) {
        } else {
            menu.removeItem(bVar.c());
        }
    }

    public final h c() {
        return this.f54271b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        p.e(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.c()) {
            io.a<v> aVar = this.f54272c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.c()) {
            io.a<v> aVar2 = this.f54273d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.c()) {
            io.a<v> aVar3 = this.f54274e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != b.SelectAll.c()) {
            return false;
        } else {
            io.a<v> aVar4 = this.f54275f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.f54272c != null) {
                    a(menu, b.Copy);
                }
                if (this.f54273d != null) {
                    a(menu, b.Paste);
                }
                if (this.f54274e != null) {
                    a(menu, b.Cut);
                }
                if (this.f54275f != null) {
                    a(menu, b.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void f() {
        io.a<v> aVar = this.f54270a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(io.a<v> aVar) {
        this.f54272c = aVar;
    }

    public final void i(io.a<v> aVar) {
        this.f54274e = aVar;
    }

    public final void j(io.a<v> aVar) {
        this.f54273d = aVar;
    }

    public final void k(io.a<v> aVar) {
        this.f54275f = aVar;
    }

    public final void l(h hVar) {
        p.h(hVar, "<set-?>");
        this.f54271b = hVar;
    }

    public final void m(Menu menu) {
        p.h(menu, "menu");
        b(menu, b.Copy, this.f54272c);
        b(menu, b.Paste, this.f54273d);
        b(menu, b.Cut, this.f54274e);
        b(menu, b.SelectAll, this.f54275f);
    }

    public /* synthetic */ d(io.a aVar, h hVar, io.a aVar2, io.a aVar3, io.a aVar4, io.a aVar5, int i10, jo.h hVar2) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? h.f16726e.a() : hVar, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : aVar3, (i10 & 16) != 0 ? null : aVar4, (i10 & 32) != 0 ? null : aVar5);
    }
}
