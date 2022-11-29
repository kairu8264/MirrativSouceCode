package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;
import v7.w;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final w f20143a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final p7.b f20144a;

        public a(p7.b bVar) {
            this.f20144a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f20144a);
        }
    }

    public k(InputStream inputStream, p7.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f20143a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f20143a.d();
    }

    public void c() {
        this.f20143a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d */
    public InputStream a() throws IOException {
        this.f20143a.reset();
        return this.f20143a;
    }
}
