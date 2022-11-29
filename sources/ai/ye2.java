package ai;

import android.content.pm.PackageInfo;
import java.util.List;

/* loaded from: classes3.dex */
public final class ye2 {

    /* renamed from: a  reason: collision with root package name */
    public final ie0 f12566a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12567b;

    public ye2(ie0 ie0Var, int i10) {
        this.f12566a = ie0Var;
        this.f12567b = i10;
    }

    public final String a() {
        return this.f12566a.f5204z;
    }

    public final String b() {
        return this.f12566a.f5201w.getString("ms");
    }

    public final PackageInfo c() {
        return this.f12566a.B;
    }

    public final List<String> d() {
        return this.f12566a.A;
    }

    public final String e() {
        return this.f12566a.D;
    }

    public final int f() {
        return this.f12567b;
    }

    public final boolean g() {
        return this.f12566a.f5201w.getBoolean("is_gbid");
    }
}
