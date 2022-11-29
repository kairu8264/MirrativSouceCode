package fr;

import ep.c0;
import ep.e0;
import er.f;
import er.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import xm.e;

/* loaded from: classes4.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f32125a;

    public a(e eVar) {
        this.f32125a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        Objects.requireNonNull(eVar, "gson == null");
        return new a(eVar);
    }

    @Override // er.f.a
    public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        return new b(this.f32125a, this.f32125a.m(en.a.get(type)));
    }

    @Override // er.f.a
    public f<e0, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        return new c(this.f32125a, this.f32125a.m(en.a.get(type)));
    }
}
