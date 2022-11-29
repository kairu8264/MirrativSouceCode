package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes3.dex */
public final class xg0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11922a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f11923b;

    /* renamed from: c  reason: collision with root package name */
    public final yg.r1 f11924c;

    /* renamed from: d  reason: collision with root package name */
    public final ai0 f11925d;

    /* renamed from: e  reason: collision with root package name */
    public String f11926e = "";

    public xg0(Context context, yg.r1 r1Var, ai0 ai0Var) {
        this.f11923b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f11924c = r1Var;
        this.f11922a = context;
        this.f11925d = ai0Var;
    }

    public final void a() {
        this.f11923b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f11923b, "IABTCF_PurposeConsents");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Context context;
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "");
            if (string.isEmpty() || this.f11926e.equals(string)) {
                return;
            }
            this.f11926e = string;
            boolean z10 = string.charAt(0) != '1';
            if (((Boolean) ft.c().c(ox.f8053o0)).booleanValue()) {
                this.f11924c.c(z10);
                if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue() && z10 && (context = this.f11922a) != null) {
                    context.deleteDatabase("OfflineUpload.db");
                }
            }
            if (((Boolean) ft.c().c(ox.f8013j0)).booleanValue()) {
                this.f11925d.f();
            }
        }
    }
}
