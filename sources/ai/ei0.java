package ai;

import android.content.SharedPreferences;
import java.util.List;

/* loaded from: classes3.dex */
public final class ei0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f3675a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ gi0 f3676b;

    public ei0(gi0 gi0Var, String str) {
        this.f3676b = gi0Var;
        this.f3675a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<fi0> list;
        synchronized (this.f3676b) {
            list = this.f3676b.f4462b;
            for (fi0 fi0Var : list) {
                fi0Var.a(sharedPreferences, this.f3675a, str);
            }
        }
    }
}
