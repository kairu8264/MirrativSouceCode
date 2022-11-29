package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yp1 {

    /* renamed from: e  reason: collision with root package name */
    public final String f12702e;

    /* renamed from: f  reason: collision with root package name */
    public final up1 f12703f;

    /* renamed from: b  reason: collision with root package name */
    public final List<Map<String, String>> f12699b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12700c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12701d = false;

    /* renamed from: a  reason: collision with root package name */
    public final yg.r1 f12698a = wg.t.h().p();

    public yp1(String str, up1 up1Var) {
        this.f12702e = str;
        this.f12703f = up1Var;
    }

    public final synchronized void a(String str) {
        if (((Boolean) ft.c().c(ox.f8078r1)).booleanValue()) {
            if (!((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                Map<String, String> f10 = f();
                f10.put(ActionLogBase.ACTION, "adapter_init_started");
                f10.put("ancn", str);
                this.f12699b.add(f10);
            }
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) ft.c().c(ox.f8078r1)).booleanValue()) {
            if (!((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                Map<String, String> f10 = f();
                f10.put(ActionLogBase.ACTION, "adapter_init_finished");
                f10.put("ancn", str);
                this.f12699b.add(f10);
            }
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) ft.c().c(ox.f8078r1)).booleanValue()) {
            if (!((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                Map<String, String> f10 = f();
                f10.put(ActionLogBase.ACTION, "adapter_init_finished");
                f10.put("ancn", str);
                f10.put("rqe", str2);
                this.f12699b.add(f10);
            }
        }
    }

    public final synchronized void d() {
        if (((Boolean) ft.c().c(ox.f8078r1)).booleanValue()) {
            if (!((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                if (this.f12700c) {
                    return;
                }
                Map<String, String> f10 = f();
                f10.put(ActionLogBase.ACTION, "init_started");
                this.f12699b.add(f10);
                this.f12700c = true;
            }
        }
    }

    public final synchronized void e() {
        if (((Boolean) ft.c().c(ox.f8078r1)).booleanValue()) {
            if (!((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
                if (this.f12701d) {
                    return;
                }
                Map<String, String> f10 = f();
                f10.put(ActionLogBase.ACTION, "init_finished");
                this.f12699b.add(f10);
                for (Map<String, String> map : this.f12699b) {
                    this.f12703f.a(map);
                }
                this.f12701d = true;
            }
        }
    }

    public final Map<String, String> f() {
        Map<String, String> c10 = this.f12703f.c();
        c10.put("tms", Long.toString(wg.t.k().elapsedRealtime(), 10));
        c10.put("tid", this.f12698a.x() ? "" : this.f12702e);
        return c10;
    }
}
