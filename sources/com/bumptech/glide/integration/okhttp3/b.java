package com.bumptech.glide.integration.okhttp3;

import ep.e;
import ep.z;
import java.io.InputStream;
import m7.h;
import s7.g;
import s7.n;
import s7.o;
import s7.r;

/* loaded from: classes.dex */
public class b implements n<g, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final e.a f20097a;

    /* loaded from: classes.dex */
    public static class a implements o<g, InputStream> {

        /* renamed from: b  reason: collision with root package name */
        public static volatile e.a f20098b;

        /* renamed from: a  reason: collision with root package name */
        public final e.a f20099a;

        public a() {
            this(b());
        }

        public static e.a b() {
            if (f20098b == null) {
                synchronized (a.class) {
                    if (f20098b == null) {
                        f20098b = new z();
                    }
                }
            }
            return f20098b;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<g, InputStream> c(r rVar) {
            return new b(this.f20099a);
        }

        public a(e.a aVar) {
            this.f20099a = aVar;
        }
    }

    public b(e.a aVar) {
        this.f20097a = aVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<InputStream> b(g gVar, int i10, int i11, h hVar) {
        return new n.a<>(gVar, new j7.a(this.f20097a, gVar));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(g gVar) {
        return true;
    }
}
