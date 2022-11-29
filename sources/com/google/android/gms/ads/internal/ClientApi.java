package com.google.android.gms.ads.internal;

import ai.ag2;
import ai.au;
import ai.cf0;
import ai.d52;
import ai.ec0;
import ai.fs;
import ai.ft;
import ai.ih1;
import ai.jj2;
import ai.ju;
import ai.kh1;
import ai.l40;
import ai.n40;
import ai.ni0;
import ai.or0;
import ai.ox;
import ai.p00;
import ai.ph2;
import ai.qc0;
import ai.ru;
import ai.sf0;
import ai.t00;
import ai.wt;
import ai.yk2;
import ai.yq1;
import ai.z80;
import ai.zf2;
import ai.zj0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;
import wg.s;
import xg.a0;
import xg.c;
import xg.t;
import xg.u;
import xg.w;
import yh.a;
import yh.b;

/* loaded from: classes3.dex */
public class ClientApi extends ju {
    @Override // ai.ku
    public final ec0 A5(a aVar, z80 z80Var, int i10) {
        return or0.d((Context) b.z0(aVar), z80Var, i10).A();
    }

    @Override // ai.ku
    public final n40 C1(a aVar, z80 z80Var, int i10, l40 l40Var) {
        Context context = (Context) b.z0(aVar);
        yq1 c10 = or0.d(context, z80Var, i10).c();
        c10.a(context);
        c10.b(l40Var);
        return c10.zza().b();
    }

    @Override // ai.ku
    public final t00 J5(a aVar, a aVar2, a aVar3) {
        return new ih1((View) b.z0(aVar), (HashMap) b.z0(aVar2), (HashMap) b.z0(aVar3));
    }

    @Override // ai.ku
    public final qc0 P(a aVar) {
        Activity activity = (Activity) b.z0(aVar);
        AdOverlayInfoParcel p10 = AdOverlayInfoParcel.p(activity.getIntent());
        if (p10 == null) {
            return new u(activity);
        }
        int i10 = p10.G;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new u(activity);
                        }
                        return new a0(activity);
                    }
                    return new w(activity, p10);
                }
                return new c(activity);
            }
            return new xg.b(activity);
        }
        return new t(activity);
    }

    @Override // ai.ku
    public final ni0 V4(a aVar, z80 z80Var, int i10) {
        return or0.d((Context) b.z0(aVar), z80Var, i10).y();
    }

    @Override // ai.ku
    public final p00 b1(a aVar, a aVar2) {
        return new kh1((FrameLayout) b.z0(aVar), (FrameLayout) b.z0(aVar2), 213806000);
    }

    @Override // ai.ku
    public final au b5(a aVar, fs fsVar, String str, z80 z80Var, int i10) {
        Context context = (Context) b.z0(aVar);
        zf2 r10 = or0.d(context, z80Var, i10).r();
        r10.t(str);
        r10.a(context);
        ag2 zza = r10.zza();
        if (i10 >= ((Integer) ft.c().c(ox.C3)).intValue()) {
            return zza.zzb();
        }
        return zza.zza();
    }

    @Override // ai.ku
    public final au d2(a aVar, fs fsVar, String str, z80 z80Var, int i10) {
        Context context = (Context) b.z0(aVar);
        jj2 t10 = or0.d(context, z80Var, i10).t();
        t10.b(context);
        t10.a(fsVar);
        t10.A(str);
        return t10.zza().zza();
    }

    @Override // ai.ku
    public final au e2(a aVar, fs fsVar, String str, int i10) {
        return new s((Context) b.z0(aVar), fsVar, str, new zj0(213806000, i10, true, false));
    }

    @Override // ai.ku
    public final au h3(a aVar, fs fsVar, String str, z80 z80Var, int i10) {
        Context context = (Context) b.z0(aVar);
        ph2 o10 = or0.d(context, z80Var, i10).o();
        o10.b(context);
        o10.a(fsVar);
        o10.A(str);
        return o10.zza().zza();
    }

    @Override // ai.ku
    public final sf0 i3(a aVar, String str, z80 z80Var, int i10) {
        Context context = (Context) b.z0(aVar);
        yk2 w10 = or0.d(context, z80Var, i10).w();
        w10.a(context);
        w10.t(str);
        return w10.zza().zzb();
    }

    @Override // ai.ku
    public final cf0 o3(a aVar, z80 z80Var, int i10) {
        Context context = (Context) b.z0(aVar);
        yk2 w10 = or0.d(context, z80Var, i10).w();
        w10.a(context);
        return w10.zza().zza();
    }

    @Override // ai.ku
    public final ru q3(a aVar, int i10) {
        return or0.e((Context) b.z0(aVar), i10).m();
    }

    @Override // ai.ku
    public final wt v5(a aVar, String str, z80 z80Var, int i10) {
        Context context = (Context) b.z0(aVar);
        return new d52(or0.d(context, z80Var, i10), context, str);
    }
}
