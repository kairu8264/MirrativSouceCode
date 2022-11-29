package ai;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wp0 implements e43<Map<String, String>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f11704a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11705b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Uri f11706c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ yp0 f11707d;

    public wp0(yp0 yp0Var, List list, String str, Uri uri) {
        this.f11707d = yp0Var;
        this.f11704a = list;
        this.f11705b = str;
        this.f11706c = uri;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        uj0.f("Failed to parse gmsg params for: ".concat(String.valueOf(this.f11706c)));
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(Map<String, String> map) {
        this.f11707d.y(map, this.f11704a, this.f11705b);
    }
}
