package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f36990a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f36991b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f36992c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f36993d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f36994e;

    public d() {
        super(null);
    }

    public void a(Configuration configuration) {
        if (this.f36994e == null) {
            if (this.f36993d == null) {
                this.f36993d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f36994e == null) {
            Configuration configuration = this.f36993d;
            if (configuration == null) {
                this.f36994e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f36994e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f36993d);
                this.f36994e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f36994e;
    }

    public int c() {
        return this.f36990a;
    }

    public final void d() {
        boolean z10 = this.f36991b == null;
        if (z10) {
            this.f36991b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f36991b.setTo(theme);
            }
        }
        e(this.f36991b, this.f36990a, z10);
    }

    public void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f36992c == null) {
                this.f36992c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f36992c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f36991b;
        if (theme != null) {
            return theme;
        }
        if (this.f36990a == 0) {
            this.f36990a = d.i.f28784e;
        }
        d();
        return this.f36991b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f36990a != i10) {
            this.f36990a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f36990a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f36991b = theme;
    }
}
