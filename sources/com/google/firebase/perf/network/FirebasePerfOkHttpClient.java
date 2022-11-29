package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import ep.b0;
import ep.d0;
import ep.e;
import ep.e0;
import ep.f;
import ep.v;
import ep.x;
import java.io.IOException;
import mm.d;
import om.g;
import rm.k;
import sm.h;

/* loaded from: classes4.dex */
public class FirebasePerfOkHttpClient {
    public static void a(d0 d0Var, d dVar, long j10, long j11) throws IOException {
        b0 G = d0Var.G();
        if (G == null) {
            return;
        }
        dVar.w(G.j().x().toString());
        dVar.l(G.g());
        if (G.a() != null) {
            long a10 = G.a().a();
            if (a10 != -1) {
                dVar.p(a10);
            }
        }
        e0 a11 = d0Var.a();
        if (a11 != null) {
            long h10 = a11.h();
            if (h10 != -1) {
                dVar.s(h10);
            }
            x i10 = a11.i();
            if (i10 != null) {
                dVar.r(i10.toString());
            }
        }
        dVar.m(d0Var.h());
        dVar.q(j10);
        dVar.u(j11);
        dVar.b();
    }

    @Keep
    public static void enqueue(e eVar, f fVar) {
        h hVar = new h();
        eVar.U(new g(fVar, k.k(), hVar, hVar.d()));
    }

    @Keep
    public static d0 execute(e eVar) throws IOException {
        d c10 = d.c(k.k());
        h hVar = new h();
        long d10 = hVar.d();
        try {
            d0 d11 = eVar.d();
            a(d11, c10, d10, hVar.b());
            return d11;
        } catch (IOException e10) {
            b0 j10 = eVar.j();
            if (j10 != null) {
                v j11 = j10.j();
                if (j11 != null) {
                    c10.w(j11.x().toString());
                }
                if (j10.g() != null) {
                    c10.l(j10.g());
                }
            }
            c10.q(d10);
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }
}
