package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38254a;

    /* renamed from: b  reason: collision with root package name */
    public s.g<h3.b, MenuItem> f38255b;

    /* renamed from: c  reason: collision with root package name */
    public s.g<h3.c, SubMenu> f38256c;

    public b(Context context) {
        this.f38254a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof h3.b) {
            h3.b bVar = (h3.b) menuItem;
            if (this.f38255b == null) {
                this.f38255b = new s.g<>();
            }
            MenuItem menuItem2 = this.f38255b.get(menuItem);
            if (menuItem2 == null) {
                c cVar = new c(this.f38254a, bVar);
                this.f38255b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof h3.c) {
            h3.c cVar = (h3.c) subMenu;
            if (this.f38256c == null) {
                this.f38256c = new s.g<>();
            }
            SubMenu subMenu2 = this.f38256c.get(cVar);
            if (subMenu2 == null) {
                g gVar = new g(this.f38254a, cVar);
                this.f38256c.put(cVar, gVar);
                return gVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void e() {
        s.g<h3.b, MenuItem> gVar = this.f38255b;
        if (gVar != null) {
            gVar.clear();
        }
        s.g<h3.c, SubMenu> gVar2 = this.f38256c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    public final void f(int i10) {
        if (this.f38255b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f38255b.size()) {
            if (this.f38255b.m(i11).getGroupId() == i10) {
                this.f38255b.p(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void g(int i10) {
        if (this.f38255b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f38255b.size(); i11++) {
            if (this.f38255b.m(i11).getItemId() == i10) {
                this.f38255b.p(i11);
                return;
            }
        }
    }
}
