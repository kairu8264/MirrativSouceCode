package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import com.google.android.exoplayer2.C;
import o3.b;

/* loaded from: classes.dex */
public final class g implements h3.b {
    public View A;
    public o3.b B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    public final int f14247a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14248b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14249c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14250d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f14251e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f14252f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f14253g;

    /* renamed from: h  reason: collision with root package name */
    public char f14254h;

    /* renamed from: j  reason: collision with root package name */
    public char f14256j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f14258l;

    /* renamed from: n  reason: collision with root package name */
    public e f14260n;

    /* renamed from: o  reason: collision with root package name */
    public l f14261o;

    /* renamed from: p  reason: collision with root package name */
    public Runnable f14262p;

    /* renamed from: q  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f14263q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f14264r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f14265s;

    /* renamed from: z  reason: collision with root package name */
    public int f14272z;

    /* renamed from: i  reason: collision with root package name */
    public int f14255i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f14257k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f14259m = 0;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f14266t = null;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f14267u = null;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14268v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14269w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14270x = false;

    /* renamed from: y  reason: collision with root package name */
    public int f14271y = 16;
    public boolean D = false;

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0649b {
        public a() {
        }

        @Override // o3.b.InterfaceC0649b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f14260n.J(gVar);
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f14272z = 0;
        this.f14260n = eVar;
        this.f14247a = i11;
        this.f14248b = i10;
        this.f14249c = i12;
        this.f14250d = i13;
        this.f14251e = charSequence;
        this.f14272z = i14;
    }

