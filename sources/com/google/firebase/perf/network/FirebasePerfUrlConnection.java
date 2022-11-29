package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import mm.d;
import om.c;
import rm.k;
import sm.h;
import sm.j;

/* loaded from: classes4.dex */
public class FirebasePerfUrlConnection {
    public static Object a(j jVar, k kVar, h hVar) throws IOException {
        hVar.e();
        long d10 = hVar.d();
        d c10 = d.c(kVar);
        try {
            URLConnection a10 = jVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new om.d((HttpsURLConnection) a10, hVar, c10).getContent();
            }
            if (a10 instanceof HttpURLConnection) {
                return new c((HttpURLConnection) a10, hVar, c10).getContent();
            }
            return a10.getContent();
        } catch (IOException e10) {
            c10.q(d10);
            c10.u(hVar.b());
            c10.w(jVar.toString());
            om.h.d(c10);
            throw e10;
        }
    }

    public static Object b(j jVar, Class[] clsArr, k kVar, h hVar) throws IOException {
        hVar.e();
        long d10 = hVar.d();
        d c10 = d.c(kVar);
        try {
            URLConnection a10 = jVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new om.d((HttpsURLConnection) a10, hVar, c10).getContent(clsArr);
            }
            if (a10 instanceof HttpURLConnection) {
                return new c((HttpURLConnection) a10, hVar, c10).getContent(clsArr);
            }
            return a10.getContent(clsArr);
        } catch (IOException e10) {
            c10.q(d10);
            c10.u(hVar.b());
            c10.w(jVar.toString());
            om.h.d(c10);
            throw e10;
        }
    }

    public static InputStream c(j jVar, k kVar, h hVar) throws IOException {
        hVar.e();
        long d10 = hVar.d();
        d c10 = d.c(kVar);
        try {
            URLConnection a10 = jVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new om.d((HttpsURLConnection) a10, hVar, c10).getInputStream();
            }
            if (a10 instanceof HttpURLConnection) {
                return new c((HttpURLConnection) a10, hVar, c10).getInputStream();
            }
            return a10.getInputStream();
        } catch (IOException e10) {
            c10.q(d10);
            c10.u(hVar.b());
            c10.w(jVar.toString());
            om.h.d(c10);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return a(new j(url), k.k(), new h());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new om.d((HttpsURLConnection) obj, new h(), d.c(k.k()));
        }
        return obj instanceof HttpURLConnection ? new c((HttpURLConnection) obj, new h(), d.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return c(new j(url), k.k(), new h());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return b(new j(url), clsArr, k.k(), new h());
    }
}
