package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.e0;

/* loaded from: classes.dex */
public class e implements h3.a {
    public static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f14217a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f14218b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14219c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14220d;

    /* renamed from: e  reason: collision with root package name */
    public a f14221e;

    /* renamed from: m  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f14229m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f14230n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f14231o;

    /* renamed from: p  reason: collision with root package name */
    public View f14232p;

    /* renamed from: x  reason: collision with root package name */
    public g f14240x;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14242z;

    /* renamed from: l  reason: collision with root package name */
    public int f14228l = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14233q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14234r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14235s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14236t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14237u = false;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<g> f14238v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f14239w = new CopyOnWriteArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public boolean f14241y = false;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g> f14222f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g> f14223g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f14224h = true;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<g> f14225i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<g> f14226j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f14227k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemSelected(e eVar, MenuItem menuItem);

        void onMenuModeChange(e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean invokeItem(g gVar);
    }

    public e(Context context) {
        this.f14217a = context;
        this.f14218b = context.getResources();
        b0(true);
    }

    public static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f14236t;
    }

    public Resources C() {
        return this.f14218b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (this.f14224h) {
            this.f14223g.clear();
            int size = this.f14222f.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = this.f14222f.get(i10);
                if (gVar.isVisible()) {
                    this.f14223g.add(gVar);
                }
            }
            this.f14224h = false;
            this.f14227k = true;
            return this.f14223g;
        }
        return this.f14223g;
    }

    public boolean F() {
        return this.f14241y;
    }

    public boolean G() {
        return this.f14219c;
    }

    public boolean H() {
        return this.f14220d;
    }

    public void I(g gVar) {
        this.f14227k = true;
        K(true);
    }

    public void J(g gVar) {
        this.f14224h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (!this.f14233q) {
            if (z10) {
                this.f14224h = true;
                this.f14227k = true;
            }
            i(z10);
            return;
        }
        this.f14234r = true;
        if (z10) {
            this.f14235s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    public boolean M(MenuItem menuItem, i iVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        o3.b b10 = gVar.b();
        boolean z10 = b10 != null && b10.hasSubMenu();
        if (gVar.j()) {
            k10 |= gVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new l(u(), this, gVar));
            }
            l lVar = (l) gVar.getSubMenu();
            if (z10) {
                b10.onPrepareSubMenu(lVar);
            }
            k10 |= j(lVar, iVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public final void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f14222f.size()) {
            return;
        }
        this.f14222f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    public void O(i iVar) {
        Iterator<WeakReference<i>> it = this.f14239w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f14239w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f14221e = aVar;
    }

    public e S(int i10) {
        this.f14228l = i10;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f14222f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f14222f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    public e U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    public e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    public final void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f14232p = view;
            this.f14230n = null;
            this.f14231o = null;
        } else {
            if (i10 > 0) {
                this.f14230n = C.getText(i10);
            } else if (charSequence != null) {
                this.f14230n = charSequence;
            }
            if (i11 > 0) {
                this.f14231o = c3.a.f(u(), i11);
            } else if (drawable != null) {
                this.f14231o = drawable;
            }
            this.f14232p = null;
        }
        K(false);
    }

    public e X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    public e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        g g10 = g(i10, i11, i12, B, charSequence, this.f14228l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f14229m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f14222f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z10) {
        this.f14242z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f14217a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f14217a);
    }

    public final void b0(boolean z10) {
        boolean z11 = true;
        this.f14220d = (z10 && this.f14218b.getConfiguration().keyboard != 1 && e0.e(ViewConfiguration.get(this.f14217a), this.f14217a)) ? false : false;
    }

    public void c(i iVar, Context context) {
        this.f14239w.add(new WeakReference<>(iVar));
        iVar.initForMenu(context, this);
        this.f14227k = true;
    }

    public void c0() {
        this.f14233q = false;
        if (this.f14234r) {
            this.f14234r = false;
            K(this.f14235s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f14240x;
        if (gVar != null) {
            f(gVar);
        }
        this.f14222f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f14231o = null;
        this.f14230n = null;
        this.f14232p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f14221e;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    public void d0() {
        if (this.f14233q) {
            return;
        }
        this.f14233q = true;
        this.f14234r = false;
        this.f14235s = false;
    }

    public final void e(boolean z10) {
        if (this.f14237u) {
            return;
        }
        this.f14237u = true;
        Iterator<WeakReference<i>> it = this.f14239w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f14239w.remove(next);
            } else {
                iVar.onCloseMenu(this, z10);
            }
        }
        this.f14237u = false;
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f14239w.isEmpty() && this.f14240x == gVar) {
            d0();
            Iterator<WeakReference<i>> it = this.f14239w.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f14239w.remove(next);
                } else {
                    z10 = iVar.collapseItemActionView(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            c0();
            if (z10) {
                this.f14240x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f14222f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f14222f.get(i10);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f14221e;
        return aVar != null && aVar.onMenuItemSelected(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f14242z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f14222f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z10) {
        if (this.f14239w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<i>> it = this.f14239w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f14239w.remove(next);
            } else {
                iVar.updateMenuView(z10);
            }
        }
        c0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public final boolean j(l lVar, i iVar) {
        if (this.f14239w.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = iVar != null ? iVar.onSubMenuSelected(lVar) : false;
        Iterator<WeakReference<i>> it = this.f14239w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null) {
                this.f14239w.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = iVar2.onSubMenuSelected(lVar);
            }
        }
        return onSubMenuSelected;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f14239w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<i>> it = this.f14239w.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f14239w.remove(next);
            } else {
                z10 = iVar.expandItemActionView(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        c0();
        if (z10) {
            this.f14240x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f14222f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f14222f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g p(int i10, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<g> arrayList = this.f14238v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            if (G) {
                numericShortcut = gVar.getAlphabeticShortcut();
            } else {
                numericShortcut = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (G && numericShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    public void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f14222f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f14222f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f14227k) {
            Iterator<WeakReference<i>> it = this.f14239w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f14239w.remove(next);
                } else {
                    z10 |= iVar.flagActionItems();
                }
            }
            if (z10) {
                this.f14225i.clear();
                this.f14226j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = E.get(i10);
                    if (gVar.l()) {
                        this.f14225i.add(gVar);
                    } else {
                        this.f14226j.add(gVar);
                    }
                }
            } else {
                this.f14225i.clear();
                this.f14226j.clear();
                this.f14226j.addAll(E());
            }
            this.f14227k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f14222f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f14222f.get(l10).getGroupId() != i10) {
                    break;
                }
                N(l10, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f14225i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f14222f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f14222f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f14241y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f14222f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f14222f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f14222f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f14222f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f14219c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f14222f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f14217a;
    }

    public g v() {
        return this.f14240x;
    }

    public Drawable w() {
        return this.f14231o;
    }

    public CharSequence x() {
        return this.f14230n;
    }

    public View y() {
        return this.f14232p;
    }

    public ArrayList<g> z() {
        r();
        return this.f14226j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f14218b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f14218b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f14217a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f14218b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f14218b.getString(i13));
    }
}
