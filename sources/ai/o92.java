package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class o92 implements xc2<m92> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7697a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f7698b;

    public o92(Context context, t43 t43Var) {
        this.f7697a = context;
        this.f7698b = t43Var;
    }

    public final /* synthetic */ m92 a() throws Exception {
        Bundle bundle;
        wg.t.d();
        String string = !((Boolean) ft.c().c(ox.f8073q4)).booleanValue() ? "" : this.f7697a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) ft.c().c(ox.f8089s4)).booleanValue() ? this.f7697a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        wg.t.d();
        Context context = this.f7697a;
        if (((Boolean) ft.c().c(ox.f8081r4)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new m92(string, string2, bundle, null);
    }

    @Override // ai.xc2
    public final s43<m92> zza() {
        return this.f7698b.h(new Callable(this) { // from class: ai.l92

            /* renamed from: a  reason: collision with root package name */
            public final o92 f6504a;

            {
                this.f6504a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6504a.a();
            }
        });
    }
}