    public static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public boolean A() {
        return this.f14260n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f14272z & 4) == 4;
    }

    @Override // h3.b
    public h3.b a(o3.b bVar) {
        o3.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.reset();
        }
        this.A = null;
        this.B = bVar;
        this.f14260n.K(true);
        o3.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.setVisibilityListener(new a());
        }
        return this;
    }

    @Override // h3.b
    public o3.b b() {
        return this.B;
    }

    public void c() {
        this.f14260n.I(this);
    }

    @Override // h3.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f14272z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14260n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f14270x && (this.f14268v || this.f14269w)) {
            drawable = g3.a.r(drawable).mutate();
            if (this.f14268v) {
                g3.a.o(drawable, this.f14266t);
            }
            if (this.f14269w) {
                g3.a.p(drawable, this.f14267u);
            }
            this.f14270x = false;
        }
        return drawable;
    }

    @Override // h3.b, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f14260n.k(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f14250d;
    }

    public char g() {
        return this.f14260n.G() ? this.f14256j : this.f14254h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // h3.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        o3.b bVar = this.B;
        if (bVar != null) {
            View onCreateActionView = bVar.onCreateActionView(this);
            this.A = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // h3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f14257k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f14256j;
    }

    @Override // h3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f14264r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f14248b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f14258l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f14259m != 0) {
            Drawable b10 = f.a.b(this.f14260n.u(), this.f14259m);
            this.f14259m = 0;
            this.f14258l = b10;
            return e(b10);
        }
        return null;
    }

    @Override // h3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f14266t;
    }

    @Override // h3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f14267u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f14253g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f14247a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // h3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f14255i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f14254h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f14249c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f14261o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f14251e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14252f;
        if (charSequence == null) {
            charSequence = this.f14251e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // h3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f14265s;
    }

    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f14260n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f14260n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(d.h.f28776o));
        }
        int i10 = this.f14260n.G() ? this.f14257k : this.f14255i;
        d(sb2, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(d.h.f28772k));
        d(sb2, i10, 4096, resources.getString(d.h.f28768g));
        d(sb2, i10, 2, resources.getString(d.h.f28767f));
        d(sb2, i10, 1, resources.getString(d.h.f28773l));
        d(sb2, i10, 4, resources.getString(d.h.f28775n));
        d(sb2, i10, 8, resources.getString(d.h.f28771j));
        if (g10 == '\b') {
            sb2.append(resources.getString(d.h.f28769h));
        } else if (g10 == '\n') {
            sb2.append(resources.getString(d.h.f28770i));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(d.h.f28774m));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f14261o != null;
    }

    public CharSequence i(j.a aVar) {
        if (aVar != null && aVar.b()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // h3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f14271y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f14271y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f14271y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        o3.b bVar = this.B;
        return (bVar == null || !bVar.overridesItemVisibility()) ? (this.f14271y & 8) == 0 : (this.f14271y & 8) == 0 && this.B.isVisible();
    }

    public boolean j() {
        o3.b bVar;
        if ((this.f14272z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.onCreateActionView(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f14263q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f14260n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f14262p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f14253g != null) {
                try {
                    this.f14260n.u().startActivity(this.f14253g);
                    return true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            o3.b bVar = this.B;
            return bVar != null && bVar.onPerformDefaultAction();
        }
        return true;
    }

    public boolean l() {
        return (this.f14271y & 32) == 32;
    }

    public boolean m() {
        return (this.f14271y & 4) != 0;
    }

    public boolean n() {
        return (this.f14272z & 1) == 1;
    }

    public boolean o() {
        return (this.f14272z & 2) == 2;
    }

    @Override // h3.b, android.view.MenuItem
    /* renamed from: p */
    public h3.b setActionView(int i10) {
        Context u10 = this.f14260n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    /* renamed from: q */
    public h3.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f14247a) > 0) {
            view.setId(i10);
        }
        this.f14260n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f14260n.K(false);
    }

    public void s(boolean z10) {
        int i10 = this.f14271y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f14271y = i11;
        if (i10 != i11) {
            this.f14260n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f14256j == c10) {
            return this;
        }
        this.f14256j = Character.toLowerCase(c10);
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f14271y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f14271y = i11;
        if (i10 != i11) {
            this.f14260n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f14271y & 4) != 0) {
            this.f14260n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f14271y |= 16;
        } else {
            this.f14271y &= -17;
        }
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f14259m = 0;
        this.f14258l = drawable;
        this.f14270x = true;
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14266t = colorStateList;
        this.f14268v = true;
        this.f14270x = true;
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14267u = mode;
        this.f14269w = true;
        this.f14270x = true;
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f14253g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f14254h == c10) {
            return this;
        }
        this.f14254h = c10;
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14263q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f14254h = c10;
        this.f14256j = Character.toLowerCase(c11);
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14272z = i10;
        this.f14260n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f14251e = charSequence;
        this.f14260n.K(false);
        l lVar = this.f14261o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14252f = charSequence;
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f14260n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f14271y = (z10 ? 4 : 0) | (this.f14271y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f14251e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f14271y |= 32;
        } else {
            this.f14271y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // h3.b, android.view.MenuItem
    /* renamed from: w */
    public h3.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(l lVar) {
        this.f14261o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f14271y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f14271y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f14260n.A();
    }

    @Override // h3.b, android.view.MenuItem
    public h3.b setContentDescription(CharSequence charSequence) {
        this.f14264r = charSequence;
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public h3.b setTooltipText(CharSequence charSequence) {
        this.f14265s = charSequence;
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f14256j == c10 && this.f14257k == i10) {
            return this;
        }
        this.f14256j = Character.toLowerCase(c10);
        this.f14257k = KeyEvent.normalizeMetaState(i10);
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f14254h == c10 && this.f14255i == i10) {
            return this;
        }
        this.f14254h = c10;
        this.f14255i = KeyEvent.normalizeMetaState(i10);
        this.f14260n.K(false);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14254h = c10;
        this.f14255i = KeyEvent.normalizeMetaState(i10);
        this.f14256j = Character.toLowerCase(c11);
        this.f14257k = KeyEvent.normalizeMetaState(i11);
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f14258l = null;
        this.f14259m = i10;
        this.f14270x = true;
        this.f14260n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f14260n.u().getString(i10));
    }
}
