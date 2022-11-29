package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import o3.b;

/* loaded from: classes.dex */
public class c extends k.b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final h3.b f38257d;

    /* renamed from: e  reason: collision with root package name */
    public Method f38258e;

    /* loaded from: classes.dex */
    public class a extends o3.b {

        /* renamed from: a  reason: collision with root package name */
        public final ActionProvider f38259a;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f38259a = actionProvider;
        }

        @Override // o3.b
        public boolean hasSubMenu() {
            return this.f38259a.hasSubMenu();
        }

        @Override // o3.b
        public View onCreateActionView() {
            return this.f38259a.onCreateActionView();
        }

        @Override // o3.b
        public boolean onPerformDefaultAction() {
            return this.f38259a.onPerformDefaultAction();
        }

        @Override // o3.b
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f38259a.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: c  reason: collision with root package name */
        public b.InterfaceC0649b f38261c;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // o3.b
        public boolean isVisible() {
            return this.f38259a.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            b.InterfaceC0649b interfaceC0649b = this.f38261c;
            if (interfaceC0649b != null) {
                interfaceC0649b.onActionProviderVisibilityChanged(z10);
            }
        }

        @Override // o3.b
        public View onCreateActionView(MenuItem menuItem) {
            return this.f38259a.onCreateActionView(menuItem);
        }

        @Override // o3.b
        public boolean overridesItemVisibility() {
            return this.f38259a.overridesItemVisibility();
        }

        @Override // o3.b
        public void refreshVisibility() {
            this.f38259a.refreshVisibility();
        }

        @Override // o3.b
        public void setVisibilityListener(b.InterfaceC0649b interfaceC0649b) {
            this.f38261c = interfaceC0649b;
            this.f38259a.setVisibilityListener(interfaceC0649b != null ? this : null);
        }
    }

    /* renamed from: k.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0530c extends FrameLayout implements j.c {

        /* renamed from: w  reason: collision with root package name */
        public final CollapsibleActionView f38263w;

        public C0530c(View view) {
            super(view.getContext());
            this.f38263w = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f38263w;
        }

        @Override // j.c
        public void onActionViewCollapsed() {
            this.f38263w.onActionViewCollapsed();
        }

        @Override // j.c
        public void onActionViewExpanded() {
            this.f38263w.onActionViewExpanded();
        }
    }

    /* loaded from: classes.dex */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f38264a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f38264a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f38264a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f38264a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* loaded from: classes.dex */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f38266a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f38266a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f38266a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, h3.b bVar) {
        super(context);
        if (bVar != null) {
            this.f38257d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f38257d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f38257d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        o3.b b10 = this.f38257d.b();
        if (b10 instanceof a) {
            return ((a) b10).f38259a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f38257d.getActionView();
        return actionView instanceof C0530c ? ((C0530c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f38257d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f38257d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f38257d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f38257d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f38257d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f38257d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f38257d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f38257d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f38257d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f38257d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f38257d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f38257d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f38257d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f38257d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f38257d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f38257d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f38257d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f38258e == null) {
                this.f38258e = this.f38257d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f38258e.invoke(this.f38257d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f38257d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f38257d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f38257d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f38257d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f38257d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f38257d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        o3.b aVar;
        if (Build.VERSION.SDK_INT >= 16) {
            aVar = new b(this.f38254a, actionProvider);
        } else {
            aVar = new a(this.f38254a, actionProvider);
        }
        h3.b bVar = this.f38257d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0530c(view);
        }
        this.f38257d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f38257d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f38257d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f38257d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f38257d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f38257d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f38257d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38257d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38257d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f38257d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f38257d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f38257d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38257d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f38257d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f38257d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f38257d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f38257d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38257d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f38257d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f38257d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f38257d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f38257d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f38257d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f38257d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f38257d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f38257d.setActionView(i10);
        View actionView = this.f38257d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f38257d.setActionView(new C0530c(actionView));
        }
        return this;
    }
}
