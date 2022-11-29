package vk;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 extends vk.a {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<?>> f57410a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<?>> f57411b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Class<?>> f57412c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Class<?>> f57413d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Class<?>> f57414e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f57415f;

    /* renamed from: g  reason: collision with root package name */
    public final e f57416g;

    /* loaded from: classes.dex */
    public static class a implements ul.c {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Class<?>> f57417a;

        /* renamed from: b  reason: collision with root package name */
        public final ul.c f57418b;

        public a(Set<Class<?>> set, ul.c cVar) {
            this.f57417a = set;
            this.f57418b = cVar;
        }
    }

    public a0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.e()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!dVar.h().isEmpty()) {
            hashSet.add(ul.c.class);
        }
        this.f57410a = Collections.unmodifiableSet(hashSet);
        this.f57411b = Collections.unmodifiableSet(hashSet2);
        this.f57412c = Collections.unmodifiableSet(hashSet3);
        this.f57413d = Collections.unmodifiableSet(hashSet4);
        this.f57414e = Collections.unmodifiableSet(hashSet5);
        this.f57415f = dVar.h();
        this.f57416g = eVar;
    }

    @Override // vk.a, vk.e
    public <T> T a(Class<T> cls) {
        if (this.f57410a.contains(cls)) {
            T t10 = (T) this.f57416g.a(cls);
            return !cls.equals(ul.c.class) ? t10 : (T) new a(this.f57415f, (ul.c) t10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // vk.e
    public <T> xl.b<Set<T>> b(Class<T> cls) {
        if (this.f57414e.contains(cls)) {
            return this.f57416g.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // vk.a, vk.e
    public <T> Set<T> c(Class<T> cls) {
        if (this.f57413d.contains(cls)) {
            return this.f57416g.c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // vk.e
    public <T> xl.b<T> d(Class<T> cls) {
        if (this.f57411b.contains(cls)) {
            return this.f57416g.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // vk.e
    public <T> xl.a<T> e(Class<T> cls) {
        if (this.f57412c.contains(cls)) {
            return this.f57416g.e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
