package p7;

import java.util.Queue;
import p7.m;

/* loaded from: classes.dex */
public abstract class d<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<T> f46179a = i8.k.f(20);

    public abstract T a();

    public T b() {
        T poll = this.f46179a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t10) {
        if (this.f46179a.size() < 20) {
            this.f46179a.offer(t10);
        }
    }
}
