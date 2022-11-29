package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o7.s;
import o7.u;
import s7.n;
import s7.o;
import s7.p;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a  reason: collision with root package name */
    public final p f20052a;

    /* renamed from: b  reason: collision with root package name */
    public final d8.a f20053b;

    /* renamed from: c  reason: collision with root package name */
    public final d8.e f20054c;

    /* renamed from: d  reason: collision with root package name */
    public final d8.f f20055d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f20056e;

    /* renamed from: f  reason: collision with root package name */
    public final a8.f f20057f;

    /* renamed from: g  reason: collision with root package name */
    public final d8.b f20058g;

    /* renamed from: h  reason: collision with root package name */
    public final d8.d f20059h = new d8.d();

    /* renamed from: i  reason: collision with root package name */
    public final d8.c f20060i = new d8.c();

    /* renamed from: j  reason: collision with root package name */
    public final n3.e<List<Throwable>> f20061j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        n3.e<List<Throwable>> e10 = j8.a.e();
        this.f20061j = e10;
        this.f20052a = new p(e10);
        this.f20053b = new d8.a();
        this.f20054c = new d8.e();
        this.f20055d = new d8.f();
        this.f20056e = new com.bumptech.glide.load.data.f();
        this.f20057f = new a8.f();
        this.f20058g = new d8.b();
        v(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    public <Data, TResource> Registry a(Class<Data> cls, Class<TResource> cls2, m7.j<Data, TResource> jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public <Model, Data> Registry b(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.f20052a.a(cls, cls2, oVar);
        return this;
    }

    public <Data> Registry c(Class<Data> cls, m7.d<Data> dVar) {
        this.f20053b.a(cls, dVar);
        return this;
    }

    public <TResource> Registry d(Class<TResource> cls, m7.k<TResource> kVar) {
        this.f20055d.a(cls, kVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, m7.j<Data, TResource> jVar) {
        this.f20054c.a(str, jVar, cls, cls2);
        return this;
    }

    public final <Data, TResource, Transcode> List<o7.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f20054c.d(cls, cls2)) {
            for (Class cls5 : this.f20057f.b(cls4, cls3)) {
                arrayList.add(new o7.i(cls, cls4, cls5, this.f20054c.b(cls, cls4), this.f20057f.a(cls4, cls5), this.f20061j));
            }
        }
        return arrayList;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b10 = this.f20058g.b();
        if (b10.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b10;
    }

    public <Data, TResource, Transcode> s<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> a10 = this.f20060i.a(cls, cls2, cls3);
        if (this.f20060i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List<o7.i<Data, TResource, Transcode>> f10 = f(cls, cls2, cls3);
            a10 = f10.isEmpty() ? null : new s<>(cls, cls2, cls3, f10, this.f20061j);
            this.f20060i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        return this.f20052a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a10 = this.f20059h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList<>();
            for (Class<?> cls4 : this.f20052a.c(cls)) {
                for (Class<?> cls5 : this.f20054c.d(cls4, cls2)) {
                    if (!this.f20057f.b(cls5, cls3).isEmpty() && !a10.contains(cls5)) {
                        a10.add(cls5);
                    }
                }
            }
            this.f20059h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public <X> m7.k<X> k(u<X> uVar) throws NoResultEncoderAvailableException {
        m7.k<X> b10 = this.f20055d.b(uVar.d());
        if (b10 != null) {
            return b10;
        }
        throw new NoResultEncoderAvailableException(uVar.d());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f20056e.a(x10);
    }

    public <X> m7.d<X> m(X x10) throws NoSourceEncoderAvailableException {
        m7.d<X> b10 = this.f20053b.b(x10.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(u<?> uVar) {
        return this.f20055d.b(uVar.d()) != null;
    }

    public <Data, TResource> Registry o(Class<Data> cls, Class<TResource> cls2, m7.j<Data, TResource> jVar) {
        q("legacy_prepend_all", cls, cls2, jVar);
        return this;
    }

    public <TResource> Registry p(Class<TResource> cls, m7.k<TResource> kVar) {
        this.f20055d.c(cls, kVar);
        return this;
    }

    public <Data, TResource> Registry q(String str, Class<Data> cls, Class<TResource> cls2, m7.j<Data, TResource> jVar) {
        this.f20054c.e(str, jVar, cls, cls2);
        return this;
    }

    public Registry r(ImageHeaderParser imageHeaderParser) {
        this.f20058g.a(imageHeaderParser);
        return this;
    }

    public Registry s(e.a<?> aVar) {
        this.f20056e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry t(Class<TResource> cls, Class<Transcode> cls2, a8.e<TResource, Transcode> eVar) {
        this.f20057f.c(cls, cls2, eVar);
        return this;
    }

    public <Model, Data> Registry u(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.f20052a.f(cls, cls2, oVar);
        return this;
    }

    public final Registry v(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.f20054c.f(arrayList);
        return this;
    }
}
