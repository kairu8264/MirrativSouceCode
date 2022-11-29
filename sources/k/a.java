package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements h3.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f38234a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38235b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38236c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f38237d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f38238e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f38239f;

    /* renamed from: g  reason: collision with root package name */
    public char f38240g;

    /* renamed from: i  reason: collision with root package name */
    public char f38242i;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f38244k;

    /* renamed from: l  reason: collision with root package name */
    public Context f38245l;

    /* renamed from: m  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f38246m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f38247n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f38248o;

    /* renamed from: h  reason: collision with root package name */
    public int f38241h = 4096;

    /* renamed from: j  reason: collision with root package name */
    public int f38243j = 4096;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f38249p = null;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f38250q = null;

    /* renamed from: r  reason: collision with root package name */
    public boolean f38251r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f38252s = false;

    /* renamed from: t  reason: collision with root package name */
    public int f38253t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f38245l = context;
        this.f38234a = i11;
        this.f38235b = i10;
        this.f38236c = i13;
        this.f38237d = charSequence;
    }

    @Override // h3.b
    public h3.b a(o3.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // h3.b
    public o3.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f38244k;
        if (drawable != null) {
            if (this.f38251r || this.f38252s) {
                Drawable r10 = g3.a.r(drawable);
                this.f38244k = r10;
                Drawable mutate = r10.mutate();
                this.f38244k = mutate;
                if (this.f38251r) {
                    g3.a.o(mutate, this.f38249p);
                }
                if (this.f38252s) {
                    g3.a.p(this.f38244k, this.f38250q);
                }
            }
        }
    }

    @Override // h3.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // h3.b, android.view.MenuItem
    /* renamed from: d */
    public h3.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // h3.b, android.view.MenuItem
    /* renamed from: e */
    public h3.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // h3.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // h3.b, android.view.MenuItem
    /* renamed from: f */
    public h3.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // h3.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // h3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f38243j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f38242i;
    }

    @Override // h3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f38247n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f38235b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f38244k;
    }

    @Override // h3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f38249p;
    }

    @Override // h3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f38250q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f38239f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f38234a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f38241h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f38240g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f38236c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f38237d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38238e;
        return charSequence != null ? charSequence : this.f38237d;
    }

    @Override // h3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f38248o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // h3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f38253t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f38253t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f38253t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f38253t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f38242i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f38253t = (z10 ? 1 : 0) | (this.f38253t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f38253t = (z10 ? 2 : 0) | (this.f38253t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f38253t = (z10 ? 16 : 0) | (this.f38253t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f38244k = drawable;
        c();
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38249p = colorStateList;
        this.f38251r = true;
        c();
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38250q = mode;
        this.f38252s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f38239f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f38240g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38246m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f38240g = c10;
        this.f38242i = Character.toLowerCase(c11);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f38237d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38238e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f38253t = (this.f38253t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f38242i = Character.toLowerCase(c10);
        this.f38243j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public h3.b setContentDescription(CharSequence charSequence) {
        this.f38247n = charSequence;
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f38240g = c10;
        this.f38241h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f38237d = this.f38245l.getResources().getString(i10);
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public h3.b setTooltipText(CharSequence charSequence) {
        this.f38248o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f38244k = c3.a.f(this.f38245l, i10);
        c();
        return this;
    }

    @Override // h3.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f38240g = c10;
        this.f38241h = KeyEvent.normalizeMetaState(i10);
        this.f38242i = Character.toLowerCase(c11);
        this.f38243j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
