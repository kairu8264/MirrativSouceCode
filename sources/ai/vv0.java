package ai;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vv0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11384a;

    /* renamed from: b  reason: collision with root package name */
    public final yg.r1 f11385b = wg.t.h().p();

    public vv0(Context context) {
        this.f11384a = context;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        String str = map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (((Boolean) ft.c().c(ox.f8053o0)).booleanValue()) {
                this.f11385b.c(parseBoolean);
                if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue() && parseBoolean) {
                    this.f11384a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (((Boolean) ft.c().c(ox.f8013j0)).booleanValue()) {
            wg.t.a().j(bundle);
        }
    }
}
