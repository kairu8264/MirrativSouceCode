package ai;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class lx implements rz {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ mx f6714a;

    public lx(mx mxVar) {
        this.f6714a = mxVar;
    }

    @Override // ai.rz
    public final String a(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6714a.f7088e;
        return sharedPreferences.getString(str, str2);
    }

    @Override // ai.rz
    public final Long b(String str, long j10) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f6714a.f7088e;
            return Long.valueOf(sharedPreferences2.getLong(str, j10));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f6714a.f7088e;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j10));
        }
    }

    @Override // ai.rz
    public final Double c(String str, double d10) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6714a.f7088e;
        return Double.valueOf(sharedPreferences.getFloat(str, (float) d10));
    }

    @Override // ai.rz
    public final Boolean d(String str, boolean z10) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6714a.f7088e;
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z10));
    }
}
