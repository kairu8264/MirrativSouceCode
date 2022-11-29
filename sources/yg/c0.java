package yg;

import ai.c50;
import ai.dt;
import ai.ft;
import ai.h44;
import ai.i44;
import ai.nj0;
import ai.ox;
import ai.p44;
import ai.s34;
import ai.v44;
import ai.w34;
import ai.z34;
import android.content.Context;
import com.google.android.gms.internal.ads.zzwl;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class c0 extends i44 {

    /* renamed from: d  reason: collision with root package name */
    public final Context f61860d;

    public c0(Context context, h44 h44Var) {
        super(h44Var);
        this.f61860d = context;
    }

    public static z34 b(Context context) {
        z34 z34Var = new z34(new p44(new File(context.getCacheDir(), "admob_volley"), 20971520), new c0(context, new v44(null, null)), 4);
        z34Var.a();
        return z34Var;
    }

    @Override // ai.i44, ai.q34
    public final s34 a(w34<?> w34Var) throws zzwl {
        if (w34Var.c() == 0) {
            if (Pattern.matches((String) ft.c().c(ox.R2), w34Var.o())) {
                dt.a();
                if (nj0.l(this.f61860d, 13400000)) {
                    s34 a10 = new c50(this.f61860d).a(w34Var);
                    if (a10 != null) {
                        String valueOf = String.valueOf(w34Var.o());
                        p1.k(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a10;
                    }
                    String valueOf2 = String.valueOf(w34Var.o());
                    p1.k(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(w34Var);
    }
}
