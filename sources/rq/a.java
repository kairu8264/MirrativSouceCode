package rq;

import jo.p;

/* loaded from: classes4.dex */
public final class a<T> extends c<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qq.a<T> aVar) {
        super(aVar);
        p.h(aVar, "beanDefinition");
    }

    @Override // rq.c
    public T b(b bVar) {
        p.h(bVar, "context");
        return a(bVar);
    }
}
