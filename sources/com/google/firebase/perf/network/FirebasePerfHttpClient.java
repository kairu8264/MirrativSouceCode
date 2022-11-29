package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import java.io.IOException;
import mm.d;
import om.f;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import rm.k;
import sm.h;

/* loaded from: classes4.dex */
public class FirebasePerfHttpClient {
    public static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = om.h.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, hVar, c10), httpContext);
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    public static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = om.h.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, hVar, c10));
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    public static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = om.h.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, hVar, c10), httpContext);
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    public static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = om.h.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, hVar, c10));
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    public static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = om.h.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.u(hVar.b());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = om.h.a(execute);
            if (a11 != null) {
                c10.s(a11.longValue());
            }
            String b10 = om.h.b(execute);
            if (b10 != null) {
                c10.r(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return h(httpClient, httpUriRequest, new h(), k.k());
    }

    public static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = om.h.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.u(hVar.b());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = om.h.a(execute);
            if (a11 != null) {
                c10.s(a11.longValue());
            }
            String b10 = om.h.b(execute);
            if (b10 != null) {
                c10.r(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    public static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = om.h.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.u(hVar.b());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = om.h.a(execute);
            if (a11 != null) {
                c10.s(a11.longValue());
            }
            String b10 = om.h.b(execute);
            if (b10 != null) {
                c10.r(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    public static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, h hVar, k kVar) throws IOException {
        d c10 = d.c(kVar);
        try {
            c10.w(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = om.h.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            hVar.e();
            c10.q(hVar.d());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.u(hVar.b());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = om.h.a(execute);
            if (a11 != null) {
                c10.s(a11.longValue());
            }
            String b10 = om.h.b(execute);
            if (b10 != null) {
                c10.r(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.u(hVar.b());
            om.h.d(c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return g(httpClient, httpUriRequest, httpContext, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) d(httpClient, httpUriRequest, responseHandler, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) c(httpClient, httpUriRequest, responseHandler, httpContext, new h(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return f(httpClient, httpHost, httpRequest, new h(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return e(httpClient, httpHost, httpRequest, httpContext, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, new h(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, httpContext, new h(), k.k());
    }
}
