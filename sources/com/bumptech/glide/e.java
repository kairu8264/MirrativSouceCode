package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final l<?, ?> f20084k = new b();

    /* renamed from: a  reason: collision with root package name */
    public final p7.b f20085a;

    /* renamed from: b  reason: collision with root package name */
    public final Registry f20086b;

    /* renamed from: c  reason: collision with root package name */
    public final f8.g f20087c;

    /* renamed from: d  reason: collision with root package name */
    public final c.a f20088d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e8.g<Object>> f20089e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, l<?, ?>> f20090f;

    /* renamed from: g  reason: collision with root package name */
    public final o7.k f20091g;

    /* renamed from: h  reason: collision with root package name */
    public final f f20092h;

    /* renamed from: i  reason: collision with root package name */
    public final int f20093i;

    /* renamed from: j  reason: collision with root package name */
    public e8.h f20094j;

    public e(Context context, p7.b bVar, Registry registry, f8.g gVar, c.a aVar, Map<Class<?>, l<?, ?>> map, List<e8.g<Object>> list, o7.k kVar, f fVar, int i10) {
        super(context.getApplicationContext());
        this.f20085a = bVar;
        this.f20086b = registry;
        this.f20087c = gVar;
        this.f20088d = aVar;
        this.f20089e = list;
        this.f20090f = map;
        this.f20091g = kVar;
        this.f20092h = fVar;
        this.f20093i = i10;
    }

    public <X> f8.k<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f20087c.a(imageView, cls);
    }

    public p7.b b() {
        return this.f20085a;
    }

    public List<e8.g<Object>> c() {
        return this.f20089e;
    }

    public synchronized e8.h d() {
        if (this.f20094j == null) {
            this.f20094j = this.f20088d.a().lock();
        }
        return this.f20094j;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l<?, T>) this.f20090f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f20090f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l<?, T>) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f20084k : lVar;
    }

    public o7.k f() {
        return this.f20091g;
    }

    public f g() {
        return this.f20092h;
    }

    public int h() {
        return this.f20093i;
    }

    public Registry i() {
        return this.f20086b;
    }
}
