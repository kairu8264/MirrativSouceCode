package ai;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class mh2 implements e43<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q62 f6943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ rz0 f6944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ nh2 f6945c;

    public mh2(nh2 nh2Var, q62 q62Var, rz0 rz0Var) {
        this.f6945c = nh2Var;
        this.f6943a = q62Var;
        this.f6944b = rz0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        l71 l71Var;
        Executor executor;
        final sr h10 = this.f6944b.b().h(th2);
        synchronized (this.f6945c) {
            this.f6945c.f7340j = null;
            this.f6944b.a().z(h10);
            if (((Boolean) ft.c().c(ox.O5)).booleanValue()) {
                executor = this.f6945c.f7332b;
                executor.execute(new Runnable(this, h10) { // from class: ai.lh2

                    /* renamed from: w  reason: collision with root package name */
                    public final mh2 f6566w;

                    /* renamed from: x  reason: collision with root package name */
                    public final sr f6567x;

                    {
                        this.f6566w = this;
                        this.f6567x = h10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b62 b62Var;
                        mh2 mh2Var = this.f6566w;
                        sr srVar = this.f6567x;
                        b62Var = mh2Var.f6945c.f7334d;
                        b62Var.z(srVar);
                    }
                });
            }
            l71Var = this.f6945c.f7338h;
            l71Var.S0(60);
            om2.a(h10.f9916w, th2, "BannerAdLoader.onFailure");
            this.f6943a.zza();
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(ty0 ty0Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        l71 l71Var;
        Executor executor;
        b62 b62Var;
        b62 b62Var2;
        f62 f62Var;
        ty0 ty0Var2 = ty0Var;
        synchronized (this.f6945c) {
            this.f6945c.f7340j = null;
            viewGroup = this.f6945c.f7336f;
            viewGroup.removeAllViews();
            if (ty0Var2.g() != null) {
                ViewParent parent = ty0Var2.g().getParent();
                if (parent instanceof ViewGroup) {
                    String c10 = ty0Var2.d() != null ? ty0Var2.d().c() : "";
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 78);
                    sb2.append("Banner view provided from ");
                    sb2.append(c10);
                    sb2.append(" already has a parent view. Removing its old parent.");
                    uj0.f(sb2.toString());
                    ((ViewGroup) parent).removeView(ty0Var2.g());
                }
            }
            gx<Boolean> gxVar = ox.O5;
            if (((Boolean) ft.c().c(gxVar)).booleanValue()) {
                f91 f10 = ty0Var2.f();
                b62Var2 = this.f6945c.f7334d;
                f10.a(b62Var2);
                f62Var = this.f6945c.f7335e;
                f10.b(f62Var);
            }
            viewGroup2 = this.f6945c.f7336f;
            viewGroup2.addView(ty0Var2.g());
            this.f6943a.b(ty0Var2);
            if (((Boolean) ft.c().c(gxVar)).booleanValue()) {
                executor = this.f6945c.f7332b;
                b62Var = this.f6945c.f7334d;
                b62Var.getClass();
                executor.execute(kh2.a(b62Var));
            }
            l71Var = this.f6945c.f7338h;
            l71Var.S0(ty0Var2.l());
        }
    }
}
