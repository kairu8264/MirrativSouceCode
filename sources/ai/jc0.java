package ai;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class jc0 implements kc0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5691b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5692c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5693d = false;

    /* renamed from: a  reason: collision with root package name */
    public jr2 f5694a;

    @Override // ai.kc0
    public final void P(yh.a aVar) {
        synchronized (f5691b) {
            if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && f5692c) {
                try {
                    this.f5694a.X(aVar);
                } catch (RemoteException | NullPointerException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // ai.kc0
    public final String a(Context context) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue()) {
            try {
                b(context);
                String valueOf = String.valueOf(this.f5694a.e());
                return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
            } catch (RemoteException | NullPointerException e10) {
                uj0.i("#007 Could not call remote method.", e10);
                return null;
            }
        }
        return null;
    }

    public final void b(Context context) {
        synchronized (f5691b) {
            if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && !f5693d) {
                try {
                    f5693d = true;
                    this.f5694a = (jr2) xj0.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", ic0.f5179a);
                } catch (zzcgw e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // ai.kc0
    public final boolean p(Context context) {
        synchronized (f5691b) {
            if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue()) {
                if (f5692c) {
                    return true;
                }
                try {
                    b(context);
                    boolean L = this.f5694a.L(yh.b.h1(context));
                    f5692c = L;
                    return L;
                } catch (RemoteException e10) {
                    e = e10;
                    uj0.i("#007 Could not call remote method.", e);
                    return false;
                } catch (NullPointerException e11) {
                    e = e11;
                    uj0.i("#007 Could not call remote method.", e);
                    return false;
                }
            }
            return false;
        }
    }

    @Override // ai.kc0
    public final yh.a q(String str, WebView webView, String str2, String str3, String str4, String str5, mc0 mc0Var, lc0 lc0Var, String str6) {
        synchronized (f5691b) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && f5692c) {
                    try {
                        return this.f5694a.c3(str, yh.b.h1(webView), "", "javascript", str4, str5, mc0Var.toString(), lc0Var.toString(), str6);
                    } catch (RemoteException | NullPointerException e10) {
                        uj0.i("#007 Could not call remote method.", e10);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // ai.kc0
    public final void r(yh.a aVar, View view) {
        synchronized (f5691b) {
            if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && f5692c) {
                try {
                    this.f5694a.u2(aVar, yh.b.h1(view));
                } catch (RemoteException | NullPointerException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // ai.kc0
    public final void s(yh.a aVar, View view) {
        synchronized (f5691b) {
            if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && f5692c) {
                try {
                    this.f5694a.U0(aVar, yh.b.h1(view));
                } catch (RemoteException | NullPointerException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // ai.kc0
    public final yh.a t(String str, WebView webView, String str2, String str3, String str4, mc0 mc0Var, lc0 lc0Var, String str5) {
        synchronized (f5691b) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && f5692c) {
                    try {
                        return this.f5694a.L0(str, yh.b.h1(webView), "", "javascript", str4, "Google", mc0Var.toString(), lc0Var.toString(), str5);
                    } catch (RemoteException | NullPointerException e10) {
                        uj0.i("#007 Could not call remote method.", e10);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // ai.kc0
    public final void zzf(yh.a aVar) {
        synchronized (f5691b) {
            if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && f5692c) {
                try {
                    this.f5694a.zzf(aVar);
                } catch (RemoteException | NullPointerException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        }
    }
}
