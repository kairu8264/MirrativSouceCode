package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mx implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g  reason: collision with root package name */
    public Context f7090g;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7084a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ConditionVariable f7085b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f7086c = false;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f7087d = false;

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f7088e = null;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f7089f = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f7091h = new JSONObject();

    public final void b(Context context) {
        if (this.f7086c) {
            return;
        }
        synchronized (this.f7084a) {
            if (this.f7086c) {
                return;
            }
            if (!this.f7087d) {
                this.f7087d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f7090g = applicationContext;
            try {
                this.f7089f = xh.c.a(applicationContext).c(this.f7090g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context c10 = nh.g.c(context);
            if (c10 != null || (c10 = context.getApplicationContext()) != null) {
                context = c10;
            }
            if (context == null) {
                this.f7087d = false;
                this.f7085b.open();
                return;
            }
            ft.a();
            SharedPreferences a10 = ix.a(context);
            this.f7088e = a10;
            if (a10 != null) {
                a10.registerOnSharedPreferenceChangeListener(this);
            }
            sz.b(new lx(this));
            f();
            this.f7086c = true;
            this.f7087d = false;
            this.f7085b.open();
        }
    }

    public final <T> T c(final gx<T> gxVar) {
        if (!this.f7085b.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            synchronized (this.f7084a) {
                if (!this.f7087d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f7086c || this.f7088e == null) {
            synchronized (this.f7084a) {
                if (this.f7086c && this.f7088e != null) {
                }
                return gxVar.f();
            }
        }
        if (gxVar.m() == 2) {
            Bundle bundle = this.f7089f;
            return bundle == null ? gxVar.f() : gxVar.a(bundle);
        } else if (gxVar.m() == 1 && this.f7091h.has(gxVar.e())) {
            return gxVar.c(this.f7091h);
        } else {
            return (T) qx.a(new yx2(this, gxVar) { // from class: ai.jx

                /* renamed from: w  reason: collision with root package name */
                public final mx f5946w;

                /* renamed from: x  reason: collision with root package name */
                public final gx f5947x;

                {
                    this.f5946w = this;
                    this.f5947x = gxVar;
                }

                @Override // ai.yx2
                public final Object zza() {
                    return this.f5946w.e(this.f5947x);
                }
            });
        }
    }

    public final /* synthetic */ String d() {
        return this.f7088e.getString("flag_configuration", "{}");
    }

    public final /* synthetic */ Object e(gx gxVar) {
        return gxVar.d(this.f7088e);
    }

    public final void f() {
        if (this.f7088e == null) {
            return;
        }
        try {
            this.f7091h = new JSONObject((String) qx.a(new yx2(this) { // from class: ai.kx

                /* renamed from: w  reason: collision with root package name */
                public final mx f6389w;

                {
                    this.f6389w = this;
                }

                @Override // ai.yx2
                public final Object zza() {
                    return this.f6389w.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
