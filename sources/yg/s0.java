package yg;

import ai.b54;
import ai.ft;
import ai.mk0;
import ai.ox;
import ai.s34;
import ai.s43;
import ai.tj0;
import ai.uj0;
import ai.z34;
import android.content.Context;
import com.google.android.gms.internal.ads.zzvk;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static z34 f61941a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f61942b = new Object();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final n0<Void> f61943c = new k0();

    public s0(Context context) {
        z34 a10;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f61942b) {
            if (f61941a == null) {
                ox.a(context);
                if (!vh.e.a()) {
                    if (((Boolean) ft.c().c(ox.Q2)).booleanValue()) {
                        a10 = c0.b(context);
                        f61941a = a10;
                    }
                }
                a10 = b54.a(context, null);
                f61941a = a10;
            }
        }
    }

    public final s43<s34> a(String str) {
        mk0 mk0Var = new mk0();
        f61941a.b(new r0(str, null, mk0Var));
        return mk0Var;
    }

    public final s43<String> b(int i10, String str, Map<String, String> map, byte[] bArr) {
        p0 p0Var = new p0(null);
        l0 l0Var = new l0(this, str, p0Var);
        tj0 tj0Var = new tj0(null);
        m0 m0Var = new m0(this, i10, str, p0Var, l0Var, bArr, map, tj0Var);
        if (tj0.j()) {
            try {
                tj0Var.b(str, "GET", m0Var.t(), m0Var.u());
            } catch (zzvk e10) {
                uj0.f(e10.getMessage());
            }
        }
        f61941a.b(m0Var);
        return p0Var;
    }
}
