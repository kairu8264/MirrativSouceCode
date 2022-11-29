package mn;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f41220a;

    public b(Context context, String str) {
        if (context != null) {
            this.f41220a = context.getSharedPreferences(str, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    @Override // mn.a
    public SharedPreferences.Editor a() {
        return this.f41220a.edit();
    }

    @Override // mn.a
    public boolean b(SharedPreferences.Editor editor) {
        editor.apply();
        return true;
    }

    @Override // mn.a
    public SharedPreferences get() {
        return this.f41220a;
    }
}
